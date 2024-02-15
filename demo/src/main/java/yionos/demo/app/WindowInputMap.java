package yionos.demo.app;

import yionos.demo.WindowProcessor;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static glfw3.GLFW3.*;

public class WindowInputMap
{
    /**
     * The input information is stored as a single long acquired by concatenating the modifiers of the key with its action.
     * The leftmost 32 bits contain the modifiers, while the rightmost 32 bits contain the action.
     */

    private static final long DEFAULT_INPUT_VALUE = ((long)0 << 32) | GLFW_RELEASE;

    private final long[] m_keyInputs = new long[GLFW_KEY_MENU + 1], m_previousKeyInputs;
    private final long[] m_mouseInputs = new long[3], m_previousMouseInputs;
    private final Queue<Integer> m_keysToTrace = new ArrayDeque<>();
    private final Queue<Integer> m_mouseInputsToTrace = new ArrayDeque<>();
    private double m_mousePosX = 0.d, m_mousePosY = 0.d;
    private double m_previousMousePosX = 0.d, m_previousMousePosY = 0.d;

    public WindowInputMap(WindowProcessor window)
    {
        Arrays.fill(this.m_keyInputs, DEFAULT_INPUT_VALUE);
        this.m_previousKeyInputs = Arrays.copyOf(this.m_keyInputs, this.m_keyInputs.length);

        Arrays.fill(this.m_mouseInputs, DEFAULT_INPUT_VALUE);
        this.m_previousMouseInputs = Arrays.copyOf(this.m_mouseInputs, this.m_mouseInputs.length);

        window.registerKeyInputCallback((key, _, action, mods) ->
        {
            if (key >= 0 && key < this.m_keyInputs.length)
            {
                this.m_previousKeyInputs[key] = this.m_keyInputs[key];
                this.m_keyInputs[key] = encodeInput(action, mods);
                this.m_keysToTrace.offer(key);
            }
        });

        window.registerMousePosCallback((x, y) ->
        {
            this.m_previousMousePosX = this.m_mousePosX;
            this.m_previousMousePosY = this.m_mousePosY;
            this.m_mousePosX = x;
            this.m_mousePosY = y;
        });

        window.registerMouseButtonCallback((button, action, mods) ->
        {
            if (button >= 0 && button < this.m_mouseInputs.length)
            {
                this.m_previousMouseInputs[button] = this.m_mouseInputs[button];
                this.m_mouseInputs[button] = encodeInput(action, mods);
                this.m_mouseInputsToTrace.offer(button);
            }
        });
    }

    private static long encodeInput(int action, int mods)
    {
        return ((long) mods << 32) | (long) action;
    }

    public void trace()
    {
        while (!this.m_keysToTrace.isEmpty())
        {
            int key = this.m_keysToTrace.poll();
            this.m_previousKeyInputs[key] = this.m_keyInputs[key];
        }

        while (!this.m_mouseInputsToTrace.isEmpty())
        {
            int key = this.m_mouseInputsToTrace.poll();
            this.m_previousMouseInputs[key] = this.m_mouseInputs[key];
        }

        this.m_previousMousePosX = this.m_mousePosX;
        this.m_previousMousePosY = this.m_mousePosY;
    }

    public int keyAction(int key)
    {
        return (int)this.m_keyInputs[key];
    }

    public int previousKeyAction(int key)
    {
        return (int)this.m_previousKeyInputs[key];
    }

    public int keyMods(int key)
    {
        return (int)(this.m_keyInputs[key] >> 32);
    }

    public int previousKeyMods(int key)
    {
        return (int)(this.m_previousKeyInputs[key] >> 32);
    }

    public int mouseAction(int button)
    {
        return (int)this.m_mouseInputs[button];
    }

    public int previousMouseAction(int button)
    {
        return (int)this.m_previousMouseInputs[button];
    }

    public int mouseMods(int button)
    {
        return (int)(this.m_mouseInputs[button] >> 32);
    }

    public int previousMouseMods(int button)
    {
        return (int)(this.m_previousMouseInputs[button] >> 32);
    }

    public double mouseX()
    {
        return this.m_mousePosX;
    }

    public double previousMouseX()
    {
        return this.m_previousMousePosX;
    }

    public double mouseY()
    {
        return this.m_mousePosY;
    }

    public double previousMouseY()
    {
        return this.m_previousMousePosY;
    }

    public boolean keyToggled(int key)
    {
        return this.keyAction(key) == GLFW_PRESS && this.previousKeyAction(key) == GLFW_RELEASE;
    }

    public boolean keyToggledWithMods(int key, int mods)
    {
        return this.keyToggled(key) && (this.keyMods(key) & mods) != 0;
    }

    public boolean keyDown(int key)
    {
        int action = this.keyAction(key);
        return action == GLFW_PRESS || action == GLFW_REPEAT;
    }

    public double displacementX()
    {
        return this.m_mousePosX - this.m_previousMousePosX;
    }

    public double displacementY()
    {
        return this.m_mousePosY - this.m_previousMousePosY;
    }
}
