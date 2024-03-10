#ifndef YIONOS_CONTRAPTION_GENERIC_ARRAY_LIST
#define YIONOS_CONTRAPTION_GENERIC_ARRAY_LIST

#include "CommonToolset.h"

#include <cstdint>
#include <new>

namespace yionos
{

template<typename T>
class GenericArrayList
{
    uint32_t m_capacity, m_size;
    T *m_buffer;

public:
    GenericArrayList()
    : m_capacity(0), m_size(0), m_buffer(nullptr)
    {}

    explicit GenericArrayList(uint32_t initialCapacity)
    : m_capacity(initialCapacity), m_size(0)
    {
        if (initialCapacity == 0)
        {
            m_buffer = nullptr;
            return;
        }

        m_buffer = new T[initialCapacity];
    }

    ~GenericArrayList()
    {
        delete[] m_buffer;
    }

    YIONOS_ALWAYS_INLINE uint32_t size() const
    {
        return m_size;
    }

    YIONOS_ALWAYS_INLINE uint32_t capacity() const
    {
        return m_capacity;
    }

    YIONOS_ALWAYS_INLINE bool isEmpty() const
    {
        return m_size == 0;
    }

    YIONOS_ALWAYS_INLINE T& operator[](uint32_t index) const
    {
        YIONOS_ASSERT(index < m_size);
        return m_buffer[index];
    }

    YIONOS_ALWAYS_INLINE void grow()
    {
        uint32_t newCapacity = m_capacity == 0 ? 1 : (m_capacity << 1);
        T* newBuffer = new T[newCapacity];

        for (uint32_t i = 0; i < m_capacity; i++)
        {
            new(&newBuffer[i]) T(m_buffer[i]);
            m_buffer[i].~T();
        }

        delete[] m_buffer;
        m_buffer = newBuffer;
        m_capacity = newCapacity;
    }

    YIONOS_ALWAYS_INLINE T& push(const T& e)
    {
        if (m_size == m_capacity)
        {
            grow();
        }

        return *(new(&m_buffer[m_size++]) T(e));
    }

    YIONOS_ALWAYS_INLINE T pop()
    {
        YIONOS_ASSERT(m_size > 0);

        T end = m_buffer[--m_size];
        m_buffer[m_size].~T();

        return end;
    }

    YIONOS_ALWAYS_INLINE void remove(uint32_t index)
    {
        YIONOS_ASSERT(index < m_size);

        m_buffer[index] = m_buffer[--m_size];
        m_buffer[m_size].~T();
    }

    YIONOS_ALWAYS_INLINE void shiftRemove(uint32_t index)
    {
        YIONOS_ASSERT(index < m_size);

        m_buffer[index].~T();

        --m_size;
        while (index < m_size)
        {
            new(&m_buffer[index]) T(m_buffer[index + 1]);
            m_buffer[index + 1].~T();
        }
    }

    YIONOS_ALWAYS_INLINE void reserve(uint32_t capacity)
    {
        if (capacity <= m_capacity) return;

        T* newBuffer = new T[capacity];

        for (uint32_t i = 0; i < m_capacity; i++)
        {
            new (&newBuffer[i]) T(m_buffer[i]);
            m_buffer[i].~T();
        }

        delete[] m_buffer;
        m_buffer = newBuffer;
        m_capacity = capacity;
    }

    YIONOS_ALWAYS_INLINE void trim()
    {
        T* newBuffer;
        if (m_size == 0)
        {
            newBuffer = nullptr;
        }
        else
        {
            newBuffer = new T[m_size];
            for (uint32_t i = 0; i < m_size; i++)
            {
                new(&newBuffer[i]) T(m_buffer[i]);
                m_buffer[i].~T();
            }
        }

        delete[] m_buffer;
        m_buffer = newBuffer;
        m_capacity = m_size;
    }

    YIONOS_ALWAYS_INLINE void clear()
    {
        m_size = 0;
    }
};

} /* yionos */

#endif /* YIONOS_CONTRAPTION_GENERIC_ARRAY_LIST */
