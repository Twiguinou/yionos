package yionos.detection;

import org.joml.Vector3d;
import yionos.dynamics.SolidObject;

public class CollisionManifold
{
    public static final class ContactInfo
    {
        public final Vector3d posA = new Vector3d(), posB = new Vector3d();
        public final Vector3d normalA = new Vector3d(), normalB = new Vector3d();
        public double penetration = 0.0;
    }

    private static final int gMaxContactInfoCount = 8;

    private final ContactInfo[] m_contacts = new ContactInfo[gMaxContactInfoCount];
    private int m_nextIndex = 0;
    public SolidObject object1, object2;
    public double normalLagrange = 0.0, tangentLagrange = 0.0;

    public CollisionManifold()
    {
        for (int i = 0; i < this.m_contacts.length; i++)
        {
            this.m_contacts[i] = new ContactInfo();
        }
    }

    public int contactCount()
    {
        return this.m_nextIndex;
    }

    public ContactInfo contact(int index)
    {
        assert (index < this.m_nextIndex) && (index >= 0);

        return this.m_contacts[index];
    }

    public ContactInfo push()
    {
        assert this.m_nextIndex < gMaxContactInfoCount;

        return this.m_contacts[this.m_nextIndex++];
    }

    public void reset()
    {
        this.m_nextIndex = 0;
    }
}
