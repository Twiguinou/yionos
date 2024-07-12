package yionos.demo.app.samples;

import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector4d;
import yionos.demo.app.Camera;
import yionos.demo.app.NuklearContext;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.WindowInputMap;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.detection.CollisionManifold;
import yionos.detection.algorithms.MinkowskiPortalRefinement;
import yionos.dynamics.geometries.ConvexHullGeometry;
import yionos.utils.Transform;

import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;

import static glfw3.GLFW3.*;
import static nuklear.Nuklear.*;
import static nuklear.nk_panel_flags.*;
import static java.lang.foreign.ValueLayout.*;

public class MPRSample implements DemoSample
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
    private static final ObjectRenderer.MeshColors CONTACT_POINT_COLORS = new ObjectRenderer.MeshColors(
            new Vector4d(1.0, 1.0, 1.0, 1.0),
            new Vector4d(0.5, 0.5, 0.8, 1.0),
            new Vector4d(0.0, 0.7, 0.4, 1.0)
    );
    private static final ObjectRenderer.MeshColors CONTACT_POINT_COLORS_INV = new ObjectRenderer.MeshColors(
            new Vector4d(1.0).sub(CONTACT_POINT_COLORS.lightColor()).setComponent(3, 1.0),
            new Vector4d(1.0).sub(CONTACT_POINT_COLORS.darkColor()).setComponent(3, 1.0),
            new Vector4d(1.0).sub(CONTACT_POINT_COLORS.borderColor()).setComponent(3, 1.0)
    );

    private final VulkanRenderer renderer;
    private boolean m_renderWireframes = true;

    private final Transform cubeTransformA = new Transform();
    private final Transform cubeTransformB = new Transform();
    private final ConvexHullGeometry cubeGeometry = new ConvexHullGeometry(new Vector3d[] {
            new Vector3d(-0.5, -0.5, -0.5),
            new Vector3d(0.5, -0.5, -0.5),
            new Vector3d(-0.5, -0.5, 0.5),
            new Vector3d(0.5, -0.5, 0.5),
            new Vector3d(-0.5, 0.5, -0.5),
            new Vector3d(0.5, 0.5, -0.5),
            new Vector3d(-0.5, 0.5, 0.5),
            new Vector3d(0.5, 0.5, 0.5)
    });
    private final ConvexHullGeometry cubeGeometryFloor = new ConvexHullGeometry(new Vector3d[] {
            new Vector3d(-5.5, -0.5, -0.5),
            new Vector3d(5.5, -0.5, -5.5),
            new Vector3d(-5.5, -0.5, 5.5),
            new Vector3d(5.5, -0.5, 5.5),
            new Vector3d(-5.5, 0.5, -5.5),
            new Vector3d(5.5, 0.5, -5.5),
            new Vector3d(-5.5, 0.5, 5.5),
            new Vector3d(5.5, 0.5, 5.5)
    });

    public MPRSample(VulkanRenderer renderer)
    {
        this.renderer = renderer;
    }

    @Override
    public void initSimulation()
    {
        this.cubeTransformA.position().set(0.0, 0.0, 0.0);
        this.cubeTransformA.rotation().identity();

        this.cubeTransformB.position().set(0.0, 2.0, 0.0);
        this.cubeTransformB.rotation().identity();
    }

    @Override
    public void handleInputs(WindowInputMap inputs)
    {
        if (inputs.keyDown(GLFW_KEY_KP_8)) this.cubeTransformA.position().add(0.0, 0.0, -0.01);
        if (inputs.keyDown(GLFW_KEY_KP_5)) this.cubeTransformA.position().add(0.0, 0.0, 0.01);
        if (inputs.keyDown(GLFW_KEY_KP_6)) this.cubeTransformA.position().add(0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_4)) this.cubeTransformA.position().add(-0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_SUBTRACT)) this.cubeTransformA.position().add(0.0, 0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_ADD)) this.cubeTransformA.position().add(0.0, -0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_MULTIPLY)) this.cubeTransformA.rotation().rotateXYZ(0.005, 0.01, 0.02).normalize();
        if (inputs.keyDown(GLFW_KEY_KP_DIVIDE)) this.cubeTransformA.rotation().rotateXYZ(-0.005, -0.01, -0.02).normalize();
    }

    @Override
    public void update() {}

    @Override
    public void render(Camera camera)
    {
        CollisionManifold.ContactInfo contact = new CollisionManifold.ContactInfo();

        boolean collision = MinkowskiPortalRefinement.manifold(this.cubeGeometry, this.cubeTransformA, this.cubeGeometry, this.cubeTransformB, contact);
        ObjectRenderer.MeshColors colors = collision ? OVERLAP_COLORS : NO_COLLISION_COLORS;

        if (collision)
        {
            this.renderer.setLineWidth(2.0f);
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugWireframe());

            Matrix4d pointTransform = new Matrix4d();
            pointTransform.translation(contact.posA);
            pointTransform.scale(0.1);

            this.renderer.renderObject(camera, pointTransform, CONTACT_POINT_COLORS, ObjectRenderer.Type.SPHERE);

            pointTransform.translation(contact.posB);
            pointTransform.scale(0.1);

            this.renderer.renderObject(camera, pointTransform, CONTACT_POINT_COLORS_INV, ObjectRenderer.Type.SPHERE);

            /*Matrix4d normalTransform = new Matrix4d();
            normalTransform.translation(contact.posA);
            normalTransform.scale(0.1);

            this.renderer.renderObject(camera, normalTransform, CONTACT_POINT_COLORS, ObjectRenderer.Type.CUBE);

            normalTransform.identity();
            normalTransform.translation(contact.posA);
            normalTransform.translate(contact.normalA.mul(0.2, new Vector3d()));
            normalTransform.scale(0.1);

            this.renderer.renderObject(camera, normalTransform, CONTACT_POINT_COLORS, ObjectRenderer.Type.CUBE);*/
        }

        if (this.m_renderWireframes)
        {
            this.renderer.setLineWidth(2.0f);
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugWireframe());
        }
        else
        {
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebug());
        }

        Matrix4d modelMatrix = new Matrix4d();

        this.cubeTransformA.computeModelMatrix(modelMatrix);
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.CUBE);

        this.cubeTransformB.computeModelMatrix(modelMatrix);
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.CUBE);
    }

    @Override
    public void arrangeOverlay(NuklearContext context)
    {
        try (Arena arena = Arena.ofConfined())
        {
            SegmentAllocator textAllocator = SegmentAllocator.prefixAllocator(arena.allocate(JAVA_CHAR, 512));

            if (nk_begin(context.pContext(), textAllocator.allocateFrom("Scene configuration"), nk_rect(arena, 20, 500, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE | NK_WINDOW_SCALABLE) != 0)
            {
                nk_layout_row_static(context.pContext(), 30, 140, 1);
                if (nk_checkbox_label(context.pContext(), textAllocator.allocateFrom("Render wireframes"), arena.allocateFrom(JAVA_INT, this.m_renderWireframes ? 0 : 1)) != 0)
                {
                    this.m_renderWireframes = !this.m_renderWireframes;
                }

                nk_layout_row_static(context.pContext(), 30, 200, 1);
                nk_label_wrap(context.pContext(), textAllocator.allocateFrom("-Use your numpad keys to move the cube around"));
            }

            nk_end(context.pContext());
        }
    }

    @Override
    public void dispose() {}
}
