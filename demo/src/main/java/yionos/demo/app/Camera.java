package yionos.demo.app;

import org.joml.Matrix4d;
import org.joml.Vector3d;

import static yionos.MathDefinitions.*;

public class Camera
{
    private static final double gMinCameraPitch = 0.005;
    private static final double gMaxCameraPitch = PI - gMinCameraPitch;
    private static final double gMinCameraDistance = 0.1;
    private static final double gMaxCameraDistance = 500.0;

    private final Matrix4d m_projectionMatrix = new Matrix4d();
    private final Matrix4d m_clippingMatrix = new Matrix4d();
    private final Vector3d m_target = new Vector3d();
    private double m_distance, m_pitch, m_yaw;

    private final Vector3d m_defaultTarget;
    private final double m_defaultDistance, m_defaultPitch, m_defaultYaw;

    public Camera(Vector3d target, Vector3d position)
    {
        this.m_defaultTarget = new Vector3d(target);
        this.m_defaultDistance = clamp(position.length(), gMinCameraDistance, gMaxCameraDistance);
        this.m_defaultPitch = clamp(arccos(position.y / this.m_defaultDistance), gMinCameraPitch, gMaxCameraPitch);
        this.m_defaultYaw = atan2(position.z, position.x);

        this.reset();
    }

    public void reset()
    {
        this.m_target.set(this.m_defaultTarget);
        this.m_distance = this.m_defaultDistance;
        this.m_pitch = this.m_defaultPitch;
        this.m_yaw = this.m_defaultYaw;
    }

    public void setProjection(double fov, double aspectRatio, double near, double far)
    {
        this.m_projectionMatrix.setPerspective(fov, aspectRatio, near, far, true);
        /*double f = cot(fov * 0.5);
        double g = far / (near - far);

        this.m_projectionMatrix.zero()
                .m00(f / aspectRatio)
                .m11(f)
                .m22(g).m23(-1.0)
                .m32(g * near);*/
    }

    public Matrix4d projectionMatrix()
    {
        return this.m_projectionMatrix;
    }

    public void transformationMatrix(Matrix4d modelMatrix, Matrix4d dest)
    {
        this.m_clippingMatrix.mul(modelMatrix, dest);
    }

    public void updateViewMatrix()
    {
        double cosTheta = cos(this.m_pitch), cosPhi = cos(this.m_yaw);
        double sinTheta = sin(this.m_pitch), sinPhi = sin(this.m_yaw);

        Vector3d uR = new Vector3d(sinTheta * sinPhi, cosTheta, sinTheta * cosPhi);
        Vector3d uTheta = new Vector3d(cosTheta * sinPhi, -sinTheta, cosTheta * cosPhi);

        Vector3d eye = uR.mul(this.m_distance, new Vector3d()).add(this.m_target);

        this.m_projectionMatrix.lookAt(eye, this.m_target, uTheta.negate(), this.m_clippingMatrix);
    }

    public void translate(double offset)
    {
        this.m_distance = clamp(this.m_distance * pow(1.1, offset), gMinCameraDistance, gMaxCameraDistance);
    }

    public void rotate(double xOffset, double yOffset)
    {
        this.m_yaw = (this.m_yaw + xOffset) % PIx2;
        this.m_pitch = clamp(this.m_pitch + yOffset, gMinCameraPitch, gMaxCameraPitch);
    }

    public void moveTarget(double x, double y)
    {
        double cosTheta = cos(this.m_pitch), cosPhi = cos(this.m_yaw);
        double sinTheta = sin(this.m_pitch), sinPhi = sin(this.m_yaw);

        Vector3d uTheta = new Vector3d(cosTheta * sinPhi, -sinTheta, cosTheta * cosPhi);
        Vector3d uPhi = new Vector3d(cosPhi, 0.0, -sinPhi);

        this.m_target.add(uPhi.mul(x).add(uTheta.mul(y)).mul(this.m_distance));
    }

    public void changeTarget(Vector3d target)
    {
        this.m_target.set(target);
    }
}
