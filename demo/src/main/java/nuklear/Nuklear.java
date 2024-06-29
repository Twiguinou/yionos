package nuklear;

public final class Nuklear
{private Nuklear() {}

    public static final int nk_false = 0;
    public static final int nk_true = 1;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_init_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_init_default;
    public static int nk_init_default(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_init_default.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD__nk_init_fixed;
    public static int nk_init_fixed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment memory, long size, java.lang.foreign.MemorySegment __arg4)
    {
        try {return (int)MTD__nk_init_fixed.invokeExact(__arg1, memory, size, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_init;
    public static int nk_init(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (int)MTD__nk_init.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_init_custom;
    public static final java.lang.invoke.MethodHandle MTD__nk_init_custom;
    public static int nk_init_custom(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment __arg4)
    {
        try {return (int)MTD__nk_init_custom.invokeExact(__arg1, cmds, pool, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_clear;
    public static final java.lang.invoke.MethodHandle MTD__nk_clear;
    public static void nk_clear(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_clear.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_free;
    public static final java.lang.invoke.MethodHandle MTD__nk_free;
    public static void nk_free(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_free.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_begin;
    public static void nk_input_begin(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_input_begin.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_motion;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_motion;
    public static void nk_input_motion(java.lang.foreign.MemorySegment __arg1, int x, int y)
    {
        try {MTD__nk_input_motion.invokeExact(__arg1, x, y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_key;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_key;
    public static void nk_input_key(java.lang.foreign.MemorySegment __arg1, int __arg2, int down)
    {
        try {MTD__nk_input_key.invokeExact(__arg1, __arg2, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_button;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_button;
    public static void nk_input_button(java.lang.foreign.MemorySegment __arg1, int __arg2, int x, int y, int down)
    {
        try {MTD__nk_input_button.invokeExact(__arg1, __arg2, x, y, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_scroll;
    public static void nk_input_scroll(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 val)
    {
        try {MTD__nk_input_scroll.invokeExact(__arg1, val._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_char;
    public static void nk_input_char(java.lang.foreign.MemorySegment __arg1, byte __arg2)
    {
        try {MTD__nk_input_char.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_glyph;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_glyph;
    public static void nk_input_glyph(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_input_glyph.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_unicode;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_unicode;
    public static void nk_input_unicode(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {MTD__nk_input_unicode.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_end;
    public static void nk_input_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_input_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__begin;
    public static final java.lang.invoke.MethodHandle MTD__nk__begin;
    public static java.lang.foreign.MemorySegment nk__begin(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__begin.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__next;
    public static final java.lang.invoke.MethodHandle MTD__nk__next;
    public static java.lang.foreign.MemorySegment nk__next(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__next.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_convert;
    public static final java.lang.invoke.MethodHandle MTD__nk_convert;
    public static int nk_convert(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment vertices, java.lang.foreign.MemorySegment elements, java.lang.foreign.MemorySegment __arg5)
    {
        try {return (int)MTD__nk_convert.invokeExact(__arg1, cmds, vertices, elements, __arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_begin;
    public static java.lang.foreign.MemorySegment nk__draw_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_begin.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_end;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_end;
    public static java.lang.foreign.MemorySegment nk__draw_end(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_end.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_next;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_next;
    public static java.lang.foreign.MemorySegment nk__draw_next(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_next.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_begin;
    public static int nk_begin(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment title, nuklear.nk_rect bounds, int flags)
    {
        try {return (int)MTD__nk_begin.invokeExact(ctx, title, bounds._ptr(), flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_begin_titled;
    public static final java.lang.invoke.MethodHandle MTD__nk_begin_titled;
    public static int nk_begin_titled(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment title, nuklear.nk_rect bounds, int flags)
    {
        try {return (int)MTD__nk_begin_titled.invokeExact(ctx, name, title, bounds._ptr(), flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_end;
    public static void nk_end(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD__nk_end.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_find;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_find;
    public static java.lang.foreign.MemorySegment nk_window_find(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_window_find.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_bounds;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_bounds;
    public static nuklear.nk_rect nk_window_get_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment ctx)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_window_get_bounds.invokeExact(allocator, ctx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_position;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_position;
    public static nuklear.nk_vec2 nk_window_get_position(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment ctx)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_window_get_position.invokeExact(allocator, ctx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_size;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_size;
    public static nuklear.nk_vec2 nk_window_get_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_window_get_size.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_width;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_width;
    public static float nk_window_get_width(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (float)MTD__nk_window_get_width.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_height;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_height;
    public static float nk_window_get_height(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (float)MTD__nk_window_get_height.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_panel;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_panel;
    public static java.lang.foreign.MemorySegment nk_window_get_panel(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_window_get_panel.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_content_region;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_content_region;
    public static nuklear.nk_rect nk_window_get_content_region(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_window_get_content_region.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_content_region_min;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_content_region_min;
    public static nuklear.nk_vec2 nk_window_get_content_region_min(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_window_get_content_region_min.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_content_region_max;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_content_region_max;
    public static nuklear.nk_vec2 nk_window_get_content_region_max(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_window_get_content_region_max.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_content_region_size;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_content_region_size;
    public static nuklear.nk_vec2 nk_window_get_content_region_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_window_get_content_region_size.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_canvas;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_canvas;
    public static java.lang.foreign.MemorySegment nk_window_get_canvas(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_window_get_canvas.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_get_scroll;
    public static void nk_window_get_scroll(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment offset_x, java.lang.foreign.MemorySegment offset_y)
    {
        try {MTD__nk_window_get_scroll.invokeExact(__arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_has_focus;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_has_focus;
    public static int nk_window_has_focus(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_window_has_focus.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_hovered;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_hovered;
    public static int nk_window_is_hovered(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_window_is_hovered.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_collapsed;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_collapsed;
    public static int nk_window_is_collapsed(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD__nk_window_is_collapsed.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_closed;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_closed;
    public static int nk_window_is_closed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_window_is_closed.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_hidden;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_hidden;
    public static int nk_window_is_hidden(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_window_is_hidden.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_active;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_active;
    public static int nk_window_is_active(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_window_is_active.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_is_any_hovered;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_is_any_hovered;
    public static int nk_window_is_any_hovered(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_window_is_any_hovered.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_item_is_any_active;
    public static final java.lang.invoke.MethodHandle MTD__nk_item_is_any_active;
    public static int nk_item_is_any_active(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_item_is_any_active.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_set_bounds;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_set_bounds;
    public static void nk_window_set_bounds(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, nuklear.nk_rect bounds)
    {
        try {MTD__nk_window_set_bounds.invokeExact(__arg1, name, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_set_position;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_set_position;
    public static void nk_window_set_position(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, nuklear.nk_vec2 pos)
    {
        try {MTD__nk_window_set_position.invokeExact(__arg1, name, pos._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_set_size;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_set_size;
    public static void nk_window_set_size(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, nuklear.nk_vec2 __arg3)
    {
        try {MTD__nk_window_set_size.invokeExact(__arg1, name, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_set_focus;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_set_focus;
    public static void nk_window_set_focus(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name)
    {
        try {MTD__nk_window_set_focus.invokeExact(__arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_set_scroll;
    public static void nk_window_set_scroll(java.lang.foreign.MemorySegment __arg1, int offset_x, int offset_y)
    {
        try {MTD__nk_window_set_scroll.invokeExact(__arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_close;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_close;
    public static void nk_window_close(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {MTD__nk_window_close.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_collapse;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_collapse;
    public static void nk_window_collapse(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int state)
    {
        try {MTD__nk_window_collapse.invokeExact(__arg1, name, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_collapse_if;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_collapse_if;
    public static void nk_window_collapse_if(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int __arg3, int cond)
    {
        try {MTD__nk_window_collapse_if.invokeExact(__arg1, name, __arg3, cond);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_show;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_show;
    public static void nk_window_show(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int __arg3)
    {
        try {MTD__nk_window_show.invokeExact(__arg1, name, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_window_show_if;
    public static final java.lang.invoke.MethodHandle MTD__nk_window_show_if;
    public static void nk_window_show_if(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int __arg3, int cond)
    {
        try {MTD__nk_window_show_if.invokeExact(__arg1, name, __arg3, cond);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rule_horizontal;
    public static final java.lang.invoke.MethodHandle MTD__nk_rule_horizontal;
    public static void nk_rule_horizontal(java.lang.foreign.MemorySegment ctx, nuklear.nk_color color, int rounding)
    {
        try {MTD__nk_rule_horizontal.invokeExact(ctx, color._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_set_min_row_height;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_set_min_row_height;
    public static void nk_layout_set_min_row_height(java.lang.foreign.MemorySegment __arg1, float height)
    {
        try {MTD__nk_layout_set_min_row_height.invokeExact(__arg1, height);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_reset_min_row_height;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_reset_min_row_height;
    public static void nk_layout_reset_min_row_height(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_layout_reset_min_row_height.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_widget_bounds;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_widget_bounds;
    public static nuklear.nk_rect nk_layout_widget_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_layout_widget_bounds.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_ratio_from_pixel;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_ratio_from_pixel;
    public static float nk_layout_ratio_from_pixel(java.lang.foreign.MemorySegment __arg1, float pixel_width)
    {
        try {return (float)MTD__nk_layout_ratio_from_pixel.invokeExact(__arg1, pixel_width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_dynamic;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_dynamic;
    public static void nk_layout_row_dynamic(java.lang.foreign.MemorySegment ctx, float height, int cols)
    {
        try {MTD__nk_layout_row_dynamic.invokeExact(ctx, height, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_static;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_static;
    public static void nk_layout_row_static(java.lang.foreign.MemorySegment ctx, float height, int item_width, int cols)
    {
        try {MTD__nk_layout_row_static.invokeExact(ctx, height, item_width, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_begin;
    public static void nk_layout_row_begin(java.lang.foreign.MemorySegment ctx, int fmt, float row_height, int cols)
    {
        try {MTD__nk_layout_row_begin.invokeExact(ctx, fmt, row_height, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_push;
    public static void nk_layout_row_push(java.lang.foreign.MemorySegment __arg1, float value)
    {
        try {MTD__nk_layout_row_push.invokeExact(__arg1, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_end;
    public static void nk_layout_row_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_layout_row_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row;
    public static void nk_layout_row(java.lang.foreign.MemorySegment __arg1, int __arg2, float height, int cols, java.lang.foreign.MemorySegment ratio)
    {
        try {MTD__nk_layout_row.invokeExact(__arg1, __arg2, height, cols, ratio);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_template_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_template_begin;
    public static void nk_layout_row_template_begin(java.lang.foreign.MemorySegment __arg1, float row_height)
    {
        try {MTD__nk_layout_row_template_begin.invokeExact(__arg1, row_height);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_template_push_dynamic;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_template_push_dynamic;
    public static void nk_layout_row_template_push_dynamic(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_layout_row_template_push_dynamic.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_template_push_variable;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_template_push_variable;
    public static void nk_layout_row_template_push_variable(java.lang.foreign.MemorySegment __arg1, float min_width)
    {
        try {MTD__nk_layout_row_template_push_variable.invokeExact(__arg1, min_width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_template_push_static;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_template_push_static;
    public static void nk_layout_row_template_push_static(java.lang.foreign.MemorySegment __arg1, float width)
    {
        try {MTD__nk_layout_row_template_push_static.invokeExact(__arg1, width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_row_template_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_row_template_end;
    public static void nk_layout_row_template_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_layout_row_template_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_begin;
    public static void nk_layout_space_begin(java.lang.foreign.MemorySegment __arg1, int __arg2, float height, int widget_count)
    {
        try {MTD__nk_layout_space_begin.invokeExact(__arg1, __arg2, height, widget_count);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_push;
    public static void nk_layout_space_push(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect bounds)
    {
        try {MTD__nk_layout_space_push.invokeExact(__arg1, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_end;
    public static void nk_layout_space_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_layout_space_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_bounds;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_bounds;
    public static nuklear.nk_rect nk_layout_space_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_layout_space_bounds.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_to_screen;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_to_screen;
    public static nuklear.nk_vec2 nk_layout_space_to_screen(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 __arg2)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_layout_space_to_screen.invokeExact(allocator, __arg1, __arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_to_local;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_to_local;
    public static nuklear.nk_vec2 nk_layout_space_to_local(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 __arg2)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_layout_space_to_local.invokeExact(allocator, __arg1, __arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_rect_to_screen;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_rect_to_screen;
    public static nuklear.nk_rect nk_layout_space_rect_to_screen(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_layout_space_rect_to_screen.invokeExact(allocator, __arg1, __arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_layout_space_rect_to_local;
    public static final java.lang.invoke.MethodHandle MTD__nk_layout_space_rect_to_local;
    public static nuklear.nk_rect nk_layout_space_rect_to_local(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_layout_space_rect_to_local.invokeExact(allocator, __arg1, __arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_spacer;
    public static final java.lang.invoke.MethodHandle MTD__nk_spacer;
    public static void nk_spacer(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_spacer.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_begin;
    public static int nk_group_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment title, int __arg3)
    {
        try {return (int)MTD__nk_group_begin.invokeExact(__arg1, title, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_begin_titled;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_begin_titled;
    public static int nk_group_begin_titled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment title, int __arg4)
    {
        try {return (int)MTD__nk_group_begin_titled.invokeExact(__arg1, name, title, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_end;
    public static void nk_group_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_group_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_scrolled_offset_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_scrolled_offset_begin;
    public static int nk_group_scrolled_offset_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment x_offset, java.lang.foreign.MemorySegment y_offset, java.lang.foreign.MemorySegment title, int flags)
    {
        try {return (int)MTD__nk_group_scrolled_offset_begin.invokeExact(__arg1, x_offset, y_offset, title, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_scrolled_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_scrolled_begin;
    public static int nk_group_scrolled_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment off, java.lang.foreign.MemorySegment title, int __arg4)
    {
        try {return (int)MTD__nk_group_scrolled_begin.invokeExact(__arg1, off, title, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_scrolled_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_scrolled_end;
    public static void nk_group_scrolled_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_group_scrolled_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_get_scroll;
    public static void nk_group_get_scroll(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment id, java.lang.foreign.MemorySegment x_offset, java.lang.foreign.MemorySegment y_offset)
    {
        try {MTD__nk_group_get_scroll.invokeExact(__arg1, id, x_offset, y_offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_group_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_group_set_scroll;
    public static void nk_group_set_scroll(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment id, int x_offset, int y_offset)
    {
        try {MTD__nk_group_set_scroll.invokeExact(__arg1, id, x_offset, y_offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_push_hashed;
    public static int nk_tree_push_hashed(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD__nk_tree_push_hashed.invokeExact(__arg1, __arg2, title, initial_state, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_image_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_image_push_hashed;
    public static int nk_tree_image_push_hashed(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_image __arg3, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD__nk_tree_image_push_hashed.invokeExact(__arg1, __arg2, __arg3._ptr(), title, initial_state, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_pop;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_pop;
    public static void nk_tree_pop(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_tree_pop.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_state_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_state_push;
    public static int nk_tree_state_push(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment title, java.lang.foreign.MemorySegment state)
    {
        try {return (int)MTD__nk_tree_state_push.invokeExact(__arg1, __arg2, title, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_state_image_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_state_image_push;
    public static int nk_tree_state_image_push(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_image __arg3, java.lang.foreign.MemorySegment title, java.lang.foreign.MemorySegment state)
    {
        try {return (int)MTD__nk_tree_state_image_push.invokeExact(__arg1, __arg2, __arg3._ptr(), title, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_state_pop;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_state_pop;
    public static void nk_tree_state_pop(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_tree_state_pop.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_element_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_element_push_hashed;
    public static int nk_tree_element_push_hashed(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment selected, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD__nk_tree_element_push_hashed.invokeExact(__arg1, __arg2, title, initial_state, selected, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_element_image_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_element_image_push_hashed;
    public static int nk_tree_element_image_push_hashed(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_image __arg3, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment selected, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD__nk_tree_element_image_push_hashed.invokeExact(__arg1, __arg2, __arg3._ptr(), title, initial_state, selected, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tree_element_pop;
    public static final java.lang.invoke.MethodHandle MTD__nk_tree_element_pop;
    public static void nk_tree_element_pop(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_tree_element_pop.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_list_view_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_list_view_begin;
    public static int nk_list_view_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment out, java.lang.foreign.MemorySegment id, int __arg4, int row_height, int row_count)
    {
        try {return (int)MTD__nk_list_view_begin.invokeExact(__arg1, out, id, __arg4, row_height, row_count);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_list_view_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_list_view_end;
    public static void nk_list_view_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_list_view_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget;
    public static int nk_widget(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_widget.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_fitting;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_fitting;
    public static int nk_widget_fitting(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_vec2 __arg3)
    {
        try {return (int)MTD__nk_widget_fitting.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_bounds;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_bounds;
    public static nuklear.nk_rect nk_widget_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_widget_bounds.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_position;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_position;
    public static nuklear.nk_vec2 nk_widget_position(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_widget_position.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_size;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_size;
    public static nuklear.nk_vec2 nk_widget_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_widget_size.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_width;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_width;
    public static float nk_widget_width(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (float)MTD__nk_widget_width.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_height;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_height;
    public static float nk_widget_height(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (float)MTD__nk_widget_height.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_is_hovered;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_is_hovered;
    public static int nk_widget_is_hovered(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_widget_is_hovered.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_is_mouse_clicked;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_is_mouse_clicked;
    public static int nk_widget_is_mouse_clicked(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_widget_is_mouse_clicked.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_has_mouse_click_down;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_has_mouse_click_down;
    public static int nk_widget_has_mouse_click_down(java.lang.foreign.MemorySegment __arg1, int __arg2, int down)
    {
        try {return (int)MTD__nk_widget_has_mouse_click_down.invokeExact(__arg1, __arg2, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_spacing;
    public static final java.lang.invoke.MethodHandle MTD__nk_spacing;
    public static void nk_spacing(java.lang.foreign.MemorySegment __arg1, int cols)
    {
        try {MTD__nk_spacing.invokeExact(__arg1, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_disable_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_disable_begin;
    public static void nk_widget_disable_begin(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD__nk_widget_disable_begin.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_widget_disable_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_widget_disable_end;
    public static void nk_widget_disable_end(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD__nk_widget_disable_end.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_text;
    public static void nk_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int __arg4)
    {
        try {MTD__nk_text.invokeExact(__arg1, __arg2, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_text_colored;
    public static final java.lang.invoke.MethodHandle MTD__nk_text_colored;
    public static void nk_text_colored(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int __arg4, nuklear.nk_color __arg5)
    {
        try {MTD__nk_text_colored.invokeExact(__arg1, __arg2, __arg3, __arg4, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_text_wrap;
    public static final java.lang.invoke.MethodHandle MTD__nk_text_wrap;
    public static void nk_text_wrap(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {MTD__nk_text_wrap.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_text_wrap_colored;
    public static final java.lang.invoke.MethodHandle MTD__nk_text_wrap_colored;
    public static void nk_text_wrap_colored(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, nuklear.nk_color __arg4)
    {
        try {MTD__nk_text_wrap_colored.invokeExact(__arg1, __arg2, __arg3, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_label;
    public static void nk_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align)
    {
        try {MTD__nk_label.invokeExact(__arg1, __arg2, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_label_colored;
    public static final java.lang.invoke.MethodHandle MTD__nk_label_colored;
    public static void nk_label_colored(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, nuklear.nk_color __arg4)
    {
        try {MTD__nk_label_colored.invokeExact(__arg1, __arg2, align, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_label_wrap;
    public static final java.lang.invoke.MethodHandle MTD__nk_label_wrap;
    public static void nk_label_wrap(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_label_wrap.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_label_colored_wrap;
    public static final java.lang.invoke.MethodHandle MTD__nk_label_colored_wrap;
    public static void nk_label_colored_wrap(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_color __arg3)
    {
        try {MTD__nk_label_colored_wrap.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_image;
    public static void nk_image(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2)
    {
        try {MTD__nk_image.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_image_color;
    public static void nk_image_color(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, nuklear.nk_color __arg3)
    {
        try {MTD__nk_image_color.invokeExact(__arg1, __arg2._ptr(), __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_text;
    public static int nk_button_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment title, int len)
    {
        try {return (int)MTD__nk_button_text.invokeExact(__arg1, title, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_label;
    public static int nk_button_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment title)
    {
        try {return (int)MTD__nk_button_label.invokeExact(__arg1, title);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_color;
    public static int nk_button_color(java.lang.foreign.MemorySegment __arg1, nuklear.nk_color __arg2)
    {
        try {return (int)MTD__nk_button_color.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol;
    public static int nk_button_symbol(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_button_symbol.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image;
    public static int nk_button_image(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image img)
    {
        try {return (int)MTD__nk_button_image.invokeExact(__arg1, img._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol_label;
    public static int nk_button_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int text_alignment)
    {
        try {return (int)MTD__nk_button_symbol_label.invokeExact(__arg1, __arg2, __arg3, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol_text;
    public static int nk_button_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_button_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image_label;
    public static int nk_button_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image img, java.lang.foreign.MemorySegment __arg3, int text_alignment)
    {
        try {return (int)MTD__nk_button_image_label.invokeExact(__arg1, img._ptr(), __arg3, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image_text;
    public static int nk_button_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image img, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_button_image_text.invokeExact(__arg1, img._ptr(), __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_text_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_text_styled;
    public static int nk_button_text_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment title, int len)
    {
        try {return (int)MTD__nk_button_text_styled.invokeExact(__arg1, __arg2, title, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_label_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_label_styled;
    public static int nk_button_label_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment title)
    {
        try {return (int)MTD__nk_button_label_styled.invokeExact(__arg1, __arg2, title);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol_styled;
    public static int nk_button_symbol_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_button_symbol_styled.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image_styled;
    public static int nk_button_image_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_image img)
    {
        try {return (int)MTD__nk_button_image_styled.invokeExact(__arg1, __arg2, img._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol_text_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol_text_styled;
    public static int nk_button_symbol_text_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, java.lang.foreign.MemorySegment __arg4, int __arg5, int alignment)
    {
        try {return (int)MTD__nk_button_symbol_text_styled.invokeExact(__arg1, __arg2, __arg3, __arg4, __arg5, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_symbol_label_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_symbol_label_styled;
    public static int nk_button_symbol_label_styled(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment style, int symbol, java.lang.foreign.MemorySegment title, int align)
    {
        try {return (int)MTD__nk_button_symbol_label_styled.invokeExact(ctx, style, symbol, title, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image_label_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image_label_styled;
    public static int nk_button_image_label_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_image img, java.lang.foreign.MemorySegment __arg4, int text_alignment)
    {
        try {return (int)MTD__nk_button_image_label_styled.invokeExact(__arg1, __arg2, img._ptr(), __arg4, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_image_text_styled;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_image_text_styled;
    public static int nk_button_image_text_styled(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_image img, java.lang.foreign.MemorySegment __arg4, int __arg5, int alignment)
    {
        try {return (int)MTD__nk_button_image_text_styled.invokeExact(__arg1, __arg2, img._ptr(), __arg4, __arg5, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_set_behavior;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_set_behavior;
    public static void nk_button_set_behavior(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {MTD__nk_button_set_behavior.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_push_behavior;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_push_behavior;
    public static int nk_button_push_behavior(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_button_push_behavior.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_button_pop_behavior;
    public static final java.lang.invoke.MethodHandle MTD__nk_button_pop_behavior;
    public static int nk_button_pop_behavior(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_button_pop_behavior.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_check_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_check_label;
    public static int nk_check_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int active)
    {
        try {return (int)MTD__nk_check_label.invokeExact(__arg1, __arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_check_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_check_text;
    public static int nk_check_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int active)
    {
        try {return (int)MTD__nk_check_text.invokeExact(__arg1, __arg2, __arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_check_text_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_check_text_align;
    public static int nk_check_text_align(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_check_text_align.invokeExact(__arg1, __arg2, __arg3, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_check_flags_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_check_flags_label;
    public static int nk_check_flags_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int flags, int value)
    {
        try {return (int)MTD__nk_check_flags_label.invokeExact(__arg1, __arg2, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_check_flags_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_check_flags_text;
    public static int nk_check_flags_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int flags, int value)
    {
        try {return (int)MTD__nk_check_flags_text.invokeExact(__arg1, __arg2, __arg3, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_label;
    public static int nk_checkbox_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD__nk_checkbox_label.invokeExact(__arg1, __arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_label_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_label_align;
    public static int nk_checkbox_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_checkbox_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_text;
    public static int nk_checkbox_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD__nk_checkbox_text.invokeExact(__arg1, __arg2, __arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_text_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_text_align;
    public static int nk_checkbox_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_checkbox_text_align.invokeExact(ctx, text, len, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_flags_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_flags_label;
    public static int nk_checkbox_flags_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment flags, int value)
    {
        try {return (int)MTD__nk_checkbox_flags_label.invokeExact(__arg1, __arg2, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_checkbox_flags_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_checkbox_flags_text;
    public static int nk_checkbox_flags_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, java.lang.foreign.MemorySegment flags, int value)
    {
        try {return (int)MTD__nk_checkbox_flags_text.invokeExact(__arg1, __arg2, __arg3, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_radio_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_radio_label;
    public static int nk_radio_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD__nk_radio_label.invokeExact(__arg1, __arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_radio_label_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_radio_label_align;
    public static int nk_radio_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_radio_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_radio_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_radio_text;
    public static int nk_radio_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD__nk_radio_text.invokeExact(__arg1, __arg2, __arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_radio_text_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_radio_text_align;
    public static int nk_radio_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_radio_text_align.invokeExact(ctx, text, len, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_option_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_option_label;
    public static int nk_option_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int active)
    {
        try {return (int)MTD__nk_option_label.invokeExact(__arg1, __arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_option_label_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_option_label_align;
    public static int nk_option_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, int active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_option_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_option_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_option_text;
    public static int nk_option_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int active)
    {
        try {return (int)MTD__nk_option_text.invokeExact(__arg1, __arg2, __arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_option_text_align;
    public static final java.lang.invoke.MethodHandle MTD__nk_option_text_align;
    public static int nk_option_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, int is_active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD__nk_option_text_align.invokeExact(ctx, text, len, is_active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_label;
    public static int nk_selectable_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_label.invokeExact(__arg1, __arg2, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_text;
    public static int nk_selectable_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_text.invokeExact(__arg1, __arg2, __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_image_label;
    public static int nk_selectable_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_image_label.invokeExact(__arg1, __arg2._ptr(), __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_image_text;
    public static int nk_selectable_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_image_text.invokeExact(__arg1, __arg2._ptr(), __arg3, __arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_symbol_label;
    public static int nk_selectable_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_symbol_label.invokeExact(__arg1, __arg2, __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_selectable_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_selectable_symbol_text;
    public static int nk_selectable_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD__nk_selectable_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_label;
    public static int nk_select_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, int value)
    {
        try {return (int)MTD__nk_select_label.invokeExact(__arg1, __arg2, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_text;
    public static int nk_select_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align, int value)
    {
        try {return (int)MTD__nk_select_text.invokeExact(__arg1, __arg2, __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_image_label;
    public static int nk_select_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int align, int value)
    {
        try {return (int)MTD__nk_select_image_label.invokeExact(__arg1, __arg2._ptr(), __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_image_text;
    public static int nk_select_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int align, int value)
    {
        try {return (int)MTD__nk_select_image_text.invokeExact(__arg1, __arg2._ptr(), __arg3, __arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_symbol_label;
    public static int nk_select_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int align, int value)
    {
        try {return (int)MTD__nk_select_symbol_label.invokeExact(__arg1, __arg2, __arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_select_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_select_symbol_text;
    public static int nk_select_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int align, int value)
    {
        try {return (int)MTD__nk_select_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_slide_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_slide_float;
    public static float nk_slide_float(java.lang.foreign.MemorySegment __arg1, float min, float val, float max, float step)
    {
        try {return (float)MTD__nk_slide_float.invokeExact(__arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_slide_int;
    public static final java.lang.invoke.MethodHandle MTD__nk_slide_int;
    public static int nk_slide_int(java.lang.foreign.MemorySegment __arg1, int min, int val, int max, int step)
    {
        try {return (int)MTD__nk_slide_int.invokeExact(__arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_slider_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_slider_float;
    public static int nk_slider_float(java.lang.foreign.MemorySegment __arg1, float min, java.lang.foreign.MemorySegment val, float max, float step)
    {
        try {return (int)MTD__nk_slider_float.invokeExact(__arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_slider_int;
    public static final java.lang.invoke.MethodHandle MTD__nk_slider_int;
    public static int nk_slider_int(java.lang.foreign.MemorySegment __arg1, int min, java.lang.foreign.MemorySegment val, int max, int step)
    {
        try {return (int)MTD__nk_slider_int.invokeExact(__arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_progress;
    public static final java.lang.invoke.MethodHandle MTD__nk_progress;
    public static int nk_progress(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment cur, long max, int modifyable)
    {
        try {return (int)MTD__nk_progress.invokeExact(__arg1, cur, max, modifyable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_prog;
    public static final java.lang.invoke.MethodHandle MTD__nk_prog;
    public static long nk_prog(java.lang.foreign.MemorySegment __arg1, long cur, long max, int modifyable)
    {
        try {return (long)MTD__nk_prog.invokeExact(__arg1, cur, max, modifyable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_picker;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_picker;
    public static nuklear.nk_colorf nk_color_picker(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, nuklear.nk_colorf __arg2, int __arg3)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD__nk_color_picker.invokeExact(allocator, __arg1, __arg2._ptr(), __arg3));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_pick;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_pick;
    public static int nk_color_pick(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_color_pick.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_property_int;
    public static final java.lang.invoke.MethodHandle MTD__nk_property_int;
    public static void nk_property_int(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int min, java.lang.foreign.MemorySegment val, int max, int step, float inc_per_pixel)
    {
        try {MTD__nk_property_int.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_property_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_property_float;
    public static void nk_property_float(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, float min, java.lang.foreign.MemorySegment val, float max, float step, float inc_per_pixel)
    {
        try {MTD__nk_property_float.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_property_double;
    public static final java.lang.invoke.MethodHandle MTD__nk_property_double;
    public static void nk_property_double(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, double min, java.lang.foreign.MemorySegment val, double max, double step, float inc_per_pixel)
    {
        try {MTD__nk_property_double.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_propertyi;
    public static final java.lang.invoke.MethodHandle MTD__nk_propertyi;
    public static int nk_propertyi(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, int min, int val, int max, int step, float inc_per_pixel)
    {
        try {return (int)MTD__nk_propertyi.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_propertyf;
    public static final java.lang.invoke.MethodHandle MTD__nk_propertyf;
    public static float nk_propertyf(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, float min, float val, float max, float step, float inc_per_pixel)
    {
        try {return (float)MTD__nk_propertyf.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_propertyd;
    public static final java.lang.invoke.MethodHandle MTD__nk_propertyd;
    public static double nk_propertyd(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment name, double min, double val, double max, double step, float inc_per_pixel)
    {
        try {return (double)MTD__nk_propertyd.invokeExact(__arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_edit_string;
    public static final java.lang.invoke.MethodHandle MTD__nk_edit_string;
    public static int nk_edit_string(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment len, int max, java.lang.foreign.MemorySegment __arg6)
    {
        try {return (int)MTD__nk_edit_string.invokeExact(__arg1, __arg2, buffer, len, max, __arg6);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_edit_string_zero_terminated;
    public static final java.lang.invoke.MethodHandle MTD__nk_edit_string_zero_terminated;
    public static int nk_edit_string_zero_terminated(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment buffer, int max, java.lang.foreign.MemorySegment __arg5)
    {
        try {return (int)MTD__nk_edit_string_zero_terminated.invokeExact(__arg1, __arg2, buffer, max, __arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_edit_buffer;
    public static final java.lang.invoke.MethodHandle MTD__nk_edit_buffer;
    public static int nk_edit_buffer(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, java.lang.foreign.MemorySegment __arg4)
    {
        try {return (int)MTD__nk_edit_buffer.invokeExact(__arg1, __arg2, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_edit_focus;
    public static final java.lang.invoke.MethodHandle MTD__nk_edit_focus;
    public static void nk_edit_focus(java.lang.foreign.MemorySegment __arg1, int flags)
    {
        try {MTD__nk_edit_focus.invokeExact(__arg1, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_edit_unfocus;
    public static final java.lang.invoke.MethodHandle MTD__nk_edit_unfocus;
    public static void nk_edit_unfocus(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_edit_unfocus.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_begin;
    public static int nk_chart_begin(java.lang.foreign.MemorySegment __arg1, int __arg2, int num, float min, float max)
    {
        try {return (int)MTD__nk_chart_begin.invokeExact(__arg1, __arg2, num, min, max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_begin_colored;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_begin_colored;
    public static int nk_chart_begin_colored(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_color __arg3, nuklear.nk_color active, int num, float min, float max)
    {
        try {return (int)MTD__nk_chart_begin_colored.invokeExact(__arg1, __arg2, __arg3._ptr(), active._ptr(), num, min, max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_add_slot;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_add_slot;
    public static void nk_chart_add_slot(java.lang.foreign.MemorySegment ctx, int __arg2, int count, float min_value, float max_value)
    {
        try {MTD__nk_chart_add_slot.invokeExact(ctx, __arg2, count, min_value, max_value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_add_slot_colored;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_add_slot_colored;
    public static void nk_chart_add_slot_colored(java.lang.foreign.MemorySegment ctx, int __arg2, nuklear.nk_color __arg3, nuklear.nk_color active, int count, float min_value, float max_value)
    {
        try {MTD__nk_chart_add_slot_colored.invokeExact(ctx, __arg2, __arg3._ptr(), active._ptr(), count, min_value, max_value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_push;
    public static int nk_chart_push(java.lang.foreign.MemorySegment __arg1, float __arg2)
    {
        try {return (int)MTD__nk_chart_push.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_push_slot;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_push_slot;
    public static int nk_chart_push_slot(java.lang.foreign.MemorySegment __arg1, float __arg2, int __arg3)
    {
        try {return (int)MTD__nk_chart_push_slot.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_chart_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_chart_end;
    public static void nk_chart_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_chart_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_plot;
    public static final java.lang.invoke.MethodHandle MTD__nk_plot;
    public static void nk_plot(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment values, int count, int offset)
    {
        try {MTD__nk_plot.invokeExact(__arg1, __arg2, values, count, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_plot_function;
    public static final java.lang.invoke.MethodHandle MTD__nk_plot_function;
    public static void nk_plot_function(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment userdata, java.lang.foreign.MemorySegment value_getter, int count, int offset)
    {
        try {MTD__nk_plot_function.invokeExact(__arg1, __arg2, userdata, value_getter, count, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_popup_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_popup_begin;
    public static int nk_popup_begin(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, nuklear.nk_rect bounds)
    {
        try {return (int)MTD__nk_popup_begin.invokeExact(__arg1, __arg2, __arg3, __arg4, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_popup_close;
    public static final java.lang.invoke.MethodHandle MTD__nk_popup_close;
    public static void nk_popup_close(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_popup_close.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_popup_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_popup_end;
    public static void nk_popup_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_popup_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_popup_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_popup_get_scroll;
    public static void nk_popup_get_scroll(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment offset_x, java.lang.foreign.MemorySegment offset_y)
    {
        try {MTD__nk_popup_get_scroll.invokeExact(__arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_popup_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD__nk_popup_set_scroll;
    public static void nk_popup_set_scroll(java.lang.foreign.MemorySegment __arg1, int offset_x, int offset_y)
    {
        try {MTD__nk_popup_set_scroll.invokeExact(__arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo;
    public static int nk_combo(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items, int count, int selected, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo.invokeExact(__arg1, items, count, selected, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_separator;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_separator;
    public static int nk_combo_separator(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items_separated_by_separator, int separator, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_separator.invokeExact(__arg1, items_separated_by_separator, separator, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_string;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_string;
    public static int nk_combo_string(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items_separated_by_zeros, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_string.invokeExact(__arg1, items_separated_by_zeros, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_callback;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_callback;
    public static int nk_combo_callback(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment item_getter, java.lang.foreign.MemorySegment userdata, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_callback.invokeExact(__arg1, item_getter, userdata, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combobox;
    public static final java.lang.invoke.MethodHandle MTD__nk_combobox;
    public static void nk_combobox(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items, int count, java.lang.foreign.MemorySegment selected, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD__nk_combobox.invokeExact(__arg1, items, count, selected, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combobox_string;
    public static final java.lang.invoke.MethodHandle MTD__nk_combobox_string;
    public static void nk_combobox_string(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items_separated_by_zeros, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD__nk_combobox_string.invokeExact(__arg1, items_separated_by_zeros, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combobox_separator;
    public static final java.lang.invoke.MethodHandle MTD__nk_combobox_separator;
    public static void nk_combobox_separator(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment items_separated_by_separator, int separator, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD__nk_combobox_separator.invokeExact(__arg1, items_separated_by_separator, separator, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combobox_callback;
    public static final java.lang.invoke.MethodHandle MTD__nk_combobox_callback;
    public static void nk_combobox_callback(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment item_getter, java.lang.foreign.MemorySegment __arg3, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD__nk_combobox_callback.invokeExact(__arg1, item_getter, __arg3, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_text;
    public static int nk_combo_begin_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, int __arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_text.invokeExact(__arg1, selected, __arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_label;
    public static int nk_combo_begin_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_label.invokeExact(__arg1, selected, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_color;
    public static int nk_combo_begin_color(java.lang.foreign.MemorySegment __arg1, nuklear.nk_color color, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_color.invokeExact(__arg1, color._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_symbol;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_symbol;
    public static int nk_combo_begin_symbol(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_symbol.invokeExact(__arg1, __arg2, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_symbol_label;
    public static int nk_combo_begin_symbol_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, int __arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_symbol_label.invokeExact(__arg1, selected, __arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_symbol_text;
    public static int nk_combo_begin_symbol_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, int __arg3, int __arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_symbol_text.invokeExact(__arg1, selected, __arg3, __arg4, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_image;
    public static int nk_combo_begin_image(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image img, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_image.invokeExact(__arg1, img._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_image_label;
    public static int nk_combo_begin_image_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, nuklear.nk_image __arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_image_label.invokeExact(__arg1, selected, __arg3._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_begin_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_begin_image_text;
    public static int nk_combo_begin_image_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment selected, int __arg3, nuklear.nk_image __arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_combo_begin_image_text.invokeExact(__arg1, selected, __arg3, __arg4._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_label;
    public static int nk_combo_item_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int alignment)
    {
        try {return (int)MTD__nk_combo_item_label.invokeExact(__arg1, __arg2, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_text;
    public static int nk_combo_item_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int alignment)
    {
        try {return (int)MTD__nk_combo_item_text.invokeExact(__arg1, __arg2, __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_image_label;
    public static int nk_combo_item_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_combo_item_image_label.invokeExact(__arg1, __arg2._ptr(), __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_image_text;
    public static int nk_combo_item_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_combo_item_image_text.invokeExact(__arg1, __arg2._ptr(), __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_symbol_label;
    public static int nk_combo_item_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_combo_item_symbol_label.invokeExact(__arg1, __arg2, __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_item_symbol_text;
    public static int nk_combo_item_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_combo_item_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_close;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_close;
    public static void nk_combo_close(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_combo_close.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_combo_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_combo_end;
    public static void nk_combo_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_combo_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_begin;
    public static int nk_contextual_begin(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_vec2 __arg3, nuklear.nk_rect trigger_bounds)
    {
        try {return (int)MTD__nk_contextual_begin.invokeExact(__arg1, __arg2, __arg3._ptr(), trigger_bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_text;
    public static int nk_contextual_item_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align)
    {
        try {return (int)MTD__nk_contextual_item_text.invokeExact(__arg1, __arg2, __arg3, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_label;
    public static int nk_contextual_item_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align)
    {
        try {return (int)MTD__nk_contextual_item_label.invokeExact(__arg1, __arg2, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_image_label;
    public static int nk_contextual_item_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_contextual_item_image_label.invokeExact(__arg1, __arg2._ptr(), __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_image_text;
    public static int nk_contextual_item_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int len, int alignment)
    {
        try {return (int)MTD__nk_contextual_item_image_text.invokeExact(__arg1, __arg2._ptr(), __arg3, len, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_symbol_label;
    public static int nk_contextual_item_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_contextual_item_symbol_label.invokeExact(__arg1, __arg2, __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_item_symbol_text;
    public static int nk_contextual_item_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_contextual_item_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_close;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_close;
    public static void nk_contextual_close(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_contextual_close.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_contextual_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_contextual_end;
    public static void nk_contextual_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_contextual_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tooltip;
    public static final java.lang.invoke.MethodHandle MTD__nk_tooltip;
    public static void nk_tooltip(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_tooltip.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tooltip_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_tooltip_begin;
    public static int nk_tooltip_begin(java.lang.foreign.MemorySegment __arg1, float width)
    {
        try {return (int)MTD__nk_tooltip_begin.invokeExact(__arg1, width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_tooltip_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_tooltip_end;
    public static void nk_tooltip_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_tooltip_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menubar_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_menubar_begin;
    public static void nk_menubar_begin(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_menubar_begin.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menubar_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_menubar_end;
    public static void nk_menubar_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_menubar_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_text;
    public static int nk_menu_begin_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment title, int title_len, int align, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_text.invokeExact(__arg1, title, title_len, align, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_label;
    public static int nk_menu_begin_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_label.invokeExact(__arg1, __arg2, align, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_image;
    public static int nk_menu_begin_image(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_image __arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_image.invokeExact(__arg1, __arg2, __arg3._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_image_text;
    public static int nk_menu_begin_image_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align, nuklear.nk_image __arg5, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_image_text.invokeExact(__arg1, __arg2, __arg3, align, __arg5._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_image_label;
    public static int nk_menu_begin_image_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, nuklear.nk_image __arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_image_label.invokeExact(__arg1, __arg2, align, __arg4._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_symbol;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_symbol;
    public static int nk_menu_begin_symbol(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_symbol.invokeExact(__arg1, __arg2, __arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_symbol_text;
    public static int nk_menu_begin_symbol_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align, int __arg5, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_symbol_text.invokeExact(__arg1, __arg2, __arg3, align, __arg5, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_begin_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_begin_symbol_label;
    public static int nk_menu_begin_symbol_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int align, int __arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD__nk_menu_begin_symbol_label.invokeExact(__arg1, __arg2, align, __arg4, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_text;
    public static int nk_menu_item_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3, int align)
    {
        try {return (int)MTD__nk_menu_item_text.invokeExact(__arg1, __arg2, __arg3, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_label;
    public static int nk_menu_item_label(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int alignment)
    {
        try {return (int)MTD__nk_menu_item_label.invokeExact(__arg1, __arg2, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_image_label;
    public static int nk_menu_item_image_label(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_menu_item_image_label.invokeExact(__arg1, __arg2._ptr(), __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_image_text;
    public static int nk_menu_item_image_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image __arg2, java.lang.foreign.MemorySegment __arg3, int len, int alignment)
    {
        try {return (int)MTD__nk_menu_item_image_text.invokeExact(__arg1, __arg2._ptr(), __arg3, len, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_symbol_text;
    public static int nk_menu_item_symbol_text(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int __arg4, int alignment)
    {
        try {return (int)MTD__nk_menu_item_symbol_text.invokeExact(__arg1, __arg2, __arg3, __arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_item_symbol_label;
    public static int nk_menu_item_symbol_label(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3, int alignment)
    {
        try {return (int)MTD__nk_menu_item_symbol_label.invokeExact(__arg1, __arg2, __arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_close;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_close;
    public static void nk_menu_close(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_menu_close.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_menu_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_menu_end;
    public static void nk_menu_end(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_menu_end.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_default;
    public static void nk_style_default(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_style_default.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_from_table;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_from_table;
    public static void nk_style_from_table(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_style_from_table.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_load_cursor;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_load_cursor;
    public static void nk_style_load_cursor(java.lang.foreign.MemorySegment __arg1, int __arg2, java.lang.foreign.MemorySegment __arg3)
    {
        try {MTD__nk_style_load_cursor.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_load_all_cursors;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_load_all_cursors;
    public static void nk_style_load_all_cursors(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_style_load_all_cursors.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_get_color_by_name;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_get_color_by_name;
    public static java.lang.foreign.MemorySegment nk_style_get_color_by_name(int __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_style_get_color_by_name.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_set_font;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_set_font;
    public static void nk_style_set_font(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_style_set_font.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_set_cursor;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_set_cursor;
    public static int nk_style_set_cursor(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_style_set_cursor.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_show_cursor;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_show_cursor;
    public static void nk_style_show_cursor(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_style_show_cursor.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_hide_cursor;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_hide_cursor;
    public static void nk_style_hide_cursor(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_style_hide_cursor.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_font;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_font;
    public static int nk_style_push_font(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_style_push_font.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_float;
    public static int nk_style_push_float(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, float __arg3)
    {
        try {return (int)MTD__nk_style_push_float.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_vec2;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_vec2;
    public static int nk_style_push_vec2(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_vec2 __arg3)
    {
        try {return (int)MTD__nk_style_push_vec2.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_style_item;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_style_item;
    public static int nk_style_push_style_item(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_style_item __arg3)
    {
        try {return (int)MTD__nk_style_push_style_item.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_flags;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_flags;
    public static int nk_style_push_flags(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_style_push_flags.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_push_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_push_color;
    public static int nk_style_push_color(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_color __arg3)
    {
        try {return (int)MTD__nk_style_push_color.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_font;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_font;
    public static int nk_style_pop_font(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_font.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_float;
    public static int nk_style_pop_float(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_float.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_vec2;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_vec2;
    public static int nk_style_pop_vec2(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_vec2.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_style_item;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_style_item;
    public static int nk_style_pop_style_item(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_style_item.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_flags;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_flags;
    public static int nk_style_pop_flags(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_flags.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_pop_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_pop_color;
    public static int nk_style_pop_color(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_style_pop_color.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb;
    public static nuklear.nk_color nk_rgb(java.lang.foreign.SegmentAllocator allocator, int r, int g, int b)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb.invokeExact(allocator, r, g, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_iv;
    public static nuklear.nk_color nk_rgb_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_iv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_bv;
    public static nuklear.nk_color nk_rgb_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_bv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_f;
    public static nuklear.nk_color nk_rgb_f(java.lang.foreign.SegmentAllocator allocator, float r, float g, float b)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_f.invokeExact(allocator, r, g, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_fv;
    public static nuklear.nk_color nk_rgb_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_fv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_cf;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_cf;
    public static nuklear.nk_color nk_rgb_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_colorf c)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_cf.invokeExact(allocator, c._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_hex;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_hex;
    public static nuklear.nk_color nk_rgb_hex(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_hex.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgb_factor;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgb_factor;
    public static nuklear.nk_color nk_rgb_factor(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color col, float factor)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgb_factor.invokeExact(allocator, col._ptr(), factor));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba;
    public static nuklear.nk_color nk_rgba(java.lang.foreign.SegmentAllocator allocator, int r, int g, int b, int a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba.invokeExact(allocator, r, g, b, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_u32;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_u32;
    public static nuklear.nk_color nk_rgba_u32(java.lang.foreign.SegmentAllocator allocator, int __arg1)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_u32.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_iv;
    public static nuklear.nk_color nk_rgba_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_iv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_bv;
    public static nuklear.nk_color nk_rgba_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_bv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_f;
    public static nuklear.nk_color nk_rgba_f(java.lang.foreign.SegmentAllocator allocator, float r, float g, float b, float a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_f.invokeExact(allocator, r, g, b, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_fv;
    public static nuklear.nk_color nk_rgba_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_fv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_cf;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_cf;
    public static nuklear.nk_color nk_rgba_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_colorf c)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_cf.invokeExact(allocator, c._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rgba_hex;
    public static final java.lang.invoke.MethodHandle MTD__nk_rgba_hex;
    public static nuklear.nk_color nk_rgba_hex(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_rgba_hex.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_colorf;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_colorf;
    public static nuklear.nk_colorf nk_hsva_colorf(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v, float a)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD__nk_hsva_colorf.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_colorfv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_colorfv;
    public static nuklear.nk_colorf nk_hsva_colorfv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment c)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD__nk_hsva_colorfv.invokeExact(allocator, c));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_colorf_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_colorf_hsva_f;
    public static void nk_colorf_hsva_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, java.lang.foreign.MemorySegment out_a, nuklear.nk_colorf in)
    {
        try {MTD__nk_colorf_hsva_f.invokeExact(out_h, out_s, out_v, out_a, in._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_colorf_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_colorf_hsva_fv;
    public static void nk_colorf_hsva_fv(java.lang.foreign.MemorySegment hsva, nuklear.nk_colorf in)
    {
        try {MTD__nk_colorf_hsva_fv.invokeExact(hsva, in._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsv;
    public static nuklear.nk_color nk_hsv(java.lang.foreign.SegmentAllocator allocator, int h, int s, int v)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsv.invokeExact(allocator, h, s, v));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsv_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsv_iv;
    public static nuklear.nk_color nk_hsv_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsv_iv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsv_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsv_bv;
    public static nuklear.nk_color nk_hsv_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsv_bv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsv_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsv_f;
    public static nuklear.nk_color nk_hsv_f(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsv_f.invokeExact(allocator, h, s, v));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsv_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsv_fv;
    public static nuklear.nk_color nk_hsv_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsv_fv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva;
    public static nuklear.nk_color nk_hsva(java.lang.foreign.SegmentAllocator allocator, int h, int s, int v, int a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsva.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_iv;
    public static nuklear.nk_color nk_hsva_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsva_iv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_bv;
    public static nuklear.nk_color nk_hsva_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsva_bv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_f;
    public static nuklear.nk_color nk_hsva_f(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v, float a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsva_f.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_hsva_fv;
    public static nuklear.nk_color nk_hsva_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD__nk_hsva_fv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_f;
    public static void nk_color_f(java.lang.foreign.MemorySegment r, java.lang.foreign.MemorySegment g, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment a, nuklear.nk_color __arg5)
    {
        try {MTD__nk_color_f.invokeExact(r, g, b, a, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_fv;
    public static void nk_color_fv(java.lang.foreign.MemorySegment rgba_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_fv.invokeExact(rgba_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_cf;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_cf;
    public static nuklear.nk_colorf nk_color_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color __arg1)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD__nk_color_cf.invokeExact(allocator, __arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_d;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_d;
    public static void nk_color_d(java.lang.foreign.MemorySegment r, java.lang.foreign.MemorySegment g, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment a, nuklear.nk_color __arg5)
    {
        try {MTD__nk_color_d.invokeExact(r, g, b, a, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_dv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_dv;
    public static void nk_color_dv(java.lang.foreign.MemorySegment rgba_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_dv.invokeExact(rgba_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_u32;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_u32;
    public static int nk_color_u32(nuklear.nk_color __arg1)
    {
        try {return (int)MTD__nk_color_u32.invokeExact(__arg1._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hex_rgba;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hex_rgba;
    public static void nk_color_hex_rgba(java.lang.foreign.MemorySegment output, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hex_rgba.invokeExact(output, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hex_rgb;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hex_rgb;
    public static void nk_color_hex_rgb(java.lang.foreign.MemorySegment output, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hex_rgb.invokeExact(output, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_i;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_i;
    public static void nk_color_hsv_i(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color __arg4)
    {
        try {MTD__nk_color_hsv_i.invokeExact(out_h, out_s, out_v, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_b;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_b;
    public static void nk_color_hsv_b(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color __arg4)
    {
        try {MTD__nk_color_hsv_b.invokeExact(out_h, out_s, out_v, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_iv;
    public static void nk_color_hsv_iv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsv_iv.invokeExact(hsv_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_bv;
    public static void nk_color_hsv_bv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsv_bv.invokeExact(hsv_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_f;
    public static void nk_color_hsv_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color __arg4)
    {
        try {MTD__nk_color_hsv_f.invokeExact(out_h, out_s, out_v, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsv_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsv_fv;
    public static void nk_color_hsv_fv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsv_fv.invokeExact(hsv_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_i;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_i;
    public static void nk_color_hsva_i(java.lang.foreign.MemorySegment h, java.lang.foreign.MemorySegment s, java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment a, nuklear.nk_color __arg5)
    {
        try {MTD__nk_color_hsva_i.invokeExact(h, s, v, a, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_b;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_b;
    public static void nk_color_hsva_b(java.lang.foreign.MemorySegment h, java.lang.foreign.MemorySegment s, java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment a, nuklear.nk_color __arg5)
    {
        try {MTD__nk_color_hsva_b.invokeExact(h, s, v, a, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_iv;
    public static void nk_color_hsva_iv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsva_iv.invokeExact(hsva_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_bv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_bv;
    public static void nk_color_hsva_bv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsva_bv.invokeExact(hsva_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_f;
    public static void nk_color_hsva_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, java.lang.foreign.MemorySegment out_a, nuklear.nk_color __arg5)
    {
        try {MTD__nk_color_hsva_f.invokeExact(out_h, out_s, out_v, out_a, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_color_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD__nk_color_hsva_fv;
    public static void nk_color_hsva_fv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color __arg2)
    {
        try {MTD__nk_color_hsva_fv.invokeExact(hsva_out, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_handle_ptr;
    public static final java.lang.invoke.MethodHandle MTD__nk_handle_ptr;
    public static nuklear.nk_handle nk_handle_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_handle((java.lang.foreign.MemorySegment)MTD__nk_handle_ptr.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_handle_id;
    public static final java.lang.invoke.MethodHandle MTD__nk_handle_id;
    public static nuklear.nk_handle nk_handle_id(java.lang.foreign.SegmentAllocator allocator, int __arg1)
    {
        try {return new nuklear.nk_handle((java.lang.foreign.MemorySegment)MTD__nk_handle_id.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image_handle;
    public static final java.lang.invoke.MethodHandle MTD__nk_image_handle;
    public static nuklear.nk_image nk_image_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle __arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_image_handle.invokeExact(allocator, __arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image_ptr;
    public static final java.lang.invoke.MethodHandle MTD__nk_image_ptr;
    public static nuklear.nk_image nk_image_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_image_ptr.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image_id;
    public static final java.lang.invoke.MethodHandle MTD__nk_image_id;
    public static nuklear.nk_image nk_image_id(java.lang.foreign.SegmentAllocator allocator, int __arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_image_id.invokeExact(allocator, __arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_image_is_subimage;
    public static final java.lang.invoke.MethodHandle MTD__nk_image_is_subimage;
    public static int nk_image_is_subimage(java.lang.foreign.MemorySegment img)
    {
        try {return (int)MTD__nk_image_is_subimage.invokeExact(img);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_subimage_ptr;
    public static final java.lang.invoke.MethodHandle MTD__nk_subimage_ptr;
    public static nuklear.nk_image nk_subimage_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_subimage_ptr.invokeExact(allocator, __arg1, w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_subimage_id;
    public static final java.lang.invoke.MethodHandle MTD__nk_subimage_id;
    public static nuklear.nk_image nk_subimage_id(java.lang.foreign.SegmentAllocator allocator, int __arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_subimage_id.invokeExact(allocator, __arg1, w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_subimage_handle;
    public static final java.lang.invoke.MethodHandle MTD__nk_subimage_handle;
    public static nuklear.nk_image nk_subimage_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle __arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD__nk_subimage_handle.invokeExact(allocator, __arg1._ptr(), w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_nine_slice_handle;
    public static final java.lang.invoke.MethodHandle MTD__nk_nine_slice_handle;
    public static nuklear.nk_nine_slice nk_nine_slice_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle __arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_nine_slice_handle.invokeExact(allocator, __arg1._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_nine_slice_ptr;
    public static final java.lang.invoke.MethodHandle MTD__nk_nine_slice_ptr;
    public static nuklear.nk_nine_slice nk_nine_slice_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_nine_slice_ptr.invokeExact(allocator, __arg1, l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_nine_slice_id;
    public static final java.lang.invoke.MethodHandle MTD__nk_nine_slice_id;
    public static nuklear.nk_nine_slice nk_nine_slice_id(java.lang.foreign.SegmentAllocator allocator, int __arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_nine_slice_id.invokeExact(allocator, __arg1, l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_nine_slice_is_sub9slice;
    public static final java.lang.invoke.MethodHandle MTD__nk_nine_slice_is_sub9slice;
    public static int nk_nine_slice_is_sub9slice(java.lang.foreign.MemorySegment img)
    {
        try {return (int)MTD__nk_nine_slice_is_sub9slice.invokeExact(img);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_sub9slice_ptr;
    public static final java.lang.invoke.MethodHandle MTD__nk_sub9slice_ptr;
    public static nuklear.nk_nine_slice nk_sub9slice_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment __arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_sub9slice_ptr.invokeExact(allocator, __arg1, w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_sub9slice_id;
    public static final java.lang.invoke.MethodHandle MTD__nk_sub9slice_id;
    public static nuklear.nk_nine_slice nk_sub9slice_id(java.lang.foreign.SegmentAllocator allocator, int __arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_sub9slice_id.invokeExact(allocator, __arg1, w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_sub9slice_handle;
    public static final java.lang.invoke.MethodHandle MTD__nk_sub9slice_handle;
    public static nuklear.nk_nine_slice nk_sub9slice_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle __arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD__nk_sub9slice_handle.invokeExact(allocator, __arg1._ptr(), w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_murmur_hash;
    public static final java.lang.invoke.MethodHandle MTD__nk_murmur_hash;
    public static int nk_murmur_hash(java.lang.foreign.MemorySegment key, int len, int seed)
    {
        try {return (int)MTD__nk_murmur_hash.invokeExact(key, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_triangle_from_direction;
    public static final java.lang.invoke.MethodHandle MTD__nk_triangle_from_direction;
    public static void nk_triangle_from_direction(java.lang.foreign.MemorySegment result, nuklear.nk_rect r, float pad_x, float pad_y, int __arg5)
    {
        try {MTD__nk_triangle_from_direction.invokeExact(result, r._ptr(), pad_x, pad_y, __arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_vec2;
    public static final java.lang.invoke.MethodHandle MTD__nk_vec2;
    public static nuklear.nk_vec2 nk_vec2(java.lang.foreign.SegmentAllocator allocator, float x, float y)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_vec2.invokeExact(allocator, x, y));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_vec2i;
    public static final java.lang.invoke.MethodHandle MTD__nk_vec2i;
    public static nuklear.nk_vec2 nk_vec2i(java.lang.foreign.SegmentAllocator allocator, int x, int y)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_vec2i.invokeExact(allocator, x, y));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_vec2v;
    public static final java.lang.invoke.MethodHandle MTD__nk_vec2v;
    public static nuklear.nk_vec2 nk_vec2v(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xy)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_vec2v.invokeExact(allocator, xy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_vec2iv;
    public static final java.lang.invoke.MethodHandle MTD__nk_vec2iv;
    public static nuklear.nk_vec2 nk_vec2iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xy)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_vec2iv.invokeExact(allocator, xy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_get_null_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_get_null_rect;
    public static nuklear.nk_rect nk_get_null_rect(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_get_null_rect.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_rect;
    public static nuklear.nk_rect nk_rect(java.lang.foreign.SegmentAllocator allocator, float x, float y, float w, float h)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_rect.invokeExact(allocator, x, y, w, h));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_recti;
    public static final java.lang.invoke.MethodHandle MTD__nk_recti;
    public static nuklear.nk_rect nk_recti(java.lang.foreign.SegmentAllocator allocator, int x, int y, int w, int h)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_recti.invokeExact(allocator, x, y, w, h));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_recta;
    public static final java.lang.invoke.MethodHandle MTD__nk_recta;
    public static nuklear.nk_rect nk_recta(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_vec2 pos, nuklear.nk_vec2 size)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_recta.invokeExact(allocator, pos._ptr(), size._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rectv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rectv;
    public static nuklear.nk_rect nk_rectv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xywh)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_rectv.invokeExact(allocator, xywh));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rectiv;
    public static final java.lang.invoke.MethodHandle MTD__nk_rectiv;
    public static nuklear.nk_rect nk_rectiv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xywh)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD__nk_rectiv.invokeExact(allocator, xywh));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rect_pos;
    public static final java.lang.invoke.MethodHandle MTD__nk_rect_pos;
    public static nuklear.nk_vec2 nk_rect_pos(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_rect __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_rect_pos.invokeExact(allocator, __arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_rect_size;
    public static final java.lang.invoke.MethodHandle MTD__nk_rect_size;
    public static nuklear.nk_vec2 nk_rect_size(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_rect __arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD__nk_rect_size.invokeExact(allocator, __arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strlen;
    public static final java.lang.invoke.MethodHandle MTD__nk_strlen;
    public static int nk_strlen(java.lang.foreign.MemorySegment str)
    {
        try {return (int)MTD__nk_strlen.invokeExact(str);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stricmp;
    public static final java.lang.invoke.MethodHandle MTD__nk_stricmp;
    public static int nk_stricmp(java.lang.foreign.MemorySegment s1, java.lang.foreign.MemorySegment s2)
    {
        try {return (int)MTD__nk_stricmp.invokeExact(s1, s2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stricmpn;
    public static final java.lang.invoke.MethodHandle MTD__nk_stricmpn;
    public static int nk_stricmpn(java.lang.foreign.MemorySegment s1, java.lang.foreign.MemorySegment s2, int n)
    {
        try {return (int)MTD__nk_stricmpn.invokeExact(s1, s2, n);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strtoi;
    public static final java.lang.invoke.MethodHandle MTD__nk_strtoi;
    public static int nk_strtoi(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (int)MTD__nk_strtoi.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strtof;
    public static final java.lang.invoke.MethodHandle MTD__nk_strtof;
    public static float nk_strtof(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (float)MTD__nk_strtof.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strtod;
    public static final java.lang.invoke.MethodHandle MTD__nk_strtod;
    public static double nk_strtod(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (double)MTD__nk_strtod.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strfilter;
    public static final java.lang.invoke.MethodHandle MTD__nk_strfilter;
    public static int nk_strfilter(java.lang.foreign.MemorySegment text, java.lang.foreign.MemorySegment regexp)
    {
        try {return (int)MTD__nk_strfilter.invokeExact(text, regexp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strmatch_fuzzy_string;
    public static final java.lang.invoke.MethodHandle MTD__nk_strmatch_fuzzy_string;
    public static int nk_strmatch_fuzzy_string(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment out_score)
    {
        try {return (int)MTD__nk_strmatch_fuzzy_string.invokeExact(str, pattern, out_score);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_strmatch_fuzzy_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_strmatch_fuzzy_text;
    public static int nk_strmatch_fuzzy_text(java.lang.foreign.MemorySegment txt, int txt_len, java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment out_score)
    {
        try {return (int)MTD__nk_strmatch_fuzzy_text.invokeExact(txt, txt_len, pattern, out_score);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_utf_decode;
    public static final java.lang.invoke.MethodHandle MTD__nk_utf_decode;
    public static int nk_utf_decode(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_utf_decode.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_utf_encode;
    public static final java.lang.invoke.MethodHandle MTD__nk_utf_encode;
    public static int nk_utf_encode(int __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_utf_encode.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_utf_len;
    public static final java.lang.invoke.MethodHandle MTD__nk_utf_len;
    public static int nk_utf_len(java.lang.foreign.MemorySegment __arg1, int byte_len)
    {
        try {return (int)MTD__nk_utf_len.invokeExact(__arg1, byte_len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_utf_at;
    public static final java.lang.invoke.MethodHandle MTD__nk_utf_at;
    public static java.lang.foreign.MemorySegment nk_utf_at(java.lang.foreign.MemorySegment buffer, int length, int index, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_utf_at.invokeExact(buffer, length, index, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_default_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_default_glyph_ranges;
    public static java.lang.foreign.MemorySegment nk_font_default_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_default_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_chinese_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_chinese_glyph_ranges;
    public static java.lang.foreign.MemorySegment nk_font_chinese_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_chinese_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_cyrillic_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_cyrillic_glyph_ranges;
    public static java.lang.foreign.MemorySegment nk_font_cyrillic_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_cyrillic_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_korean_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_korean_glyph_ranges;
    public static java.lang.foreign.MemorySegment nk_font_korean_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_korean_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_init_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_init_default;
    public static void nk_font_atlas_init_default(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_font_atlas_init_default.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_init;
    public static void nk_font_atlas_init(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_font_atlas_init.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_init_custom;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_init_custom;
    public static void nk_font_atlas_init_custom(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment persistent, java.lang.foreign.MemorySegment _transient)
    {
        try {MTD__nk_font_atlas_init_custom.invokeExact(__arg1, persistent, _transient);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_begin;
    public static void nk_font_atlas_begin(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_font_atlas_begin.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_config;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_config;
    public static nuklear.nk_font_config nk_font_config(java.lang.foreign.SegmentAllocator allocator, float pixel_height)
    {
        try {return new nuklear.nk_font_config((java.lang.foreign.MemorySegment)MTD__nk_font_config.invokeExact(allocator, pixel_height));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add_default;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add_default(java.lang.foreign.MemorySegment __arg1, float height, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add_default.invokeExact(__arg1, height, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add_from_memory;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add_from_memory(java.lang.foreign.MemorySegment atlas, java.lang.foreign.MemorySegment memory, long size, float height, java.lang.foreign.MemorySegment config)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add_from_memory.invokeExact(atlas, memory, size, height, config);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add_from_file;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add_from_file;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add_from_file(java.lang.foreign.MemorySegment atlas, java.lang.foreign.MemorySegment file_path, float height, java.lang.foreign.MemorySegment __arg4)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add_from_file.invokeExact(atlas, file_path, height, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add_compressed;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add_compressed;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add_compressed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment memory, long size, float height, java.lang.foreign.MemorySegment __arg5)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add_compressed.invokeExact(__arg1, memory, size, height, __arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_add_compressed_base85;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_add_compressed_base85;
    public static java.lang.foreign.MemorySegment nk_font_atlas_add_compressed_base85(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment data, float height, java.lang.foreign.MemorySegment config)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_add_compressed_base85.invokeExact(__arg1, data, height, config);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_bake;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_bake;
    public static java.lang.foreign.MemorySegment nk_font_atlas_bake(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment width, java.lang.foreign.MemorySegment height, int __arg4)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_atlas_bake.invokeExact(__arg1, width, height, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_end;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_end;
    public static void nk_font_atlas_end(java.lang.foreign.MemorySegment __arg1, nuklear.nk_handle tex, java.lang.foreign.MemorySegment __arg3)
    {
        try {MTD__nk_font_atlas_end.invokeExact(__arg1, tex._ptr(), __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_find_glyph;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_find_glyph;
    public static java.lang.foreign.MemorySegment nk_font_find_glyph(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_font_find_glyph.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_cleanup;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_cleanup;
    public static void nk_font_atlas_cleanup(java.lang.foreign.MemorySegment atlas)
    {
        try {MTD__nk_font_atlas_cleanup.invokeExact(atlas);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_font_atlas_clear;
    public static final java.lang.invoke.MethodHandle MTD__nk_font_atlas_clear;
    public static void nk_font_atlas_clear(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_font_atlas_clear.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_init_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_init_default;
    public static void nk_buffer_init_default(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_buffer_init_default.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_init;
    public static void nk_buffer_init(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, long size)
    {
        try {MTD__nk_buffer_init.invokeExact(__arg1, __arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_init_fixed;
    public static void nk_buffer_init_fixed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD__nk_buffer_init_fixed.invokeExact(__arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_info;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_info;
    public static void nk_buffer_info(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {MTD__nk_buffer_info.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_push;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_push;
    public static void nk_buffer_push(java.lang.foreign.MemorySegment __arg1, int type, java.lang.foreign.MemorySegment memory, long size, long align)
    {
        try {MTD__nk_buffer_push.invokeExact(__arg1, type, memory, size, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_mark;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_mark;
    public static void nk_buffer_mark(java.lang.foreign.MemorySegment __arg1, int type)
    {
        try {MTD__nk_buffer_mark.invokeExact(__arg1, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_reset;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_reset;
    public static void nk_buffer_reset(java.lang.foreign.MemorySegment __arg1, int type)
    {
        try {MTD__nk_buffer_reset.invokeExact(__arg1, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_clear;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_clear;
    public static void nk_buffer_clear(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_buffer_clear.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_free;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_free;
    public static void nk_buffer_free(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_buffer_free.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_memory;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_memory;
    public static java.lang.foreign.MemorySegment nk_buffer_memory(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_buffer_memory.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_memory_const;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_memory_const;
    public static java.lang.foreign.MemorySegment nk_buffer_memory_const(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_buffer_memory_const.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_buffer_total;
    public static final java.lang.invoke.MethodHandle MTD__nk_buffer_total;
    public static long nk_buffer_total(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (long)MTD__nk_buffer_total.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_init_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_init_default;
    public static void nk_str_init_default(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_str_init_default.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_init;
    public static void nk_str_init(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, long size)
    {
        try {MTD__nk_str_init.invokeExact(__arg1, __arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_init_fixed;
    public static void nk_str_init_fixed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD__nk_str_init_fixed.invokeExact(__arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_clear;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_clear;
    public static void nk_str_clear(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_str_clear.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_free;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_free;
    public static void nk_str_free(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_str_free.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_text_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_text_char;
    public static int nk_str_append_text_char(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_str_append_text_char.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_str_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_str_char;
    public static int nk_str_append_str_char(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_str_append_str_char.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_text_utf8;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_text_utf8;
    public static int nk_str_append_text_utf8(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_str_append_text_utf8.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_str_utf8;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_str_utf8;
    public static int nk_str_append_str_utf8(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_str_append_str_utf8.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_text_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_text_runes;
    public static int nk_str_append_text_runes(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int __arg3)
    {
        try {return (int)MTD__nk_str_append_text_runes.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_append_str_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_append_str_runes;
    public static int nk_str_append_str_runes(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (int)MTD__nk_str_append_str_runes.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_at_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_at_char;
    public static int nk_str_insert_at_char(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3, int __arg4)
    {
        try {return (int)MTD__nk_str_insert_at_char.invokeExact(__arg1, pos, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_at_rune;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_at_rune;
    public static int nk_str_insert_at_rune(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3, int __arg4)
    {
        try {return (int)MTD__nk_str_insert_at_rune.invokeExact(__arg1, pos, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_text_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_text_char;
    public static int nk_str_insert_text_char(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3, int __arg4)
    {
        try {return (int)MTD__nk_str_insert_text_char.invokeExact(__arg1, pos, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_str_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_str_char;
    public static int nk_str_insert_str_char(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (int)MTD__nk_str_insert_str_char.invokeExact(__arg1, pos, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_text_utf8;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_text_utf8;
    public static int nk_str_insert_text_utf8(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3, int __arg4)
    {
        try {return (int)MTD__nk_str_insert_text_utf8.invokeExact(__arg1, pos, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_str_utf8;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_str_utf8;
    public static int nk_str_insert_str_utf8(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (int)MTD__nk_str_insert_str_utf8.invokeExact(__arg1, pos, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_text_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_text_runes;
    public static int nk_str_insert_text_runes(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3, int __arg4)
    {
        try {return (int)MTD__nk_str_insert_text_runes.invokeExact(__arg1, pos, __arg3, __arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_insert_str_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_insert_str_runes;
    public static int nk_str_insert_str_runes(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (int)MTD__nk_str_insert_str_runes.invokeExact(__arg1, pos, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_remove_chars;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_remove_chars;
    public static void nk_str_remove_chars(java.lang.foreign.MemorySegment __arg1, int len)
    {
        try {MTD__nk_str_remove_chars.invokeExact(__arg1, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_remove_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_remove_runes;
    public static void nk_str_remove_runes(java.lang.foreign.MemorySegment str, int len)
    {
        try {MTD__nk_str_remove_runes.invokeExact(str, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_delete_chars;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_delete_chars;
    public static void nk_str_delete_chars(java.lang.foreign.MemorySegment __arg1, int pos, int len)
    {
        try {MTD__nk_str_delete_chars.invokeExact(__arg1, pos, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_delete_runes;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_delete_runes;
    public static void nk_str_delete_runes(java.lang.foreign.MemorySegment __arg1, int pos, int len)
    {
        try {MTD__nk_str_delete_runes.invokeExact(__arg1, pos, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_at_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_at_char;
    public static java.lang.foreign.MemorySegment nk_str_at_char(java.lang.foreign.MemorySegment __arg1, int pos)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_at_char.invokeExact(__arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_at_rune;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_at_rune;
    public static java.lang.foreign.MemorySegment nk_str_at_rune(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_at_rune.invokeExact(__arg1, pos, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_rune_at;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_rune_at;
    public static int nk_str_rune_at(java.lang.foreign.MemorySegment __arg1, int pos)
    {
        try {return (int)MTD__nk_str_rune_at.invokeExact(__arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_at_char_const;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_at_char_const;
    public static java.lang.foreign.MemorySegment nk_str_at_char_const(java.lang.foreign.MemorySegment __arg1, int pos)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_at_char_const.invokeExact(__arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_at_const;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_at_const;
    public static java.lang.foreign.MemorySegment nk_str_at_const(java.lang.foreign.MemorySegment __arg1, int pos, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_at_const.invokeExact(__arg1, pos, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_get;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_get;
    public static java.lang.foreign.MemorySegment nk_str_get(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_get.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_get_const;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_get_const;
    public static java.lang.foreign.MemorySegment nk_str_get_const(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk_str_get_const.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_len;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_len;
    public static int nk_str_len(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_str_len.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_str_len_char;
    public static final java.lang.invoke.MethodHandle MTD__nk_str_len_char;
    public static int nk_str_len_char(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_str_len_char.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_default;
    public static int nk_filter_default(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_default.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_ascii;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_ascii;
    public static int nk_filter_ascii(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_ascii.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_float;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_float;
    public static int nk_filter_float(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_float.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_decimal;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_decimal;
    public static int nk_filter_decimal(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_decimal.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_hex;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_hex;
    public static int nk_filter_hex(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_hex.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_oct;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_oct;
    public static int nk_filter_oct(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_oct.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_filter_binary;
    public static final java.lang.invoke.MethodHandle MTD__nk_filter_binary;
    public static int nk_filter_binary(java.lang.foreign.MemorySegment __arg1, int unicode)
    {
        try {return (int)MTD__nk_filter_binary.invokeExact(__arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_init_default;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_init_default;
    public static void nk_textedit_init_default(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_init_default.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_init;
    public static void nk_textedit_init(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, long size)
    {
        try {MTD__nk_textedit_init.invokeExact(__arg1, __arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_init_fixed;
    public static void nk_textedit_init_fixed(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD__nk_textedit_init_fixed.invokeExact(__arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_free;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_free;
    public static void nk_textedit_free(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_free.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_text;
    public static void nk_textedit_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int total_len)
    {
        try {MTD__nk_textedit_text.invokeExact(__arg1, __arg2, total_len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_delete;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_delete;
    public static void nk_textedit_delete(java.lang.foreign.MemorySegment __arg1, int where, int len)
    {
        try {MTD__nk_textedit_delete.invokeExact(__arg1, where, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_delete_selection;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_delete_selection;
    public static void nk_textedit_delete_selection(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_delete_selection.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_select_all;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_select_all;
    public static void nk_textedit_select_all(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_select_all.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_cut;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_cut;
    public static int nk_textedit_cut(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__nk_textedit_cut.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_paste;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_paste;
    public static int nk_textedit_paste(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int len)
    {
        try {return (int)MTD__nk_textedit_paste.invokeExact(__arg1, __arg2, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_undo;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_undo;
    public static void nk_textedit_undo(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_undo.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_textedit_redo;
    public static final java.lang.invoke.MethodHandle MTD__nk_textedit_redo;
    public static void nk_textedit_redo(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_textedit_redo.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_line;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_line;
    public static void nk_stroke_line(java.lang.foreign.MemorySegment b, float x0, float y0, float x1, float y1, float line_thickness, nuklear.nk_color __arg7)
    {
        try {MTD__nk_stroke_line.invokeExact(b, x0, y0, x1, y1, line_thickness, __arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_curve;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_curve;
    public static void nk_stroke_curve(java.lang.foreign.MemorySegment __arg1, float __arg2, float __arg3, float __arg4, float __arg5, float __arg6, float __arg7, float __arg8, float __arg9, float line_thickness, nuklear.nk_color __arg11)
    {
        try {MTD__nk_stroke_curve.invokeExact(__arg1, __arg2, __arg3, __arg4, __arg5, __arg6, __arg7, __arg8, __arg9, line_thickness, __arg11._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_rect;
    public static void nk_stroke_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, float rounding, float line_thickness, nuklear.nk_color __arg5)
    {
        try {MTD__nk_stroke_rect.invokeExact(__arg1, __arg2._ptr(), rounding, line_thickness, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_circle;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_circle;
    public static void nk_stroke_circle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, float line_thickness, nuklear.nk_color __arg4)
    {
        try {MTD__nk_stroke_circle.invokeExact(__arg1, __arg2._ptr(), line_thickness, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_arc;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_arc;
    public static void nk_stroke_arc(java.lang.foreign.MemorySegment __arg1, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, nuklear.nk_color __arg8)
    {
        try {MTD__nk_stroke_arc.invokeExact(__arg1, cx, cy, radius, a_min, a_max, line_thickness, __arg8._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_triangle;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_triangle;
    public static void nk_stroke_triangle(java.lang.foreign.MemorySegment __arg1, float __arg2, float __arg3, float __arg4, float __arg5, float __arg6, float __arg7, float line_thichness, nuklear.nk_color __arg9)
    {
        try {MTD__nk_stroke_triangle.invokeExact(__arg1, __arg2, __arg3, __arg4, __arg5, __arg6, __arg7, line_thichness, __arg9._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_polyline;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_polyline;
    public static void nk_stroke_polyline(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment points, int point_count, float line_thickness, nuklear.nk_color col)
    {
        try {MTD__nk_stroke_polyline.invokeExact(__arg1, points, point_count, line_thickness, col._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_stroke_polygon;
    public static final java.lang.invoke.MethodHandle MTD__nk_stroke_polygon;
    public static void nk_stroke_polygon(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int point_count, float line_thickness, nuklear.nk_color __arg5)
    {
        try {MTD__nk_stroke_polygon.invokeExact(__arg1, __arg2, point_count, line_thickness, __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_rect;
    public static void nk_fill_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, float rounding, nuklear.nk_color __arg4)
    {
        try {MTD__nk_fill_rect.invokeExact(__arg1, __arg2._ptr(), rounding, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_rect_multi_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_rect_multi_color;
    public static void nk_fill_rect_multi_color(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, nuklear.nk_color left, nuklear.nk_color top, nuklear.nk_color right, nuklear.nk_color bottom)
    {
        try {MTD__nk_fill_rect_multi_color.invokeExact(__arg1, __arg2._ptr(), left._ptr(), top._ptr(), right._ptr(), bottom._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_circle;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_circle;
    public static void nk_fill_circle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, nuklear.nk_color __arg3)
    {
        try {MTD__nk_fill_circle.invokeExact(__arg1, __arg2._ptr(), __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_arc;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_arc;
    public static void nk_fill_arc(java.lang.foreign.MemorySegment __arg1, float cx, float cy, float radius, float a_min, float a_max, nuklear.nk_color __arg7)
    {
        try {MTD__nk_fill_arc.invokeExact(__arg1, cx, cy, radius, a_min, a_max, __arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_triangle;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_triangle;
    public static void nk_fill_triangle(java.lang.foreign.MemorySegment __arg1, float x0, float y0, float x1, float y1, float x2, float y2, nuklear.nk_color __arg8)
    {
        try {MTD__nk_fill_triangle.invokeExact(__arg1, x0, y0, x1, y1, x2, y2, __arg8._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_fill_polygon;
    public static final java.lang.invoke.MethodHandle MTD__nk_fill_polygon;
    public static void nk_fill_polygon(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, int point_count, nuklear.nk_color __arg4)
    {
        try {MTD__nk_fill_polygon.invokeExact(__arg1, __arg2, point_count, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_image;
    public static void nk_draw_image(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, java.lang.foreign.MemorySegment __arg3, nuklear.nk_color __arg4)
    {
        try {MTD__nk_draw_image.invokeExact(__arg1, __arg2._ptr(), __arg3, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_nine_slice;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_nine_slice;
    public static void nk_draw_nine_slice(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, java.lang.foreign.MemorySegment __arg3, nuklear.nk_color __arg4)
    {
        try {MTD__nk_draw_nine_slice.invokeExact(__arg1, __arg2._ptr(), __arg3, __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_text;
    public static void nk_draw_text(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment __arg5, nuklear.nk_color __arg6, nuklear.nk_color __arg7)
    {
        try {MTD__nk_draw_text.invokeExact(__arg1, __arg2._ptr(), text, len, __arg5, __arg6._ptr(), __arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_push_scissor;
    public static final java.lang.invoke.MethodHandle MTD__nk_push_scissor;
    public static void nk_push_scissor(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {MTD__nk_push_scissor.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_push_custom;
    public static final java.lang.invoke.MethodHandle MTD__nk_push_custom;
    public static void nk_push_custom(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2, java.lang.foreign.MemorySegment __arg3, nuklear.nk_handle usr)
    {
        try {MTD__nk_push_custom.invokeExact(__arg1, __arg2._ptr(), __arg3, usr._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_has_mouse_click;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_has_mouse_click;
    public static int nk_input_has_mouse_click(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_has_mouse_click.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_has_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_has_mouse_click_in_rect;
    public static int nk_input_has_mouse_click_in_rect(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_rect __arg3)
    {
        try {return (int)MTD__nk_input_has_mouse_click_in_rect.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_has_mouse_click_in_button_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_has_mouse_click_in_button_rect;
    public static int nk_input_has_mouse_click_in_button_rect(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_rect __arg3)
    {
        try {return (int)MTD__nk_input_has_mouse_click_in_button_rect.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_has_mouse_click_down_in_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_has_mouse_click_down_in_rect;
    public static int nk_input_has_mouse_click_down_in_rect(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_rect __arg3, int down)
    {
        try {return (int)MTD__nk_input_has_mouse_click_down_in_rect.invokeExact(__arg1, __arg2, __arg3._ptr(), down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_click_in_rect;
    public static int nk_input_is_mouse_click_in_rect(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_rect __arg3)
    {
        try {return (int)MTD__nk_input_is_mouse_click_in_rect.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_click_down_in_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_click_down_in_rect;
    public static int nk_input_is_mouse_click_down_in_rect(java.lang.foreign.MemorySegment i, int id, nuklear.nk_rect b, int down)
    {
        try {return (int)MTD__nk_input_is_mouse_click_down_in_rect.invokeExact(i, id, b._ptr(), down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_any_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_any_mouse_click_in_rect;
    public static int nk_input_any_mouse_click_in_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {return (int)MTD__nk_input_any_mouse_click_in_rect.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_prev_hovering_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_prev_hovering_rect;
    public static int nk_input_is_mouse_prev_hovering_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {return (int)MTD__nk_input_is_mouse_prev_hovering_rect.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_hovering_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_hovering_rect;
    public static int nk_input_is_mouse_hovering_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect __arg2)
    {
        try {return (int)MTD__nk_input_is_mouse_hovering_rect.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_mouse_clicked;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_mouse_clicked;
    public static int nk_input_mouse_clicked(java.lang.foreign.MemorySegment __arg1, int __arg2, nuklear.nk_rect __arg3)
    {
        try {return (int)MTD__nk_input_mouse_clicked.invokeExact(__arg1, __arg2, __arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_down;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_down;
    public static int nk_input_is_mouse_down(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_mouse_down.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_pressed;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_pressed;
    public static int nk_input_is_mouse_pressed(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_mouse_pressed.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_mouse_released;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_mouse_released;
    public static int nk_input_is_mouse_released(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_mouse_released.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_key_pressed;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_key_pressed;
    public static int nk_input_is_key_pressed(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_key_pressed.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_key_released;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_key_released;
    public static int nk_input_is_key_released(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_key_released.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_input_is_key_down;
    public static final java.lang.invoke.MethodHandle MTD__nk_input_is_key_down;
    public static int nk_input_is_key_down(java.lang.foreign.MemorySegment __arg1, int __arg2)
    {
        try {return (int)MTD__nk_input_is_key_down.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_init;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_init;
    public static void nk_draw_list_init(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_draw_list_init.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_setup;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_setup;
    public static void nk_draw_list_setup(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment vertices, java.lang.foreign.MemorySegment elements, int line_aa, int shape_aa)
    {
        try {MTD__nk_draw_list_setup.invokeExact(__arg1, __arg2, cmds, vertices, elements, line_aa, shape_aa);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_list_begin;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_list_begin;
    public static java.lang.foreign.MemorySegment nk__draw_list_begin(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_list_begin.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_list_next;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_list_next;
    public static java.lang.foreign.MemorySegment nk__draw_list_next(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, java.lang.foreign.MemorySegment __arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_list_next.invokeExact(__arg1, __arg2, __arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk__draw_list_end;
    public static final java.lang.invoke.MethodHandle MTD__nk__draw_list_end;
    public static java.lang.foreign.MemorySegment nk__draw_list_end(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__nk__draw_list_end.invokeExact(__arg1, __arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_clear;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_clear;
    public static void nk_draw_list_path_clear(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__nk_draw_list_path_clear.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_line_to;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_line_to;
    public static void nk_draw_list_path_line_to(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 pos)
    {
        try {MTD__nk_draw_list_path_line_to.invokeExact(__arg1, pos._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_arc_to_fast;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_arc_to_fast;
    public static void nk_draw_list_path_arc_to_fast(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 center, float radius, int a_min, int a_max)
    {
        try {MTD__nk_draw_list_path_arc_to_fast.invokeExact(__arg1, center._ptr(), radius, a_min, a_max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_arc_to;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_arc_to;
    public static void nk_draw_list_path_arc_to(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 center, float radius, float a_min, float a_max, int segments)
    {
        try {MTD__nk_draw_list_path_arc_to.invokeExact(__arg1, center._ptr(), radius, a_min, a_max, segments);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_rect_to;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_rect_to;
    public static void nk_draw_list_path_rect_to(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, float rounding)
    {
        try {MTD__nk_draw_list_path_rect_to.invokeExact(__arg1, a._ptr(), b._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_curve_to;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_curve_to;
    public static void nk_draw_list_path_curve_to(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 p2, nuklear.nk_vec2 p3, nuklear.nk_vec2 p4, int num_segments)
    {
        try {MTD__nk_draw_list_path_curve_to.invokeExact(__arg1, p2._ptr(), p3._ptr(), p4._ptr(), num_segments);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_fill;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_fill;
    public static void nk_draw_list_path_fill(java.lang.foreign.MemorySegment __arg1, nuklear.nk_color __arg2)
    {
        try {MTD__nk_draw_list_path_fill.invokeExact(__arg1, __arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_path_stroke;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_path_stroke;
    public static void nk_draw_list_path_stroke(java.lang.foreign.MemorySegment __arg1, nuklear.nk_color __arg2, int closed, float thickness)
    {
        try {MTD__nk_draw_list_path_stroke.invokeExact(__arg1, __arg2._ptr(), closed, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_line;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_line;
    public static void nk_draw_list_stroke_line(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_color __arg4, float thickness)
    {
        try {MTD__nk_draw_list_stroke_line.invokeExact(__arg1, a._ptr(), b._ptr(), __arg4._ptr(), thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_rect;
    public static void nk_draw_list_stroke_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect rect, nuklear.nk_color __arg3, float rounding, float thickness)
    {
        try {MTD__nk_draw_list_stroke_rect.invokeExact(__arg1, rect._ptr(), __arg3._ptr(), rounding, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_triangle;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_triangle;
    public static void nk_draw_list_stroke_triangle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_vec2 c, nuklear.nk_color __arg5, float thickness)
    {
        try {MTD__nk_draw_list_stroke_triangle.invokeExact(__arg1, a._ptr(), b._ptr(), c._ptr(), __arg5._ptr(), thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_circle;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_circle;
    public static void nk_draw_list_stroke_circle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 center, float radius, nuklear.nk_color __arg4, int segs, float thickness)
    {
        try {MTD__nk_draw_list_stroke_circle.invokeExact(__arg1, center._ptr(), radius, __arg4._ptr(), segs, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_curve;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_curve;
    public static void nk_draw_list_stroke_curve(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 p0, nuklear.nk_vec2 cp0, nuklear.nk_vec2 cp1, nuklear.nk_vec2 p1, nuklear.nk_color __arg6, int segments, float thickness)
    {
        try {MTD__nk_draw_list_stroke_curve.invokeExact(__arg1, p0._ptr(), cp0._ptr(), cp1._ptr(), p1._ptr(), __arg6._ptr(), segments, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_stroke_poly_line;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_stroke_poly_line;
    public static void nk_draw_list_stroke_poly_line(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment pnts, int cnt, nuklear.nk_color __arg4, int __arg5, float thickness, int __arg7)
    {
        try {MTD__nk_draw_list_stroke_poly_line.invokeExact(__arg1, pnts, cnt, __arg4._ptr(), __arg5, thickness, __arg7);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_fill_rect;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_fill_rect;
    public static void nk_draw_list_fill_rect(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect rect, nuklear.nk_color __arg3, float rounding)
    {
        try {MTD__nk_draw_list_fill_rect.invokeExact(__arg1, rect._ptr(), __arg3._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_fill_rect_multi_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_fill_rect_multi_color;
    public static void nk_draw_list_fill_rect_multi_color(java.lang.foreign.MemorySegment __arg1, nuklear.nk_rect rect, nuklear.nk_color left, nuklear.nk_color top, nuklear.nk_color right, nuklear.nk_color bottom)
    {
        try {MTD__nk_draw_list_fill_rect_multi_color.invokeExact(__arg1, rect._ptr(), left._ptr(), top._ptr(), right._ptr(), bottom._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_fill_triangle;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_fill_triangle;
    public static void nk_draw_list_fill_triangle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_vec2 c, nuklear.nk_color __arg5)
    {
        try {MTD__nk_draw_list_fill_triangle.invokeExact(__arg1, a._ptr(), b._ptr(), c._ptr(), __arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_fill_circle;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_fill_circle;
    public static void nk_draw_list_fill_circle(java.lang.foreign.MemorySegment __arg1, nuklear.nk_vec2 center, float radius, nuklear.nk_color col, int segs)
    {
        try {MTD__nk_draw_list_fill_circle.invokeExact(__arg1, center._ptr(), radius, col._ptr(), segs);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_fill_poly_convex;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_fill_poly_convex;
    public static void nk_draw_list_fill_poly_convex(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment points, int count, nuklear.nk_color __arg4, int __arg5)
    {
        try {MTD__nk_draw_list_fill_poly_convex.invokeExact(__arg1, points, count, __arg4._ptr(), __arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_add_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_add_image;
    public static void nk_draw_list_add_image(java.lang.foreign.MemorySegment __arg1, nuklear.nk_image texture, nuklear.nk_rect rect, nuklear.nk_color __arg4)
    {
        try {MTD__nk_draw_list_add_image.invokeExact(__arg1, texture._ptr(), rect._ptr(), __arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_draw_list_add_text;
    public static final java.lang.invoke.MethodHandle MTD__nk_draw_list_add_text;
    public static void nk_draw_list_add_text(java.lang.foreign.MemorySegment __arg1, java.lang.foreign.MemorySegment __arg2, nuklear.nk_rect __arg3, java.lang.foreign.MemorySegment text, int len, float font_height, nuklear.nk_color __arg7)
    {
        try {MTD__nk_draw_list_add_text.invokeExact(__arg1, __arg2, __arg3._ptr(), text, len, font_height, __arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_item_color;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_item_color;
    public static nuklear.nk_style_item nk_style_item_color(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color __arg1)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD__nk_style_item_color.invokeExact(allocator, __arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_item_image;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_item_image;
    public static nuklear.nk_style_item nk_style_item_image(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_image img)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD__nk_style_item_image.invokeExact(allocator, img._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_item_nine_slice;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_item_nine_slice;
    public static nuklear.nk_style_item nk_style_item_nine_slice(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_nine_slice slice)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD__nk_style_item_nine_slice.invokeExact(allocator, slice._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__nk_style_item_hide;
    public static final java.lang.invoke.MethodHandle MTD__nk_style_item_hide;
    public static nuklear.nk_style_item nk_style_item_hide(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD__nk_style_item_hide.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));

        MTD_ADDRESS__nk_init_default = lookup.find("nk_init_default").orElseThrow();
        MTD__nk_init_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_init_default, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_init_fixed = lookup.find("nk_init_fixed").orElseThrow();
        MTD__nk_init_fixed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_init_fixed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_init = lookup.find("nk_init").orElseThrow();
        MTD__nk_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_init, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_init_custom = lookup.find("nk_init_custom").orElseThrow();
        MTD__nk_init_custom = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_init_custom, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_clear = lookup.find("nk_clear").orElseThrow();
        MTD__nk_clear = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_clear, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_free = lookup.find("nk_free").orElseThrow();
        MTD__nk_free = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_input_begin = lookup.find("nk_input_begin").orElseThrow();
        MTD__nk_input_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_input_motion = lookup.find("nk_input_motion").orElseThrow();
        MTD__nk_input_motion = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_motion, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_key = lookup.find("nk_input_key").orElseThrow();
        MTD__nk_input_key = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_key, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_button = lookup.find("nk_input_button").orElseThrow();
        MTD__nk_input_button = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_button, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_scroll = lookup.find("nk_input_scroll").orElseThrow();
        MTD__nk_input_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_input_char = lookup.find("nk_input_char").orElseThrow();
        MTD__nk_input_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_char, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BYTE));
        MTD_ADDRESS__nk_input_glyph = lookup.find("nk_input_glyph").orElseThrow();
        MTD__nk_input_glyph = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_glyph, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_input_unicode = lookup.find("nk_input_unicode").orElseThrow();
        MTD__nk_input_unicode = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_unicode, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_end = lookup.find("nk_input_end").orElseThrow();
        MTD__nk_input_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__begin = lookup.find("nk__begin").orElseThrow();
        MTD__nk__begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__begin, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__next = lookup.find("nk__next").orElseThrow();
        MTD__nk__next = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__next, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_convert = lookup.find("nk_convert").orElseThrow();
        MTD__nk_convert = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_convert, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__draw_begin = lookup.find("nk__draw_begin").orElseThrow();
        MTD__nk__draw_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_begin, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__draw_end = lookup.find("nk__draw_end").orElseThrow();
        MTD__nk__draw_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_end, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__draw_next = lookup.find("nk__draw_next").orElseThrow();
        MTD__nk__draw_next = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_next, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_begin = lookup.find("nk_begin").orElseThrow();
        MTD__nk_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_begin_titled = lookup.find("nk_begin_titled").orElseThrow();
        MTD__nk_begin_titled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_begin_titled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_end = lookup.find("nk_end").orElseThrow();
        MTD__nk_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_find = lookup.find("nk_window_find").orElseThrow();
        MTD__nk_window_find = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_find, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_bounds = lookup.find("nk_window_get_bounds").orElseThrow();
        MTD__nk_window_get_bounds = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_position = lookup.find("nk_window_get_position").orElseThrow();
        MTD__nk_window_get_position = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_position, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_size = lookup.find("nk_window_get_size").orElseThrow();
        MTD__nk_window_get_size = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_width = lookup.find("nk_window_get_width").orElseThrow();
        MTD__nk_window_get_width = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_width, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_height = lookup.find("nk_window_get_height").orElseThrow();
        MTD__nk_window_get_height = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_height, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_panel = lookup.find("nk_window_get_panel").orElseThrow();
        MTD__nk_window_get_panel = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_panel, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_content_region = lookup.find("nk_window_get_content_region").orElseThrow();
        MTD__nk_window_get_content_region = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_content_region, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_content_region_min = lookup.find("nk_window_get_content_region_min").orElseThrow();
        MTD__nk_window_get_content_region_min = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_content_region_min, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_content_region_max = lookup.find("nk_window_get_content_region_max").orElseThrow();
        MTD__nk_window_get_content_region_max = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_content_region_max, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_content_region_size = lookup.find("nk_window_get_content_region_size").orElseThrow();
        MTD__nk_window_get_content_region_size = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_content_region_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_canvas = lookup.find("nk_window_get_canvas").orElseThrow();
        MTD__nk_window_get_canvas = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_canvas, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_get_scroll = lookup.find("nk_window_get_scroll").orElseThrow();
        MTD__nk_window_get_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_has_focus = lookup.find("nk_window_has_focus").orElseThrow();
        MTD__nk_window_has_focus = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_has_focus, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_hovered = lookup.find("nk_window_is_hovered").orElseThrow();
        MTD__nk_window_is_hovered = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_collapsed = lookup.find("nk_window_is_collapsed").orElseThrow();
        MTD__nk_window_is_collapsed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_collapsed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_closed = lookup.find("nk_window_is_closed").orElseThrow();
        MTD__nk_window_is_closed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_closed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_hidden = lookup.find("nk_window_is_hidden").orElseThrow();
        MTD__nk_window_is_hidden = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_hidden, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_active = lookup.find("nk_window_is_active").orElseThrow();
        MTD__nk_window_is_active = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_active, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_is_any_hovered = lookup.find("nk_window_is_any_hovered").orElseThrow();
        MTD__nk_window_is_any_hovered = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_is_any_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_item_is_any_active = lookup.find("nk_item_is_any_active").orElseThrow();
        MTD__nk_item_is_any_active = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_item_is_any_active, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_set_bounds = lookup.find("nk_window_set_bounds").orElseThrow();
        MTD__nk_window_set_bounds = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_set_bounds, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_window_set_position = lookup.find("nk_window_set_position").orElseThrow();
        MTD__nk_window_set_position = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_set_position, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_window_set_size = lookup.find("nk_window_set_size").orElseThrow();
        MTD__nk_window_set_size = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_set_size, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_window_set_focus = lookup.find("nk_window_set_focus").orElseThrow();
        MTD__nk_window_set_focus = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_set_focus, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_set_scroll = lookup.find("nk_window_set_scroll").orElseThrow();
        MTD__nk_window_set_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_window_close = lookup.find("nk_window_close").orElseThrow();
        MTD__nk_window_close = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_close, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_window_collapse = lookup.find("nk_window_collapse").orElseThrow();
        MTD__nk_window_collapse = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_collapse, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_window_collapse_if = lookup.find("nk_window_collapse_if").orElseThrow();
        MTD__nk_window_collapse_if = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_collapse_if, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_window_show = lookup.find("nk_window_show").orElseThrow();
        MTD__nk_window_show = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_show, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_window_show_if = lookup.find("nk_window_show_if").orElseThrow();
        MTD__nk_window_show_if = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_window_show_if, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_rule_horizontal = lookup.find("nk_rule_horizontal").orElseThrow();
        MTD__nk_rule_horizontal = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rule_horizontal, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_layout_set_min_row_height = lookup.find("nk_layout_set_min_row_height").orElseThrow();
        MTD__nk_layout_set_min_row_height = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_set_min_row_height, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_reset_min_row_height = lookup.find("nk_layout_reset_min_row_height").orElseThrow();
        MTD__nk_layout_reset_min_row_height = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_reset_min_row_height, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_widget_bounds = lookup.find("nk_layout_widget_bounds").orElseThrow();
        MTD__nk_layout_widget_bounds = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_widget_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_ratio_from_pixel = lookup.find("nk_layout_ratio_from_pixel").orElseThrow();
        MTD__nk_layout_ratio_from_pixel = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_ratio_from_pixel, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_row_dynamic = lookup.find("nk_layout_row_dynamic").orElseThrow();
        MTD__nk_layout_row_dynamic = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_dynamic, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_layout_row_static = lookup.find("nk_layout_row_static").orElseThrow();
        MTD__nk_layout_row_static = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_static, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_layout_row_begin = lookup.find("nk_layout_row_begin").orElseThrow();
        MTD__nk_layout_row_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_layout_row_push = lookup.find("nk_layout_row_push").orElseThrow();
        MTD__nk_layout_row_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_push, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_row_end = lookup.find("nk_layout_row_end").orElseThrow();
        MTD__nk_layout_row_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_row = lookup.find("nk_layout_row").orElseThrow();
        MTD__nk_layout_row = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_row_template_begin = lookup.find("nk_layout_row_template_begin").orElseThrow();
        MTD__nk_layout_row_template_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_template_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_row_template_push_dynamic = lookup.find("nk_layout_row_template_push_dynamic").orElseThrow();
        MTD__nk_layout_row_template_push_dynamic = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_template_push_dynamic, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_row_template_push_variable = lookup.find("nk_layout_row_template_push_variable").orElseThrow();
        MTD__nk_layout_row_template_push_variable = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_template_push_variable, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_row_template_push_static = lookup.find("nk_layout_row_template_push_static").orElseThrow();
        MTD__nk_layout_row_template_push_static = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_template_push_static, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_layout_row_template_end = lookup.find("nk_layout_row_template_end").orElseThrow();
        MTD__nk_layout_row_template_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_row_template_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_space_begin = lookup.find("nk_layout_space_begin").orElseThrow();
        MTD__nk_layout_space_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_layout_space_push = lookup.find("nk_layout_space_push").orElseThrow();
        MTD__nk_layout_space_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_push, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_layout_space_end = lookup.find("nk_layout_space_end").orElseThrow();
        MTD__nk_layout_space_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_space_bounds = lookup.find("nk_layout_space_bounds").orElseThrow();
        MTD__nk_layout_space_bounds = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_layout_space_to_screen = lookup.find("nk_layout_space_to_screen").orElseThrow();
        MTD__nk_layout_space_to_screen = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_to_screen, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_layout_space_to_local = lookup.find("nk_layout_space_to_local").orElseThrow();
        MTD__nk_layout_space_to_local = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_to_local, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_layout_space_rect_to_screen = lookup.find("nk_layout_space_rect_to_screen").orElseThrow();
        MTD__nk_layout_space_rect_to_screen = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_rect_to_screen, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_layout_space_rect_to_local = lookup.find("nk_layout_space_rect_to_local").orElseThrow();
        MTD__nk_layout_space_rect_to_local = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_layout_space_rect_to_local, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_spacer = lookup.find("nk_spacer").orElseThrow();
        MTD__nk_spacer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_spacer, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_group_begin = lookup.find("nk_group_begin").orElseThrow();
        MTD__nk_group_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_group_begin_titled = lookup.find("nk_group_begin_titled").orElseThrow();
        MTD__nk_group_begin_titled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_begin_titled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_group_end = lookup.find("nk_group_end").orElseThrow();
        MTD__nk_group_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_group_scrolled_offset_begin = lookup.find("nk_group_scrolled_offset_begin").orElseThrow();
        MTD__nk_group_scrolled_offset_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_scrolled_offset_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_group_scrolled_begin = lookup.find("nk_group_scrolled_begin").orElseThrow();
        MTD__nk_group_scrolled_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_scrolled_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_group_scrolled_end = lookup.find("nk_group_scrolled_end").orElseThrow();
        MTD__nk_group_scrolled_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_scrolled_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_group_get_scroll = lookup.find("nk_group_get_scroll").orElseThrow();
        MTD__nk_group_get_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_group_set_scroll = lookup.find("nk_group_set_scroll").orElseThrow();
        MTD__nk_group_set_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_group_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_tree_push_hashed = lookup.find("nk_tree_push_hashed").orElseThrow();
        MTD__nk_tree_push_hashed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_tree_image_push_hashed = lookup.find("nk_tree_image_push_hashed").orElseThrow();
        MTD__nk_tree_image_push_hashed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_image_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_tree_pop = lookup.find("nk_tree_pop").orElseThrow();
        MTD__nk_tree_pop = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_pop, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tree_state_push = lookup.find("nk_tree_state_push").orElseThrow();
        MTD__nk_tree_state_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_state_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tree_state_image_push = lookup.find("nk_tree_state_image_push").orElseThrow();
        MTD__nk_tree_state_image_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_state_image_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tree_state_pop = lookup.find("nk_tree_state_pop").orElseThrow();
        MTD__nk_tree_state_pop = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_state_pop, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tree_element_push_hashed = lookup.find("nk_tree_element_push_hashed").orElseThrow();
        MTD__nk_tree_element_push_hashed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_element_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_tree_element_image_push_hashed = lookup.find("nk_tree_element_image_push_hashed").orElseThrow();
        MTD__nk_tree_element_image_push_hashed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_element_image_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_tree_element_pop = lookup.find("nk_tree_element_pop").orElseThrow();
        MTD__nk_tree_element_pop = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tree_element_pop, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_list_view_begin = lookup.find("nk_list_view_begin").orElseThrow();
        MTD__nk_list_view_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_list_view_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_list_view_end = lookup.find("nk_list_view_end").orElseThrow();
        MTD__nk_list_view_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_list_view_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget = lookup.find("nk_widget").orElseThrow();
        MTD__nk_widget = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_fitting = lookup.find("nk_widget_fitting").orElseThrow();
        MTD__nk_widget_fitting = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_fitting, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_widget_bounds = lookup.find("nk_widget_bounds").orElseThrow();
        MTD__nk_widget_bounds = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_position = lookup.find("nk_widget_position").orElseThrow();
        MTD__nk_widget_position = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_position, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_size = lookup.find("nk_widget_size").orElseThrow();
        MTD__nk_widget_size = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_width = lookup.find("nk_widget_width").orElseThrow();
        MTD__nk_widget_width = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_width, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_height = lookup.find("nk_widget_height").orElseThrow();
        MTD__nk_widget_height = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_height, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_is_hovered = lookup.find("nk_widget_is_hovered").orElseThrow();
        MTD__nk_widget_is_hovered = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_is_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_is_mouse_clicked = lookup.find("nk_widget_is_mouse_clicked").orElseThrow();
        MTD__nk_widget_is_mouse_clicked = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_is_mouse_clicked, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_widget_has_mouse_click_down = lookup.find("nk_widget_has_mouse_click_down").orElseThrow();
        MTD__nk_widget_has_mouse_click_down = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_has_mouse_click_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_spacing = lookup.find("nk_spacing").orElseThrow();
        MTD__nk_spacing = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_spacing, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_widget_disable_begin = lookup.find("nk_widget_disable_begin").orElseThrow();
        MTD__nk_widget_disable_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_disable_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_widget_disable_end = lookup.find("nk_widget_disable_end").orElseThrow();
        MTD__nk_widget_disable_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_widget_disable_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_text = lookup.find("nk_text").orElseThrow();
        MTD__nk_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_text, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_text_colored = lookup.find("nk_text_colored").orElseThrow();
        MTD__nk_text_colored = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_text_colored, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_text_wrap = lookup.find("nk_text_wrap").orElseThrow();
        MTD__nk_text_wrap = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_text_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_text_wrap_colored = lookup.find("nk_text_wrap_colored").orElseThrow();
        MTD__nk_text_wrap_colored = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_text_wrap_colored, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_label = lookup.find("nk_label").orElseThrow();
        MTD__nk_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_label, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_label_colored = lookup.find("nk_label_colored").orElseThrow();
        MTD__nk_label_colored = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_label_colored, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_label_wrap = lookup.find("nk_label_wrap").orElseThrow();
        MTD__nk_label_wrap = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_label_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_label_colored_wrap = lookup.find("nk_label_colored_wrap").orElseThrow();
        MTD__nk_label_colored_wrap = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_label_colored_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_image = lookup.find("nk_image").orElseThrow();
        MTD__nk_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout));
        MTD_ADDRESS__nk_image_color = lookup.find("nk_image_color").orElseThrow();
        MTD__nk_image_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image_color, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_button_text = lookup.find("nk_button_text").orElseThrow();
        MTD__nk_button_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_label = lookup.find("nk_button_label").orElseThrow();
        MTD__nk_button_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_button_color = lookup.find("nk_button_color").orElseThrow();
        MTD__nk_button_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_button_symbol = lookup.find("nk_button_symbol").orElseThrow();
        MTD__nk_button_symbol = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image = lookup.find("nk_button_image").orElseThrow();
        MTD__nk_button_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout));
        MTD_ADDRESS__nk_button_symbol_label = lookup.find("nk_button_symbol_label").orElseThrow();
        MTD__nk_button_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_symbol_text = lookup.find("nk_button_symbol_text").orElseThrow();
        MTD__nk_button_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image_label = lookup.find("nk_button_image_label").orElseThrow();
        MTD__nk_button_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image_text = lookup.find("nk_button_image_text").orElseThrow();
        MTD__nk_button_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_text_styled = lookup.find("nk_button_text_styled").orElseThrow();
        MTD__nk_button_text_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_label_styled = lookup.find("nk_button_label_styled").orElseThrow();
        MTD__nk_button_label_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_button_symbol_styled = lookup.find("nk_button_symbol_styled").orElseThrow();
        MTD__nk_button_symbol_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image_styled = lookup.find("nk_button_image_styled").orElseThrow();
        MTD__nk_button_image_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout));
        MTD_ADDRESS__nk_button_symbol_text_styled = lookup.find("nk_button_symbol_text_styled").orElseThrow();
        MTD__nk_button_symbol_text_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_symbol_label_styled = lookup.find("nk_button_symbol_label_styled").orElseThrow();
        MTD__nk_button_symbol_label_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_symbol_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image_label_styled = lookup.find("nk_button_image_label_styled").orElseThrow();
        MTD__nk_button_image_label_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_image_text_styled = lookup.find("nk_button_image_text_styled").orElseThrow();
        MTD__nk_button_image_text_styled = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_image_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_set_behavior = lookup.find("nk_button_set_behavior").orElseThrow();
        MTD__nk_button_set_behavior = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_set_behavior, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_push_behavior = lookup.find("nk_button_push_behavior").orElseThrow();
        MTD__nk_button_push_behavior = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_push_behavior, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_button_pop_behavior = lookup.find("nk_button_pop_behavior").orElseThrow();
        MTD__nk_button_pop_behavior = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_button_pop_behavior, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_check_label = lookup.find("nk_check_label").orElseThrow();
        MTD__nk_check_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_check_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_check_text = lookup.find("nk_check_text").orElseThrow();
        MTD__nk_check_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_check_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_check_text_align = lookup.find("nk_check_text_align").orElseThrow();
        MTD__nk_check_text_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_check_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_check_flags_label = lookup.find("nk_check_flags_label").orElseThrow();
        MTD__nk_check_flags_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_check_flags_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_check_flags_text = lookup.find("nk_check_flags_text").orElseThrow();
        MTD__nk_check_flags_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_check_flags_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_checkbox_label = lookup.find("nk_checkbox_label").orElseThrow();
        MTD__nk_checkbox_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_checkbox_label_align = lookup.find("nk_checkbox_label_align").orElseThrow();
        MTD__nk_checkbox_label_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_checkbox_text = lookup.find("nk_checkbox_text").orElseThrow();
        MTD__nk_checkbox_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_checkbox_text_align = lookup.find("nk_checkbox_text_align").orElseThrow();
        MTD__nk_checkbox_text_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_checkbox_flags_label = lookup.find("nk_checkbox_flags_label").orElseThrow();
        MTD__nk_checkbox_flags_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_flags_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_checkbox_flags_text = lookup.find("nk_checkbox_flags_text").orElseThrow();
        MTD__nk_checkbox_flags_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_checkbox_flags_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_radio_label = lookup.find("nk_radio_label").orElseThrow();
        MTD__nk_radio_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_radio_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_radio_label_align = lookup.find("nk_radio_label_align").orElseThrow();
        MTD__nk_radio_label_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_radio_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_radio_text = lookup.find("nk_radio_text").orElseThrow();
        MTD__nk_radio_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_radio_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_radio_text_align = lookup.find("nk_radio_text_align").orElseThrow();
        MTD__nk_radio_text_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_radio_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_option_label = lookup.find("nk_option_label").orElseThrow();
        MTD__nk_option_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_option_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_option_label_align = lookup.find("nk_option_label_align").orElseThrow();
        MTD__nk_option_label_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_option_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_option_text = lookup.find("nk_option_text").orElseThrow();
        MTD__nk_option_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_option_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_option_text_align = lookup.find("nk_option_text_align").orElseThrow();
        MTD__nk_option_text_align = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_option_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_selectable_label = lookup.find("nk_selectable_label").orElseThrow();
        MTD__nk_selectable_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_selectable_text = lookup.find("nk_selectable_text").orElseThrow();
        MTD__nk_selectable_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_selectable_image_label = lookup.find("nk_selectable_image_label").orElseThrow();
        MTD__nk_selectable_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_selectable_image_text = lookup.find("nk_selectable_image_text").orElseThrow();
        MTD__nk_selectable_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_selectable_symbol_label = lookup.find("nk_selectable_symbol_label").orElseThrow();
        MTD__nk_selectable_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_selectable_symbol_text = lookup.find("nk_selectable_symbol_text").orElseThrow();
        MTD__nk_selectable_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_selectable_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_select_label = lookup.find("nk_select_label").orElseThrow();
        MTD__nk_select_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_select_text = lookup.find("nk_select_text").orElseThrow();
        MTD__nk_select_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_select_image_label = lookup.find("nk_select_image_label").orElseThrow();
        MTD__nk_select_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_select_image_text = lookup.find("nk_select_image_text").orElseThrow();
        MTD__nk_select_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_select_symbol_label = lookup.find("nk_select_symbol_label").orElseThrow();
        MTD__nk_select_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_select_symbol_text = lookup.find("nk_select_symbol_text").orElseThrow();
        MTD__nk_select_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_select_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_slide_float = lookup.find("nk_slide_float").orElseThrow();
        MTD__nk_slide_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_slide_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_slide_int = lookup.find("nk_slide_int").orElseThrow();
        MTD__nk_slide_int = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_slide_int, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_slider_float = lookup.find("nk_slider_float").orElseThrow();
        MTD__nk_slider_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_slider_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_slider_int = lookup.find("nk_slider_int").orElseThrow();
        MTD__nk_slider_int = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_slider_int, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_progress = lookup.find("nk_progress").orElseThrow();
        MTD__nk_progress = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_progress, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_prog = lookup.find("nk_prog").orElseThrow();
        MTD__nk_prog = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_prog, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_color_picker = lookup.find("nk_color_picker").orElseThrow();
        MTD__nk_color_picker = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_picker, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_colorf.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_color_pick = lookup.find("nk_color_pick").orElseThrow();
        MTD__nk_color_pick = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_pick, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_property_int = lookup.find("nk_property_int").orElseThrow();
        MTD__nk_property_int = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_property_int, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_property_float = lookup.find("nk_property_float").orElseThrow();
        MTD__nk_property_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_property_float, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_property_double = lookup.find("nk_property_double").orElseThrow();
        MTD__nk_property_double = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_property_double, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_DOUBLE, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_propertyi = lookup.find("nk_propertyi").orElseThrow();
        MTD__nk_propertyi = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_propertyi, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_propertyf = lookup.find("nk_propertyf").orElseThrow();
        MTD__nk_propertyf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_propertyf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_propertyd = lookup.find("nk_propertyd").orElseThrow();
        MTD__nk_propertyd = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_propertyd, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_edit_string = lookup.find("nk_edit_string").orElseThrow();
        MTD__nk_edit_string = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_edit_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_edit_string_zero_terminated = lookup.find("nk_edit_string_zero_terminated").orElseThrow();
        MTD__nk_edit_string_zero_terminated = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_edit_string_zero_terminated, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_edit_buffer = lookup.find("nk_edit_buffer").orElseThrow();
        MTD__nk_edit_buffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_edit_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_edit_focus = lookup.find("nk_edit_focus").orElseThrow();
        MTD__nk_edit_focus = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_edit_focus, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_edit_unfocus = lookup.find("nk_edit_unfocus").orElseThrow();
        MTD__nk_edit_unfocus = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_edit_unfocus, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_chart_begin = lookup.find("nk_chart_begin").orElseThrow();
        MTD__nk_chart_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_chart_begin_colored = lookup.find("nk_chart_begin_colored").orElseThrow();
        MTD__nk_chart_begin_colored = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_begin_colored, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_chart_add_slot = lookup.find("nk_chart_add_slot").orElseThrow();
        MTD__nk_chart_add_slot = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_add_slot, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_chart_add_slot_colored = lookup.find("nk_chart_add_slot_colored").orElseThrow();
        MTD__nk_chart_add_slot_colored = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_add_slot_colored, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_chart_push = lookup.find("nk_chart_push").orElseThrow();
        MTD__nk_chart_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_chart_push_slot = lookup.find("nk_chart_push_slot").orElseThrow();
        MTD__nk_chart_push_slot = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_push_slot, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_chart_end = lookup.find("nk_chart_end").orElseThrow();
        MTD__nk_chart_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_chart_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_plot = lookup.find("nk_plot").orElseThrow();
        MTD__nk_plot = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_plot, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_plot_function = lookup.find("nk_plot_function").orElseThrow();
        MTD__nk_plot_function = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_plot_function, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_popup_begin = lookup.find("nk_popup_begin").orElseThrow();
        MTD__nk_popup_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_popup_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_popup_close = lookup.find("nk_popup_close").orElseThrow();
        MTD__nk_popup_close = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_popup_close, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_popup_end = lookup.find("nk_popup_end").orElseThrow();
        MTD__nk_popup_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_popup_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_popup_get_scroll = lookup.find("nk_popup_get_scroll").orElseThrow();
        MTD__nk_popup_get_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_popup_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_popup_set_scroll = lookup.find("nk_popup_set_scroll").orElseThrow();
        MTD__nk_popup_set_scroll = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_popup_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo = lookup.find("nk_combo").orElseThrow();
        MTD__nk_combo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_separator = lookup.find("nk_combo_separator").orElseThrow();
        MTD__nk_combo_separator = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_separator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_string = lookup.find("nk_combo_string").orElseThrow();
        MTD__nk_combo_string = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_callback = lookup.find("nk_combo_callback").orElseThrow();
        MTD__nk_combo_callback = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_callback, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combobox = lookup.find("nk_combobox").orElseThrow();
        MTD__nk_combobox = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combobox, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combobox_string = lookup.find("nk_combobox_string").orElseThrow();
        MTD__nk_combobox_string = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combobox_string, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combobox_separator = lookup.find("nk_combobox_separator").orElseThrow();
        MTD__nk_combobox_separator = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combobox_separator, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combobox_callback = lookup.find("nk_combobox_callback").orElseThrow();
        MTD__nk_combobox_callback = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combobox_callback, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_text = lookup.find("nk_combo_begin_text").orElseThrow();
        MTD__nk_combo_begin_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_label = lookup.find("nk_combo_begin_label").orElseThrow();
        MTD__nk_combo_begin_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_color = lookup.find("nk_combo_begin_color").orElseThrow();
        MTD__nk_combo_begin_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_symbol = lookup.find("nk_combo_begin_symbol").orElseThrow();
        MTD__nk_combo_begin_symbol = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_symbol_label = lookup.find("nk_combo_begin_symbol_label").orElseThrow();
        MTD__nk_combo_begin_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_symbol_text = lookup.find("nk_combo_begin_symbol_text").orElseThrow();
        MTD__nk_combo_begin_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_image = lookup.find("nk_combo_begin_image").orElseThrow();
        MTD__nk_combo_begin_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_image_label = lookup.find("nk_combo_begin_image_label").orElseThrow();
        MTD__nk_combo_begin_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_begin_image_text = lookup.find("nk_combo_begin_image_text").orElseThrow();
        MTD__nk_combo_begin_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_begin_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_combo_item_label = lookup.find("nk_combo_item_label").orElseThrow();
        MTD__nk_combo_item_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_item_text = lookup.find("nk_combo_item_text").orElseThrow();
        MTD__nk_combo_item_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_item_image_label = lookup.find("nk_combo_item_image_label").orElseThrow();
        MTD__nk_combo_item_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_item_image_text = lookup.find("nk_combo_item_image_text").orElseThrow();
        MTD__nk_combo_item_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_item_symbol_label = lookup.find("nk_combo_item_symbol_label").orElseThrow();
        MTD__nk_combo_item_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_item_symbol_text = lookup.find("nk_combo_item_symbol_text").orElseThrow();
        MTD__nk_combo_item_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_combo_close = lookup.find("nk_combo_close").orElseThrow();
        MTD__nk_combo_close = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_close, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_combo_end = lookup.find("nk_combo_end").orElseThrow();
        MTD__nk_combo_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_combo_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_contextual_begin = lookup.find("nk_contextual_begin").orElseThrow();
        MTD__nk_contextual_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_contextual_item_text = lookup.find("nk_contextual_item_text").orElseThrow();
        MTD__nk_contextual_item_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_item_label = lookup.find("nk_contextual_item_label").orElseThrow();
        MTD__nk_contextual_item_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_item_image_label = lookup.find("nk_contextual_item_image_label").orElseThrow();
        MTD__nk_contextual_item_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_item_image_text = lookup.find("nk_contextual_item_image_text").orElseThrow();
        MTD__nk_contextual_item_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_item_symbol_label = lookup.find("nk_contextual_item_symbol_label").orElseThrow();
        MTD__nk_contextual_item_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_item_symbol_text = lookup.find("nk_contextual_item_symbol_text").orElseThrow();
        MTD__nk_contextual_item_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_contextual_close = lookup.find("nk_contextual_close").orElseThrow();
        MTD__nk_contextual_close = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_close, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_contextual_end = lookup.find("nk_contextual_end").orElseThrow();
        MTD__nk_contextual_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_contextual_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tooltip = lookup.find("nk_tooltip").orElseThrow();
        MTD__nk_tooltip = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tooltip, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_tooltip_begin = lookup.find("nk_tooltip_begin").orElseThrow();
        MTD__nk_tooltip_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tooltip_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_tooltip_end = lookup.find("nk_tooltip_end").orElseThrow();
        MTD__nk_tooltip_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_tooltip_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_menubar_begin = lookup.find("nk_menubar_begin").orElseThrow();
        MTD__nk_menubar_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menubar_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_menubar_end = lookup.find("nk_menubar_end").orElseThrow();
        MTD__nk_menubar_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menubar_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_menu_begin_text = lookup.find("nk_menu_begin_text").orElseThrow();
        MTD__nk_menu_begin_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_label = lookup.find("nk_menu_begin_label").orElseThrow();
        MTD__nk_menu_begin_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_image = lookup.find("nk_menu_begin_image").orElseThrow();
        MTD__nk_menu_begin_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_image_text = lookup.find("nk_menu_begin_image_text").orElseThrow();
        MTD__nk_menu_begin_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_image_label = lookup.find("nk_menu_begin_image_label").orElseThrow();
        MTD__nk_menu_begin_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_symbol = lookup.find("nk_menu_begin_symbol").orElseThrow();
        MTD__nk_menu_begin_symbol = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_symbol_text = lookup.find("nk_menu_begin_symbol_text").orElseThrow();
        MTD__nk_menu_begin_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_begin_symbol_label = lookup.find("nk_menu_begin_symbol_label").orElseThrow();
        MTD__nk_menu_begin_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_begin_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_menu_item_text = lookup.find("nk_menu_item_text").orElseThrow();
        MTD__nk_menu_item_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_item_label = lookup.find("nk_menu_item_label").orElseThrow();
        MTD__nk_menu_item_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_item_image_label = lookup.find("nk_menu_item_image_label").orElseThrow();
        MTD__nk_menu_item_image_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_item_image_text = lookup.find("nk_menu_item_image_text").orElseThrow();
        MTD__nk_menu_item_image_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_item_symbol_text = lookup.find("nk_menu_item_symbol_text").orElseThrow();
        MTD__nk_menu_item_symbol_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_item_symbol_label = lookup.find("nk_menu_item_symbol_label").orElseThrow();
        MTD__nk_menu_item_symbol_label = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_menu_close = lookup.find("nk_menu_close").orElseThrow();
        MTD__nk_menu_close = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_close, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_menu_end = lookup.find("nk_menu_end").orElseThrow();
        MTD__nk_menu_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_menu_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_default = lookup.find("nk_style_default").orElseThrow();
        MTD__nk_style_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_default, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_from_table = lookup.find("nk_style_from_table").orElseThrow();
        MTD__nk_style_from_table = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_from_table, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_load_cursor = lookup.find("nk_style_load_cursor").orElseThrow();
        MTD__nk_style_load_cursor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_load_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_load_all_cursors = lookup.find("nk_style_load_all_cursors").orElseThrow();
        MTD__nk_style_load_all_cursors = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_load_all_cursors, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_get_color_by_name = lookup.find("nk_style_get_color_by_name").orElseThrow();
        MTD__nk_style_get_color_by_name = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_get_color_by_name, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_style_set_font = lookup.find("nk_style_set_font").orElseThrow();
        MTD__nk_style_set_font = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_set_font, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_set_cursor = lookup.find("nk_style_set_cursor").orElseThrow();
        MTD__nk_style_set_cursor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_set_cursor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_style_show_cursor = lookup.find("nk_style_show_cursor").orElseThrow();
        MTD__nk_style_show_cursor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_show_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_hide_cursor = lookup.find("nk_style_hide_cursor").orElseThrow();
        MTD__nk_style_hide_cursor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_hide_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_push_font = lookup.find("nk_style_push_font").orElseThrow();
        MTD__nk_style_push_font = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_font, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_push_float = lookup.find("nk_style_push_float").orElseThrow();
        MTD__nk_style_push_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_style_push_vec2 = lookup.find("nk_style_push_vec2").orElseThrow();
        MTD__nk_style_push_vec2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_vec2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_style_push_style_item = lookup.find("nk_style_push_style_item").orElseThrow();
        MTD__nk_style_push_style_item = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_style_item, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_style_item.gRecordLayout));
        MTD_ADDRESS__nk_style_push_flags = lookup.find("nk_style_push_flags").orElseThrow();
        MTD__nk_style_push_flags = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_flags, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_style_push_color = lookup.find("nk_style_push_color").orElseThrow();
        MTD__nk_style_push_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_push_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_style_pop_font = lookup.find("nk_style_pop_font").orElseThrow();
        MTD__nk_style_pop_font = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_font, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_pop_float = lookup.find("nk_style_pop_float").orElseThrow();
        MTD__nk_style_pop_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_pop_vec2 = lookup.find("nk_style_pop_vec2").orElseThrow();
        MTD__nk_style_pop_vec2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_vec2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_pop_style_item = lookup.find("nk_style_pop_style_item").orElseThrow();
        MTD__nk_style_pop_style_item = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_style_item, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_pop_flags = lookup.find("nk_style_pop_flags").orElseThrow();
        MTD__nk_style_pop_flags = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_flags, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_style_pop_color = lookup.find("nk_style_pop_color").orElseThrow();
        MTD__nk_style_pop_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_pop_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgb = lookup.find("nk_rgb").orElseThrow();
        MTD__nk_rgb = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_rgb_iv = lookup.find("nk_rgb_iv").orElseThrow();
        MTD__nk_rgb_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgb_bv = lookup.find("nk_rgb_bv").orElseThrow();
        MTD__nk_rgb_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgb_f = lookup.find("nk_rgb_f").orElseThrow();
        MTD__nk_rgb_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_rgb_fv = lookup.find("nk_rgb_fv").orElseThrow();
        MTD__nk_rgb_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgb_cf = lookup.find("nk_rgb_cf").orElseThrow();
        MTD__nk_rgb_cf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, nuklear.nk_colorf.gRecordLayout));
        MTD_ADDRESS__nk_rgb_hex = lookup.find("nk_rgb_hex").orElseThrow();
        MTD__nk_rgb_hex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_hex, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgb_factor = lookup.find("nk_rgb_factor").orElseThrow();
        MTD__nk_rgb_factor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgb_factor, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_rgba = lookup.find("nk_rgba").orElseThrow();
        MTD__nk_rgba = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_rgba_u32 = lookup.find("nk_rgba_u32").orElseThrow();
        MTD__nk_rgba_u32 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_u32, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_rgba_iv = lookup.find("nk_rgba_iv").orElseThrow();
        MTD__nk_rgba_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgba_bv = lookup.find("nk_rgba_bv").orElseThrow();
        MTD__nk_rgba_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgba_f = lookup.find("nk_rgba_f").orElseThrow();
        MTD__nk_rgba_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_rgba_fv = lookup.find("nk_rgba_fv").orElseThrow();
        MTD__nk_rgba_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rgba_cf = lookup.find("nk_rgba_cf").orElseThrow();
        MTD__nk_rgba_cf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, nuklear.nk_colorf.gRecordLayout));
        MTD_ADDRESS__nk_rgba_hex = lookup.find("nk_rgba_hex").orElseThrow();
        MTD__nk_rgba_hex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rgba_hex, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsva_colorf = lookup.find("nk_hsva_colorf").orElseThrow();
        MTD__nk_hsva_colorf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_colorf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_hsva_colorfv = lookup.find("nk_hsva_colorfv").orElseThrow();
        MTD__nk_hsva_colorfv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_colorfv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_colorf_hsva_f = lookup.find("nk_colorf_hsva_f").orElseThrow();
        MTD__nk_colorf_hsva_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_colorf_hsva_f, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_colorf.gRecordLayout));
        MTD_ADDRESS__nk_colorf_hsva_fv = lookup.find("nk_colorf_hsva_fv").orElseThrow();
        MTD__nk_colorf_hsva_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_colorf_hsva_fv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_colorf.gRecordLayout));
        MTD_ADDRESS__nk_hsv = lookup.find("nk_hsv").orElseThrow();
        MTD__nk_hsv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_hsv_iv = lookup.find("nk_hsv_iv").orElseThrow();
        MTD__nk_hsv_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsv_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsv_bv = lookup.find("nk_hsv_bv").orElseThrow();
        MTD__nk_hsv_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsv_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsv_f = lookup.find("nk_hsv_f").orElseThrow();
        MTD__nk_hsv_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsv_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_hsv_fv = lookup.find("nk_hsv_fv").orElseThrow();
        MTD__nk_hsv_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsv_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsva = lookup.find("nk_hsva").orElseThrow();
        MTD__nk_hsva = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_hsva_iv = lookup.find("nk_hsva_iv").orElseThrow();
        MTD__nk_hsva_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsva_bv = lookup.find("nk_hsva_bv").orElseThrow();
        MTD__nk_hsva_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_hsva_f = lookup.find("nk_hsva_f").orElseThrow();
        MTD__nk_hsva_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_hsva_fv = lookup.find("nk_hsva_fv").orElseThrow();
        MTD__nk_hsva_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_hsva_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_color_f = lookup.find("nk_color_f").orElseThrow();
        MTD__nk_color_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_f, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_fv = lookup.find("nk_color_fv").orElseThrow();
        MTD__nk_color_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_fv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_cf = lookup.find("nk_color_cf").orElseThrow();
        MTD__nk_color_cf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_d = lookup.find("nk_color_d").orElseThrow();
        MTD__nk_color_d = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_d, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_dv = lookup.find("nk_color_dv").orElseThrow();
        MTD__nk_color_dv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_dv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_u32 = lookup.find("nk_color_u32").orElseThrow();
        MTD__nk_color_u32 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_u32, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hex_rgba = lookup.find("nk_color_hex_rgba").orElseThrow();
        MTD__nk_color_hex_rgba = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hex_rgba, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hex_rgb = lookup.find("nk_color_hex_rgb").orElseThrow();
        MTD__nk_color_hex_rgb = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hex_rgb, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_i = lookup.find("nk_color_hsv_i").orElseThrow();
        MTD__nk_color_hsv_i = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_i, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_b = lookup.find("nk_color_hsv_b").orElseThrow();
        MTD__nk_color_hsv_b = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_b, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_iv = lookup.find("nk_color_hsv_iv").orElseThrow();
        MTD__nk_color_hsv_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_iv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_bv = lookup.find("nk_color_hsv_bv").orElseThrow();
        MTD__nk_color_hsv_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_bv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_f = lookup.find("nk_color_hsv_f").orElseThrow();
        MTD__nk_color_hsv_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_f, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsv_fv = lookup.find("nk_color_hsv_fv").orElseThrow();
        MTD__nk_color_hsv_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsv_fv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_i = lookup.find("nk_color_hsva_i").orElseThrow();
        MTD__nk_color_hsva_i = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_i, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_b = lookup.find("nk_color_hsva_b").orElseThrow();
        MTD__nk_color_hsva_b = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_b, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_iv = lookup.find("nk_color_hsva_iv").orElseThrow();
        MTD__nk_color_hsva_iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_iv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_bv = lookup.find("nk_color_hsva_bv").orElseThrow();
        MTD__nk_color_hsva_bv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_bv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_f = lookup.find("nk_color_hsva_f").orElseThrow();
        MTD__nk_color_hsva_f = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_f, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_color_hsva_fv = lookup.find("nk_color_hsva_fv").orElseThrow();
        MTD__nk_color_hsva_fv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_color_hsva_fv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_handle_ptr = lookup.find("nk_handle_ptr").orElseThrow();
        MTD__nk_handle_ptr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_handle_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_handle.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_handle_id = lookup.find("nk_handle_id").orElseThrow();
        MTD__nk_handle_id = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_handle_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_image_handle = lookup.find("nk_image_handle").orElseThrow();
        MTD__nk_image_handle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, nuklear.nk_handle.gRecordLayout));
        MTD_ADDRESS__nk_image_ptr = lookup.find("nk_image_ptr").orElseThrow();
        MTD__nk_image_ptr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_image_id = lookup.find("nk_image_id").orElseThrow();
        MTD__nk_image_id = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_image_is_subimage = lookup.find("nk_image_is_subimage").orElseThrow();
        MTD__nk_image_is_subimage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_image_is_subimage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_subimage_ptr = lookup.find("nk_subimage_ptr").orElseThrow();
        MTD__nk_subimage_ptr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_subimage_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_subimage_id = lookup.find("nk_subimage_id").orElseThrow();
        MTD__nk_subimage_id = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_subimage_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_subimage_handle = lookup.find("nk_subimage_handle").orElseThrow();
        MTD__nk_subimage_handle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_subimage_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gRecordLayout, nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_nine_slice_handle = lookup.find("nk_nine_slice_handle").orElseThrow();
        MTD__nk_nine_slice_handle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_nine_slice_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_nine_slice_ptr = lookup.find("nk_nine_slice_ptr").orElseThrow();
        MTD__nk_nine_slice_ptr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_nine_slice_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_nine_slice_id = lookup.find("nk_nine_slice_id").orElseThrow();
        MTD__nk_nine_slice_id = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_nine_slice_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_nine_slice_is_sub9slice = lookup.find("nk_nine_slice_is_sub9slice").orElseThrow();
        MTD__nk_nine_slice_is_sub9slice = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_nine_slice_is_sub9slice, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_sub9slice_ptr = lookup.find("nk_sub9slice_ptr").orElseThrow();
        MTD__nk_sub9slice_ptr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_sub9slice_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_sub9slice_id = lookup.find("nk_sub9slice_id").orElseThrow();
        MTD__nk_sub9slice_id = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_sub9slice_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_sub9slice_handle = lookup.find("nk_sub9slice_handle").orElseThrow();
        MTD__nk_sub9slice_handle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_sub9slice_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gRecordLayout, nuklear.nk_handle.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS__nk_murmur_hash = lookup.find("nk_murmur_hash").orElseThrow();
        MTD__nk_murmur_hash = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_murmur_hash, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_triangle_from_direction = lookup.find("nk_triangle_from_direction").orElseThrow();
        MTD__nk_triangle_from_direction = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_triangle_from_direction, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_vec2 = lookup.find("nk_vec2").orElseThrow();
        MTD__nk_vec2 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_vec2, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_vec2i = lookup.find("nk_vec2i").orElseThrow();
        MTD__nk_vec2i = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_vec2i, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_vec2v = lookup.find("nk_vec2v").orElseThrow();
        MTD__nk_vec2v = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_vec2v, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_vec2iv = lookup.find("nk_vec2iv").orElseThrow();
        MTD__nk_vec2iv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_vec2iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_get_null_rect = lookup.find("nk_get_null_rect").orElseThrow();
        MTD__nk_get_null_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_get_null_rect, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_rect = lookup.find("nk_rect").orElseThrow();
        MTD__nk_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rect, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_recti = lookup.find("nk_recti").orElseThrow();
        MTD__nk_recti = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_recti, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_recta = lookup.find("nk_recta").orElseThrow();
        MTD__nk_recta = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_recta, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_rectv = lookup.find("nk_rectv").orElseThrow();
        MTD__nk_rectv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rectv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rectiv = lookup.find("nk_rectiv").orElseThrow();
        MTD__nk_rectiv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rectiv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_rect_pos = lookup.find("nk_rect_pos").orElseThrow();
        MTD__nk_rect_pos = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rect_pos, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_rect_size = lookup.find("nk_rect_size").orElseThrow();
        MTD__nk_rect_size = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_rect_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gRecordLayout, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_strlen = lookup.find("nk_strlen").orElseThrow();
        MTD__nk_strlen = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strlen, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_stricmp = lookup.find("nk_stricmp").orElseThrow();
        MTD__nk_stricmp = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stricmp, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_stricmpn = lookup.find("nk_stricmpn").orElseThrow();
        MTD__nk_stricmpn = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stricmpn, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_strtoi = lookup.find("nk_strtoi").orElseThrow();
        MTD__nk_strtoi = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strtoi, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_strtof = lookup.find("nk_strtof").orElseThrow();
        MTD__nk_strtof = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strtof, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_strtod = lookup.find("nk_strtod").orElseThrow();
        MTD__nk_strtod = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strtod, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_strfilter = lookup.find("nk_strfilter").orElseThrow();
        MTD__nk_strfilter = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strfilter, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_strmatch_fuzzy_string = lookup.find("nk_strmatch_fuzzy_string").orElseThrow();
        MTD__nk_strmatch_fuzzy_string = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strmatch_fuzzy_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_strmatch_fuzzy_text = lookup.find("nk_strmatch_fuzzy_text").orElseThrow();
        MTD__nk_strmatch_fuzzy_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_strmatch_fuzzy_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_utf_decode = lookup.find("nk_utf_decode").orElseThrow();
        MTD__nk_utf_decode = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_utf_decode, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_utf_encode = lookup.find("nk_utf_encode").orElseThrow();
        MTD__nk_utf_encode = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_utf_encode, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_utf_len = lookup.find("nk_utf_len").orElseThrow();
        MTD__nk_utf_len = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_utf_len, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_utf_at = lookup.find("nk_utf_at").orElseThrow();
        MTD__nk_utf_at = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_utf_at, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_default_glyph_ranges = lookup.find("nk_font_default_glyph_ranges").orElseThrow();
        MTD__nk_font_default_glyph_ranges = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_default_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_chinese_glyph_ranges = lookup.find("nk_font_chinese_glyph_ranges").orElseThrow();
        MTD__nk_font_chinese_glyph_ranges = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_chinese_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_cyrillic_glyph_ranges = lookup.find("nk_font_cyrillic_glyph_ranges").orElseThrow();
        MTD__nk_font_cyrillic_glyph_ranges = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_cyrillic_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_korean_glyph_ranges = lookup.find("nk_font_korean_glyph_ranges").orElseThrow();
        MTD__nk_font_korean_glyph_ranges = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_korean_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_init_default = lookup.find("nk_font_atlas_init_default").orElseThrow();
        MTD__nk_font_atlas_init_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_init = lookup.find("nk_font_atlas_init").orElseThrow();
        MTD__nk_font_atlas_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_init, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_init_custom = lookup.find("nk_font_atlas_init_custom").orElseThrow();
        MTD__nk_font_atlas_init_custom = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_init_custom, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_begin = lookup.find("nk_font_atlas_begin").orElseThrow();
        MTD__nk_font_atlas_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_begin, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_config = lookup.find("nk_font_config").orElseThrow();
        MTD__nk_font_config = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_config, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_font_config.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_font_atlas_add = lookup.find("nk_font_atlas_add").orElseThrow();
        MTD__nk_font_atlas_add = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_add_default = lookup.find("nk_font_atlas_add_default").orElseThrow();
        MTD__nk_font_atlas_add_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add_default, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_add_from_memory = lookup.find("nk_font_atlas_add_from_memory").orElseThrow();
        MTD__nk_font_atlas_add_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add_from_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_add_from_file = lookup.find("nk_font_atlas_add_from_file").orElseThrow();
        MTD__nk_font_atlas_add_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add_from_file, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_add_compressed = lookup.find("nk_font_atlas_add_compressed").orElseThrow();
        MTD__nk_font_atlas_add_compressed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add_compressed, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_add_compressed_base85 = lookup.find("nk_font_atlas_add_compressed_base85").orElseThrow();
        MTD__nk_font_atlas_add_compressed_base85 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_add_compressed_base85, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_bake = lookup.find("nk_font_atlas_bake").orElseThrow();
        MTD__nk_font_atlas_bake = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_bake, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_font_atlas_end = lookup.find("nk_font_atlas_end").orElseThrow();
        MTD__nk_font_atlas_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_end, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_handle.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_find_glyph = lookup.find("nk_font_find_glyph").orElseThrow();
        MTD__nk_font_find_glyph = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_find_glyph, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_font_atlas_cleanup = lookup.find("nk_font_atlas_cleanup").orElseThrow();
        MTD__nk_font_atlas_cleanup = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_cleanup, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_font_atlas_clear = lookup.find("nk_font_atlas_clear").orElseThrow();
        MTD__nk_font_atlas_clear = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_font_atlas_clear, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_init_default = lookup.find("nk_buffer_init_default").orElseThrow();
        MTD__nk_buffer_init_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_init = lookup.find("nk_buffer_init").orElseThrow();
        MTD__nk_buffer_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_init, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_buffer_init_fixed = lookup.find("nk_buffer_init_fixed").orElseThrow();
        MTD__nk_buffer_init_fixed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_buffer_info = lookup.find("nk_buffer_info").orElseThrow();
        MTD__nk_buffer_info = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_info, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_push = lookup.find("nk_buffer_push").orElseThrow();
        MTD__nk_buffer_push = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_push, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_buffer_mark = lookup.find("nk_buffer_mark").orElseThrow();
        MTD__nk_buffer_mark = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_mark, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_buffer_reset = lookup.find("nk_buffer_reset").orElseThrow();
        MTD__nk_buffer_reset = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_reset, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_buffer_clear = lookup.find("nk_buffer_clear").orElseThrow();
        MTD__nk_buffer_clear = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_clear, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_free = lookup.find("nk_buffer_free").orElseThrow();
        MTD__nk_buffer_free = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_memory = lookup.find("nk_buffer_memory").orElseThrow();
        MTD__nk_buffer_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_memory_const = lookup.find("nk_buffer_memory_const").orElseThrow();
        MTD__nk_buffer_memory_const = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_memory_const, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_buffer_total = lookup.find("nk_buffer_total").orElseThrow();
        MTD__nk_buffer_total = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_buffer_total, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_init_default = lookup.find("nk_str_init_default").orElseThrow();
        MTD__nk_str_init_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_init = lookup.find("nk_str_init").orElseThrow();
        MTD__nk_str_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_init, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_str_init_fixed = lookup.find("nk_str_init_fixed").orElseThrow();
        MTD__nk_str_init_fixed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_str_clear = lookup.find("nk_str_clear").orElseThrow();
        MTD__nk_str_clear = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_clear, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_free = lookup.find("nk_str_free").orElseThrow();
        MTD__nk_str_free = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_append_text_char = lookup.find("nk_str_append_text_char").orElseThrow();
        MTD__nk_str_append_text_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_text_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_append_str_char = lookup.find("nk_str_append_str_char").orElseThrow();
        MTD__nk_str_append_str_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_str_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_append_text_utf8 = lookup.find("nk_str_append_text_utf8").orElseThrow();
        MTD__nk_str_append_text_utf8 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_text_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_append_str_utf8 = lookup.find("nk_str_append_str_utf8").orElseThrow();
        MTD__nk_str_append_str_utf8 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_str_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_append_text_runes = lookup.find("nk_str_append_text_runes").orElseThrow();
        MTD__nk_str_append_text_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_text_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_append_str_runes = lookup.find("nk_str_append_str_runes").orElseThrow();
        MTD__nk_str_append_str_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_append_str_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_insert_at_char = lookup.find("nk_str_insert_at_char").orElseThrow();
        MTD__nk_str_insert_at_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_at_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_insert_at_rune = lookup.find("nk_str_insert_at_rune").orElseThrow();
        MTD__nk_str_insert_at_rune = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_at_rune, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_insert_text_char = lookup.find("nk_str_insert_text_char").orElseThrow();
        MTD__nk_str_insert_text_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_text_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_insert_str_char = lookup.find("nk_str_insert_str_char").orElseThrow();
        MTD__nk_str_insert_str_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_str_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_insert_text_utf8 = lookup.find("nk_str_insert_text_utf8").orElseThrow();
        MTD__nk_str_insert_text_utf8 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_text_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_insert_str_utf8 = lookup.find("nk_str_insert_str_utf8").orElseThrow();
        MTD__nk_str_insert_str_utf8 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_str_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_insert_text_runes = lookup.find("nk_str_insert_text_runes").orElseThrow();
        MTD__nk_str_insert_text_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_text_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_insert_str_runes = lookup.find("nk_str_insert_str_runes").orElseThrow();
        MTD__nk_str_insert_str_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_insert_str_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_remove_chars = lookup.find("nk_str_remove_chars").orElseThrow();
        MTD__nk_str_remove_chars = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_remove_chars, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_remove_runes = lookup.find("nk_str_remove_runes").orElseThrow();
        MTD__nk_str_remove_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_remove_runes, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_delete_chars = lookup.find("nk_str_delete_chars").orElseThrow();
        MTD__nk_str_delete_chars = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_delete_chars, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_delete_runes = lookup.find("nk_str_delete_runes").orElseThrow();
        MTD__nk_str_delete_runes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_delete_runes, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_at_char = lookup.find("nk_str_at_char").orElseThrow();
        MTD__nk_str_at_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_at_char, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_at_rune = lookup.find("nk_str_at_rune").orElseThrow();
        MTD__nk_str_at_rune = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_at_rune, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_rune_at = lookup.find("nk_str_rune_at").orElseThrow();
        MTD__nk_str_rune_at = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_rune_at, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_at_char_const = lookup.find("nk_str_at_char_const").orElseThrow();
        MTD__nk_str_at_char_const = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_at_char_const, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_str_at_const = lookup.find("nk_str_at_const").orElseThrow();
        MTD__nk_str_at_const = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_at_const, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_get = lookup.find("nk_str_get").orElseThrow();
        MTD__nk_str_get = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_get, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_get_const = lookup.find("nk_str_get_const").orElseThrow();
        MTD__nk_str_get_const = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_get_const, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_len = lookup.find("nk_str_len").orElseThrow();
        MTD__nk_str_len = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_len, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_str_len_char = lookup.find("nk_str_len_char").orElseThrow();
        MTD__nk_str_len_char = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_str_len_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_filter_default = lookup.find("nk_filter_default").orElseThrow();
        MTD__nk_filter_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_default, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_ascii = lookup.find("nk_filter_ascii").orElseThrow();
        MTD__nk_filter_ascii = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_ascii, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_float = lookup.find("nk_filter_float").orElseThrow();
        MTD__nk_filter_float = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_decimal = lookup.find("nk_filter_decimal").orElseThrow();
        MTD__nk_filter_decimal = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_decimal, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_hex = lookup.find("nk_filter_hex").orElseThrow();
        MTD__nk_filter_hex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_hex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_oct = lookup.find("nk_filter_oct").orElseThrow();
        MTD__nk_filter_oct = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_oct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_filter_binary = lookup.find("nk_filter_binary").orElseThrow();
        MTD__nk_filter_binary = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_filter_binary, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_textedit_init_default = lookup.find("nk_textedit_init_default").orElseThrow();
        MTD__nk_textedit_init_default = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_init = lookup.find("nk_textedit_init").orElseThrow();
        MTD__nk_textedit_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_init, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_textedit_init_fixed = lookup.find("nk_textedit_init_fixed").orElseThrow();
        MTD__nk_textedit_init_fixed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__nk_textedit_free = lookup.find("nk_textedit_free").orElseThrow();
        MTD__nk_textedit_free = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_text = lookup.find("nk_textedit_text").orElseThrow();
        MTD__nk_textedit_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_text, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_textedit_delete = lookup.find("nk_textedit_delete").orElseThrow();
        MTD__nk_textedit_delete = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_delete, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_textedit_delete_selection = lookup.find("nk_textedit_delete_selection").orElseThrow();
        MTD__nk_textedit_delete_selection = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_delete_selection, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_select_all = lookup.find("nk_textedit_select_all").orElseThrow();
        MTD__nk_textedit_select_all = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_select_all, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_cut = lookup.find("nk_textedit_cut").orElseThrow();
        MTD__nk_textedit_cut = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_cut, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_paste = lookup.find("nk_textedit_paste").orElseThrow();
        MTD__nk_textedit_paste = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_paste, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_textedit_undo = lookup.find("nk_textedit_undo").orElseThrow();
        MTD__nk_textedit_undo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_undo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_textedit_redo = lookup.find("nk_textedit_redo").orElseThrow();
        MTD__nk_textedit_redo = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_textedit_redo, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_stroke_line = lookup.find("nk_stroke_line").orElseThrow();
        MTD__nk_stroke_line = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_line, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_curve = lookup.find("nk_stroke_curve").orElseThrow();
        MTD__nk_stroke_curve = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_curve, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_rect = lookup.find("nk_stroke_rect").orElseThrow();
        MTD__nk_stroke_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_rect, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_circle = lookup.find("nk_stroke_circle").orElseThrow();
        MTD__nk_stroke_circle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_circle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_arc = lookup.find("nk_stroke_arc").orElseThrow();
        MTD__nk_stroke_arc = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_arc, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_triangle = lookup.find("nk_stroke_triangle").orElseThrow();
        MTD__nk_stroke_triangle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_polyline = lookup.find("nk_stroke_polyline").orElseThrow();
        MTD__nk_stroke_polyline = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_polyline, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_stroke_polygon = lookup.find("nk_stroke_polygon").orElseThrow();
        MTD__nk_stroke_polygon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_stroke_polygon, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_rect = lookup.find("nk_fill_rect").orElseThrow();
        MTD__nk_fill_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_rect, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_rect_multi_color = lookup.find("nk_fill_rect_multi_color").orElseThrow();
        MTD__nk_fill_rect_multi_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_rect_multi_color, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_circle = lookup.find("nk_fill_circle").orElseThrow();
        MTD__nk_fill_circle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_circle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_arc = lookup.find("nk_fill_arc").orElseThrow();
        MTD__nk_fill_arc = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_arc, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_triangle = lookup.find("nk_fill_triangle").orElseThrow();
        MTD__nk_fill_triangle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_fill_polygon = lookup.find("nk_fill_polygon").orElseThrow();
        MTD__nk_fill_polygon = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_fill_polygon, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_image = lookup.find("nk_draw_image").orElseThrow();
        MTD__nk_draw_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_image, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_nine_slice = lookup.find("nk_draw_nine_slice").orElseThrow();
        MTD__nk_draw_nine_slice = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_nine_slice, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_text = lookup.find("nk_draw_text").orElseThrow();
        MTD__nk_draw_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_text, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_push_scissor = lookup.find("nk_push_scissor").orElseThrow();
        MTD__nk_push_scissor = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_push_scissor, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_push_custom = lookup.find("nk_push_custom").orElseThrow();
        MTD__nk_push_custom = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_push_custom, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_handle.gRecordLayout));
        MTD_ADDRESS__nk_input_has_mouse_click = lookup.find("nk_input_has_mouse_click").orElseThrow();
        MTD__nk_input_has_mouse_click = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_has_mouse_click, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_has_mouse_click_in_rect = lookup.find("nk_input_has_mouse_click_in_rect").orElseThrow();
        MTD__nk_input_has_mouse_click_in_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_has_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_has_mouse_click_in_button_rect = lookup.find("nk_input_has_mouse_click_in_button_rect").orElseThrow();
        MTD__nk_input_has_mouse_click_in_button_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_has_mouse_click_in_button_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_has_mouse_click_down_in_rect = lookup.find("nk_input_has_mouse_click_down_in_rect").orElseThrow();
        MTD__nk_input_has_mouse_click_down_in_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_has_mouse_click_down_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_mouse_click_in_rect = lookup.find("nk_input_is_mouse_click_in_rect").orElseThrow();
        MTD__nk_input_is_mouse_click_in_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_is_mouse_click_down_in_rect = lookup.find("nk_input_is_mouse_click_down_in_rect").orElseThrow();
        MTD__nk_input_is_mouse_click_down_in_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_click_down_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_any_mouse_click_in_rect = lookup.find("nk_input_any_mouse_click_in_rect").orElseThrow();
        MTD__nk_input_any_mouse_click_in_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_any_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_is_mouse_prev_hovering_rect = lookup.find("nk_input_is_mouse_prev_hovering_rect").orElseThrow();
        MTD__nk_input_is_mouse_prev_hovering_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_prev_hovering_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_is_mouse_hovering_rect = lookup.find("nk_input_is_mouse_hovering_rect").orElseThrow();
        MTD__nk_input_is_mouse_hovering_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_hovering_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_mouse_clicked = lookup.find("nk_input_mouse_clicked").orElseThrow();
        MTD__nk_input_mouse_clicked = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_mouse_clicked, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gRecordLayout));
        MTD_ADDRESS__nk_input_is_mouse_down = lookup.find("nk_input_is_mouse_down").orElseThrow();
        MTD__nk_input_is_mouse_down = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_mouse_pressed = lookup.find("nk_input_is_mouse_pressed").orElseThrow();
        MTD__nk_input_is_mouse_pressed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_pressed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_mouse_released = lookup.find("nk_input_is_mouse_released").orElseThrow();
        MTD__nk_input_is_mouse_released = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_mouse_released, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_key_pressed = lookup.find("nk_input_is_key_pressed").orElseThrow();
        MTD__nk_input_is_key_pressed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_key_pressed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_key_released = lookup.find("nk_input_is_key_released").orElseThrow();
        MTD__nk_input_is_key_released = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_key_released, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_input_is_key_down = lookup.find("nk_input_is_key_down").orElseThrow();
        MTD__nk_input_is_key_down = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_input_is_key_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_init = lookup.find("nk_draw_list_init").orElseThrow();
        MTD__nk_draw_list_init = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_init, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_draw_list_setup = lookup.find("nk_draw_list_setup").orElseThrow();
        MTD__nk_draw_list_setup = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_setup, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk__draw_list_begin = lookup.find("nk__draw_list_begin").orElseThrow();
        MTD__nk__draw_list_begin = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_list_begin, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__draw_list_next = lookup.find("nk__draw_list_next").orElseThrow();
        MTD__nk__draw_list_next = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_list_next, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk__draw_list_end = lookup.find("nk__draw_list_end").orElseThrow();
        MTD__nk__draw_list_end = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk__draw_list_end, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_draw_list_path_clear = lookup.find("nk_draw_list_path_clear").orElseThrow();
        MTD__nk_draw_list_path_clear = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_clear, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__nk_draw_list_path_line_to = lookup.find("nk_draw_list_path_line_to").orElseThrow();
        MTD__nk_draw_list_path_line_to = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_line_to, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout));
        MTD_ADDRESS__nk_draw_list_path_arc_to_fast = lookup.find("nk_draw_list_path_arc_to_fast").orElseThrow();
        MTD__nk_draw_list_path_arc_to_fast = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_arc_to_fast, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_path_arc_to = lookup.find("nk_draw_list_path_arc_to").orElseThrow();
        MTD__nk_draw_list_path_arc_to = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_arc_to, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_path_rect_to = lookup.find("nk_draw_list_path_rect_to").orElseThrow();
        MTD__nk_draw_list_path_rect_to = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_rect_to, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_path_curve_to = lookup.find("nk_draw_list_path_curve_to").orElseThrow();
        MTD__nk_draw_list_path_curve_to = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_curve_to, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_path_fill = lookup.find("nk_draw_list_path_fill").orElseThrow();
        MTD__nk_draw_list_path_fill = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_fill, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_list_path_stroke = lookup.find("nk_draw_list_path_stroke").orElseThrow();
        MTD__nk_draw_list_path_stroke = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_path_stroke, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_line = lookup.find("nk_draw_list_stroke_line").orElseThrow();
        MTD__nk_draw_list_stroke_line = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_line, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_rect = lookup.find("nk_draw_list_stroke_rect").orElseThrow();
        MTD__nk_draw_list_stroke_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_rect, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_triangle = lookup.find("nk_draw_list_stroke_triangle").orElseThrow();
        MTD__nk_draw_list_stroke_triangle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_circle = lookup.find("nk_draw_list_stroke_circle").orElseThrow();
        MTD__nk_draw_list_stroke_circle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_circle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_curve = lookup.find("nk_draw_list_stroke_curve").orElseThrow();
        MTD__nk_draw_list_stroke_curve = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_curve, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_stroke_poly_line = lookup.find("nk_draw_list_stroke_poly_line").orElseThrow();
        MTD__nk_draw_list_stroke_poly_line = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_stroke_poly_line, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_fill_rect = lookup.find("nk_draw_list_fill_rect").orElseThrow();
        MTD__nk_draw_list_fill_rect = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_fill_rect, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__nk_draw_list_fill_rect_multi_color = lookup.find("nk_draw_list_fill_rect_multi_color").orElseThrow();
        MTD__nk_draw_list_fill_rect_multi_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_fill_rect_multi_color, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_list_fill_triangle = lookup.find("nk_draw_list_fill_triangle").orElseThrow();
        MTD__nk_draw_list_fill_triangle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_fill_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_vec2.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_list_fill_circle = lookup.find("nk_draw_list_fill_circle").orElseThrow();
        MTD__nk_draw_list_fill_circle = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_fill_circle, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_vec2.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_fill_poly_convex = lookup.find("nk_draw_list_fill_poly_convex").orElseThrow();
        MTD__nk_draw_list_fill_poly_convex = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_fill_poly_convex, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gRecordLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__nk_draw_list_add_image = lookup.find("nk_draw_list_add_image").orElseThrow();
        MTD__nk_draw_list_add_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_add_image, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_image.gRecordLayout, nuklear.nk_rect.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_draw_list_add_text = lookup.find("nk_draw_list_add_text").orElseThrow();
        MTD__nk_draw_list_add_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_draw_list_add_text, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, nuklear.nk_rect.gRecordLayout, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_style_item_color = lookup.find("nk_style_item_color").orElseThrow();
        MTD__nk_style_item_color = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_item_color, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gRecordLayout, nuklear.nk_color.gRecordLayout));
        MTD_ADDRESS__nk_style_item_image = lookup.find("nk_style_item_image").orElseThrow();
        MTD__nk_style_item_image = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_item_image, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gRecordLayout, nuklear.nk_image.gRecordLayout));
        MTD_ADDRESS__nk_style_item_nine_slice = lookup.find("nk_style_item_nine_slice").orElseThrow();
        MTD__nk_style_item_nine_slice = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_item_nine_slice, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gRecordLayout, nuklear.nk_nine_slice.gRecordLayout));
        MTD_ADDRESS__nk_style_item_hide = lookup.find("nk_style_item_hide").orElseThrow();
        MTD__nk_style_item_hide = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__nk_style_item_hide, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gRecordLayout));
    }
}
