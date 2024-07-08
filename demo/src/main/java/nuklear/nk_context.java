package nuklear;

public record nk_context(java.lang.foreign.MemorySegment _ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__input = nuklear.nk_input.gRecordLayout.withName("input");
    public static final long OFFSET__input = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__style = nuklear.nk_style.gRecordLayout.withName("style");
    public static final long OFFSET__style = 360;
    public static final java.lang.foreign.StructLayout LAYOUT__memory = nuklear.nk_buffer.gRecordLayout.withName("memory");
    public static final long OFFSET__memory = 9480;
    public static final java.lang.foreign.StructLayout LAYOUT__clip = nuklear.nk_clipboard.gRecordLayout.withName("clip");
    public static final long OFFSET__clip = 9600;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__last_widget_state = java.lang.foreign.ValueLayout.JAVA_INT.withName("last_widget_state");
    public static final long OFFSET__last_widget_state = 9624;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__button_behavior = java.lang.foreign.ValueLayout.JAVA_INT.withName("button_behavior");
    public static final long OFFSET__button_behavior = 9628;
    public static final java.lang.foreign.StructLayout LAYOUT__stacks = nuklear.nk_configuration_stacks.gRecordLayout.withName("stacks");
    public static final long OFFSET__stacks = 9632;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT__delta_time_seconds = java.lang.foreign.ValueLayout.JAVA_FLOAT.withName("delta_time_seconds");
    public static final long OFFSET__delta_time_seconds = 12504;
    public static final java.lang.foreign.StructLayout LAYOUT__draw_list = nuklear.nk_draw_list.gRecordLayout.withName("draw_list");
    public static final long OFFSET__draw_list = 12512;
    public static final java.lang.foreign.StructLayout LAYOUT__text_edit = nuklear.nk_text_edit.gRecordLayout.withName("text_edit");
    public static final long OFFSET__text_edit = 12752;
    public static final java.lang.foreign.StructLayout LAYOUT__overlay = nuklear.nk_command_buffer.gRecordLayout.withName("overlay");
    public static final long OFFSET__overlay = 18136;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__build = java.lang.foreign.ValueLayout.JAVA_INT.withName("build");
    public static final long OFFSET__build = 18200;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__use_pool = java.lang.foreign.ValueLayout.JAVA_INT.withName("use_pool");
    public static final long OFFSET__use_pool = 18204;
    public static final java.lang.foreign.StructLayout LAYOUT__pool = nuklear.nk_pool.gRecordLayout.withName("pool");
    public static final long OFFSET__pool = 18208;
    public static final java.lang.foreign.AddressLayout LAYOUT__begin = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("begin");
    public static final long OFFSET__begin = 18280;
    public static final java.lang.foreign.AddressLayout LAYOUT__end = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("end");
    public static final long OFFSET__end = 18288;
    public static final java.lang.foreign.AddressLayout LAYOUT__active = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("active");
    public static final long OFFSET__active = 18296;
    public static final java.lang.foreign.AddressLayout LAYOUT__current = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("current");
    public static final long OFFSET__current = 18304;
    public static final java.lang.foreign.AddressLayout LAYOUT__freelist = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("freelist");
    public static final long OFFSET__freelist = 18312;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__count = java.lang.foreign.ValueLayout.JAVA_INT.withName("count");
    public static final long OFFSET__count = 18320;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__seq = java.lang.foreign.ValueLayout.JAVA_INT.withName("seq");
    public static final long OFFSET__seq = 18324;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__input,
            LAYOUT__style,
            LAYOUT__memory,
            LAYOUT__clip,
            LAYOUT__last_widget_state,
            LAYOUT__button_behavior,
            LAYOUT__stacks,
            LAYOUT__delta_time_seconds,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__draw_list,
            LAYOUT__text_edit,
            LAYOUT__overlay,
            LAYOUT__build,
            LAYOUT__use_pool,
            LAYOUT__pool,
            LAYOUT__begin,
            LAYOUT__end,
            LAYOUT__active,
            LAYOUT__current,
            LAYOUT__freelist,
            LAYOUT__count,
            LAYOUT__seq
    ).withByteAlignment(8).withName("nk_context");

    public nk_context(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static nk_context getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new nk_context(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, nk_context value)
    {
        java.lang.foreign.MemorySegment.copy(value._ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public nuklear.nk_input input() {return new nuklear.nk_input(this._ptr.asSlice(OFFSET__input, LAYOUT__input));}
    public void input(java.util.function.Consumer<nuklear.nk_input> consumer) {consumer.accept(this.input());}
    public void input(nuklear.nk_input value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__input, LAYOUT__input.byteSize());}

    public nuklear.nk_style style() {return new nuklear.nk_style(this._ptr.asSlice(OFFSET__style, LAYOUT__style));}
    public void style(java.util.function.Consumer<nuklear.nk_style> consumer) {consumer.accept(this.style());}
    public void style(nuklear.nk_style value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__style, LAYOUT__style.byteSize());}

    public nuklear.nk_buffer memory() {return new nuklear.nk_buffer(this._ptr.asSlice(OFFSET__memory, LAYOUT__memory));}
    public void memory(java.util.function.Consumer<nuklear.nk_buffer> consumer) {consumer.accept(this.memory());}
    public void memory(nuklear.nk_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__memory, LAYOUT__memory.byteSize());}

    public nuklear.nk_clipboard clip() {return new nuklear.nk_clipboard(this._ptr.asSlice(OFFSET__clip, LAYOUT__clip));}
    public void clip(java.util.function.Consumer<nuklear.nk_clipboard> consumer) {consumer.accept(this.clip());}
    public void clip(nuklear.nk_clipboard value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__clip, LAYOUT__clip.byteSize());}

    public int last_widget_state() {return this._ptr.get(LAYOUT__last_widget_state, OFFSET__last_widget_state);}
    public void last_widget_state(int value) {this._ptr.set(LAYOUT__last_widget_state, OFFSET__last_widget_state, value);}
    public java.lang.foreign.MemorySegment $last_widget_state() {return this._ptr.asSlice(OFFSET__last_widget_state, LAYOUT__last_widget_state);}

    public int button_behavior() {return this._ptr.get(LAYOUT__button_behavior, OFFSET__button_behavior);}
    public void button_behavior(int value) {this._ptr.set(LAYOUT__button_behavior, OFFSET__button_behavior, value);}
    public java.lang.foreign.MemorySegment $button_behavior() {return this._ptr.asSlice(OFFSET__button_behavior, LAYOUT__button_behavior);}

    public nuklear.nk_configuration_stacks stacks() {return new nuklear.nk_configuration_stacks(this._ptr.asSlice(OFFSET__stacks, LAYOUT__stacks));}
    public void stacks(java.util.function.Consumer<nuklear.nk_configuration_stacks> consumer) {consumer.accept(this.stacks());}
    public void stacks(nuklear.nk_configuration_stacks value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__stacks, LAYOUT__stacks.byteSize());}

    public float delta_time_seconds() {return this._ptr.get(LAYOUT__delta_time_seconds, OFFSET__delta_time_seconds);}
    public void delta_time_seconds(float value) {this._ptr.set(LAYOUT__delta_time_seconds, OFFSET__delta_time_seconds, value);}
    public java.lang.foreign.MemorySegment $delta_time_seconds() {return this._ptr.asSlice(OFFSET__delta_time_seconds, LAYOUT__delta_time_seconds);}

    public nuklear.nk_draw_list draw_list() {return new nuklear.nk_draw_list(this._ptr.asSlice(OFFSET__draw_list, LAYOUT__draw_list));}
    public void draw_list(java.util.function.Consumer<nuklear.nk_draw_list> consumer) {consumer.accept(this.draw_list());}
    public void draw_list(nuklear.nk_draw_list value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__draw_list, LAYOUT__draw_list.byteSize());}

    public nuklear.nk_text_edit text_edit() {return new nuklear.nk_text_edit(this._ptr.asSlice(OFFSET__text_edit, LAYOUT__text_edit));}
    public void text_edit(java.util.function.Consumer<nuklear.nk_text_edit> consumer) {consumer.accept(this.text_edit());}
    public void text_edit(nuklear.nk_text_edit value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__text_edit, LAYOUT__text_edit.byteSize());}

    public nuklear.nk_command_buffer overlay() {return new nuklear.nk_command_buffer(this._ptr.asSlice(OFFSET__overlay, LAYOUT__overlay));}
    public void overlay(java.util.function.Consumer<nuklear.nk_command_buffer> consumer) {consumer.accept(this.overlay());}
    public void overlay(nuklear.nk_command_buffer value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__overlay, LAYOUT__overlay.byteSize());}

    public int build() {return this._ptr.get(LAYOUT__build, OFFSET__build);}
    public void build(int value) {this._ptr.set(LAYOUT__build, OFFSET__build, value);}
    public java.lang.foreign.MemorySegment $build() {return this._ptr.asSlice(OFFSET__build, LAYOUT__build);}

    public int use_pool() {return this._ptr.get(LAYOUT__use_pool, OFFSET__use_pool);}
    public void use_pool(int value) {this._ptr.set(LAYOUT__use_pool, OFFSET__use_pool, value);}
    public java.lang.foreign.MemorySegment $use_pool() {return this._ptr.asSlice(OFFSET__use_pool, LAYOUT__use_pool);}

    public nuklear.nk_pool pool() {return new nuklear.nk_pool(this._ptr.asSlice(OFFSET__pool, LAYOUT__pool));}
    public void pool(java.util.function.Consumer<nuklear.nk_pool> consumer) {consumer.accept(this.pool());}
    public void pool(nuklear.nk_pool value) {java.lang.foreign.MemorySegment.copy(value._ptr(), 0, this._ptr, OFFSET__pool, LAYOUT__pool.byteSize());}

    public java.lang.foreign.MemorySegment begin() {return this._ptr.get(LAYOUT__begin, OFFSET__begin);}
    public void begin(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__begin, OFFSET__begin, value);}
    public java.lang.foreign.MemorySegment $begin() {return this._ptr.asSlice(OFFSET__begin, LAYOUT__begin);}

    public java.lang.foreign.MemorySegment end() {return this._ptr.get(LAYOUT__end, OFFSET__end);}
    public void end(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__end, OFFSET__end, value);}
    public java.lang.foreign.MemorySegment $end() {return this._ptr.asSlice(OFFSET__end, LAYOUT__end);}

    public java.lang.foreign.MemorySegment active() {return this._ptr.get(LAYOUT__active, OFFSET__active);}
    public void active(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__active, OFFSET__active, value);}
    public java.lang.foreign.MemorySegment $active() {return this._ptr.asSlice(OFFSET__active, LAYOUT__active);}

    public java.lang.foreign.MemorySegment current() {return this._ptr.get(LAYOUT__current, OFFSET__current);}
    public void current(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__current, OFFSET__current, value);}
    public java.lang.foreign.MemorySegment $current() {return this._ptr.asSlice(OFFSET__current, LAYOUT__current);}

    public java.lang.foreign.MemorySegment freelist() {return this._ptr.get(LAYOUT__freelist, OFFSET__freelist);}
    public void freelist(java.lang.foreign.MemorySegment value) {this._ptr.set(LAYOUT__freelist, OFFSET__freelist, value);}
    public java.lang.foreign.MemorySegment $freelist() {return this._ptr.asSlice(OFFSET__freelist, LAYOUT__freelist);}

    public int count() {return this._ptr.get(LAYOUT__count, OFFSET__count);}
    public void count(int value) {this._ptr.set(LAYOUT__count, OFFSET__count, value);}
    public java.lang.foreign.MemorySegment $count() {return this._ptr.asSlice(OFFSET__count, LAYOUT__count);}

    public int seq() {return this._ptr.get(LAYOUT__seq, OFFSET__seq);}
    public void seq(int value) {this._ptr.set(LAYOUT__seq, OFFSET__seq, value);}
    public java.lang.foreign.MemorySegment $seq() {return this._ptr.asSlice(OFFSET__seq, LAYOUT__seq);}
}
