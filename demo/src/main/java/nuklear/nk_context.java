package nuklear;

public record nk_context(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$input = nuklear.nk_input.gStructLayout;
    public static final long OFFSET$input = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$style = nuklear.nk_style.gStructLayout;
    public static final long OFFSET$style = 360L;
    public static final java.lang.foreign.GroupLayout LAYOUT$memory = nuklear.nk_buffer.gStructLayout;
    public static final long OFFSET$memory = 9480L;
    public static final java.lang.foreign.GroupLayout LAYOUT$clip = nuklear.nk_clipboard.gStructLayout;
    public static final long OFFSET$clip = 9600L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$last_widget_state = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$last_widget_state = 9624L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$button_behavior = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$button_behavior = 9628L;
    public static final java.lang.foreign.GroupLayout LAYOUT$stacks = nuklear.nk_configuration_stacks.gStructLayout;
    public static final long OFFSET$stacks = 9632L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$delta_time_seconds = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$delta_time_seconds = 12504L;
    public static final java.lang.foreign.GroupLayout LAYOUT$draw_list = nuklear.nk_draw_list.gStructLayout;
    public static final long OFFSET$draw_list = 12512L;
    public static final java.lang.foreign.GroupLayout LAYOUT$text_edit = nuklear.nk_text_edit.gStructLayout;
    public static final long OFFSET$text_edit = 12752L;
    public static final java.lang.foreign.GroupLayout LAYOUT$overlay = nuklear.nk_command_buffer.gStructLayout;
    public static final long OFFSET$overlay = 18136L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$build = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$build = 18200L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$use_pool = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$use_pool = 18204L;
    public static final java.lang.foreign.GroupLayout LAYOUT$pool = nuklear.nk_pool.gStructLayout;
    public static final long OFFSET$pool = 18208L;
    public static final java.lang.foreign.AddressLayout LAYOUT$begin = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$begin = 18280L;
    public static final java.lang.foreign.AddressLayout LAYOUT$end = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$end = 18288L;
    public static final java.lang.foreign.AddressLayout LAYOUT$active = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$active = 18296L;
    public static final java.lang.foreign.AddressLayout LAYOUT$current = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$current = 18304L;
    public static final java.lang.foreign.AddressLayout LAYOUT$freelist = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$freelist = 18312L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$count = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$count = 18320L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$seq = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$seq = 18324L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$input,
            LAYOUT$style,
            LAYOUT$memory,
            LAYOUT$clip,
            LAYOUT$last_widget_state,
            LAYOUT$button_behavior,
            LAYOUT$stacks,
            LAYOUT$delta_time_seconds,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$draw_list,
            LAYOUT$text_edit,
            LAYOUT$overlay,
            LAYOUT$build,
            LAYOUT$use_pool,
            LAYOUT$pool,
            LAYOUT$begin,
            LAYOUT$end,
            LAYOUT$active,
            LAYOUT$current,
            LAYOUT$freelist,
            LAYOUT$count,
            LAYOUT$seq
    ).withName("nk_context");

    public nk_context(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static nk_context getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new nk_context(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public nuklear.nk_input input() {return new nuklear.nk_input(this._ptr.asSlice(OFFSET$input, LAYOUT$input));}
    public void input(java.util.function.Consumer<nuklear.nk_input> consumer) {consumer.accept(this.input());}
    public void input(nuklear.nk_input value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$input, LAYOUT$input.byteSize());}

    public nuklear.nk_style style() {return new nuklear.nk_style(this._ptr.asSlice(OFFSET$style, LAYOUT$style));}
    public void style(java.util.function.Consumer<nuklear.nk_style> consumer) {consumer.accept(this.style());}
    public void style(nuklear.nk_style value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$style, LAYOUT$style.byteSize());}

    public nuklear.nk_buffer memory() {return new nuklear.nk_buffer(this._ptr.asSlice(OFFSET$memory, LAYOUT$memory));}
    public void memory(java.util.function.Consumer<nuklear.nk_buffer> consumer) {consumer.accept(this.memory());}
    public void memory(nuklear.nk_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$memory, LAYOUT$memory.byteSize());}

    public nuklear.nk_clipboard clip() {return new nuklear.nk_clipboard(this._ptr.asSlice(OFFSET$clip, LAYOUT$clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_clipboard> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_clipboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$clip, LAYOUT$clip.byteSize());}

    public int last_widget_state() {return this._ptr.get(LAYOUT$last_widget_state, OFFSET$last_widget_state);}
    public void last_widget_state(int value) {this._ptr.set(LAYOUT$last_widget_state, OFFSET$last_widget_state, value);}
    public java.lang.foreign.MemorySegment last_widget_state_ptr() {return this._ptr.asSlice(OFFSET$last_widget_state, LAYOUT$last_widget_state);}

    public int button_behavior() {return this._ptr.get(LAYOUT$button_behavior, OFFSET$button_behavior);}
    public void button_behavior(int value) {this._ptr.set(LAYOUT$button_behavior, OFFSET$button_behavior, value);}
    public java.lang.foreign.MemorySegment button_behavior_ptr() {return this._ptr.asSlice(OFFSET$button_behavior, LAYOUT$button_behavior);}

    public nuklear.nk_configuration_stacks stacks() {return new nuklear.nk_configuration_stacks(this._ptr.asSlice(OFFSET$stacks, LAYOUT$stacks));}
    public void stacks(java.util.function.Consumer<nuklear.nk_configuration_stacks> consumer) {consumer.accept(this.stacks());}
    public void stacks(nuklear.nk_configuration_stacks value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$stacks, LAYOUT$stacks.byteSize());}

    public float delta_time_seconds() {return this._ptr.get(LAYOUT$delta_time_seconds, OFFSET$delta_time_seconds);}
    public void delta_time_seconds(float value) {this._ptr.set(LAYOUT$delta_time_seconds, OFFSET$delta_time_seconds, value);}
    public java.lang.foreign.MemorySegment delta_time_seconds_ptr() {return this._ptr.asSlice(OFFSET$delta_time_seconds, LAYOUT$delta_time_seconds);}

    public nuklear.nk_draw_list draw_list() {return new nuklear.nk_draw_list(this._ptr.asSlice(OFFSET$draw_list, LAYOUT$draw_list));}
    public void draw_list(java.util.function.Consumer<nuklear.nk_draw_list> consumer) {consumer.accept(this.draw_list());}
    public void draw_list(nuklear.nk_draw_list value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$draw_list, LAYOUT$draw_list.byteSize());}

    public nuklear.nk_text_edit text_edit() {return new nuklear.nk_text_edit(this._ptr.asSlice(OFFSET$text_edit, LAYOUT$text_edit));}
    public void text_edit(java.util.function.Consumer<nuklear.nk_text_edit> consumer) {consumer.accept(this.text_edit());}
    public void text_edit(nuklear.nk_text_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$text_edit, LAYOUT$text_edit.byteSize());}

    public nuklear.nk_command_buffer overlay() {return new nuklear.nk_command_buffer(this._ptr.asSlice(OFFSET$overlay, LAYOUT$overlay));}
    public void overlay(java.util.function.Consumer<nuklear.nk_command_buffer> consumer) {consumer.accept(this.overlay());}
    public void overlay(nuklear.nk_command_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$overlay, LAYOUT$overlay.byteSize());}

    public int build() {return this._ptr.get(LAYOUT$build, OFFSET$build);}
    public void build(int value) {this._ptr.set(LAYOUT$build, OFFSET$build, value);}
    public java.lang.foreign.MemorySegment build_ptr() {return this._ptr.asSlice(OFFSET$build, LAYOUT$build);}

    public int use_pool() {return this._ptr.get(LAYOUT$use_pool, OFFSET$use_pool);}
    public void use_pool(int value) {this._ptr.set(LAYOUT$use_pool, OFFSET$use_pool, value);}
    public java.lang.foreign.MemorySegment use_pool_ptr() {return this._ptr.asSlice(OFFSET$use_pool, LAYOUT$use_pool);}

    public nuklear.nk_pool pool() {return new nuklear.nk_pool(this._ptr.asSlice(OFFSET$pool, LAYOUT$pool));}
    public void pool(java.util.function.Consumer<nuklear.nk_pool> consumer) {consumer.accept(this.pool());}
    public void pool(nuklear.nk_pool value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET$pool, LAYOUT$pool.byteSize());}

    public java.lang.foreign.MemorySegment begin() {return this._ptr.get(LAYOUT$begin, OFFSET$begin);}
    public void begin(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$begin, OFFSET$begin, value);}
    public java.lang.foreign.MemorySegment begin_ptr() {return this._ptr.asSlice(OFFSET$begin, LAYOUT$begin);}

    public java.lang.foreign.MemorySegment end() {return this._ptr.get(LAYOUT$end, OFFSET$end);}
    public void end(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$end, OFFSET$end, value);}
    public java.lang.foreign.MemorySegment end_ptr() {return this._ptr.asSlice(OFFSET$end, LAYOUT$end);}

    public java.lang.foreign.MemorySegment active() {return this._ptr.get(LAYOUT$active, OFFSET$active);}
    public void active(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$active, OFFSET$active, value);}
    public java.lang.foreign.MemorySegment active_ptr() {return this._ptr.asSlice(OFFSET$active, LAYOUT$active);}

    public java.lang.foreign.MemorySegment current() {return this._ptr.get(LAYOUT$current, OFFSET$current);}
    public void current(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$current, OFFSET$current, value);}
    public java.lang.foreign.MemorySegment current_ptr() {return this._ptr.asSlice(OFFSET$current, LAYOUT$current);}

    public java.lang.foreign.MemorySegment freelist() {return this._ptr.get(LAYOUT$freelist, OFFSET$freelist);}
    public void freelist(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT$freelist, OFFSET$freelist, value);}
    public java.lang.foreign.MemorySegment freelist_ptr() {return this._ptr.asSlice(OFFSET$freelist, LAYOUT$freelist);}

    public int count() {return this._ptr.get(LAYOUT$count, OFFSET$count);}
    public void count(int value) {this._ptr.set(LAYOUT$count, OFFSET$count, value);}
    public java.lang.foreign.MemorySegment count_ptr() {return this._ptr.asSlice(OFFSET$count, LAYOUT$count);}

    public int seq() {return this._ptr.get(LAYOUT$seq, OFFSET$seq);}
    public void seq(int value) {this._ptr.set(LAYOUT$seq, OFFSET$seq, value);}
    public java.lang.foreign.MemorySegment seq_ptr() {return this._ptr.asSlice(OFFSET$seq, LAYOUT$seq);}
}
