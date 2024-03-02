package yionos.demo.app.samples;

import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector4d;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.NuklearContext;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.WindowInputMap;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.detection.CollisionDispatcher;
import yionos.detection.CollisionManifold;
import yionos.detection.DefaultCollisionDispatcher;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static glfw3.GLFW3.*;
import static nuklear.Nuklear.*;
import static nuklear.nk_panel_flags.*;

public class CollisionDispatcherSample implements DemoSample
{
    private static final ObjectRenderer.MeshColors NO_COLLISION_COLORS = new ObjectRenderer.MeshColors(
            new Vector4d(1.0, 0.0, 0.0, 1.0),
            new Vector4d(0.5, 0.3, 0.7, 1.0),
            new Vector4d(1.0, 1.0, 0.0, 1.0)
    );
    private static final ObjectRenderer.MeshColors OVERLAP_COLORS = new ObjectRenderer.MeshColors(
            new Vector4d(0.0, 1.0, 1.0, 1.0),
            new Vector4d(0.5, 0.8, 0.4, 1.0),
            new Vector4d(1.0, 0.0, 0.4, 1.0)
    );

    private final VulkanRenderer renderer;
    private boolean renderWireframes = true;

    private final SphereGeometry sphereGeometry = new SphereGeometry(0.5);
    private final CuboidGeometry cuboidGeometry = new CuboidGeometry(new Vector3d(0.5));
    private final Transform sphereTransform = new Transform();
    private final Transform cubeTransform = new Transform();
    private final CollisionDispatcher collisionDispatcher = new DefaultCollisionDispatcher();
    private final CollisionManifold collisionManifold = new CollisionManifold();

    public CollisionDispatcherSample(VulkanRenderer renderer)
    {
        this.renderer = renderer;
    }

    @Override
    public void initSimulation()
    {
        sphereTransform.position().set(0.0, 3.0, -1.0);
        sphereTransform.rotation().identity();

        cubeTransform.position().set(0.0, 3.0, 2);
        cubeTransform.rotation().identity();//.rotationXYZ(0.5, 0.9, 0.6);
    }

    @Override
    public void handleInputs(WindowInputMap inputs)
    {
        if (inputs.keyDown(GLFW_KEY_KP_8)) this.cubeTransform.position().add(0.0, 0.0, -0.01);
        if (inputs.keyDown(GLFW_KEY_KP_5)) this.cubeTransform.position().add(0.0, 0.0, 0.01);
        if (inputs.keyDown(GLFW_KEY_KP_6)) this.cubeTransform.position().add(0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_4)) this.cubeTransform.position().add(-0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_SUBTRACT)) this.cubeTransform.position().add(0.0, 0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_ADD)) this.cubeTransform.position().add(0.0, -0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_MULTIPLY)) this.cubeTransform.rotation().rotateXYZ(0.01, 0.02, 0.04).normalize();
        if (inputs.keyDown(GLFW_KEY_KP_DIVIDE)) this.cubeTransform.rotation().rotateXYZ(-0.01, -0.02, -0.04).normalize();
        if (inputs.keyToggled(GLFW_KEY_H)) this.renderWireframes = !this.renderWireframes;
    }

    @Override
    public void update() {}

    @Override
    public void render(Camera camera)
    {
        if (this.renderWireframes)
        {
            this.renderer.setLineWidth(2.0f);
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugWireframe());
        }
        else
        {
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebug());
        }

        Transform rel = new Transform();
        Transform.computeRelative(this.cubeTransform, this.sphereTransform, rel);

        this.collisionManifold.reset();
        this.collisionDispatcher.execute(this.cuboidGeometry, this.sphereGeometry, rel, this.collisionManifold);

        boolean collision = this.collisionManifold.contactCount() > 0;
        ObjectRenderer.MeshColors colors = collision ? OVERLAP_COLORS : NO_COLLISION_COLORS;

        if (collision)
        {
        }

        Matrix4d modelMatrix = new Matrix4d();

        this.sphereTransform.computeModelMatrix(modelMatrix);
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.SPHERE);

        this.cubeTransform.computeModelMatrix(modelMatrix);
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.CUBE);
    }

    @Override
    public boolean arrangeOverlay(NuklearContext context)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            if (nk_begin(context.pContext(), arena.allocateUtf8String("yionos"), nk_rect(arena, 20, 300, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE) != 0)
            {
                nk_layout_row_static(context.pContext(), 30, 140, 1);
                MemorySegment active = arena.allocate(ValueLayout.JAVA_INT, this.renderWireframes ? 0 : 1);
                if (nk_checkbox_label(context.pContext(), arena.allocateUtf8String("Render wireframes"), active) != 0)
                {
                    this.renderWireframes = !this.renderWireframes;
                }
            }

            boolean mouseHovering = nk_window_is_hovered(context.pContext()) != 0;

            nk_end(context.pContext());

            return mouseHovering;
        }
    }

    @Override
    public void dispose() {}
}
