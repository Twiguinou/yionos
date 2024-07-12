package yionos.demo.app.samples;

import org.joml.Matrix4d;
import org.joml.Vector3d;
import org.joml.Vector4d;
import yionos.demo.app.*;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.detection.CollisionDispatcher;
import yionos.detection.CollisionManifold;
import yionos.detection.DefaultCollisionDispatcher;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;

import static glfw3.GLFW3.*;
import static nuklear.Nuklear.*;
import static nuklear.nk_text_align.*;
import static nuklear.nk_panel_flags.*;
import static java.lang.foreign.ValueLayout.*;

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

    private final SphereGeometry sphereGeometry = new SphereGeometry(0.5);
    private final CuboidGeometry cuboidGeometry = new CuboidGeometry(new Vector3d(5.0, 5.0, 0.5));
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

        cubeTransform.position().set(0.0, 3.0, 2.0);
        cubeTransform.rotation().identity().rotationXYZ(0.5, 0.2, 0.3).normalize();
    }

    @Override
    public void handleInputs(WindowInputMap inputs)
    {
        if (inputs.keyDown(GLFW_KEY_KP_8)) this.sphereTransform.position().add(0.0, 0.0, -0.01);
        if (inputs.keyDown(GLFW_KEY_KP_5)) this.sphereTransform.position().add(0.0, 0.0, 0.01);
        if (inputs.keyDown(GLFW_KEY_KP_6)) this.sphereTransform.position().add(0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_4)) this.sphereTransform.position().add(-0.01, 0.0, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_SUBTRACT)) this.sphereTransform.position().add(0.0, 0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_ADD)) this.sphereTransform.position().add(0.0, -0.01, 0.0);
        if (inputs.keyDown(GLFW_KEY_KP_MULTIPLY)) this.sphereTransform.rotation().rotateXYZ(0.005, 0.01, 0.02).normalize();
        if (inputs.keyDown(GLFW_KEY_KP_DIVIDE)) this.sphereTransform.rotation().rotateXYZ(-0.005, -0.01, -0.02).normalize();
    }

    @Override
    public void update() {}

    @Override
    public void render(Camera camera)
    {
        Transform rel = new Transform();
        Transform.computeRelative(this.cubeTransform, this.sphereTransform, rel);

        this.collisionManifold.reset();
        this.collisionDispatcher.execute(this.cuboidGeometry, this.sphereGeometry, rel, this.collisionManifold);

        boolean collision = this.collisionManifold.contactCount() > 0;
        ObjectRenderer.MeshColors colors = collision ? OVERLAP_COLORS : NO_COLLISION_COLORS;

        if (collision)
        {
            this.renderer.setLineWidth(2.0f);
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugWireframe());

            Vector3d contactWorldPos = new Vector3d();
            Matrix4d contactTransform = new Matrix4d();
            for (int i = 0; i < this.collisionManifold.contactCount(); i++)
            {
                CollisionManifold.ContactInfo contact = this.collisionManifold.contact(i);

                contact.posA.rotate(this.cubeTransform.rotation(), contactWorldPos);
                contactWorldPos.add(this.cubeTransform.position());

                contactTransform.identity();
                contactTransform.translation(contactWorldPos);
                contactTransform.scale(0.1);

                this.renderer.renderObject(camera, contactTransform, CONTACT_POINT_COLORS, ObjectRenderer.Type.SPHERE);

                contact.posB.rotate(this.sphereTransform.rotation(), contactWorldPos);
                contactWorldPos.add(this.sphereTransform.position());

                contactTransform.identity();
                contactTransform.translation(contactWorldPos);
                contactTransform.scale(0.1);

                this.renderer.renderObject(camera, contactTransform, CONTACT_POINT_COLORS_INV, ObjectRenderer.Type.SPHERE);
            }
        }

        if (this.m_renderWireframes)
        {
            if (!collision)
            {
                this.renderer.setLineWidth(2.0f);
                this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugWireframe());
            }
        }
        else
        {
            this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebug());
        }

        Matrix4d modelMatrix = new Matrix4d();

        this.sphereTransform.computeModelMatrix(modelMatrix);
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.SPHERE);

        this.cubeTransform.computeModelMatrix(modelMatrix);
        modelMatrix.scale(this.cuboidGeometry.halfExtents().mul(2.0, new Vector3d()));
        this.renderer.renderObject(camera, modelMatrix, colors, ObjectRenderer.Type.CUBE);
    }

    @Override
    public void arrangeOverlay(NuklearContext context)
    {
        try (Arena arena = Arena.ofConfined())
        {
            SegmentAllocator textAllocator = SegmentAllocator.prefixAllocator(arena.allocate(JAVA_CHAR, 128));

            if (nk_begin(context.pContext(), textAllocator.allocateFrom("Scene configuration"), nk_rect(arena, 20, 500, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE | NK_WINDOW_SCALABLE) != 0)
            {
                nk_layout_row_static(context.pContext(), 30, 140, 1);
                if (nk_checkbox_label(context.pContext(), textAllocator.allocateFrom("Render wireframes"), arena.allocateFrom(JAVA_INT, this.m_renderWireframes ? 0 : 1)) != 0)
                {
                    this.m_renderWireframes = !this.m_renderWireframes;
                }

                for (int i = 0; i < this.collisionManifold.contactCount(); i++)
                {
                    CollisionManifold.ContactInfo contact = this.collisionManifold.contact(i);

                    nk_layout_row_dynamic(context.pContext(), 30, 1);
                    nk_label(context.pContext(), textAllocator.allocateFrom(String.format("penetration c%d: %f", i, contact.penetration)), NK_TEXT_ALIGN_LEFT);
                }
            }

            nk_end(context.pContext());
        }
    }

    @Override
    public void dispose() {}
}
