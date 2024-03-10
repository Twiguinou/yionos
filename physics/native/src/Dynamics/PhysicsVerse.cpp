#include "PhysicsVerse.h"

using namespace yionos;

PhysicsVerse::PhysicsVerse(uint32_t initialObjectCapacity)
: m_objectsIdentifiers(initialObjectCapacity)
{
}

PhysicsVerse::~PhysicsVerse()
{
    delete[] m_motionStates;
}

void PhysicsVerse::update(double dt)
{
}

ObjectIdentifier PhysicsVerse::registerObject(const ObjectCreateInfo &objectCreateInfo)
{
    // First, pool a new identifier
    ObjectIdentifier id = m_objectsIdentifiers.take();

    MotionState& state = m_motionStates[id];
    state.transform = objectCreateInfo.transform;
    state.previousTransform = objectCreateInfo.transform;
    state.linearVelocity = objectCreateInfo.linearVelocity;
    state.angularVelocity = objectCreateInfo.angularVelocity;

    return id;
}

void PhysicsVerse::removeObject(ObjectIdentifier identifier)
{
}
