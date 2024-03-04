package yionos.dynamics.constraints;

import yionos.dynamics.SolidObject;

public abstract class PairedConstraint implements Constraint
{
    private final SolidObject m_object1;
    private final SolidObject m_object2;

    protected PairedConstraint(SolidObject object1, SolidObject object2)
    {
        this.m_object1 = object1;
        this.m_object2 = object2;
    }

    public SolidObject object1()
    {
        return this.m_object1;
    }

    public SolidObject object2()
    {
        return this.m_object2;
    }
}
