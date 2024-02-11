package yionos.demo.app;

import yionos.demo.WindowProcessor;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static glfw3.GLFW3.*;

public class WindowInputMap
{
    private final int[] m_keyInputs = new int[GLFW_KEY_MENU + 1], m_previousKeyInputs;
    private final int[] m_mouseInputs = new int[3], m_previousMouseInputs;
    private final Queue<Integer> m_keysToTrace = new ArrayDeque<>();
    private final Queue<Integer> m_mouseInputsToTrace = new ArrayDeque<>();
    private double m_mousePosX = 0.d, m_mousePosY = 0.d;
    private double m_previousMousePosX = 0.d, m_previousMousePosY = 0.d;

    public WindowInputMap(WindowProcessor window)
    {
        Arrays.fill(this.m_keyInputs, GLFW_RELEASE);
        this.m_previousKeyInputs = Arrays.copyOf(this.m_keyInputs, this.m_keyInputs.length);

        Arrays.fill(this.m_mouseInputs, GLFW_RELEASE);
        this.m_previousMouseInputs = Arrays.copyOf(this.m_mouseInputs, this.m_mouseInputs.length);

        window.registerKeyInputCallback((key, _, action, _) ->
        {
            if (key >= 0 && key < this.m_keyInputs.length)
            {
                this.m_previousKeyInputs[key] = this.m_keyInputs[key];
                this.m_keyInputs[key] = action;
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

        window.registerMouseButtonCallback((button, action, _) ->
        {
            if (button >= 0 && button < this.m_mouseInputs.length)
            {
                this.m_previousMouseInputs[button] = this.m_mouseInputs[button];
                this.m_mouseInputs[button] = action;
                this.m_mouseInputsToTrace.offer(button);
            }
        });
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
    }

    public int keyInput(int key) {return this.m_keyInputs[key];}
    public int previousKeyInput(int key) {return this.m_previousKeyInputs[key];}

    public int mouseInput(int button) {return this.m_mouseInputs[button];}
    public int previousMouseInput(int button) {return this.m_previousMouseInputs[button];}

    public double mouseX() {return this.m_mousePosX;}
    public double previousMouseX() {return this.m_previousMousePosX;}
    public double mouseY() {return this.m_mousePosY;}
    public double previousMouseY() {return this.m_previousMousePosY;}

    public boolean keyToggled(int key)
    {
        return this.m_keyInputs[key] == GLFW_PRESS && this.m_previousKeyInputs[key] == GLFW_RELEASE;
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
