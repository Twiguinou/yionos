package yionos.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class SequenceInitializer
{
    private final Deque<Disposable> m_stack = new ArrayDeque<>();

    public SequenceInitializer() {}

    public void push(Disposable disposable)
    {
        this.m_stack.push(disposable);
    }

    public void empty()
    {
        while (!this.m_stack.isEmpty())
        {
            this.m_stack.pop().dispose();
        }
    }
}
