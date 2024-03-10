#ifndef YIONOS_CONTRAPTION_IDENTIFIERS
#define YIONOS_CONTRAPTION_IDENTIFIERS

#include "GenericArrayList.h"

#include <cstdint>
#include <cstring>

namespace yionos
{

class Identifiers
{
    uint32_t m_storageSize, m_storageCapacity;
    uint32_t *m_storage;
    uint32_t m_nextIdentifier;

public:
    explicit Identifiers(uint32_t initialCapacity)
    : m_storageSize(0), m_storageCapacity(initialCapacity), m_nextIdentifier(0)
    {
        if (initialCapacity == 0)
        {
            m_storage = nullptr;
            return;
        }

        m_storage = new uint32_t[initialCapacity];
    }

    ~Identifiers()
    {
        delete[] m_storage;
    }

    YIONOS_ALWAYS_INLINE uint32_t take()
    {
        if (m_storageSize > 0)
        {
            return m_storage[--m_storageSize];
        }

        return m_nextIdentifier++;
    }

    YIONOS_ALWAYS_INLINE void release(uint32_t id)
    {
        if (m_storageSize == m_storageCapacity)
        {
            if (m_storageCapacity == 0)
            {
                m_storage = new uint32_t(id);
                m_storageCapacity = 1;
            }
            else
            {
                m_storageCapacity <<= 1;
                uint32_t *newStorage = new uint32_t[m_storageCapacity];
                memcpy(newStorage, m_storage, sizeof(uint32_t) * m_storageSize);

                delete[] m_storage;
                m_storage = newStorage;
            }
        }

        m_storage[m_storageSize++] = id;
    }

    YIONOS_ALWAYS_INLINE void reset()
    {
        m_storageSize = 0;
        m_nextIdentifier = 0;
    }
};

} /* yionos */

#endif /* YIONOS_CONTRAPTION_IDENTIFIERS */
