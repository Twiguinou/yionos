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
import yionos.detection.*;
import yionos.dynamics.DynamicSolidObject;
import yionos.dynamics.PhysicsVerse;
import yionos.dynamics.SolidObject;
import yionos.dynamics.geometries.ConvexHullGeometry;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.SphereGeometry;

import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static nuklear.Nuklear.*;
import static nuklear.nk_panel_flags.*;

public class SphereStackSample implements DemoSample
{
    private static final ObjectRenderer.MeshColors MESH_COLORS = new ObjectRenderer.MeshColors(
            new Vector4d(1.0, 0.0, 0.0, 1.0),
            new Vector4d(0.5, 0.3, 0.7, 1.0),
            new Vector4d(1.0, 1.0, 0.0, 1.0)
    );
    private static final ObjectRenderer.MeshColors CONTACT_POINT_COLORS = new ObjectRenderer.MeshColors(
            new Vector4d(1.0, 1.0, 1.0, 1.0),
            new Vector4d(0.5, 0.5, 0.8, 1.0),
            new Vector4d(0.0, 0.7, 0.4, 1.0)
    );

    private static final double gPhysicsTimeStep = 1.0 / 60.0;

    private final VulkanRenderer renderer;
    private final PhysicsVerse m_verse;
    private boolean m_stepping = false;

    public SphereStackSample(VulkanRenderer renderer)
    {
        this.renderer = renderer;

        Broadphase broadphase = new NaiveBroadphase(new HashtablePairStorage());
        CollisionDispatcher dispatcher = new DefaultCollisionDispatcher();
        this.m_verse = new PhysicsVerse(broadphase, dispatcher);
    }

    @Override
    public void initSimulation()
    {
        this.m_verse.clearScene();
        this.m_verse.gravity().set(0.0, -3.801, 0.0);

        ConvexHullGeometry cubeGeometry = new ConvexHullGeometry(new Vector3d[] {
                new Vector3d(-0.5, -0.5, -0.5),
                new Vector3d(0.5, -0.5, -0.5),
                new Vector3d(-0.5, -0.5, 0.5),
                new Vector3d(0.5, -0.5, 0.5),
                new Vector3d(-0.5, 0.5, -0.5),
                new Vector3d(0.5, 0.5, -0.5),
                new Vector3d(-0.5, 0.5, 0.5),
                new Vector3d(0.5, 0.5, 0.5)
        });

        for (int y = 0; y < 10; y++)
        {
            DynamicSolidObject collider1 = new DynamicSolidObject(1.0, cubeGeometry);
            collider1.worldTransform().position().set(0.0, 3.0 * y + 1, 0.0);
            //collider1.worldTransform().rotation().rotateXYZ(0.1, 0.2, 0.3).normalize();

            collider1.applyCentralImpulse(new Vector3d(0.0, -1.0, 0.0));

            collider1.friction(0.6);
            collider1.restitution(0.2);
            this.m_verse.addSolidObject(collider1);
        }

        for (int x = -6; x < 7; x++)
        {
            for (int z = -6; z < 7; z++)
            {
                SolidObject floor = new SolidObject();
                floor.worldTransform().position().set(x, -0.5, z);
                floor.setGeometry(cubeGeometry);

                floor.friction(0.6);
                floor.restitution(0.2);
                this.m_verse.addSolidObject(floor);
            }
        }
    }

    @Override
    public void handleInputs(WindowInputMap inputs) {}

    @Override
    public void update()
    {
        if (!this.m_stepping)
        {
            return;
        }

        this.m_verse.update(gPhysicsTimeStep, 20);
    }

    @Override
    public void render(Camera camera)
    {
        this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebug());

        Matrix4d modelMatrix = new Matrix4d();
        this.m_verse.dynamicObjects().forEach(object ->
        {
            object.worldTransform().computeModelMatrix(modelMatrix);
            switch (object.geometry())
            {
                case SphereGeometry _ -> this.renderer.renderObject(camera, modelMatrix, MESH_COLORS, ObjectRenderer.Type.SPHERE);
                case CuboidGeometry cuboid ->
                {
                    modelMatrix.scale(cuboid.halfExtents().mul(2.0, new Vector3d()));
                    this.renderer.renderObject(camera, modelMatrix, MESH_COLORS, ObjectRenderer.Type.CUBE);
                }
                default -> this.renderer.renderObject(camera, modelMatrix, MESH_COLORS, ObjectRenderer.Type.CUBE);
            }
        });

        this.m_verse.staticObjects().forEach(object ->
        {
            object.worldTransform().computeModelMatrix(modelMatrix);
            switch (object.geometry())
            {
                case SphereGeometry _ -> this.renderer.renderObject(camera, modelMatrix, MESH_COLORS, ObjectRenderer.Type.SPHERE);
                case CuboidGeometry cuboid ->
                {
                    modelMatrix.scale(cuboid.halfExtents().mul(2.0, new Vector3d()));
                    this.renderer.renderObject(camera, modelMatrix, MESH_COLORS, ObjectRenderer.Type.CUBE);
                }
                default -> this.renderer.renderObject(camera, modelMatrix, CONTACT_POINT_COLORS, ObjectRenderer.Type.CUBE);
            }
        });
    }

    @Override
    public void arrangeOverlay(NuklearContext context)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            SegmentAllocator textAllocator = SegmentAllocator.prefixAllocator(arena.allocateArray(ValueLayout.JAVA_CHAR, 128));

            if (nk_begin(context.pContext(), textAllocator.allocateUtf8String("Scene configuration"), nk_rect(arena, 20, 500, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE | NK_WINDOW_SCALABLE) != 0)
            {
                nk_layout_row_static(context.pContext(), 30, 140, 1);
                if (nk_checkbox_label(context.pContext(), textAllocator.allocateUtf8String("Pause simulation"), arena.allocate(ValueLayout.JAVA_INT, this.m_stepping ? 1 : 0)) != 0)
                {
                    this.m_stepping = !this.m_stepping;
                }
            }

            nk_end(context.pContext());
        }
    }

    @Override
    public void dispose() {}
}
