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

        SphereGeometry sphereGeometry = new SphereGeometry(0.5);

        // WALL 1
        {
            for (int x = 2; x < 3; x++)
            {
                for (int y = 0; y < 1; y++)
                {
                    DynamicSolidObject collider = new DynamicSolidObject(5.0, sphereGeometry);
                    collider.worldTransform().position().set(x * 1.2, y * 1.2, 0.0);

                    collider.applyCentralImpulse(new Vector3d(0.0, 0.0, 20.0));

                    collider.friction(0.6);
                    collider.restitution(0.6);
                    this.m_verse.addSolidObject(collider);
                }
            }
        }

        // WALL 2
        {
            for (int x = 0; x < 5; x++)
            {
                for (int y = 0; y < 5; y++)
                {
                    DynamicSolidObject collider = new DynamicSolidObject(1.0, sphereGeometry);
                    collider.worldTransform().position().set(x * 1.1, y * 1.1, 5.0);

                    collider.friction(0.6);
                    collider.restitution(0.6);
                    //this.m_verse.addSolidObject(collider);
                }
            }
        }

        // WALL 3
        SolidObject solidObject = new SolidObject();
        solidObject.setGeometry(new CuboidGeometry(new Vector3d(10.0, 10.0, 1.0)));
        solidObject.worldTransform().position().set(0.0, 0.0, 15.0);
        solidObject.worldTransform().rotation().rotateXYZ(0.5, 0.2, 0.3).normalize();

        solidObject.friction(0.7);
        solidObject.restitution(0.4);

        this.m_verse.addSolidObject(solidObject);
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
                default -> {}
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
                default -> {}
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
