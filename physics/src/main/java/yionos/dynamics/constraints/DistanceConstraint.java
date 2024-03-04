package yionos.dynamics.constraints;

import yionos.dynamics.SolidObject;

public class DistanceConstraint extends PairedConstraint
{
    private double m_distance;

    public DistanceConstraint(SolidObject object1, SolidObject object2, double distance)
    {
        super(object1, object2);
        this.distance(distance);
    }

    public double distance()
    {
        return this.m_distance;
    }

    public void distance(double distance)
    {
        if (distance <= 0)
        {
            throw new IllegalArgumentException("Invalid distance setting for constraint.");
        }

        this.m_distance = distance;
    }
}
