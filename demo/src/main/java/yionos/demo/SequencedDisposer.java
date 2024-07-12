package yionos.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import java.util.function.Function;

public class SequencedDisposer implements AutoCloseable
{
    private final Deque<Disposable> m_stack = new ArrayDeque<>();

    public SequencedDisposer() {}

    public static void wrap(Consumer<SequencedDisposer> action)
    {
        SequencedDisposer disposer = new SequencedDisposer();
        try
        {
            action.accept(disposer);
        }
        catch (Throwable t)
        {
            disposer.close();
            throw t;
        }
    }

    public static <T> T wrap(Function<SequencedDisposer, T> action)
    {
        SequencedDisposer disposer = new SequencedDisposer();
        try
        {
            return action.apply(disposer);
        }
        catch (Throwable t)
        {
            disposer.close();
            throw t;
        }
    }

    public void push(Disposable disposable)
    {
        this.m_stack.push(disposable);
    }

    @Override
    public void close()
    {
        while (!this.m_stack.isEmpty())
        {
            this.m_stack.pop().dispose();
        }
    }
}
