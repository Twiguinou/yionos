#ifndef YIONOS_DYNAMICS_PHYSICS_VERSE
#define YIONOS_DYNAMICS_PHYSICS_VERSE

#include <Contraption/Identifiers.h>
#include <Contraption/Transform.h>
#include <Contraption/Matrix3.h>

namespace yionos
{

struct ObjectCreateInfo
{
    Transform transform;
    Vector3 linearVelocity, angularVelocity;
    double mass;
    Matrix3 inertia;
};

struct MotionState
{
    Transform transform, previousTransform;
    Vector3 linearVelocity, angularVelocity;
};

typedef uint32_t ObjectIdentifier;

class PhysicsVerse
{
    Identifiers m_objectsIdentifiers;
    MotionState *m_motionStates;
    uint32_t m_objectCount;

public:
    PhysicsVerse(uint32_t initialObjectCapacity);

    ~PhysicsVerse();

    void update(double dt);

    ObjectIdentifier registerObject(const ObjectCreateInfo &objectCreateInfo);

    void removeObject(ObjectIdentifier identifier);
};

} /* yionos */

#endif /* YIONOS_DYNAMICS_PHYSICS_VERSE */
