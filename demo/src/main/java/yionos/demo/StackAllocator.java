package yionos.demo;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static java.lang.foreign.MemorySegment.NULL;

public final class StackAllocator implements Arena
{
    private static final long gWholeStackSize = 1_000_000;
    private static final ThreadLocal<StackAllocator> gStackMap = ThreadLocal.withInitial(() -> new StackAllocator(null));

    private final Arena m_arena;
    private final boolean m_initial;
    private MemorySegment m_frameSlice;

    private StackAllocator(@Nullable StackAllocator previous)
    {
        if (previous != null)
        {
            this.m_arena = Arena.ofConfined();
            this.m_frameSlice = previous.m_frameSlice.reinterpret(this.m_arena, null);
            this.m_initial = false;
        }
        else
        {
            this.m_arena = Arena.ofAuto();
            this.m_frameSlice = this.m_arena.allocate(gWholeStackSize);
            this.m_initial = true;
        }
    }

    private static long alignAddress(long address, long alignment)
    {
        return (address + alignment - 1) & -alignment;
    }

    @Override
    public MemorySegment.Scope scope()
    {
        return this.m_arena.scope();
    }

    public Arena push()
    {
        return new StackAllocator(this);
    }

    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment)
    {
        if (this.m_initial) return NULL;

        // Should we cleanup the returned segment first?
        long address = this.m_frameSlice.address();
        long offset = alignAddress(address, byteAlignment) - address;

        MemorySegment userSegment = this.m_frameSlice.asSlice(offset, byteSize, byteAlignment);
        userSegment.fill((byte)0);
        this.m_frameSlice = this.m_frameSlice.asSlice(offset + byteSize);

        return userSegment;
    }

    @Override
    public void close()
    {
        if (!this.m_initial)
        {
            this.m_arena.close();
        }
    }

    public static Arena stackPush()
    {
        return Thread.currentThread().isVirtual() ? Arena.ofConfined() : gStackMap.get().push();
    }
}
