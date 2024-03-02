package nuklear;

public final class Nuklear
{private Nuklear() {}

    public static final int NK_UTF_SIZE = 4;
    public static final int NK_TEXTEDIT_UNDOCHARCOUNT = 999;
    public static final int NK_BUTTON_BEHAVIOR_STACK_SIZE = 8;
    public static final int NK_INPUT_MAX = 16;
    public static final int NK_VECTOR_STACK_SIZE = 16;
    public static final int NK_INCLUDE_DEFAULT_ALLOCATOR = 1;
    public static final int NK_FONT_STACK_SIZE = 8;
    public static final int NK_INCLUDE_FONT_BAKING = 1;
    public static final int NK_MAX_NUMBER_BUFFER = 64;
    public static final int NK_UTF_INVALID = 65533;
    public static final int NK_FLAGS_STACK_SIZE = 32;
    public static final int NK_TEXTEDIT_UNDOSTATECOUNT = 99;
    public static final int NK_INCLUDE_STANDARD_IO = 1;
    public static final int NK_MAX_FLOAT_PRECISION = 2;
    public static final int NK_INCLUDE_DEFAULT_FONT = 1;
    public static final int NK_COLOR_STACK_SIZE = 32;
    public static final int NK_CHART_MAX_SLOT = 4;
    public static final int NK_WINDOW_MAX_NAME = 64;
    public static final int NK_STYLE_ITEM_STACK_SIZE = 16;
    public static final int NK_FLOAT_STACK_SIZE = 32;
    public static final int NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS = 16;
    public static final int NK_INCLUDE_VERTEX_BUFFER_OUTPUT = 1;
    public static final int NK_INCLUDE_FIXED_TYPES = 1;

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_init_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_init_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD$nk_init_fixed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_init_custom;
    public static final java.lang.invoke.MethodHandle MTD$nk_init_custom;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_clear;
    public static final java.lang.invoke.MethodHandle MTD$nk_clear;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_free;
    public static final java.lang.invoke.MethodHandle MTD$nk_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_motion;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_motion;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_key;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_key;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_button;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_button;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_glyph;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_glyph;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_unicode;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_unicode;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__begin;
    public static final java.lang.invoke.MethodHandle MTD$nk__begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__next;
    public static final java.lang.invoke.MethodHandle MTD$nk__next;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_convert;
    public static final java.lang.invoke.MethodHandle MTD$nk_convert;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_end;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_next;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_next;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_begin_titled;
    public static final java.lang.invoke.MethodHandle MTD$nk_begin_titled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_find;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_find;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_bounds;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_bounds;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_position;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_position;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_size;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_size;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_width;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_width;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_height;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_height;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_panel;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_panel;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_content_region;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_content_region;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_content_region_min;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_content_region_min;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_content_region_max;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_content_region_max;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_content_region_size;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_content_region_size;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_canvas;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_canvas;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_get_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_has_focus;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_has_focus;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_hovered;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_hovered;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_collapsed;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_collapsed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_closed;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_closed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_hidden;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_hidden;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_active;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_active;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_is_any_hovered;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_is_any_hovered;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_item_is_any_active;
    public static final java.lang.invoke.MethodHandle MTD$nk_item_is_any_active;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_set_bounds;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_set_bounds;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_set_position;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_set_position;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_set_size;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_set_size;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_set_focus;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_set_focus;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_set_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_close;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_close;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_collapse;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_collapse;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_collapse_if;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_collapse_if;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_show;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_show;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_window_show_if;
    public static final java.lang.invoke.MethodHandle MTD$nk_window_show_if;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rule_horizontal;
    public static final java.lang.invoke.MethodHandle MTD$nk_rule_horizontal;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_set_min_row_height;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_set_min_row_height;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_reset_min_row_height;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_reset_min_row_height;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_widget_bounds;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_widget_bounds;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_ratio_from_pixel;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_ratio_from_pixel;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_dynamic;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_dynamic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_static;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_static;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_template_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_template_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_template_push_dynamic;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_template_push_dynamic;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_template_push_variable;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_template_push_variable;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_template_push_static;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_template_push_static;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_row_template_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_row_template_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_bounds;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_bounds;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_to_screen;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_to_screen;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_to_local;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_to_local;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_rect_to_screen;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_rect_to_screen;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_layout_space_rect_to_local;
    public static final java.lang.invoke.MethodHandle MTD$nk_layout_space_rect_to_local;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_spacer;
    public static final java.lang.invoke.MethodHandle MTD$nk_spacer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_begin_titled;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_begin_titled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_scrolled_offset_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_scrolled_offset_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_scrolled_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_scrolled_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_scrolled_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_scrolled_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_get_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_group_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_group_set_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_push_hashed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_image_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_image_push_hashed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_pop;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_pop;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_state_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_state_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_state_image_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_state_image_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_state_pop;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_state_pop;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_element_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_element_push_hashed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_element_image_push_hashed;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_element_image_push_hashed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tree_element_pop;
    public static final java.lang.invoke.MethodHandle MTD$nk_tree_element_pop;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_list_view_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_list_view_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_list_view_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_list_view_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_fitting;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_fitting;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_bounds;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_bounds;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_position;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_position;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_size;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_size;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_width;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_width;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_height;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_height;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_is_hovered;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_is_hovered;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_is_mouse_clicked;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_is_mouse_clicked;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_has_mouse_click_down;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_has_mouse_click_down;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_spacing;
    public static final java.lang.invoke.MethodHandle MTD$nk_spacing;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_disable_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_disable_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_widget_disable_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_widget_disable_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_text_colored;
    public static final java.lang.invoke.MethodHandle MTD$nk_text_colored;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_text_wrap;
    public static final java.lang.invoke.MethodHandle MTD$nk_text_wrap;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_text_wrap_colored;
    public static final java.lang.invoke.MethodHandle MTD$nk_text_wrap_colored;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_label_colored;
    public static final java.lang.invoke.MethodHandle MTD$nk_label_colored;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_label_wrap;
    public static final java.lang.invoke.MethodHandle MTD$nk_label_wrap;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_label_colored_wrap;
    public static final java.lang.invoke.MethodHandle MTD$nk_label_colored_wrap;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_image_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_text_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_text_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_label_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_label_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol_text_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol_text_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_symbol_label_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_symbol_label_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image_label_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image_label_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_image_text_styled;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_image_text_styled;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_set_behavior;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_set_behavior;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_push_behavior;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_push_behavior;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_button_pop_behavior;
    public static final java.lang.invoke.MethodHandle MTD$nk_button_pop_behavior;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_check_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_check_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_check_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_check_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_check_text_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_check_text_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_check_flags_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_check_flags_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_check_flags_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_check_flags_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_label_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_label_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_text_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_text_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_flags_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_flags_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_checkbox_flags_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_checkbox_flags_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_radio_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_radio_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_radio_label_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_radio_label_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_radio_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_radio_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_radio_text_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_radio_text_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_option_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_option_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_option_label_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_option_label_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_option_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_option_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_option_text_align;
    public static final java.lang.invoke.MethodHandle MTD$nk_option_text_align;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_selectable_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_selectable_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_select_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_select_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_slide_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_slide_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_slide_int;
    public static final java.lang.invoke.MethodHandle MTD$nk_slide_int;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_slider_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_slider_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_slider_int;
    public static final java.lang.invoke.MethodHandle MTD$nk_slider_int;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_progress;
    public static final java.lang.invoke.MethodHandle MTD$nk_progress;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_prog;
    public static final java.lang.invoke.MethodHandle MTD$nk_prog;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_picker;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_picker;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_pick;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_pick;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_property_int;
    public static final java.lang.invoke.MethodHandle MTD$nk_property_int;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_property_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_property_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_property_double;
    public static final java.lang.invoke.MethodHandle MTD$nk_property_double;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_propertyi;
    public static final java.lang.invoke.MethodHandle MTD$nk_propertyi;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_propertyf;
    public static final java.lang.invoke.MethodHandle MTD$nk_propertyf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_propertyd;
    public static final java.lang.invoke.MethodHandle MTD$nk_propertyd;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_edit_string;
    public static final java.lang.invoke.MethodHandle MTD$nk_edit_string;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_edit_string_zero_terminated;
    public static final java.lang.invoke.MethodHandle MTD$nk_edit_string_zero_terminated;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_edit_buffer;
    public static final java.lang.invoke.MethodHandle MTD$nk_edit_buffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_edit_focus;
    public static final java.lang.invoke.MethodHandle MTD$nk_edit_focus;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_edit_unfocus;
    public static final java.lang.invoke.MethodHandle MTD$nk_edit_unfocus;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_begin_colored;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_begin_colored;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_add_slot;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_add_slot;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_add_slot_colored;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_add_slot_colored;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_push_slot;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_push_slot;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_chart_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_chart_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_plot;
    public static final java.lang.invoke.MethodHandle MTD$nk_plot;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_plot_function;
    public static final java.lang.invoke.MethodHandle MTD$nk_plot_function;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_popup_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_popup_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_popup_close;
    public static final java.lang.invoke.MethodHandle MTD$nk_popup_close;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_popup_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_popup_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_popup_get_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_popup_get_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_popup_set_scroll;
    public static final java.lang.invoke.MethodHandle MTD$nk_popup_set_scroll;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_separator;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_separator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_string;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_string;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_callback;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_callback;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combobox;
    public static final java.lang.invoke.MethodHandle MTD$nk_combobox;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combobox_string;
    public static final java.lang.invoke.MethodHandle MTD$nk_combobox_string;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combobox_separator;
    public static final java.lang.invoke.MethodHandle MTD$nk_combobox_separator;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combobox_callback;
    public static final java.lang.invoke.MethodHandle MTD$nk_combobox_callback;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_symbol;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_symbol;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_begin_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_begin_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_item_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_close;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_close;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_combo_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_combo_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_item_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_close;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_close;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_contextual_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_contextual_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tooltip;
    public static final java.lang.invoke.MethodHandle MTD$nk_tooltip;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tooltip_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_tooltip_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_tooltip_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_tooltip_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menubar_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_menubar_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menubar_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_menubar_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_symbol;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_symbol;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_begin_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_begin_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_image_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_image_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_image_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_image_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_symbol_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_symbol_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_item_symbol_label;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_item_symbol_label;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_close;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_close;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_menu_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_menu_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_from_table;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_from_table;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_load_cursor;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_load_cursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_load_all_cursors;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_load_all_cursors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_get_color_by_name;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_get_color_by_name;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_set_font;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_set_font;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_set_cursor;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_set_cursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_show_cursor;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_show_cursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_hide_cursor;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_hide_cursor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_font;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_font;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_vec2;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_vec2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_style_item;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_style_item;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_flags;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_flags;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_push_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_push_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_font;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_font;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_vec2;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_vec2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_style_item;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_style_item;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_flags;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_flags;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_pop_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_pop_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_cf;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_cf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_hex;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_hex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgb_factor;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgb_factor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_u32;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_u32;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_cf;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_cf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rgba_hex;
    public static final java.lang.invoke.MethodHandle MTD$nk_rgba_hex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_colorf;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_colorf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_colorfv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_colorfv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_colorf_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_colorf_hsva_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_colorf_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_colorf_hsva_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsv_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsv_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsv_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsv_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsv_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsv_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsv_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsv_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_hsva_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_cf;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_cf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_d;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_d;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_dv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_dv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_u32;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_u32;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hex_rgba;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hex_rgba;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hex_rgb;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hex_rgb;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_i;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_i;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_b;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_b;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsv_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsv_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_i;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_i;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_b;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_b;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_bv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_bv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_f;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_f;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_color_hsva_fv;
    public static final java.lang.invoke.MethodHandle MTD$nk_color_hsva_fv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_handle_ptr;
    public static final java.lang.invoke.MethodHandle MTD$nk_handle_ptr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_handle_id;
    public static final java.lang.invoke.MethodHandle MTD$nk_handle_id;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image_handle;
    public static final java.lang.invoke.MethodHandle MTD$nk_image_handle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image_ptr;
    public static final java.lang.invoke.MethodHandle MTD$nk_image_ptr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image_id;
    public static final java.lang.invoke.MethodHandle MTD$nk_image_id;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_image_is_subimage;
    public static final java.lang.invoke.MethodHandle MTD$nk_image_is_subimage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_subimage_ptr;
    public static final java.lang.invoke.MethodHandle MTD$nk_subimage_ptr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_subimage_id;
    public static final java.lang.invoke.MethodHandle MTD$nk_subimage_id;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_subimage_handle;
    public static final java.lang.invoke.MethodHandle MTD$nk_subimage_handle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_nine_slice_handle;
    public static final java.lang.invoke.MethodHandle MTD$nk_nine_slice_handle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_nine_slice_ptr;
    public static final java.lang.invoke.MethodHandle MTD$nk_nine_slice_ptr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_nine_slice_id;
    public static final java.lang.invoke.MethodHandle MTD$nk_nine_slice_id;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_nine_slice_is_sub9slice;
    public static final java.lang.invoke.MethodHandle MTD$nk_nine_slice_is_sub9slice;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_sub9slice_ptr;
    public static final java.lang.invoke.MethodHandle MTD$nk_sub9slice_ptr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_sub9slice_id;
    public static final java.lang.invoke.MethodHandle MTD$nk_sub9slice_id;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_sub9slice_handle;
    public static final java.lang.invoke.MethodHandle MTD$nk_sub9slice_handle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_murmur_hash;
    public static final java.lang.invoke.MethodHandle MTD$nk_murmur_hash;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_triangle_from_direction;
    public static final java.lang.invoke.MethodHandle MTD$nk_triangle_from_direction;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_vec2;
    public static final java.lang.invoke.MethodHandle MTD$nk_vec2;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_vec2i;
    public static final java.lang.invoke.MethodHandle MTD$nk_vec2i;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_vec2v;
    public static final java.lang.invoke.MethodHandle MTD$nk_vec2v;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_vec2iv;
    public static final java.lang.invoke.MethodHandle MTD$nk_vec2iv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_get_null_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_get_null_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_recti;
    public static final java.lang.invoke.MethodHandle MTD$nk_recti;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_recta;
    public static final java.lang.invoke.MethodHandle MTD$nk_recta;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rectv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rectv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rectiv;
    public static final java.lang.invoke.MethodHandle MTD$nk_rectiv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rect_pos;
    public static final java.lang.invoke.MethodHandle MTD$nk_rect_pos;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_rect_size;
    public static final java.lang.invoke.MethodHandle MTD$nk_rect_size;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strlen;
    public static final java.lang.invoke.MethodHandle MTD$nk_strlen;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stricmp;
    public static final java.lang.invoke.MethodHandle MTD$nk_stricmp;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stricmpn;
    public static final java.lang.invoke.MethodHandle MTD$nk_stricmpn;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strtoi;
    public static final java.lang.invoke.MethodHandle MTD$nk_strtoi;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strtof;
    public static final java.lang.invoke.MethodHandle MTD$nk_strtof;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strtod;
    public static final java.lang.invoke.MethodHandle MTD$nk_strtod;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strfilter;
    public static final java.lang.invoke.MethodHandle MTD$nk_strfilter;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strmatch_fuzzy_string;
    public static final java.lang.invoke.MethodHandle MTD$nk_strmatch_fuzzy_string;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_strmatch_fuzzy_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_strmatch_fuzzy_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_utf_decode;
    public static final java.lang.invoke.MethodHandle MTD$nk_utf_decode;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_utf_encode;
    public static final java.lang.invoke.MethodHandle MTD$nk_utf_encode;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_utf_len;
    public static final java.lang.invoke.MethodHandle MTD$nk_utf_len;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_utf_at;
    public static final java.lang.invoke.MethodHandle MTD$nk_utf_at;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_default_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_default_glyph_ranges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_chinese_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_chinese_glyph_ranges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_cyrillic_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_cyrillic_glyph_ranges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_korean_glyph_ranges;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_korean_glyph_ranges;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_init_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_init_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_init_custom;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_init_custom;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_config;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_config;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add_from_file;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add_compressed;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add_compressed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_add_compressed_base85;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_add_compressed_base85;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_bake;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_bake;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_end;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_find_glyph;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_find_glyph;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_cleanup;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_cleanup;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_font_atlas_clear;
    public static final java.lang.invoke.MethodHandle MTD$nk_font_atlas_clear;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_init_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_init_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_init_fixed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_info;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_info;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_push;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_push;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_mark;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_mark;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_reset;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_reset;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_clear;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_clear;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_free;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_memory;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_memory_const;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_memory_const;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_buffer_total;
    public static final java.lang.invoke.MethodHandle MTD$nk_buffer_total;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_init_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_init_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_init_fixed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_clear;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_clear;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_free;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_text_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_text_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_str_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_str_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_text_utf8;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_text_utf8;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_str_utf8;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_str_utf8;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_text_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_text_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_append_str_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_append_str_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_at_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_at_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_at_rune;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_at_rune;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_text_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_text_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_str_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_str_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_text_utf8;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_text_utf8;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_str_utf8;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_str_utf8;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_text_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_text_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_insert_str_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_insert_str_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_remove_chars;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_remove_chars;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_remove_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_remove_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_delete_chars;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_delete_chars;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_delete_runes;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_delete_runes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_at_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_at_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_at_rune;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_at_rune;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_rune_at;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_rune_at;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_at_char_const;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_at_char_const;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_at_const;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_at_const;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_get;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_get;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_get_const;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_get_const;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_len;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_len;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_str_len_char;
    public static final java.lang.invoke.MethodHandle MTD$nk_str_len_char;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_ascii;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_ascii;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_float;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_float;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_decimal;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_decimal;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_hex;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_hex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_oct;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_oct;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_filter_binary;
    public static final java.lang.invoke.MethodHandle MTD$nk_filter_binary;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_init_default;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_init_default;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_init_fixed;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_init_fixed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_free;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_delete;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_delete;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_delete_selection;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_delete_selection;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_select_all;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_select_all;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_cut;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_cut;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_paste;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_paste;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_undo;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_undo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_textedit_redo;
    public static final java.lang.invoke.MethodHandle MTD$nk_textedit_redo;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_line;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_line;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_curve;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_curve;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_circle;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_circle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_arc;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_arc;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_triangle;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_triangle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_polyline;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_polyline;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_stroke_polygon;
    public static final java.lang.invoke.MethodHandle MTD$nk_stroke_polygon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_rect_multi_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_rect_multi_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_circle;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_circle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_arc;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_arc;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_triangle;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_triangle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_fill_polygon;
    public static final java.lang.invoke.MethodHandle MTD$nk_fill_polygon;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_nine_slice;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_nine_slice;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_push_scissor;
    public static final java.lang.invoke.MethodHandle MTD$nk_push_scissor;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_push_custom;
    public static final java.lang.invoke.MethodHandle MTD$nk_push_custom;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_has_mouse_click;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_has_mouse_click;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_has_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_has_mouse_click_in_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_has_mouse_click_in_button_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_has_mouse_click_in_button_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_has_mouse_click_down_in_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_has_mouse_click_down_in_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_click_in_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_click_down_in_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_click_down_in_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_any_mouse_click_in_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_any_mouse_click_in_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_prev_hovering_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_prev_hovering_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_hovering_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_hovering_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_mouse_clicked;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_mouse_clicked;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_down;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_down;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_pressed;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_pressed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_mouse_released;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_mouse_released;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_key_pressed;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_key_pressed;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_key_released;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_key_released;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_input_is_key_down;
    public static final java.lang.invoke.MethodHandle MTD$nk_input_is_key_down;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_init;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_init;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_setup;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_setup;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_list_begin;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_list_begin;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_list_next;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_list_next;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk__draw_list_end;
    public static final java.lang.invoke.MethodHandle MTD$nk__draw_list_end;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_clear;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_clear;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_line_to;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_line_to;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_arc_to_fast;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_arc_to_fast;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_arc_to;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_arc_to;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_rect_to;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_rect_to;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_curve_to;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_curve_to;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_fill;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_fill;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_path_stroke;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_path_stroke;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_line;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_line;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_triangle;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_triangle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_circle;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_circle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_curve;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_curve;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_stroke_poly_line;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_stroke_poly_line;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_fill_rect;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_fill_rect;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_fill_rect_multi_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_fill_rect_multi_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_fill_triangle;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_fill_triangle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_fill_circle;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_fill_circle;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_fill_poly_convex;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_fill_poly_convex;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_add_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_add_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_draw_list_add_text;
    public static final java.lang.invoke.MethodHandle MTD$nk_draw_list_add_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_item_color;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_item_color;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_item_image;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_item_image;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_item_nine_slice;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_item_nine_slice;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$nk_style_item_hide;
    public static final java.lang.invoke.MethodHandle MTD$nk_style_item_hide;

    /*/// #### nk_init_default
    /// Initializes a `nk_context` struct with a default standard library allocator.
    /// Should be used if you don't want to be bothered with memory management in nuklear.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_init_default(struct nk_context *ctx, const struct nk_user_font *font);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|---------------------------------------------------------------
    /// __ctx__     | Must point to an either stack or heap allocated `nk_context` struct
    /// __font__    | Must point to a previously initialized font handle for more info look at font documentation
    ///
    /// Returns either `false(0)` on failure or `true(1)` on success.
    ///
    */
    public static int nk_init_default(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_init_default.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_init_fixed
    /// Initializes a `nk_context` struct from single fixed size memory block
    /// Should be used if you want complete control over nuklear's memory management.
    /// Especially recommended for system with little memory or systems with virtual memory.
    /// For the later case you can just allocate for example 16MB of virtual memory
    /// and only the required amount of memory will actually be committed.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_init_fixed(struct nk_context *ctx, void *memory, nk_size size, const struct nk_user_font *font);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// !!! Warning
    ///     make sure the passed memory block is aligned correctly for `nk_draw_commands`.
    ///
    /// Parameter   | Description
    /// ------------|--------------------------------------------------------------
    /// __ctx__     | Must point to an either stack or heap allocated `nk_context` struct
    /// __memory__  | Must point to a previously allocated memory block
    /// __size__    | Must contain the total size of __memory__
    /// __font__    | Must point to a previously initialized font handle for more info look at font documentation
    ///
    /// Returns either `false(0)` on failure or `true(1)` on success.
    */
    public static int nk_init_fixed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment memory, long size, java.lang.foreign.MemorySegment arg4)
    {
        try {return (int)MTD$nk_init_fixed.invokeExact(arg1, memory, size, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_init
    /// Initializes a `nk_context` struct with memory allocation callbacks for nuklear to allocate
    /// memory from. Used internally for `nk_init_default` and provides a kitchen sink allocation
    /// interface to nuklear. Can be useful for cases like monitoring memory consumption.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_init(struct nk_context *ctx, struct nk_allocator *alloc, const struct nk_user_font *font);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|---------------------------------------------------------------
    /// __ctx__     | Must point to an either stack or heap allocated `nk_context` struct
    /// __alloc__   | Must point to a previously allocated memory allocator
    /// __font__    | Must point to a previously initialized font handle for more info look at font documentation
    ///
    /// Returns either `false(0)` on failure or `true(1)` on success.
    */
    public static int nk_init(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
    {
        try {return (int)MTD$nk_init.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_init_custom
    /// Initializes a `nk_context` struct from two different either fixed or growing
    /// buffers. The first buffer is for allocating draw commands while the second buffer is
    /// used for allocating windows, panels and state tables.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_init_custom(struct nk_context *ctx, struct nk_buffer *cmds, struct nk_buffer *pool, const struct nk_user_font *font);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|---------------------------------------------------------------
    /// __ctx__     | Must point to an either stack or heap allocated `nk_context` struct
    /// __cmds__    | Must point to a previously initialized memory buffer either fixed or dynamic to store draw commands into
    /// __pool__    | Must point to a previously initialized memory buffer either fixed or dynamic to store windows, panels and tables
    /// __font__    | Must point to a previously initialized font handle for more info look at font documentation
    ///
    /// Returns either `false(0)` on failure or `true(1)` on success.
    */
    public static int nk_init_custom(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment pool, java.lang.foreign.MemorySegment arg4)
    {
        try {return (int)MTD$nk_init_custom.invokeExact(arg1, cmds, pool, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_clear
    /// Resets the context state at the end of the frame. This includes mostly
    /// garbage collector tasks like removing windows or table not called and therefore
    /// used anymore.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_clear(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    */
    public static void nk_clear(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_clear.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_free
    /// Frees all memory allocated by nuklear. Not needed if context was
    /// initialized with `nk_init_fixed`.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_free(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    */
    public static void nk_free(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_free.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_begin
    /// Begins the input mirroring process by resetting text, scroll
    /// mouse, previous mouse position and movement as well as key state transitions,
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_begin(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    */
    public static void nk_input_begin(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_input_begin.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_motion
    /// Mirrors current mouse position to nuklear
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_motion(struct nk_context *ctx, int x, int y);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __x__       | Must hold an integer describing the current mouse cursor x-position
    /// __y__       | Must hold an integer describing the current mouse cursor y-position
    */
    public static void nk_input_motion(java.lang.foreign.MemorySegment arg1, int x, int y)
    {
        try {MTD$nk_input_motion.invokeExact(arg1, x, y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_key
    /// Mirrors the state of a specific key to nuklear
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_key(struct nk_context*, enum nk_keys key, nk_bool down);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __key__     | Must be any value specified in enum `nk_keys` that needs to be mirrored
    /// __down__    | Must be 0 for key is up and 1 for key is down
    */
    public static void nk_input_key(java.lang.foreign.MemorySegment arg1, int arg2, int down)
    {
        try {MTD$nk_input_key.invokeExact(arg1, arg2, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_button
    /// Mirrors the state of a specific mouse button to nuklear
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_button(struct nk_context *ctx, enum nk_buttons btn, int x, int y, nk_bool down);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __btn__     | Must be any value specified in enum `nk_buttons` that needs to be mirrored
    /// __x__       | Must contain an integer describing mouse cursor x-position on click up/down
    /// __y__       | Must contain an integer describing mouse cursor y-position on click up/down
    /// __down__    | Must be 0 for key is up and 1 for key is down
    */
    public static void nk_input_button(java.lang.foreign.MemorySegment arg1, int arg2, int x, int y, int down)
    {
        try {MTD$nk_input_button.invokeExact(arg1, arg2, x, y, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_scroll
    /// Copies the last mouse scroll value to nuklear. Is generally
    /// a scroll value. So does not have to come from mouse and could also originate
    /// TODO finish this sentence
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_scroll(struct nk_context *ctx, struct nk_vec2 val);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __val__     | vector with both X- as well as Y-scroll value
    */
    public static void nk_input_scroll(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 val)
    {
        try {MTD$nk_input_scroll.invokeExact(arg1, val._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_char
    /// Copies a single ASCII character into an internal text buffer
    /// This is basically a helper function to quickly push ASCII characters into
    /// nuklear.
    ///
    /// !!! Note
    ///     Stores up to NK_INPUT_MAX bytes between `nk_input_begin` and `nk_input_end`.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_char(struct nk_context *ctx, char c);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __c__       | Must be a single ASCII character preferable one that can be printed
    */
    public static void nk_input_char(java.lang.foreign.MemorySegment arg1, char arg2)
    {
        try {MTD$nk_input_char.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_glyph
    /// Converts an encoded unicode rune into UTF-8 and copies the result into an
    /// internal text buffer.
    ///
    /// !!! Note
    ///     Stores up to NK_INPUT_MAX bytes between `nk_input_begin` and `nk_input_end`.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_glyph(struct nk_context *ctx, const nk_glyph g);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __g__       | UTF-32 unicode codepoint
    */
    public static void nk_input_glyph(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_input_glyph.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_unicode
    /// Converts a unicode rune into UTF-8 and copies the result
    /// into an internal text buffer.
    /// !!! Note
    ///     Stores up to NK_INPUT_MAX bytes between `nk_input_begin` and `nk_input_end`.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_unicode(struct nk_context*, nk_rune rune);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    /// __rune__    | UTF-32 unicode codepoint
    */
    public static void nk_input_unicode(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {MTD$nk_input_unicode.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_input_end
    /// End the input mirroring process by resetting mouse grabbing
    /// state to ensure the mouse cursor is not grabbed indefinitely.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_input_end(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to a previously initialized `nk_context` struct
    */
    public static void nk_input_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_input_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk__begin
    /// Returns a draw command list iterator to iterate all draw
    /// commands accumulated over one frame.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// const struct nk_command* nk__begin(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | must point to an previously initialized `nk_context` struct at the end of a frame
    ///
    /// Returns draw command pointer pointing to the first command inside the draw command list
    */
    public static java.lang.foreign.MemorySegment nk__begin(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__begin.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk__next
    /// Returns draw command pointer pointing to the next command inside the draw command list
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// const struct nk_command* nk__next(struct nk_context*, const struct nk_command*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct at the end of a frame
    /// __cmd__     | Must point to an previously a draw command either returned by `nk__begin` or `nk__next`
    ///
    /// Returns draw command pointer pointing to the next command inside the draw command list
    */
    public static java.lang.foreign.MemorySegment nk__next(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__next.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_convert
    /// Converts all internal draw commands into vertex draw commands and fills
    /// three buffers with vertexes, vertex draw commands and vertex indices. The vertex format
    /// as well as some other configuration values have to be configured by filling out a
    /// `nk_convert_config` struct.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_flags nk_convert(struct nk_context *ctx, struct nk_buffer *cmds,
    ///     struct nk_buffer *vertices, struct nk_buffer *elements, const struct nk_convert_config*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct at the end of a frame
    /// __cmds__    | Must point to a previously initialized buffer to hold converted vertex draw commands
    /// __vertices__| Must point to a previously initialized buffer to hold all produced vertices
    /// __elements__| Must point to a previously initialized buffer to hold all produced vertex indices
    /// __config__  | Must point to a filled out `nk_config` struct to configure the conversion process
    ///
    /// Returns one of enum nk_convert_result error codes
    ///
    /// Parameter                       | Description
    /// --------------------------------|-----------------------------------------------------------
    /// NK_CONVERT_SUCCESS              | Signals a successful draw command to vertex buffer conversion
    /// NK_CONVERT_INVALID_PARAM        | An invalid argument was passed in the function call
    /// NK_CONVERT_COMMAND_BUFFER_FULL  | The provided buffer for storing draw commands is full or failed to allocate more memory
    /// NK_CONVERT_VERTEX_BUFFER_FULL   | The provided buffer for storing vertices is full or failed to allocate more memory
    /// NK_CONVERT_ELEMENT_BUFFER_FULL  | The provided buffer for storing indices is full or failed to allocate more memory
    */
    public static int nk_convert(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment vertices, java.lang.foreign.MemorySegment elements, java.lang.foreign.MemorySegment arg5)
    {
        try {return (int)MTD$nk_convert.invokeExact(arg1, cmds, vertices, elements, arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk__draw_begin
    /// Returns a draw vertex command buffer iterator to iterate over the vertex draw command buffer
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// const struct nk_draw_command* nk__draw_begin(const struct nk_context*, const struct nk_buffer*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct at the end of a frame
    /// __buf__     | Must point to an previously by `nk_convert` filled out vertex draw command buffer
    ///
    /// Returns vertex draw command pointer pointing to the first command inside the vertex draw command buffer
    */
    public static java.lang.foreign.MemorySegment nk__draw_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_begin.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk__draw_end
    /// Returns the vertex draw command at the end of the vertex draw command buffer
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// const struct nk_draw_command* nk__draw_end(const struct nk_context *ctx, const struct nk_buffer *buf);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct at the end of a frame
    /// __buf__     | Must point to an previously by `nk_convert` filled out vertex draw command buffer
    ///
    /// Returns vertex draw command pointer pointing to the end of the last vertex draw command inside the vertex draw command buffer
    */
    public static java.lang.foreign.MemorySegment nk__draw_end(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_end.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk__draw_next
    /// Increments the vertex draw command buffer iterator
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// const struct nk_draw_command* nk__draw_next(const struct nk_draw_command*, const struct nk_buffer*, const struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __cmd__     | Must point to an previously either by `nk__draw_begin` or `nk__draw_next` returned vertex draw command
    /// __buf__     | Must point to an previously by `nk_convert` filled out vertex draw command buffer
    /// __ctx__     | Must point to an previously initialized `nk_context` struct at the end of a frame
    ///
    /// Returns vertex draw command pointer pointing to the end of the last vertex draw command inside the vertex draw command buffer
    */
    public static java.lang.foreign.MemorySegment nk__draw_next(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_next.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_begin
    /// Starts a new window; needs to be called every frame for every
    /// window (unless hidden) or otherwise the window gets removed
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_begin(struct nk_context *ctx, const char *title, struct nk_rect bounds, nk_flags flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __title__   | Window title and identifier. Needs to be persistent over frames to identify the window
    /// __bounds__  | Initial position and window size. However if you do not define `NK_WINDOW_SCALABLE` or `NK_WINDOW_MOVABLE` you can set window position and size every frame
    /// __flags__   | Window flags defined in the nk_panel_flags section with a number of different window behaviors
    ///
    /// Returns `true(1)` if the window can be filled up with widgets from this point
    /// until `nk_end` or `false(0)` otherwise for example if minimized
    */
    public static int nk_begin(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment title, nuklear.nk_rect bounds, int flags)
    {
        try {return (int)MTD$nk_begin.invokeExact(ctx, title, bounds._ptr(), flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_begin_titled
    /// Extended window start with separated title and identifier to allow multiple
    /// windows with same title but not name
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_begin_titled(struct nk_context *ctx, const char *name, const char *title, struct nk_rect bounds, nk_flags flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Window identifier. Needs to be persistent over frames to identify the window
    /// __title__   | Window title displayed inside header if flag `NK_WINDOW_TITLE` or either `NK_WINDOW_CLOSABLE` or `NK_WINDOW_MINIMIZED` was set
    /// __bounds__  | Initial position and window size. However if you do not define `NK_WINDOW_SCALABLE` or `NK_WINDOW_MOVABLE` you can set window position and size every frame
    /// __flags__   | Window flags defined in the nk_panel_flags section with a number of different window behaviors
    ///
    /// Returns `true(1)` if the window can be filled up with widgets from this point
    /// until `nk_end` or `false(0)` otherwise for example if minimized
    */
    public static int nk_begin_titled(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment title, nuklear.nk_rect bounds, int flags)
    {
        try {return (int)MTD$nk_begin_titled.invokeExact(ctx, name, title, bounds._ptr(), flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_end
    /// Needs to be called at the end of the window building process to process scaling, scrollbars and general cleanup.
    /// All widget calls after this functions will result in asserts or no state changes
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_end(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    */
    public static void nk_end(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD$nk_end.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_find
    /// Finds and returns a window from passed name
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_window *nk_window_find(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Window identifier
    ///
    /// Returns a `nk_window` struct pointing to the identified window or NULL if
    /// no window with the given name was found
    */
    public static java.lang.foreign.MemorySegment nk_window_find(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_window_find.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_bounds
    /// Returns a rectangle with screen position and size of the currently processed window
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_window_get_bounds(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns a `nk_rect` struct with window upper left window position and size
    */
    public static nuklear.nk_rect nk_window_get_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment ctx)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_window_get_bounds.invokeExact(allocator, ctx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_position
    /// Returns the position of the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_window_get_position(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns a `nk_vec2` struct with window upper left position
    */
    public static nuklear.nk_vec2 nk_window_get_position(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment ctx)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_window_get_position.invokeExact(allocator, ctx));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_size
    /// Returns the size with width and height of the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_window_get_size(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns a `nk_vec2` struct with window width and height
    */
    public static nuklear.nk_vec2 nk_window_get_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_window_get_size.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_width
    /// Returns the width of the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// float nk_window_get_width(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns the current window width
    */
    public static float nk_window_get_width(java.lang.foreign.MemorySegment arg1)
    {
        try {return (float)MTD$nk_window_get_width.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_height
    /// Returns the height of the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// float nk_window_get_height(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns the current window height
    */
    public static float nk_window_get_height(java.lang.foreign.MemorySegment arg1)
    {
        try {return (float)MTD$nk_window_get_height.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_panel
    /// Returns the underlying panel which contains all processing state of the current window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// !!! WARNING
    ///     Do not keep the returned panel pointer around, it is only valid until `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_panel* nk_window_get_panel(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns a pointer to window internal `nk_panel` state.
    */
    public static java.lang.foreign.MemorySegment nk_window_get_panel(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_window_get_panel.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_content_region
    /// Returns the position and size of the currently visible and non-clipped space
    /// inside the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_window_get_content_region(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `nk_rect` struct with screen position and size (no scrollbar offset)
    /// of the visible space inside the current window
    */
    public static nuklear.nk_rect nk_window_get_content_region(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_window_get_content_region.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_content_region_min
    /// Returns the upper left position of the currently visible and non-clipped
    /// space inside the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_window_get_content_region_min(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// returns `nk_vec2` struct with  upper left screen position (no scrollbar offset)
    /// of the visible space inside the current window
    */
    public static nuklear.nk_vec2 nk_window_get_content_region_min(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_window_get_content_region_min.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_content_region_max
    /// Returns the lower right screen position of the currently visible and
    /// non-clipped space inside the currently processed window.
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_window_get_content_region_max(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `nk_vec2` struct with lower right screen position (no scrollbar offset)
    /// of the visible space inside the current window
    */
    public static nuklear.nk_vec2 nk_window_get_content_region_max(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_window_get_content_region_max.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_content_region_size
    /// Returns the size of the currently visible and non-clipped space inside the
    /// currently processed window
    ///
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_window_get_content_region_size(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `nk_vec2` struct with size the visible space inside the current window
    */
    public static nuklear.nk_vec2 nk_window_get_content_region_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_window_get_content_region_size.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_canvas
    /// Returns the draw command buffer. Can be used to draw custom widgets
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// !!! WARNING
    ///     Do not keep the returned command buffer pointer around it is only valid until `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_command_buffer* nk_window_get_canvas(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns a pointer to window internal `nk_command_buffer` struct used as
    /// drawing canvas. Can be used to do custom drawing.
    */
    public static java.lang.foreign.MemorySegment nk_window_get_canvas(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_window_get_canvas.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_get_scroll
    /// Gets the scroll offset for the current window
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_get_scroll(struct nk_context *ctx, nk_uint *offset_x, nk_uint *offset_y);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter    | Description
    /// -------------|-----------------------------------------------------------
    /// __ctx__      | Must point to an previously initialized `nk_context` struct
    /// __offset_x__ | A pointer to the x offset output (or NULL to ignore)
    /// __offset_y__ | A pointer to the y offset output (or NULL to ignore)
    */
    public static void nk_window_get_scroll(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment offset_x, java.lang.foreign.MemorySegment offset_y)
    {
        try {MTD$nk_window_get_scroll.invokeExact(arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_has_focus
    /// Returns if the currently processed window is currently active
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_has_focus(const struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `false(0)` if current window is not active or `true(1)` if it is
    */
    public static int nk_window_has_focus(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_window_has_focus.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_hovered
    /// Return if the current window is being hovered
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_hovered(struct nk_context *ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `true(1)` if current window is hovered or `false(0)` otherwise
    */
    public static int nk_window_is_hovered(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_window_is_hovered.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_collapsed
    /// Returns if the window with given name is currently minimized/collapsed
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_collapsed(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of window you want to check if it is collapsed
    ///
    /// Returns `true(1)` if current window is minimized and `false(0)` if window not
    /// found or is not minimized
    */
    public static int nk_window_is_collapsed(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {return (int)MTD$nk_window_is_collapsed.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_closed
    /// Returns if the window with given name was closed by calling `nk_close`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_closed(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of window you want to check if it is closed
    ///
    /// Returns `true(1)` if current window was closed or `false(0)` window not found or not closed
    */
    public static int nk_window_is_closed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_window_is_closed.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_hidden
    /// Returns if the window with given name is hidden
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_hidden(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of window you want to check if it is hidden
    ///
    /// Returns `true(1)` if current window is hidden or `false(0)` window not found or visible
    */
    public static int nk_window_is_hidden(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_window_is_hidden.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_active
    /// Same as nk_window_has_focus for some reason
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_active(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of window you want to check if it is active
    ///
    /// Returns `true(1)` if current window is active or `false(0)` window not found or not active
    */
    public static int nk_window_is_active(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_window_is_active.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_is_any_hovered
    /// Returns if the any window is being hovered
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_window_is_any_hovered(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `true(1)` if any window is hovered or `false(0)` otherwise
    */
    public static int nk_window_is_any_hovered(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_window_is_any_hovered.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_item_is_any_active
    /// Returns if the any window is being hovered or any widget is currently active.
    /// Can be used to decide if input should be processed by UI or your specific input handling.
    /// Example could be UI and 3D camera to move inside a 3D space.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_item_is_any_active(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    ///
    /// Returns `true(1)` if any window is hovered or any item is active or `false(0)` otherwise
    */
    public static int nk_item_is_any_active(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_item_is_any_active.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_set_bounds
    /// Updates position and size of window with passed in name
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_set_bounds(struct nk_context*, const char *name, struct nk_rect bounds);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to modify both position and size
    /// __bounds__  | Must point to a `nk_rect` struct with the new position and size
    */
    public static void nk_window_set_bounds(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, nuklear.nk_rect bounds)
    {
        try {MTD$nk_window_set_bounds.invokeExact(arg1, name, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_set_position
    /// Updates position of window with passed name
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_set_position(struct nk_context*, const char *name, struct nk_vec2 pos);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to modify both position
    /// __pos__     | Must point to a `nk_vec2` struct with the new position
    */
    public static void nk_window_set_position(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, nuklear.nk_vec2 pos)
    {
        try {MTD$nk_window_set_position.invokeExact(arg1, name, pos._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_set_size
    /// Updates size of window with passed in name
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_set_size(struct nk_context*, const char *name, struct nk_vec2);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to modify both window size
    /// __size__    | Must point to a `nk_vec2` struct with new window size
    */
    public static void nk_window_set_size(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, nuklear.nk_vec2 arg3)
    {
        try {MTD$nk_window_set_size.invokeExact(arg1, name, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_set_focus
    /// Sets the window with given name as active
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_set_focus(struct nk_context*, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to set focus on
    */
    public static void nk_window_set_focus(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name)
    {
        try {MTD$nk_window_set_focus.invokeExact(arg1, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_set_scroll
    /// Sets the scroll offset for the current window
    /// !!! WARNING
    ///     Only call this function between calls `nk_begin_xxx` and `nk_end`
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_set_scroll(struct nk_context *ctx, nk_uint offset_x, nk_uint offset_y);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter    | Description
    /// -------------|-----------------------------------------------------------
    /// __ctx__      | Must point to an previously initialized `nk_context` struct
    /// __offset_x__ | The x offset to scroll to
    /// __offset_y__ | The y offset to scroll to
    */
    public static void nk_window_set_scroll(java.lang.foreign.MemorySegment arg1, int offset_x, int offset_y)
    {
        try {MTD$nk_window_set_scroll.invokeExact(arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_close
    /// Closes a window and marks it for being freed at the end of the frame
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_close(struct nk_context *ctx, const char *name);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to close
    */
    public static void nk_window_close(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment name)
    {
        try {MTD$nk_window_close.invokeExact(ctx, name);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_collapse
    /// Updates collapse state of a window with given name
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_collapse(struct nk_context*, const char *name, enum nk_collapse_states state);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to close
    /// __state__   | value out of nk_collapse_states section
    */
    public static void nk_window_collapse(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int state)
    {
        try {MTD$nk_window_collapse.invokeExact(arg1, name, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_collapse_if
    /// Updates collapse state of a window with given name if given condition is met
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_collapse_if(struct nk_context*, const char *name, enum nk_collapse_states, int cond);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to either collapse or maximize
    /// __state__   | value out of nk_collapse_states section the window should be put into
    /// __cond__    | condition that has to be met to actually commit the collapse state change
    */
    public static void nk_window_collapse_if(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int arg3, int cond)
    {
        try {MTD$nk_window_collapse_if.invokeExact(arg1, name, arg3, cond);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_show
    /// updates visibility state of a window with given name
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_show(struct nk_context*, const char *name, enum nk_show_states);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to either collapse or maximize
    /// __state__   | state with either visible or hidden to modify the window with
    */
    public static void nk_window_show(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int arg3)
    {
        try {MTD$nk_window_show.invokeExact(arg1, name, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_show_if
    /// Updates visibility state of a window with given name if a given condition is met
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_window_show_if(struct nk_context*, const char *name, enum nk_show_states, int cond);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __name__    | Identifier of the window to either hide or show
    /// __state__   | state with either visible or hidden to modify the window with
    /// __cond__    | condition that has to be met to actually commit the visibility state change
    */
    public static void nk_window_show_if(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int arg3, int cond)
    {
        try {MTD$nk_window_show_if.invokeExact(arg1, name, arg3, cond);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_window_show_if
    /// Line for visual separation. Draws a line with thickness determined by the current row height.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_rule_horizontal(struct nk_context *ctx, struct nk_color color, NK_BOOL rounding)
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter       | Description
    /// ----------------|-------------------------------------------------------
    /// __ctx__         | Must point to an previously initialized `nk_context` struct
    /// __color__       | Color of the horizontal line
    /// __rounding__    | Whether or not to make the line round
    */
    public static void nk_rule_horizontal(java.lang.foreign.MemorySegment ctx, nuklear.nk_color color, int rounding)
    {
        try {MTD$nk_rule_horizontal.invokeExact(ctx, color._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_set_min_row_height
    /// Sets the currently used minimum row height.
    /// !!! WARNING
    ///     The passed height needs to include both your preferred row height
    ///     as well as padding. No internal padding is added.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_set_min_row_height(struct nk_context*, float height);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __height__  | New minimum row height to be used for auto generating the row height
    */
    public static void nk_layout_set_min_row_height(java.lang.foreign.MemorySegment arg1, float height)
    {
        try {MTD$nk_layout_set_min_row_height.invokeExact(arg1, height);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_reset_min_row_height
    /// Reset the currently used minimum row height back to `font_height + text_padding + padding`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_reset_min_row_height(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    */
    public static void nk_layout_reset_min_row_height(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_layout_reset_min_row_height.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_widget_bounds
    /// Returns the width of the next row allocate by one of the layouting functions
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_layout_widget_bounds(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    ///
    /// Return `nk_rect` with both position and size of the next row
    */
    public static nuklear.nk_rect nk_layout_widget_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_layout_widget_bounds.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_ratio_from_pixel
    /// Utility functions to calculate window ratio from pixel size
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// float nk_layout_ratio_from_pixel(struct nk_context*, float pixel_width);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __pixel__   | Pixel_width to convert to window ratio
    ///
    /// Returns `nk_rect` with both position and size of the next row
    */
    public static float nk_layout_ratio_from_pixel(java.lang.foreign.MemorySegment arg1, float pixel_width)
    {
        try {return (float)MTD$nk_layout_ratio_from_pixel.invokeExact(arg1, pixel_width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_dynamic
    /// Sets current row layout to share horizontal space
    /// between @cols number of widgets evenly. Once called all subsequent widget
    /// calls greater than @cols will allocate a new row with same layout.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_dynamic(struct nk_context *ctx, float height, int cols);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    /// __columns__ | Number of widget inside row
    */
    public static void nk_layout_row_dynamic(java.lang.foreign.MemorySegment ctx, float height, int cols)
    {
        try {MTD$nk_layout_row_dynamic.invokeExact(ctx, height, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_static
    /// Sets current row layout to fill @cols number of widgets
    /// in row with same @item_width horizontal size. Once called all subsequent widget
    /// calls greater than @cols will allocate a new row with same layout.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_static(struct nk_context *ctx, float height, int item_width, int cols);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    /// __width__   | Holds pixel width of each widget in the row
    /// __columns__ | Number of widget inside row
    */
    public static void nk_layout_row_static(java.lang.foreign.MemorySegment ctx, float height, int item_width, int cols)
    {
        try {MTD$nk_layout_row_static.invokeExact(ctx, height, item_width, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_begin
    /// Starts a new dynamic or fixed row with given height and columns.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_begin(struct nk_context *ctx, enum nk_layout_format fmt, float row_height, int cols);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __fmt__     | either `NK_DYNAMIC` for window ratio or `NK_STATIC` for fixed size columns
    /// __height__  | holds height of each widget in row or zero for auto layouting
    /// __columns__ | Number of widget inside row
    */
    public static void nk_layout_row_begin(java.lang.foreign.MemorySegment ctx, int fmt, float row_height, int cols)
    {
        try {MTD$nk_layout_row_begin.invokeExact(ctx, fmt, row_height, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_push
    /// Specifies either window ratio or width of a single column
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_push(struct nk_context*, float value);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __value__   | either a window ratio or fixed width depending on @fmt in previous `nk_layout_row_begin` call
    */
    public static void nk_layout_row_push(java.lang.foreign.MemorySegment arg1, float value)
    {
        try {MTD$nk_layout_row_push.invokeExact(arg1, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_end
    /// Finished previously started row
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_end(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    */
    public static void nk_layout_row_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_layout_row_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row
    /// Specifies row columns in array as either window ratio or size
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row(struct nk_context*, enum nk_layout_format, float height, int cols, const float *ratio);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __fmt__     | Either `NK_DYNAMIC` for window ratio or `NK_STATIC` for fixed size columns
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    /// __columns__ | Number of widget inside row
    */
    public static void nk_layout_row(java.lang.foreign.MemorySegment arg1, int arg2, float height, int cols, java.lang.foreign.MemorySegment ratio)
    {
        try {MTD$nk_layout_row.invokeExact(arg1, arg2, height, cols, ratio);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_template_begin
    /// Begins the row template declaration
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_template_begin(struct nk_context*, float row_height);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    */
    public static void nk_layout_row_template_begin(java.lang.foreign.MemorySegment arg1, float row_height)
    {
        try {MTD$nk_layout_row_template_begin.invokeExact(arg1, row_height);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_template_push_dynamic
    /// Adds a dynamic column that dynamically grows and can go to zero if not enough space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_template_push_dynamic(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    */
    public static void nk_layout_row_template_push_dynamic(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_layout_row_template_push_dynamic.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_template_push_variable
    /// Adds a variable column that dynamically grows but does not shrink below specified pixel width
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_template_push_variable(struct nk_context*, float min_width);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __width__   | Holds the minimum pixel width the next column must always be
    */
    public static void nk_layout_row_template_push_variable(java.lang.foreign.MemorySegment arg1, float min_width)
    {
        try {MTD$nk_layout_row_template_push_variable.invokeExact(arg1, min_width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_template_push_static
    /// Adds a static column that does not grow and will always have the same size
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_template_push_static(struct nk_context*, float width);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __width__   | Holds the absolute pixel width value the next column must be
    */
    public static void nk_layout_row_template_push_static(java.lang.foreign.MemorySegment arg1, float width)
    {
        try {MTD$nk_layout_row_template_push_static.invokeExact(arg1, width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_row_template_end
    /// Marks the end of the row template
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_row_template_end(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    */
    public static void nk_layout_row_template_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_layout_row_template_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_begin
    /// Begins a new layouting space that allows to specify each widgets position and size.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_space_begin(struct nk_context*, enum nk_layout_format, float height, int widget_count);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_begin_xxx`
    /// __fmt__     | Either `NK_DYNAMIC` for window ratio or `NK_STATIC` for fixed size columns
    /// __height__  | Holds height of each widget in row or zero for auto layouting
    /// __columns__ | Number of widgets inside row
    */
    public static void nk_layout_space_begin(java.lang.foreign.MemorySegment arg1, int arg2, float height, int widget_count)
    {
        try {MTD$nk_layout_space_begin.invokeExact(arg1, arg2, height, widget_count);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_push
    /// Pushes position and size of the next widget in own coordinate space either as pixel or ratio
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_space_push(struct nk_context *ctx, struct nk_rect bounds);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    /// __bounds__  | Position and size in laoyut space local coordinates
    */
    public static void nk_layout_space_push(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect bounds)
    {
        try {MTD$nk_layout_space_push.invokeExact(arg1, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_end
    /// Marks the end of the layout space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_layout_space_end(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    */
    public static void nk_layout_space_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_layout_space_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_bounds
    /// Utility function to calculate total space allocated for `nk_layout_space`
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_layout_space_bounds(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    ///
    /// Returns `nk_rect` holding the total space allocated
    */
    public static nuklear.nk_rect nk_layout_space_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_layout_space_bounds.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_to_screen
    /// Converts vector from nk_layout_space coordinate space into screen space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_layout_space_to_screen(struct nk_context*, struct nk_vec2);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    /// __vec__     | Position to convert from layout space into screen coordinate space
    ///
    /// Returns transformed `nk_vec2` in screen space coordinates
    */
    public static nuklear.nk_vec2 nk_layout_space_to_screen(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 arg2)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_layout_space_to_screen.invokeExact(allocator, arg1, arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_to_local
    /// Converts vector from layout space into screen space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_vec2 nk_layout_space_to_local(struct nk_context*, struct nk_vec2);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    /// __vec__     | Position to convert from screen space into layout coordinate space
    ///
    /// Returns transformed `nk_vec2` in layout space coordinates
    */
    public static nuklear.nk_vec2 nk_layout_space_to_local(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 arg2)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_layout_space_to_local.invokeExact(allocator, arg1, arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_rect_to_screen
    /// Converts rectangle from screen space into layout space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_layout_space_rect_to_screen(struct nk_context*, struct nk_rect);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    /// __bounds__  | Rectangle to convert from layout space into screen space
    ///
    /// Returns transformed `nk_rect` in screen space coordinates
    */
    public static nuklear.nk_rect nk_layout_space_rect_to_screen(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_layout_space_rect_to_screen.invokeExact(allocator, arg1, arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_layout_space_rect_to_local
    /// Converts rectangle from layout space into screen space
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_rect nk_layout_space_rect_to_local(struct nk_context*, struct nk_rect);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    /// __bounds__  | Rectangle to convert from layout space into screen space
    ///
    /// Returns transformed `nk_rect` in layout space coordinates
    */
    public static nuklear.nk_rect nk_layout_space_rect_to_local(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_layout_space_rect_to_local.invokeExact(allocator, arg1, arg2._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_spacer
    /// Spacer is a dummy widget that consumes space as usual but doesn't draw anything
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_spacer(struct nk_context* );
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after call `nk_layout_space_begin`
    ///
    */
    public static void nk_spacer(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_spacer.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  GROUP
     *
     * =============================================================================
    /// ### Groups
    /// Groups are basically windows inside windows. They allow to subdivide space
    /// in a window to layout widgets as a group. Almost all more complex widget
    /// layouting requirements can be solved using groups and basic layouting
    /// fuctionality. Groups just like windows are identified by an unique name and
    /// internally keep track of scrollbar offsets by default. However additional
    /// versions are provided to directly manage the scrollbar.
    ///
    /// #### Usage
    /// To create a group you have to call one of the three `nk_group_begin_xxx`
    /// functions to start group declarations and `nk_group_end` at the end. Furthermore it
    /// is required to check the return value of `nk_group_begin_xxx` and only process
    /// widgets inside the window if the value is not 0.
    /// Nesting groups is possible and even encouraged since many layouting schemes
    /// can only be achieved by nesting. Groups, unlike windows, need `nk_group_end`
    /// to be only called if the corresponding `nk_group_begin_xxx` call does not return 0:
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// if (nk_group_begin_xxx(ctx, ...) {
    ///     // [... widgets ...]
    ///     nk_group_end(ctx);
    /// }
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// In the grand concept groups can be called after starting a window
    /// with `nk_begin_xxx` and before calling `nk_end`:
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// struct nk_context ctx;
    /// nk_init_xxx(&ctx, ...);
    /// while (1) {
    ///     // Input
    ///     Event evt;
    ///     nk_input_begin(&ctx);
    ///     while (GetEvent(&evt)) {
    ///         if (evt.type == MOUSE_MOVE)
    ///             nk_input_motion(&ctx, evt.motion.x, evt.motion.y);
    ///         else if (evt.type == [...]) {
    ///             nk_input_xxx(...);
    ///         }
    ///     }
    ///     nk_input_end(&ctx);
    ///     //
    ///     // Window
    ///     if (nk_begin_xxx(...) {
    ///         // [...widgets...]
    ///         nk_layout_row_dynamic(...);
    ///         if (nk_group_begin_xxx(ctx, ...) {
    ///             //[... widgets ...]
    ///             nk_group_end(ctx);
    ///         }
    ///     }
    ///     nk_end(ctx);
    ///     //
    ///     // Draw
    ///     const struct nk_command *cmd = 0;
    ///     nk_foreach(cmd, &ctx) {
    ///     switch (cmd->type) {
    ///     case NK_COMMAND_LINE:
    ///         your_draw_line_function(...)
    ///         break;
    ///     case NK_COMMAND_RECT
    ///         your_draw_rect_function(...)
    ///         break;
    ///     case ...:
    ///         // [...]
    ///     }
    ///     nk_clear(&ctx);
    /// }
    /// nk_free(&ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /// #### Reference
    /// Function                        | Description
    /// --------------------------------|-------------------------------------------
    /// nk_group_begin                  | Start a new group with internal scrollbar handling
    /// nk_group_begin_titled           | Start a new group with separated name and title and internal scrollbar handling
    /// nk_group_end                    | Ends a group. Should only be called if nk_group_begin returned non-zero
    /// nk_group_scrolled_offset_begin  | Start a new group with manual separated handling of scrollbar x- and y-offset
    /// nk_group_scrolled_begin         | Start a new group with manual scrollbar handling
    /// nk_group_scrolled_end           | Ends a group with manual scrollbar handling. Should only be called if nk_group_begin returned non-zero
    /// nk_group_get_scroll             | Gets the scroll offset for the given group
    /// nk_group_set_scroll             | Sets the scroll offset for the given group
    */
    /*/// #### nk_group_begin
    /// Starts a new widget group. Requires a previous layouting function to specify a pos/size.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_group_begin(struct nk_context*, const char *title, nk_flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __title__   | Must be an unique identifier for this group that is also used for the group header
    /// __flags__   | Window flags defined in the nk_panel_flags section with a number of different group behaviors
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_group_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment title, int arg3)
    {
        try {return (int)MTD$nk_group_begin.invokeExact(arg1, title, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_begin_titled
    /// Starts a new widget group. Requires a previous layouting function to specify a pos/size.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_group_begin_titled(struct nk_context*, const char *name, const char *title, nk_flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __id__      | Must be an unique identifier for this group
    /// __title__   | Group header title
    /// __flags__   | Window flags defined in the nk_panel_flags section with a number of different group behaviors
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_group_begin_titled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, java.lang.foreign.MemorySegment title, int arg4)
    {
        try {return (int)MTD$nk_group_begin_titled.invokeExact(arg1, name, title, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_end
    /// Ends a widget group
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_group_end(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    */
    public static void nk_group_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_group_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_scrolled_offset_begin
    /// starts a new widget group. requires a previous layouting function to specify
    /// a size. Does not keep track of scrollbar.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_group_scrolled_offset_begin(struct nk_context*, nk_uint *x_offset, nk_uint *y_offset, const char *title, nk_flags flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __x_offset__| Scrollbar x-offset to offset all widgets inside the group horizontally.
    /// __y_offset__| Scrollbar y-offset to offset all widgets inside the group vertically
    /// __title__   | Window unique group title used to both identify and display in the group header
    /// __flags__   | Window flags from the nk_panel_flags section
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_group_scrolled_offset_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment x_offset, java.lang.foreign.MemorySegment y_offset, java.lang.foreign.MemorySegment title, int flags)
    {
        try {return (int)MTD$nk_group_scrolled_offset_begin.invokeExact(arg1, x_offset, y_offset, title, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_scrolled_begin
    /// Starts a new widget group. requires a previous
    /// layouting function to specify a size. Does not keep track of scrollbar.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_group_scrolled_begin(struct nk_context*, struct nk_scroll *off, const char *title, nk_flags);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __off__     | Both x- and y- scroll offset. Allows for manual scrollbar control
    /// __title__   | Window unique group title used to both identify and display in the group header
    /// __flags__   | Window flags from nk_panel_flags section
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_group_scrolled_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment off, java.lang.foreign.MemorySegment title, int arg4)
    {
        try {return (int)MTD$nk_group_scrolled_begin.invokeExact(arg1, off, title, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_scrolled_end
    /// Ends a widget group after calling nk_group_scrolled_offset_begin or nk_group_scrolled_begin.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_group_scrolled_end(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    */
    public static void nk_group_scrolled_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_group_scrolled_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_get_scroll
    /// Gets the scroll position of the given group.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_group_get_scroll(struct nk_context*, const char *id, nk_uint *x_offset, nk_uint *y_offset);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter    | Description
    /// -------------|-----------------------------------------------------------
    /// __ctx__      | Must point to an previously initialized `nk_context` struct
    /// __id__       | The id of the group to get the scroll position of
    /// __x_offset__ | A pointer to the x offset output (or NULL to ignore)
    /// __y_offset__ | A pointer to the y offset output (or NULL to ignore)
    */
    public static void nk_group_get_scroll(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment id, java.lang.foreign.MemorySegment x_offset, java.lang.foreign.MemorySegment y_offset)
    {
        try {MTD$nk_group_get_scroll.invokeExact(arg1, id, x_offset, y_offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_group_set_scroll
    /// Sets the scroll position of the given group.
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_group_set_scroll(struct nk_context*, const char *id, nk_uint x_offset, nk_uint y_offset);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter    | Description
    /// -------------|-----------------------------------------------------------
    /// __ctx__      | Must point to an previously initialized `nk_context` struct
    /// __id__       | The id of the group to scroll
    /// __x_offset__ | The x offset to scroll to
    /// __y_offset__ | The y offset to scroll to
    */
    public static void nk_group_set_scroll(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment id, int x_offset, int y_offset)
    {
        try {MTD$nk_group_set_scroll.invokeExact(arg1, id, x_offset, y_offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_push_hashed
    /// Start a collapsible UI section with internal state management with full
    /// control over internal unique ID used to store state
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_tree_push_hashed(struct nk_context*, enum nk_tree_type, const char *title, enum nk_collapse_states initial_state, const char *hash, int len,int seed);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __type__    | Value from the nk_tree_type section to visually mark a tree node header as either a collapseable UI section or tree node
    /// __title__   | Label printed in the tree header
    /// __state__   | Initial tree state value out of nk_collapse_states
    /// __hash__    | Memory block or string to generate the ID from
    /// __len__     | Size of passed memory block or string in __hash__
    /// __seed__    | Seeding value if this function is called in a loop or default to `0`
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_tree_push_hashed(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD$nk_tree_push_hashed.invokeExact(arg1, arg2, title, initial_state, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_image_push_hashed
    /// Start a collapsible UI section with internal state management with full
    /// control over internal unique ID used to store state
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_tree_image_push_hashed(struct nk_context*, enum nk_tree_type, struct nk_image, const char *title, enum nk_collapse_states initial_state, const char *hash, int len,int seed);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct
    /// __type__    | Value from the nk_tree_type section to visually mark a tree node header as either a collapseable UI section or tree node
    /// __img__     | Image to display inside the header on the left of the label
    /// __title__   | Label printed in the tree header
    /// __state__   | Initial tree state value out of nk_collapse_states
    /// __hash__    | Memory block or string to generate the ID from
    /// __len__     | Size of passed memory block or string in __hash__
    /// __seed__    | Seeding value if this function is called in a loop or default to `0`
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_tree_image_push_hashed(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_image arg3, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD$nk_tree_image_push_hashed.invokeExact(arg1, arg2, arg3._ptr(), title, initial_state, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_pop
    /// Ends a collapsabale UI section
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_tree_pop(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after calling `nk_tree_xxx_push_xxx`
    */
    public static void nk_tree_pop(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_tree_pop.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_state_push
    /// Start a collapsible UI section with external state management
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_tree_state_push(struct nk_context*, enum nk_tree_type, const char *title, enum nk_collapse_states *state);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after calling `nk_tree_xxx_push_xxx`
    /// __type__    | Value from the nk_tree_type section to visually mark a tree node header as either a collapseable UI section or tree node
    /// __title__   | Label printed in the tree header
    /// __state__   | Persistent state to update
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_tree_state_push(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment title, java.lang.foreign.MemorySegment state)
    {
        try {return (int)MTD$nk_tree_state_push.invokeExact(arg1, arg2, title, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_state_image_push
    /// Start a collapsible UI section with image and label header and external state management
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// nk_bool nk_tree_state_image_push(struct nk_context*, enum nk_tree_type, struct nk_image, const char *title, enum nk_collapse_states *state);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after calling `nk_tree_xxx_push_xxx`
    /// __img__     | Image to display inside the header on the left of the label
    /// __type__    | Value from the nk_tree_type section to visually mark a tree node header as either a collapseable UI section or tree node
    /// __title__   | Label printed in the tree header
    /// __state__   | Persistent state to update
    ///
    /// Returns `true(1)` if visible and fillable with widgets or `false(0)` otherwise
    */
    public static int nk_tree_state_image_push(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_image arg3, java.lang.foreign.MemorySegment title, java.lang.foreign.MemorySegment state)
    {
        try {return (int)MTD$nk_tree_state_image_push.invokeExact(arg1, arg2, arg3._ptr(), title, state);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_tree_state_pop
    /// Ends a collapsabale UI section
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_tree_state_pop(struct nk_context*);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter   | Description
    /// ------------|-----------------------------------------------------------
    /// __ctx__     | Must point to an previously initialized `nk_context` struct after calling `nk_tree_xxx_push_xxx`
    */
    public static void nk_tree_state_pop(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_tree_state_pop.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_tree_element_push_hashed(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment selected, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD$nk_tree_element_push_hashed.invokeExact(arg1, arg2, title, initial_state, selected, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_tree_element_image_push_hashed(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_image arg3, java.lang.foreign.MemorySegment title, int initial_state, java.lang.foreign.MemorySegment selected, java.lang.foreign.MemorySegment hash, int len, int seed)
    {
        try {return (int)MTD$nk_tree_element_image_push_hashed.invokeExact(arg1, arg2, arg3._ptr(), title, initial_state, selected, hash, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_tree_element_pop(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_tree_element_pop.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_list_view_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment out, java.lang.foreign.MemorySegment id, int arg4, int row_height, int row_count)
    {
        try {return (int)MTD$nk_list_view_begin.invokeExact(arg1, out, id, arg4, row_height, row_count);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_list_view_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_list_view_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_widget(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_widget.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_widget_fitting(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_vec2 arg3)
    {
        try {return (int)MTD$nk_widget_fitting.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_widget_bounds(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_widget_bounds.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_widget_position(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_widget_position.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_widget_size(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_widget_size.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static float nk_widget_width(java.lang.foreign.MemorySegment arg1)
    {
        try {return (float)MTD$nk_widget_width.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static float nk_widget_height(java.lang.foreign.MemorySegment arg1)
    {
        try {return (float)MTD$nk_widget_height.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_widget_is_hovered(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_widget_is_hovered.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_widget_is_mouse_clicked(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_widget_is_mouse_clicked.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_widget_has_mouse_click_down(java.lang.foreign.MemorySegment arg1, int arg2, int down)
    {
        try {return (int)MTD$nk_widget_has_mouse_click_down.invokeExact(arg1, arg2, down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_spacing(java.lang.foreign.MemorySegment arg1, int cols)
    {
        try {MTD$nk_spacing.invokeExact(arg1, cols);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_widget_disable_begin(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD$nk_widget_disable_begin.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_widget_disable_end(java.lang.foreign.MemorySegment ctx)
    {
        try {MTD$nk_widget_disable_end.invokeExact(ctx);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int arg4)
    {
        try {MTD$nk_text.invokeExact(arg1, arg2, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_text_colored(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int arg4, nuklear.nk_color arg5)
    {
        try {MTD$nk_text_colored.invokeExact(arg1, arg2, arg3, arg4, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_text_wrap(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {MTD$nk_text_wrap.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_text_wrap_colored(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, nuklear.nk_color arg4)
    {
        try {MTD$nk_text_wrap_colored.invokeExact(arg1, arg2, arg3, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align)
    {
        try {MTD$nk_label.invokeExact(arg1, arg2, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_label_colored(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, nuklear.nk_color arg4)
    {
        try {MTD$nk_label_colored.invokeExact(arg1, arg2, align, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_label_wrap(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_label_wrap.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_label_colored_wrap(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_color arg3)
    {
        try {MTD$nk_label_colored_wrap.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_image(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2)
    {
        try {MTD$nk_image.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_image_color(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, nuklear.nk_color arg3)
    {
        try {MTD$nk_image_color.invokeExact(arg1, arg2._ptr(), arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  BUTTON
     *
     * ============================================================================= */
    public static int nk_button_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment title, int len)
    {
        try {return (int)MTD$nk_button_text.invokeExact(arg1, title, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment title)
    {
        try {return (int)MTD$nk_button_label.invokeExact(arg1, title);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_color(java.lang.foreign.MemorySegment arg1, nuklear.nk_color arg2)
    {
        try {return (int)MTD$nk_button_color.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_button_symbol.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image(java.lang.foreign.MemorySegment arg1, nuklear.nk_image img)
    {
        try {return (int)MTD$nk_button_image.invokeExact(arg1, img._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int text_alignment)
    {
        try {return (int)MTD$nk_button_symbol_label.invokeExact(arg1, arg2, arg3, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_button_symbol_text.invokeExact(arg1, arg2, arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image img, java.lang.foreign.MemorySegment arg3, int text_alignment)
    {
        try {return (int)MTD$nk_button_image_label.invokeExact(arg1, img._ptr(), arg3, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image img, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_button_image_text.invokeExact(arg1, img._ptr(), arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_text_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment title, int len)
    {
        try {return (int)MTD$nk_button_text_styled.invokeExact(arg1, arg2, title, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_label_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment title)
    {
        try {return (int)MTD$nk_button_label_styled.invokeExact(arg1, arg2, title);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_button_symbol_styled.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_image img)
    {
        try {return (int)MTD$nk_button_image_styled.invokeExact(arg1, arg2, img._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol_text_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, java.lang.foreign.MemorySegment arg4, int arg5, int alignment)
    {
        try {return (int)MTD$nk_button_symbol_text_styled.invokeExact(arg1, arg2, arg3, arg4, arg5, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_symbol_label_styled(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment style, int symbol, java.lang.foreign.MemorySegment title, int align)
    {
        try {return (int)MTD$nk_button_symbol_label_styled.invokeExact(ctx, style, symbol, title, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image_label_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_image img, java.lang.foreign.MemorySegment arg4, int text_alignment)
    {
        try {return (int)MTD$nk_button_image_label_styled.invokeExact(arg1, arg2, img._ptr(), arg4, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_image_text_styled(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_image img, java.lang.foreign.MemorySegment arg4, int arg5, int alignment)
    {
        try {return (int)MTD$nk_button_image_text_styled.invokeExact(arg1, arg2, img._ptr(), arg4, arg5, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_button_set_behavior(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {MTD$nk_button_set_behavior.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_push_behavior(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_button_push_behavior.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_button_pop_behavior(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_button_pop_behavior.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  CHECKBOX
     *
     * ============================================================================= */
    public static int nk_check_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int active)
    {
        try {return (int)MTD$nk_check_label.invokeExact(arg1, arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_check_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int active)
    {
        try {return (int)MTD$nk_check_text.invokeExact(arg1, arg2, arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_check_text_align(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_check_text_align.invokeExact(arg1, arg2, arg3, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_check_flags_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int flags, int value)
    {
        try {return (int)MTD$nk_check_flags_label.invokeExact(arg1, arg2, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_check_flags_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int flags, int value)
    {
        try {return (int)MTD$nk_check_flags_text.invokeExact(arg1, arg2, arg3, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD$nk_checkbox_label.invokeExact(arg1, arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_checkbox_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD$nk_checkbox_text.invokeExact(arg1, arg2, arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_checkbox_text_align.invokeExact(ctx, text, len, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_flags_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment flags, int value)
    {
        try {return (int)MTD$nk_checkbox_flags_label.invokeExact(arg1, arg2, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_checkbox_flags_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, java.lang.foreign.MemorySegment flags, int value)
    {
        try {return (int)MTD$nk_checkbox_flags_text.invokeExact(arg1, arg2, arg3, flags, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  RADIO BUTTON
     *
     * ============================================================================= */
    public static int nk_radio_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD$nk_radio_label.invokeExact(arg1, arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_radio_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_radio_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_radio_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, java.lang.foreign.MemorySegment active)
    {
        try {return (int)MTD$nk_radio_text.invokeExact(arg1, arg2, arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_radio_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_radio_text_align.invokeExact(ctx, text, len, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_option_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int active)
    {
        try {return (int)MTD$nk_option_label.invokeExact(arg1, arg2, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_option_label_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment label, int active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_option_label_align.invokeExact(ctx, label, active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_option_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int active)
    {
        try {return (int)MTD$nk_option_text.invokeExact(arg1, arg2, arg3, active);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_option_text_align(java.lang.foreign.MemorySegment ctx, java.lang.foreign.MemorySegment text, int len, int is_active, int widget_alignment, int text_alignment)
    {
        try {return (int)MTD$nk_option_text_align.invokeExact(ctx, text, len, is_active, widget_alignment, text_alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  SELECTABLE
     *
     * ============================================================================= */
    public static int nk_selectable_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_label.invokeExact(arg1, arg2, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_selectable_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_text.invokeExact(arg1, arg2, arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_selectable_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_image_label.invokeExact(arg1, arg2._ptr(), arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_selectable_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int arg4, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_image_text.invokeExact(arg1, arg2._ptr(), arg3, arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_selectable_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_symbol_label.invokeExact(arg1, arg2, arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_selectable_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int align, java.lang.foreign.MemorySegment value)
    {
        try {return (int)MTD$nk_selectable_symbol_text.invokeExact(arg1, arg2, arg3, arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, int value)
    {
        try {return (int)MTD$nk_select_label.invokeExact(arg1, arg2, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align, int value)
    {
        try {return (int)MTD$nk_select_text.invokeExact(arg1, arg2, arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int align, int value)
    {
        try {return (int)MTD$nk_select_image_label.invokeExact(arg1, arg2._ptr(), arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int arg4, int align, int value)
    {
        try {return (int)MTD$nk_select_image_text.invokeExact(arg1, arg2._ptr(), arg3, arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int align, int value)
    {
        try {return (int)MTD$nk_select_symbol_label.invokeExact(arg1, arg2, arg3, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_select_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int align, int value)
    {
        try {return (int)MTD$nk_select_symbol_text.invokeExact(arg1, arg2, arg3, arg4, align, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  SLIDER
     *
     * ============================================================================= */
    public static float nk_slide_float(java.lang.foreign.MemorySegment arg1, float min, float val, float max, float step)
    {
        try {return (float)MTD$nk_slide_float.invokeExact(arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_slide_int(java.lang.foreign.MemorySegment arg1, int min, int val, int max, int step)
    {
        try {return (int)MTD$nk_slide_int.invokeExact(arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_slider_float(java.lang.foreign.MemorySegment arg1, float min, java.lang.foreign.MemorySegment val, float max, float step)
    {
        try {return (int)MTD$nk_slider_float.invokeExact(arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_slider_int(java.lang.foreign.MemorySegment arg1, int min, java.lang.foreign.MemorySegment val, int max, int step)
    {
        try {return (int)MTD$nk_slider_int.invokeExact(arg1, min, val, max, step);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  PROGRESSBAR
     *
     * ============================================================================= */
    public static int nk_progress(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment cur, long max, int modifyable)
    {
        try {return (int)MTD$nk_progress.invokeExact(arg1, cur, max, modifyable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static long nk_prog(java.lang.foreign.MemorySegment arg1, long cur, long max, int modifyable)
    {
        try {return (long)MTD$nk_prog.invokeExact(arg1, cur, max, modifyable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  COLOR PICKER
     *
     * ============================================================================= */
    public static nuklear.nk_colorf nk_color_picker(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, nuklear.nk_colorf arg2, int arg3)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD$nk_color_picker.invokeExact(allocator, arg1, arg2._ptr(), arg3));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_color_pick(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_color_pick.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  PROPERTIES
     *
     * =============================================================================
    /// ### Properties
    /// Properties are the main value modification widgets in Nuklear. Changing a value
    /// can be achieved by dragging, adding/removing incremental steps on button click
    /// or by directly typing a number.
    ///
    /// #### Usage
    /// Each property requires a unique name for identification that is also used for
    /// displaying a label. If you want to use the same name multiple times make sure
    /// add a '#' before your name. The '#' will not be shown but will generate a
    /// unique ID. Each property also takes in a minimum and maximum value. If you want
    /// to make use of the complete number range of a type just use the provided
    /// type limits from `limits.h`. For example `INT_MIN` and `INT_MAX` for
    /// `nk_property_int` and `nk_propertyi`. In additional each property takes in
    /// a increment value that will be added or subtracted if either the increment
    /// decrement button is clicked. Finally there is a value for increment per pixel
    /// dragged that is added or subtracted from the value.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// int value = 0;
    /// struct nk_context ctx;
    /// nk_init_xxx(&ctx, ...);
    /// while (1) {
    ///     // Input
    ///     Event evt;
    ///     nk_input_begin(&ctx);
    ///     while (GetEvent(&evt)) {
    ///         if (evt.type == MOUSE_MOVE)
    ///             nk_input_motion(&ctx, evt.motion.x, evt.motion.y);
    ///         else if (evt.type == [...]) {
    ///             nk_input_xxx(...);
    ///         }
    ///     }
    ///     nk_input_end(&ctx);
    ///     //
    ///     // Window
    ///     if (nk_begin_xxx(...) {
    ///         // Property
    ///         nk_layout_row_dynamic(...);
    ///         nk_property_int(ctx, "ID", INT_MIN, &value, INT_MAX, 1, 1);
    ///     }
    ///     nk_end(ctx);
    ///     //
    ///     // Draw
    ///     const struct nk_command *cmd = 0;
    ///     nk_foreach(cmd, &ctx) {
    ///     switch (cmd->type) {
    ///     case NK_COMMAND_LINE:
    ///         your_draw_line_function(...)
    ///         break;
    ///     case NK_COMMAND_RECT
    ///         your_draw_rect_function(...)
    ///         break;
    ///     case ...:
    ///         // [...]
    ///     }
    ///     nk_clear(&ctx);
    /// }
    /// nk_free(&ctx);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// #### Reference
    /// Function            | Description
    /// --------------------|-------------------------------------------
    /// nk_property_int     | Integer property directly modifying a passed in value
    /// nk_property_float   | Float property directly modifying a passed in value
    /// nk_property_double  | Double property directly modifying a passed in value
    /// nk_propertyi        | Integer property returning the modified int value
    /// nk_propertyf        | Float property returning the modified float value
    /// nk_propertyd        | Double property returning the modified double value
    ///
    */
    /*/// #### nk_property_int
    /// Integer property directly modifying a passed in value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_property_int(struct nk_context *ctx, const char *name, int min, int *val, int max, int step, float inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Integer pointer to be modified
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    */
    public static void nk_property_int(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int min, java.lang.foreign.MemorySegment val, int max, int step, float inc_per_pixel)
    {
        try {MTD$nk_property_int.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_property_float
    /// Float property directly modifying a passed in value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_property_float(struct nk_context *ctx, const char *name, float min, float *val, float max, float step, float inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Float pointer to be modified
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    */
    public static void nk_property_float(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, float min, java.lang.foreign.MemorySegment val, float max, float step, float inc_per_pixel)
    {
        try {MTD$nk_property_float.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_property_double
    /// Double property directly modifying a passed in value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// void nk_property_double(struct nk_context *ctx, const char *name, double min, double *val, double max, double step, double inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Double pointer to be modified
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    */
    public static void nk_property_double(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, double min, java.lang.foreign.MemorySegment val, double max, double step, float inc_per_pixel)
    {
        try {MTD$nk_property_double.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_propertyi
    /// Integer property modifying a passed in value and returning the new value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// int nk_propertyi(struct nk_context *ctx, const char *name, int min, int val, int max, int step, float inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Current integer value to be modified and returned
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    ///
    /// Returns the new modified integer value
    */
    public static int nk_propertyi(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, int min, int val, int max, int step, float inc_per_pixel)
    {
        try {return (int)MTD$nk_propertyi.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_propertyf
    /// Float property modifying a passed in value and returning the new value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// float nk_propertyf(struct nk_context *ctx, const char *name, float min, float val, float max, float step, float inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Current float value to be modified and returned
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    ///
    /// Returns the new modified float value
    */
    public static float nk_propertyf(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, float min, float val, float max, float step, float inc_per_pixel)
    {
        try {return (float)MTD$nk_propertyf.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /*/// #### nk_propertyd
    /// Float property modifying a passed in value and returning the new value
    /// !!! WARNING
    ///     To generate a unique property ID using the same label make sure to insert
    ///     a `#` at the beginning. It will not be shown but guarantees correct behavior.
    ///
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~c
    /// float nk_propertyd(struct nk_context *ctx, const char *name, double min, double val, double max, double step, double inc_per_pixel);
    /// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ///
    /// Parameter           | Description
    /// --------------------|-----------------------------------------------------------
    /// __ctx__             | Must point to an previously initialized `nk_context` struct after calling a layouting function
    /// __name__            | String used both as a label as well as a unique identifier
    /// __min__             | Minimum value not allowed to be underflown
    /// __val__             | Current double value to be modified and returned
    /// __max__             | Maximum value not allowed to be overflown
    /// __step__            | Increment added and subtracted on increment and decrement button
    /// __inc_per_pixel__   | Value per pixel added or subtracted on dragging
    ///
    /// Returns the new modified double value
    */
    public static double nk_propertyd(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment name, double min, double val, double max, double step, float inc_per_pixel)
    {
        try {return (double)MTD$nk_propertyd.invokeExact(arg1, name, min, val, max, step, inc_per_pixel);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_edit_string(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment buffer, java.lang.foreign.MemorySegment len, int max, java.lang.foreign.MemorySegment arg6)
    {
        try {return (int)MTD$nk_edit_string.invokeExact(arg1, arg2, buffer, len, max, arg6);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_edit_string_zero_terminated(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment buffer, int max, java.lang.foreign.MemorySegment arg5)
    {
        try {return (int)MTD$nk_edit_string_zero_terminated.invokeExact(arg1, arg2, buffer, max, arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_edit_buffer(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, java.lang.foreign.MemorySegment arg4)
    {
        try {return (int)MTD$nk_edit_buffer.invokeExact(arg1, arg2, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_edit_focus(java.lang.foreign.MemorySegment arg1, int flags)
    {
        try {MTD$nk_edit_focus.invokeExact(arg1, flags);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_edit_unfocus(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_edit_unfocus.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  CHART
     *
     * ============================================================================= */
    public static int nk_chart_begin(java.lang.foreign.MemorySegment arg1, int arg2, int num, float min, float max)
    {
        try {return (int)MTD$nk_chart_begin.invokeExact(arg1, arg2, num, min, max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_chart_begin_colored(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_color arg3, nuklear.nk_color active, int num, float min, float max)
    {
        try {return (int)MTD$nk_chart_begin_colored.invokeExact(arg1, arg2, arg3._ptr(), active._ptr(), num, min, max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_chart_add_slot(java.lang.foreign.MemorySegment ctx, int arg2, int count, float min_value, float max_value)
    {
        try {MTD$nk_chart_add_slot.invokeExact(ctx, arg2, count, min_value, max_value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_chart_add_slot_colored(java.lang.foreign.MemorySegment ctx, int arg2, nuklear.nk_color arg3, nuklear.nk_color active, int count, float min_value, float max_value)
    {
        try {MTD$nk_chart_add_slot_colored.invokeExact(ctx, arg2, arg3._ptr(), active._ptr(), count, min_value, max_value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_chart_push(java.lang.foreign.MemorySegment arg1, float arg2)
    {
        try {return (int)MTD$nk_chart_push.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_chart_push_slot(java.lang.foreign.MemorySegment arg1, float arg2, int arg3)
    {
        try {return (int)MTD$nk_chart_push_slot.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_chart_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_chart_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_plot(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment values, int count, int offset)
    {
        try {MTD$nk_plot.invokeExact(arg1, arg2, values, count, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_plot_function(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment userdata, java.lang.foreign.MemorySegment value_getter, int count, int offset)
    {
        try {MTD$nk_plot_function.invokeExact(arg1, arg2, userdata, value_getter, count, offset);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  POPUP
     *
     * ============================================================================= */
    public static int nk_popup_begin(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, nuklear.nk_rect bounds)
    {
        try {return (int)MTD$nk_popup_begin.invokeExact(arg1, arg2, arg3, arg4, bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_popup_close(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_popup_close.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_popup_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_popup_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_popup_get_scroll(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment offset_x, java.lang.foreign.MemorySegment offset_y)
    {
        try {MTD$nk_popup_get_scroll.invokeExact(arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_popup_set_scroll(java.lang.foreign.MemorySegment arg1, int offset_x, int offset_y)
    {
        try {MTD$nk_popup_set_scroll.invokeExact(arg1, offset_x, offset_y);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  COMBOBOX
     *
     * ============================================================================= */
    public static int nk_combo(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items, int count, int selected, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo.invokeExact(arg1, items, count, selected, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_separator(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items_separated_by_separator, int separator, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_separator.invokeExact(arg1, items_separated_by_separator, separator, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_string(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items_separated_by_zeros, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_string.invokeExact(arg1, items_separated_by_zeros, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_callback(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment item_getter, java.lang.foreign.MemorySegment userdata, int selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_callback.invokeExact(arg1, item_getter, userdata, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combobox(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items, int count, java.lang.foreign.MemorySegment selected, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD$nk_combobox.invokeExact(arg1, items, count, selected, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combobox_string(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items_separated_by_zeros, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD$nk_combobox_string.invokeExact(arg1, items_separated_by_zeros, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combobox_separator(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment items_separated_by_separator, int separator, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD$nk_combobox_separator.invokeExact(arg1, items_separated_by_separator, separator, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combobox_callback(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment item_getter, java.lang.foreign.MemorySegment arg3, java.lang.foreign.MemorySegment selected, int count, int item_height, nuklear.nk_vec2 size)
    {
        try {MTD$nk_combobox_callback.invokeExact(arg1, item_getter, arg3, selected, count, item_height, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  ABSTRACT COMBOBOX
     *
     * ============================================================================= */
    public static int nk_combo_begin_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, int arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_text.invokeExact(arg1, selected, arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_label.invokeExact(arg1, selected, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_color(java.lang.foreign.MemorySegment arg1, nuklear.nk_color color, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_color.invokeExact(arg1, color._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_symbol(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_symbol.invokeExact(arg1, arg2, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_symbol_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, int arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_symbol_label.invokeExact(arg1, selected, arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_symbol_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, int arg3, int arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_symbol_text.invokeExact(arg1, selected, arg3, arg4, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_image(java.lang.foreign.MemorySegment arg1, nuklear.nk_image img, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_image.invokeExact(arg1, img._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_image_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, nuklear.nk_image arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_image_label.invokeExact(arg1, selected, arg3._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_begin_image_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment selected, int arg3, nuklear.nk_image arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_combo_begin_image_text.invokeExact(arg1, selected, arg3, arg4._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int alignment)
    {
        try {return (int)MTD$nk_combo_item_label.invokeExact(arg1, arg2, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int alignment)
    {
        try {return (int)MTD$nk_combo_item_text.invokeExact(arg1, arg2, arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_combo_item_image_label.invokeExact(arg1, arg2._ptr(), arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_combo_item_image_text.invokeExact(arg1, arg2._ptr(), arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_combo_item_symbol_label.invokeExact(arg1, arg2, arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_combo_item_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_combo_item_symbol_text.invokeExact(arg1, arg2, arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combo_close(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_combo_close.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_combo_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_combo_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  CONTEXTUAL
     *
     * ============================================================================= */
    public static int nk_contextual_begin(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_vec2 arg3, nuklear.nk_rect trigger_bounds)
    {
        try {return (int)MTD$nk_contextual_begin.invokeExact(arg1, arg2, arg3._ptr(), trigger_bounds._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align)
    {
        try {return (int)MTD$nk_contextual_item_text.invokeExact(arg1, arg2, arg3, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align)
    {
        try {return (int)MTD$nk_contextual_item_label.invokeExact(arg1, arg2, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_contextual_item_image_label.invokeExact(arg1, arg2._ptr(), arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int len, int alignment)
    {
        try {return (int)MTD$nk_contextual_item_image_text.invokeExact(arg1, arg2._ptr(), arg3, len, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_contextual_item_symbol_label.invokeExact(arg1, arg2, arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_contextual_item_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_contextual_item_symbol_text.invokeExact(arg1, arg2, arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_contextual_close(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_contextual_close.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_contextual_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_contextual_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  TOOLTIP
     *
     * ============================================================================= */
    public static void nk_tooltip(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_tooltip.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_tooltip_begin(java.lang.foreign.MemorySegment arg1, float width)
    {
        try {return (int)MTD$nk_tooltip_begin.invokeExact(arg1, width);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_tooltip_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_tooltip_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  MENU
     *
     * ============================================================================= */
    public static void nk_menubar_begin(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_menubar_begin.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_menubar_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_menubar_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment title, int title_len, int align, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_text.invokeExact(arg1, title, title_len, align, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_label.invokeExact(arg1, arg2, align, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_image(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_image arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_image.invokeExact(arg1, arg2, arg3._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_image_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align, nuklear.nk_image arg5, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_image_text.invokeExact(arg1, arg2, arg3, align, arg5._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_image_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, nuklear.nk_image arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_image_label.invokeExact(arg1, arg2, align, arg4._ptr(), size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_symbol(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_symbol.invokeExact(arg1, arg2, arg3, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_symbol_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align, int arg5, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_symbol_text.invokeExact(arg1, arg2, arg3, align, arg5, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_begin_symbol_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int align, int arg4, nuklear.nk_vec2 size)
    {
        try {return (int)MTD$nk_menu_begin_symbol_label.invokeExact(arg1, arg2, align, arg4, size._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3, int align)
    {
        try {return (int)MTD$nk_menu_item_text.invokeExact(arg1, arg2, arg3, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_label(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int alignment)
    {
        try {return (int)MTD$nk_menu_item_label.invokeExact(arg1, arg2, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_image_label(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_menu_item_image_label.invokeExact(arg1, arg2._ptr(), arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_image_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_image arg2, java.lang.foreign.MemorySegment arg3, int len, int alignment)
    {
        try {return (int)MTD$nk_menu_item_image_text.invokeExact(arg1, arg2._ptr(), arg3, len, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_symbol_text(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int arg4, int alignment)
    {
        try {return (int)MTD$nk_menu_item_symbol_text.invokeExact(arg1, arg2, arg3, arg4, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_menu_item_symbol_label(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3, int alignment)
    {
        try {return (int)MTD$nk_menu_item_symbol_label.invokeExact(arg1, arg2, arg3, alignment);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_menu_close(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_menu_close.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_menu_end(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_menu_end.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_default(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_style_default.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_from_table(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_style_from_table.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_load_cursor(java.lang.foreign.MemorySegment arg1, int arg2, java.lang.foreign.MemorySegment arg3)
    {
        try {MTD$nk_style_load_cursor.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_load_all_cursors(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_style_load_all_cursors.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_style_get_color_by_name(int arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_style_get_color_by_name.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_set_font(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_style_set_font.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_set_cursor(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_style_set_cursor.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_show_cursor(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_style_show_cursor.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_style_hide_cursor(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_style_hide_cursor.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_font(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_style_push_font.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_float(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, float arg3)
    {
        try {return (int)MTD$nk_style_push_float.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_vec2(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_vec2 arg3)
    {
        try {return (int)MTD$nk_style_push_vec2.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_style_item(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_style_item arg3)
    {
        try {return (int)MTD$nk_style_push_style_item.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_flags(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_style_push_flags.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_push_color(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_color arg3)
    {
        try {return (int)MTD$nk_style_push_color.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_font(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_font.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_float(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_float.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_vec2(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_vec2.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_style_item(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_style_item.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_flags(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_flags.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_style_pop_color(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_style_pop_color.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  COLOR
     *
     * ============================================================================= */
    public static nuklear.nk_color nk_rgb(java.lang.foreign.SegmentAllocator allocator, int r, int g, int b)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb.invokeExact(allocator, r, g, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_iv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_bv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_f(java.lang.foreign.SegmentAllocator allocator, float r, float g, float b)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_f.invokeExact(allocator, r, g, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_fv.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_colorf c)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_cf.invokeExact(allocator, c._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_hex(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_hex.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgb_factor(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color col, float factor)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgb_factor.invokeExact(allocator, col._ptr(), factor));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba(java.lang.foreign.SegmentAllocator allocator, int r, int g, int b, int a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba.invokeExact(allocator, r, g, b, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_u32(java.lang.foreign.SegmentAllocator allocator, int arg1)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_u32.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_iv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_bv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_f(java.lang.foreign.SegmentAllocator allocator, float r, float g, float b, float a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_f.invokeExact(allocator, r, g, b, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgba)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_fv.invokeExact(allocator, rgba));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_colorf c)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_cf.invokeExact(allocator, c._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_rgba_hex(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment rgb)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_rgba_hex.invokeExact(allocator, rgb));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_colorf nk_hsva_colorf(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v, float a)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD$nk_hsva_colorf.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_colorf nk_hsva_colorfv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment c)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD$nk_hsva_colorfv.invokeExact(allocator, c));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_colorf_hsva_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, java.lang.foreign.MemorySegment out_a, nuklear.nk_colorf in)
    {
        try {MTD$nk_colorf_hsva_f.invokeExact(out_h, out_s, out_v, out_a, in._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_colorf_hsva_fv(java.lang.foreign.MemorySegment hsva, nuklear.nk_colorf in)
    {
        try {MTD$nk_colorf_hsva_fv.invokeExact(hsva, in._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsv(java.lang.foreign.SegmentAllocator allocator, int h, int s, int v)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsv.invokeExact(allocator, h, s, v));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsv_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsv_iv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsv_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsv_bv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsv_f(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsv_f.invokeExact(allocator, h, s, v));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsv_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsv)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsv_fv.invokeExact(allocator, hsv));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsva(java.lang.foreign.SegmentAllocator allocator, int h, int s, int v, int a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsva.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsva_iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsva_iv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsva_bv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsva_bv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsva_f(java.lang.foreign.SegmentAllocator allocator, float h, float s, float v, float a)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsva_f.invokeExact(allocator, h, s, v, a));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_color nk_hsva_fv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment hsva)
    {
        try {return new nuklear.nk_color((java.lang.foreign.MemorySegment)MTD$nk_hsva_fv.invokeExact(allocator, hsva));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* color (conversion nuklear --> user) */
    public static void nk_color_f(java.lang.foreign.MemorySegment r, java.lang.foreign.MemorySegment g, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment a, nuklear.nk_color arg5)
    {
        try {MTD$nk_color_f.invokeExact(r, g, b, a, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_fv(java.lang.foreign.MemorySegment rgba_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_fv.invokeExact(rgba_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_colorf nk_color_cf(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color arg1)
    {
        try {return new nuklear.nk_colorf((java.lang.foreign.MemorySegment)MTD$nk_color_cf.invokeExact(allocator, arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_d(java.lang.foreign.MemorySegment r, java.lang.foreign.MemorySegment g, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment a, nuklear.nk_color arg5)
    {
        try {MTD$nk_color_d.invokeExact(r, g, b, a, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_dv(java.lang.foreign.MemorySegment rgba_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_dv.invokeExact(rgba_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_color_u32(nuklear.nk_color arg1)
    {
        try {return (int)MTD$nk_color_u32.invokeExact(arg1._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hex_rgba(java.lang.foreign.MemorySegment output, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hex_rgba.invokeExact(output, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hex_rgb(java.lang.foreign.MemorySegment output, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hex_rgb.invokeExact(output, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_i(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color arg4)
    {
        try {MTD$nk_color_hsv_i.invokeExact(out_h, out_s, out_v, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_b(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color arg4)
    {
        try {MTD$nk_color_hsv_b.invokeExact(out_h, out_s, out_v, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_iv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsv_iv.invokeExact(hsv_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_bv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsv_bv.invokeExact(hsv_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, nuklear.nk_color arg4)
    {
        try {MTD$nk_color_hsv_f.invokeExact(out_h, out_s, out_v, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsv_fv(java.lang.foreign.MemorySegment hsv_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsv_fv.invokeExact(hsv_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_i(java.lang.foreign.MemorySegment h, java.lang.foreign.MemorySegment s, java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment a, nuklear.nk_color arg5)
    {
        try {MTD$nk_color_hsva_i.invokeExact(h, s, v, a, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_b(java.lang.foreign.MemorySegment h, java.lang.foreign.MemorySegment s, java.lang.foreign.MemorySegment v, java.lang.foreign.MemorySegment a, nuklear.nk_color arg5)
    {
        try {MTD$nk_color_hsva_b.invokeExact(h, s, v, a, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_iv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsva_iv.invokeExact(hsva_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_bv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsva_bv.invokeExact(hsva_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_f(java.lang.foreign.MemorySegment out_h, java.lang.foreign.MemorySegment out_s, java.lang.foreign.MemorySegment out_v, java.lang.foreign.MemorySegment out_a, nuklear.nk_color arg5)
    {
        try {MTD$nk_color_hsva_f.invokeExact(out_h, out_s, out_v, out_a, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_color_hsva_fv(java.lang.foreign.MemorySegment hsva_out, nuklear.nk_color arg2)
    {
        try {MTD$nk_color_hsva_fv.invokeExact(hsva_out, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  IMAGE
     *
     * ============================================================================= */
    public static nuklear.nk_handle nk_handle_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_handle((java.lang.foreign.MemorySegment)MTD$nk_handle_ptr.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_handle nk_handle_id(java.lang.foreign.SegmentAllocator allocator, int arg1)
    {
        try {return new nuklear.nk_handle((java.lang.foreign.MemorySegment)MTD$nk_handle_id.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_image_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_image_handle.invokeExact(allocator, arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_image_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_image_ptr.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_image_id(java.lang.foreign.SegmentAllocator allocator, int arg1)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_image_id.invokeExact(allocator, arg1));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_image_is_subimage(java.lang.foreign.MemorySegment img)
    {
        try {return (int)MTD$nk_image_is_subimage.invokeExact(img);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_subimage_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_subimage_ptr.invokeExact(allocator, arg1, w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_subimage_id(java.lang.foreign.SegmentAllocator allocator, int arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_subimage_id.invokeExact(allocator, arg1, w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_image nk_subimage_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle arg1, short w, short h, nuklear.nk_rect sub_region)
    {
        try {return new nuklear.nk_image((java.lang.foreign.MemorySegment)MTD$nk_subimage_handle.invokeExact(allocator, arg1._ptr(), w, h, sub_region._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  9-SLICE
     *
     * ============================================================================= */
    public static nuklear.nk_nine_slice nk_nine_slice_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_nine_slice_handle.invokeExact(allocator, arg1._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_nine_slice nk_nine_slice_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_nine_slice_ptr.invokeExact(allocator, arg1, l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_nine_slice nk_nine_slice_id(java.lang.foreign.SegmentAllocator allocator, int arg1, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_nine_slice_id.invokeExact(allocator, arg1, l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_nine_slice_is_sub9slice(java.lang.foreign.MemorySegment img)
    {
        try {return (int)MTD$nk_nine_slice_is_sub9slice.invokeExact(img);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_nine_slice nk_sub9slice_ptr(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_sub9slice_ptr.invokeExact(allocator, arg1, w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_nine_slice nk_sub9slice_id(java.lang.foreign.SegmentAllocator allocator, int arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_sub9slice_id.invokeExact(allocator, arg1, w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_nine_slice nk_sub9slice_handle(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_handle arg1, short w, short h, nuklear.nk_rect sub_region, short l, short t, short r, short b)
    {
        try {return new nuklear.nk_nine_slice((java.lang.foreign.MemorySegment)MTD$nk_sub9slice_handle.invokeExact(allocator, arg1._ptr(), w, h, sub_region._ptr(), l, t, r, b));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  MATH
     *
     * ============================================================================= */
    public static int nk_murmur_hash(java.lang.foreign.MemorySegment key, int len, int seed)
    {
        try {return (int)MTD$nk_murmur_hash.invokeExact(key, len, seed);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_triangle_from_direction(java.lang.foreign.MemorySegment result, nuklear.nk_rect r, float pad_x, float pad_y, int arg5)
    {
        try {MTD$nk_triangle_from_direction.invokeExact(result, r._ptr(), pad_x, pad_y, arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_vec2(java.lang.foreign.SegmentAllocator allocator, float x, float y)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_vec2.invokeExact(allocator, x, y));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_vec2i(java.lang.foreign.SegmentAllocator allocator, int x, int y)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_vec2i.invokeExact(allocator, x, y));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_vec2v(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xy)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_vec2v.invokeExact(allocator, xy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_vec2iv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xy)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_vec2iv.invokeExact(allocator, xy));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_get_null_rect(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_get_null_rect.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_rect(java.lang.foreign.SegmentAllocator allocator, float x, float y, float w, float h)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_rect.invokeExact(allocator, x, y, w, h));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_recti(java.lang.foreign.SegmentAllocator allocator, int x, int y, int w, int h)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_recti.invokeExact(allocator, x, y, w, h));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_recta(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_vec2 pos, nuklear.nk_vec2 size)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_recta.invokeExact(allocator, pos._ptr(), size._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_rectv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xywh)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_rectv.invokeExact(allocator, xywh));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_rect nk_rectiv(java.lang.foreign.SegmentAllocator allocator, java.lang.foreign.MemorySegment xywh)
    {
        try {return new nuklear.nk_rect((java.lang.foreign.MemorySegment)MTD$nk_rectiv.invokeExact(allocator, xywh));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_rect_pos(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_rect arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_rect_pos.invokeExact(allocator, arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_vec2 nk_rect_size(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_rect arg1)
    {
        try {return new nuklear.nk_vec2((java.lang.foreign.MemorySegment)MTD$nk_rect_size.invokeExact(allocator, arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  STRING
     *
     * ============================================================================= */
    public static int nk_strlen(java.lang.foreign.MemorySegment str)
    {
        try {return (int)MTD$nk_strlen.invokeExact(str);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_stricmp(java.lang.foreign.MemorySegment s1, java.lang.foreign.MemorySegment s2)
    {
        try {return (int)MTD$nk_stricmp.invokeExact(s1, s2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_stricmpn(java.lang.foreign.MemorySegment s1, java.lang.foreign.MemorySegment s2, int n)
    {
        try {return (int)MTD$nk_stricmpn.invokeExact(s1, s2, n);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_strtoi(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (int)MTD$nk_strtoi.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static float nk_strtof(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (float)MTD$nk_strtof.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static double nk_strtod(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment endptr)
    {
        try {return (double)MTD$nk_strtod.invokeExact(str, endptr);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_strfilter(java.lang.foreign.MemorySegment text, java.lang.foreign.MemorySegment regexp)
    {
        try {return (int)MTD$nk_strfilter.invokeExact(text, regexp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_strmatch_fuzzy_string(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment out_score)
    {
        try {return (int)MTD$nk_strmatch_fuzzy_string.invokeExact(str, pattern, out_score);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_strmatch_fuzzy_text(java.lang.foreign.MemorySegment txt, int txt_len, java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment out_score)
    {
        try {return (int)MTD$nk_strmatch_fuzzy_text.invokeExact(txt, txt_len, pattern, out_score);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* =============================================================================
     *
     *                                  UTF-8
     *
     * ============================================================================= */
    public static int nk_utf_decode(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_utf_decode.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_utf_encode(int arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_utf_encode.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_utf_len(java.lang.foreign.MemorySegment arg1, int byte_len)
    {
        try {return (int)MTD$nk_utf_len.invokeExact(arg1, byte_len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_utf_at(java.lang.foreign.MemorySegment buffer, int length, int index, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_utf_at.invokeExact(buffer, length, index, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* some language glyph codepoint ranges */
    public static java.lang.foreign.MemorySegment nk_font_default_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_default_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_chinese_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_chinese_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_cyrillic_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_cyrillic_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_korean_glyph_ranges()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_korean_glyph_ranges.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_init_default(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_font_atlas_init_default.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_init(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_font_atlas_init.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_init_custom(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment persistent, java.lang.foreign.MemorySegment _transient)
    {
        try {MTD$nk_font_atlas_init_custom.invokeExact(arg1, persistent, _transient);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_begin(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_font_atlas_begin.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_font_config nk_font_config(java.lang.foreign.SegmentAllocator allocator, float pixel_height)
    {
        try {return new nuklear.nk_font_config((java.lang.foreign.MemorySegment)MTD$nk_font_config.invokeExact(allocator, pixel_height));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add_default(java.lang.foreign.MemorySegment arg1, float height, java.lang.foreign.MemorySegment arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add_default.invokeExact(arg1, height, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add_from_memory(java.lang.foreign.MemorySegment atlas, java.lang.foreign.MemorySegment memory, long size, float height, java.lang.foreign.MemorySegment config)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add_from_memory.invokeExact(atlas, memory, size, height, config);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add_from_file(java.lang.foreign.MemorySegment atlas, java.lang.foreign.MemorySegment file_path, float height, java.lang.foreign.MemorySegment arg4)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add_from_file.invokeExact(atlas, file_path, height, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add_compressed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment memory, long size, float height, java.lang.foreign.MemorySegment arg5)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add_compressed.invokeExact(arg1, memory, size, height, arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_add_compressed_base85(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment data, float height, java.lang.foreign.MemorySegment config)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_add_compressed_base85.invokeExact(arg1, data, height, config);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_atlas_bake(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment width, java.lang.foreign.MemorySegment height, int arg4)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_atlas_bake.invokeExact(arg1, width, height, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_end(java.lang.foreign.MemorySegment arg1, nuklear.nk_handle tex, java.lang.foreign.MemorySegment arg3)
    {
        try {MTD$nk_font_atlas_end.invokeExact(arg1, tex._ptr(), arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_font_find_glyph(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_font_find_glyph.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_cleanup(java.lang.foreign.MemorySegment atlas)
    {
        try {MTD$nk_font_atlas_cleanup.invokeExact(atlas);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_font_atlas_clear(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_font_atlas_clear.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_init_default(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_buffer_init_default.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_init(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, long size)
    {
        try {MTD$nk_buffer_init.invokeExact(arg1, arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_init_fixed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD$nk_buffer_init_fixed.invokeExact(arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_info(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {MTD$nk_buffer_info.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_push(java.lang.foreign.MemorySegment arg1, int type, java.lang.foreign.MemorySegment memory, long size, long align)
    {
        try {MTD$nk_buffer_push.invokeExact(arg1, type, memory, size, align);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_mark(java.lang.foreign.MemorySegment arg1, int type)
    {
        try {MTD$nk_buffer_mark.invokeExact(arg1, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_reset(java.lang.foreign.MemorySegment arg1, int type)
    {
        try {MTD$nk_buffer_reset.invokeExact(arg1, type);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_clear(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_buffer_clear.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_buffer_free(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_buffer_free.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_buffer_memory(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_buffer_memory.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_buffer_memory_const(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_buffer_memory_const.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static long nk_buffer_total(java.lang.foreign.MemorySegment arg1)
    {
        try {return (long)MTD$nk_buffer_total.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_init_default(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_str_init_default.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_init(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, long size)
    {
        try {MTD$nk_str_init.invokeExact(arg1, arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_init_fixed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD$nk_str_init_fixed.invokeExact(arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_clear(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_str_clear.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_free(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_str_free.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_text_char(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_str_append_text_char.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_str_char(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_str_append_str_char.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_text_utf8(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_str_append_text_utf8.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_str_utf8(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_str_append_str_utf8.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_text_runes(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int arg3)
    {
        try {return (int)MTD$nk_str_append_text_runes.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_append_str_runes(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (int)MTD$nk_str_append_str_runes.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_at_char(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3, int arg4)
    {
        try {return (int)MTD$nk_str_insert_at_char.invokeExact(arg1, pos, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_at_rune(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3, int arg4)
    {
        try {return (int)MTD$nk_str_insert_at_rune.invokeExact(arg1, pos, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_text_char(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3, int arg4)
    {
        try {return (int)MTD$nk_str_insert_text_char.invokeExact(arg1, pos, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_str_char(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3)
    {
        try {return (int)MTD$nk_str_insert_str_char.invokeExact(arg1, pos, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_text_utf8(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3, int arg4)
    {
        try {return (int)MTD$nk_str_insert_text_utf8.invokeExact(arg1, pos, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_str_utf8(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3)
    {
        try {return (int)MTD$nk_str_insert_str_utf8.invokeExact(arg1, pos, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_text_runes(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3, int arg4)
    {
        try {return (int)MTD$nk_str_insert_text_runes.invokeExact(arg1, pos, arg3, arg4);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_insert_str_runes(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment arg3)
    {
        try {return (int)MTD$nk_str_insert_str_runes.invokeExact(arg1, pos, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_remove_chars(java.lang.foreign.MemorySegment arg1, int len)
    {
        try {MTD$nk_str_remove_chars.invokeExact(arg1, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_remove_runes(java.lang.foreign.MemorySegment str, int len)
    {
        try {MTD$nk_str_remove_runes.invokeExact(str, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_delete_chars(java.lang.foreign.MemorySegment arg1, int pos, int len)
    {
        try {MTD$nk_str_delete_chars.invokeExact(arg1, pos, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_str_delete_runes(java.lang.foreign.MemorySegment arg1, int pos, int len)
    {
        try {MTD$nk_str_delete_runes.invokeExact(arg1, pos, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_at_char(java.lang.foreign.MemorySegment arg1, int pos)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_at_char.invokeExact(arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_at_rune(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_at_rune.invokeExact(arg1, pos, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_rune_at(java.lang.foreign.MemorySegment arg1, int pos)
    {
        try {return (int)MTD$nk_str_rune_at.invokeExact(arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_at_char_const(java.lang.foreign.MemorySegment arg1, int pos)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_at_char_const.invokeExact(arg1, pos);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_at_const(java.lang.foreign.MemorySegment arg1, int pos, java.lang.foreign.MemorySegment unicode, java.lang.foreign.MemorySegment len)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_at_const.invokeExact(arg1, pos, unicode, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_get(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_get.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk_str_get_const(java.lang.foreign.MemorySegment arg1)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk_str_get_const.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_len(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_str_len.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_str_len_char(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_str_len_char.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* filter function */
    public static int nk_filter_default(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_default.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_ascii(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_ascii.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_float(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_float.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_decimal(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_decimal.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_hex(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_hex.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_oct(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_oct.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_filter_binary(java.lang.foreign.MemorySegment arg1, int unicode)
    {
        try {return (int)MTD$nk_filter_binary.invokeExact(arg1, unicode);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_init_default(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_init_default.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_init(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, long size)
    {
        try {MTD$nk_textedit_init.invokeExact(arg1, arg2, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_init_fixed(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment memory, long size)
    {
        try {MTD$nk_textedit_init_fixed.invokeExact(arg1, memory, size);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_free(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_free.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int total_len)
    {
        try {MTD$nk_textedit_text.invokeExact(arg1, arg2, total_len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_delete(java.lang.foreign.MemorySegment arg1, int where, int len)
    {
        try {MTD$nk_textedit_delete.invokeExact(arg1, where, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_delete_selection(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_delete_selection.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_select_all(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_select_all.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_textedit_cut(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$nk_textedit_cut.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_textedit_paste(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int len)
    {
        try {return (int)MTD$nk_textedit_paste.invokeExact(arg1, arg2, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_undo(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_undo.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_textedit_redo(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_textedit_redo.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* shape outlines */
    public static void nk_stroke_line(java.lang.foreign.MemorySegment b, float x0, float y0, float x1, float y1, float line_thickness, nuklear.nk_color arg7)
    {
        try {MTD$nk_stroke_line.invokeExact(b, x0, y0, x1, y1, line_thickness, arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_curve(java.lang.foreign.MemorySegment arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float line_thickness, nuklear.nk_color arg11)
    {
        try {MTD$nk_stroke_curve.invokeExact(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, line_thickness, arg11._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, float rounding, float line_thickness, nuklear.nk_color arg5)
    {
        try {MTD$nk_stroke_rect.invokeExact(arg1, arg2._ptr(), rounding, line_thickness, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_circle(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, float line_thickness, nuklear.nk_color arg4)
    {
        try {MTD$nk_stroke_circle.invokeExact(arg1, arg2._ptr(), line_thickness, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_arc(java.lang.foreign.MemorySegment arg1, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, nuklear.nk_color arg8)
    {
        try {MTD$nk_stroke_arc.invokeExact(arg1, cx, cy, radius, a_min, a_max, line_thickness, arg8._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_triangle(java.lang.foreign.MemorySegment arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float line_thichness, nuklear.nk_color arg9)
    {
        try {MTD$nk_stroke_triangle.invokeExact(arg1, arg2, arg3, arg4, arg5, arg6, arg7, line_thichness, arg9._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_polyline(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment points, int point_count, float line_thickness, nuklear.nk_color col)
    {
        try {MTD$nk_stroke_polyline.invokeExact(arg1, points, point_count, line_thickness, col._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_stroke_polygon(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int point_count, float line_thickness, nuklear.nk_color arg5)
    {
        try {MTD$nk_stroke_polygon.invokeExact(arg1, arg2, point_count, line_thickness, arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* filled shades */
    public static void nk_fill_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, float rounding, nuklear.nk_color arg4)
    {
        try {MTD$nk_fill_rect.invokeExact(arg1, arg2._ptr(), rounding, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_fill_rect_multi_color(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, nuklear.nk_color left, nuklear.nk_color top, nuklear.nk_color right, nuklear.nk_color bottom)
    {
        try {MTD$nk_fill_rect_multi_color.invokeExact(arg1, arg2._ptr(), left._ptr(), top._ptr(), right._ptr(), bottom._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_fill_circle(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, nuklear.nk_color arg3)
    {
        try {MTD$nk_fill_circle.invokeExact(arg1, arg2._ptr(), arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_fill_arc(java.lang.foreign.MemorySegment arg1, float cx, float cy, float radius, float a_min, float a_max, nuklear.nk_color arg7)
    {
        try {MTD$nk_fill_arc.invokeExact(arg1, cx, cy, radius, a_min, a_max, arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_fill_triangle(java.lang.foreign.MemorySegment arg1, float x0, float y0, float x1, float y1, float x2, float y2, nuklear.nk_color arg8)
    {
        try {MTD$nk_fill_triangle.invokeExact(arg1, x0, y0, x1, y1, x2, y2, arg8._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_fill_polygon(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, int point_count, nuklear.nk_color arg4)
    {
        try {MTD$nk_fill_polygon.invokeExact(arg1, arg2, point_count, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* misc */
    public static void nk_draw_image(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, java.lang.foreign.MemorySegment arg3, nuklear.nk_color arg4)
    {
        try {MTD$nk_draw_image.invokeExact(arg1, arg2._ptr(), arg3, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_nine_slice(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, java.lang.foreign.MemorySegment arg3, nuklear.nk_color arg4)
    {
        try {MTD$nk_draw_nine_slice.invokeExact(arg1, arg2._ptr(), arg3, arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_text(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, java.lang.foreign.MemorySegment text, int len, java.lang.foreign.MemorySegment arg5, nuklear.nk_color arg6, nuklear.nk_color arg7)
    {
        try {MTD$nk_draw_text.invokeExact(arg1, arg2._ptr(), text, len, arg5, arg6._ptr(), arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_push_scissor(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {MTD$nk_push_scissor.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_push_custom(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2, java.lang.foreign.MemorySegment arg3, nuklear.nk_handle usr)
    {
        try {MTD$nk_push_custom.invokeExact(arg1, arg2._ptr(), arg3, usr._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_has_mouse_click(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_has_mouse_click.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_has_mouse_click_in_rect(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_rect arg3)
    {
        try {return (int)MTD$nk_input_has_mouse_click_in_rect.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_has_mouse_click_in_button_rect(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_rect arg3)
    {
        try {return (int)MTD$nk_input_has_mouse_click_in_button_rect.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_has_mouse_click_down_in_rect(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_rect arg3, int down)
    {
        try {return (int)MTD$nk_input_has_mouse_click_down_in_rect.invokeExact(arg1, arg2, arg3._ptr(), down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_click_in_rect(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_rect arg3)
    {
        try {return (int)MTD$nk_input_is_mouse_click_in_rect.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_click_down_in_rect(java.lang.foreign.MemorySegment i, int id, nuklear.nk_rect b, int down)
    {
        try {return (int)MTD$nk_input_is_mouse_click_down_in_rect.invokeExact(i, id, b._ptr(), down);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_any_mouse_click_in_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {return (int)MTD$nk_input_any_mouse_click_in_rect.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_prev_hovering_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {return (int)MTD$nk_input_is_mouse_prev_hovering_rect.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_hovering_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect arg2)
    {
        try {return (int)MTD$nk_input_is_mouse_hovering_rect.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_mouse_clicked(java.lang.foreign.MemorySegment arg1, int arg2, nuklear.nk_rect arg3)
    {
        try {return (int)MTD$nk_input_mouse_clicked.invokeExact(arg1, arg2, arg3._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_down(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_mouse_down.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_pressed(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_mouse_pressed.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_mouse_released(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_mouse_released.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_key_pressed(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_key_pressed.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_key_released(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_key_released.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int nk_input_is_key_down(java.lang.foreign.MemorySegment arg1, int arg2)
    {
        try {return (int)MTD$nk_input_is_key_down.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* draw list */
    public static void nk_draw_list_init(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_draw_list_init.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_setup(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment cmds, java.lang.foreign.MemorySegment vertices, java.lang.foreign.MemorySegment elements, int line_aa, int shape_aa)
    {
        try {MTD$nk_draw_list_setup.invokeExact(arg1, arg2, cmds, vertices, elements, line_aa, shape_aa);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk__draw_list_begin(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_list_begin.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk__draw_list_next(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, java.lang.foreign.MemorySegment arg3)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_list_next.invokeExact(arg1, arg2, arg3);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment nk__draw_list_end(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$nk__draw_list_end.invokeExact(arg1, arg2);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* path */
    public static void nk_draw_list_path_clear(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$nk_draw_list_path_clear.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_line_to(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 pos)
    {
        try {MTD$nk_draw_list_path_line_to.invokeExact(arg1, pos._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_arc_to_fast(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 center, float radius, int a_min, int a_max)
    {
        try {MTD$nk_draw_list_path_arc_to_fast.invokeExact(arg1, center._ptr(), radius, a_min, a_max);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_arc_to(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 center, float radius, float a_min, float a_max, int segments)
    {
        try {MTD$nk_draw_list_path_arc_to.invokeExact(arg1, center._ptr(), radius, a_min, a_max, segments);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_rect_to(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, float rounding)
    {
        try {MTD$nk_draw_list_path_rect_to.invokeExact(arg1, a._ptr(), b._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_curve_to(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 p2, nuklear.nk_vec2 p3, nuklear.nk_vec2 p4, int num_segments)
    {
        try {MTD$nk_draw_list_path_curve_to.invokeExact(arg1, p2._ptr(), p3._ptr(), p4._ptr(), num_segments);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_fill(java.lang.foreign.MemorySegment arg1, nuklear.nk_color arg2)
    {
        try {MTD$nk_draw_list_path_fill.invokeExact(arg1, arg2._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_path_stroke(java.lang.foreign.MemorySegment arg1, nuklear.nk_color arg2, int closed, float thickness)
    {
        try {MTD$nk_draw_list_path_stroke.invokeExact(arg1, arg2._ptr(), closed, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* stroke */
    public static void nk_draw_list_stroke_line(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_color arg4, float thickness)
    {
        try {MTD$nk_draw_list_stroke_line.invokeExact(arg1, a._ptr(), b._ptr(), arg4._ptr(), thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_stroke_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect rect, nuklear.nk_color arg3, float rounding, float thickness)
    {
        try {MTD$nk_draw_list_stroke_rect.invokeExact(arg1, rect._ptr(), arg3._ptr(), rounding, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_stroke_triangle(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_vec2 c, nuklear.nk_color arg5, float thickness)
    {
        try {MTD$nk_draw_list_stroke_triangle.invokeExact(arg1, a._ptr(), b._ptr(), c._ptr(), arg5._ptr(), thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_stroke_circle(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 center, float radius, nuklear.nk_color arg4, int segs, float thickness)
    {
        try {MTD$nk_draw_list_stroke_circle.invokeExact(arg1, center._ptr(), radius, arg4._ptr(), segs, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_stroke_curve(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 p0, nuklear.nk_vec2 cp0, nuklear.nk_vec2 cp1, nuklear.nk_vec2 p1, nuklear.nk_color arg6, int segments, float thickness)
    {
        try {MTD$nk_draw_list_stroke_curve.invokeExact(arg1, p0._ptr(), cp0._ptr(), cp1._ptr(), p1._ptr(), arg6._ptr(), segments, thickness);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_stroke_poly_line(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment pnts, int cnt, nuklear.nk_color arg4, int arg5, float thickness, int arg7)
    {
        try {MTD$nk_draw_list_stroke_poly_line.invokeExact(arg1, pnts, cnt, arg4._ptr(), arg5, thickness, arg7);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* fill */
    public static void nk_draw_list_fill_rect(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect rect, nuklear.nk_color arg3, float rounding)
    {
        try {MTD$nk_draw_list_fill_rect.invokeExact(arg1, rect._ptr(), arg3._ptr(), rounding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_fill_rect_multi_color(java.lang.foreign.MemorySegment arg1, nuklear.nk_rect rect, nuklear.nk_color left, nuklear.nk_color top, nuklear.nk_color right, nuklear.nk_color bottom)
    {
        try {MTD$nk_draw_list_fill_rect_multi_color.invokeExact(arg1, rect._ptr(), left._ptr(), top._ptr(), right._ptr(), bottom._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_fill_triangle(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 a, nuklear.nk_vec2 b, nuklear.nk_vec2 c, nuklear.nk_color arg5)
    {
        try {MTD$nk_draw_list_fill_triangle.invokeExact(arg1, a._ptr(), b._ptr(), c._ptr(), arg5._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_fill_circle(java.lang.foreign.MemorySegment arg1, nuklear.nk_vec2 center, float radius, nuklear.nk_color col, int segs)
    {
        try {MTD$nk_draw_list_fill_circle.invokeExact(arg1, center._ptr(), radius, col._ptr(), segs);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_fill_poly_convex(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment points, int count, nuklear.nk_color arg4, int arg5)
    {
        try {MTD$nk_draw_list_fill_poly_convex.invokeExact(arg1, points, count, arg4._ptr(), arg5);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    /* misc */
    public static void nk_draw_list_add_image(java.lang.foreign.MemorySegment arg1, nuklear.nk_image texture, nuklear.nk_rect rect, nuklear.nk_color arg4)
    {
        try {MTD$nk_draw_list_add_image.invokeExact(arg1, texture._ptr(), rect._ptr(), arg4._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void nk_draw_list_add_text(java.lang.foreign.MemorySegment arg1, java.lang.foreign.MemorySegment arg2, nuklear.nk_rect arg3, java.lang.foreign.MemorySegment text, int len, float font_height, nuklear.nk_color arg7)
    {
        try {MTD$nk_draw_list_add_text.invokeExact(arg1, arg2, arg3._ptr(), text, len, font_height, arg7._ptr());}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_style_item nk_style_item_color(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_color arg1)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD$nk_style_item_color.invokeExact(allocator, arg1._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_style_item nk_style_item_image(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_image img)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD$nk_style_item_image.invokeExact(allocator, img._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_style_item nk_style_item_nine_slice(java.lang.foreign.SegmentAllocator allocator, nuklear.nk_nine_slice slice)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD$nk_style_item_nine_slice.invokeExact(allocator, slice._ptr()));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static nuklear.nk_style_item nk_style_item_hide(java.lang.foreign.SegmentAllocator allocator)
    {
        try {return new nuklear.nk_style_item((java.lang.foreign.MemorySegment)MTD$nk_style_item_hide.invokeExact(allocator));}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libnuklear");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$nk_init_default = gLibLookup.find("nk_init_default").orElseThrow();
        MTD$nk_init_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_init_default, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_init_fixed = gLibLookup.find("nk_init_fixed").orElseThrow();
        MTD$nk_init_fixed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_init_fixed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_init = gLibLookup.find("nk_init").orElseThrow();
        MTD$nk_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_init, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_init_custom = gLibLookup.find("nk_init_custom").orElseThrow();
        MTD$nk_init_custom = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_init_custom, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_clear = gLibLookup.find("nk_clear").orElseThrow();
        MTD$nk_clear = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_clear, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_free = gLibLookup.find("nk_free").orElseThrow();
        MTD$nk_free = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_free, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_input_begin = gLibLookup.find("nk_input_begin").orElseThrow();
        MTD$nk_input_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_input_motion = gLibLookup.find("nk_input_motion").orElseThrow();
        MTD$nk_input_motion = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_motion, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_key = gLibLookup.find("nk_input_key").orElseThrow();
        MTD$nk_input_key = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_key, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_button = gLibLookup.find("nk_input_button").orElseThrow();
        MTD$nk_input_button = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_button, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_scroll = gLibLookup.find("nk_input_scroll").orElseThrow();
        MTD$nk_input_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_input_char = gLibLookup.find("nk_input_char").orElseThrow();
        MTD$nk_input_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_char, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BYTE));
        MTD_ADDRESS$nk_input_glyph = gLibLookup.find("nk_input_glyph").orElseThrow();
        MTD$nk_input_glyph = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_glyph, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_input_unicode = gLibLookup.find("nk_input_unicode").orElseThrow();
        MTD$nk_input_unicode = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_unicode, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_end = gLibLookup.find("nk_input_end").orElseThrow();
        MTD$nk_input_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__begin = gLibLookup.find("nk__begin").orElseThrow();
        MTD$nk__begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__next = gLibLookup.find("nk__next").orElseThrow();
        MTD$nk__next = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__next, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_convert = gLibLookup.find("nk_convert").orElseThrow();
        MTD$nk_convert = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_convert, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__draw_begin = gLibLookup.find("nk__draw_begin").orElseThrow();
        MTD$nk__draw_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__draw_end = gLibLookup.find("nk__draw_end").orElseThrow();
        MTD$nk__draw_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_end, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__draw_next = gLibLookup.find("nk__draw_next").orElseThrow();
        MTD$nk__draw_next = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_next, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_begin = gLibLookup.find("nk_begin").orElseThrow();
        MTD$nk_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_begin_titled = gLibLookup.find("nk_begin_titled").orElseThrow();
        MTD$nk_begin_titled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_begin_titled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_end = gLibLookup.find("nk_end").orElseThrow();
        MTD$nk_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_find = gLibLookup.find("nk_window_find").orElseThrow();
        MTD$nk_window_find = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_find, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_bounds = gLibLookup.find("nk_window_get_bounds").orElseThrow();
        MTD$nk_window_get_bounds = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_position = gLibLookup.find("nk_window_get_position").orElseThrow();
        MTD$nk_window_get_position = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_position, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_size = gLibLookup.find("nk_window_get_size").orElseThrow();
        MTD$nk_window_get_size = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_width = gLibLookup.find("nk_window_get_width").orElseThrow();
        MTD$nk_window_get_width = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_width, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_height = gLibLookup.find("nk_window_get_height").orElseThrow();
        MTD$nk_window_get_height = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_height, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_panel = gLibLookup.find("nk_window_get_panel").orElseThrow();
        MTD$nk_window_get_panel = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_panel, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_content_region = gLibLookup.find("nk_window_get_content_region").orElseThrow();
        MTD$nk_window_get_content_region = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_content_region, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_content_region_min = gLibLookup.find("nk_window_get_content_region_min").orElseThrow();
        MTD$nk_window_get_content_region_min = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_content_region_min, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_content_region_max = gLibLookup.find("nk_window_get_content_region_max").orElseThrow();
        MTD$nk_window_get_content_region_max = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_content_region_max, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_content_region_size = gLibLookup.find("nk_window_get_content_region_size").orElseThrow();
        MTD$nk_window_get_content_region_size = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_content_region_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_canvas = gLibLookup.find("nk_window_get_canvas").orElseThrow();
        MTD$nk_window_get_canvas = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_canvas, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_get_scroll = gLibLookup.find("nk_window_get_scroll").orElseThrow();
        MTD$nk_window_get_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_has_focus = gLibLookup.find("nk_window_has_focus").orElseThrow();
        MTD$nk_window_has_focus = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_has_focus, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_hovered = gLibLookup.find("nk_window_is_hovered").orElseThrow();
        MTD$nk_window_is_hovered = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_collapsed = gLibLookup.find("nk_window_is_collapsed").orElseThrow();
        MTD$nk_window_is_collapsed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_collapsed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_closed = gLibLookup.find("nk_window_is_closed").orElseThrow();
        MTD$nk_window_is_closed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_closed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_hidden = gLibLookup.find("nk_window_is_hidden").orElseThrow();
        MTD$nk_window_is_hidden = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_hidden, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_active = gLibLookup.find("nk_window_is_active").orElseThrow();
        MTD$nk_window_is_active = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_active, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_is_any_hovered = gLibLookup.find("nk_window_is_any_hovered").orElseThrow();
        MTD$nk_window_is_any_hovered = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_is_any_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_item_is_any_active = gLibLookup.find("nk_item_is_any_active").orElseThrow();
        MTD$nk_item_is_any_active = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_item_is_any_active, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_set_bounds = gLibLookup.find("nk_window_set_bounds").orElseThrow();
        MTD$nk_window_set_bounds = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_set_bounds, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_window_set_position = gLibLookup.find("nk_window_set_position").orElseThrow();
        MTD$nk_window_set_position = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_set_position, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_window_set_size = gLibLookup.find("nk_window_set_size").orElseThrow();
        MTD$nk_window_set_size = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_set_size, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_window_set_focus = gLibLookup.find("nk_window_set_focus").orElseThrow();
        MTD$nk_window_set_focus = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_set_focus, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_set_scroll = gLibLookup.find("nk_window_set_scroll").orElseThrow();
        MTD$nk_window_set_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_window_close = gLibLookup.find("nk_window_close").orElseThrow();
        MTD$nk_window_close = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_close, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_window_collapse = gLibLookup.find("nk_window_collapse").orElseThrow();
        MTD$nk_window_collapse = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_collapse, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_window_collapse_if = gLibLookup.find("nk_window_collapse_if").orElseThrow();
        MTD$nk_window_collapse_if = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_collapse_if, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_window_show = gLibLookup.find("nk_window_show").orElseThrow();
        MTD$nk_window_show = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_show, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_window_show_if = gLibLookup.find("nk_window_show_if").orElseThrow();
        MTD$nk_window_show_if = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_window_show_if, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_rule_horizontal = gLibLookup.find("nk_rule_horizontal").orElseThrow();
        MTD$nk_rule_horizontal = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rule_horizontal, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_layout_set_min_row_height = gLibLookup.find("nk_layout_set_min_row_height").orElseThrow();
        MTD$nk_layout_set_min_row_height = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_set_min_row_height, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_reset_min_row_height = gLibLookup.find("nk_layout_reset_min_row_height").orElseThrow();
        MTD$nk_layout_reset_min_row_height = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_reset_min_row_height, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_widget_bounds = gLibLookup.find("nk_layout_widget_bounds").orElseThrow();
        MTD$nk_layout_widget_bounds = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_widget_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_ratio_from_pixel = gLibLookup.find("nk_layout_ratio_from_pixel").orElseThrow();
        MTD$nk_layout_ratio_from_pixel = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_ratio_from_pixel, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_row_dynamic = gLibLookup.find("nk_layout_row_dynamic").orElseThrow();
        MTD$nk_layout_row_dynamic = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_dynamic, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_layout_row_static = gLibLookup.find("nk_layout_row_static").orElseThrow();
        MTD$nk_layout_row_static = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_static, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_layout_row_begin = gLibLookup.find("nk_layout_row_begin").orElseThrow();
        MTD$nk_layout_row_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_layout_row_push = gLibLookup.find("nk_layout_row_push").orElseThrow();
        MTD$nk_layout_row_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_push, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_row_end = gLibLookup.find("nk_layout_row_end").orElseThrow();
        MTD$nk_layout_row_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_row = gLibLookup.find("nk_layout_row").orElseThrow();
        MTD$nk_layout_row = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_row_template_begin = gLibLookup.find("nk_layout_row_template_begin").orElseThrow();
        MTD$nk_layout_row_template_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_template_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_row_template_push_dynamic = gLibLookup.find("nk_layout_row_template_push_dynamic").orElseThrow();
        MTD$nk_layout_row_template_push_dynamic = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_template_push_dynamic, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_row_template_push_variable = gLibLookup.find("nk_layout_row_template_push_variable").orElseThrow();
        MTD$nk_layout_row_template_push_variable = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_template_push_variable, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_row_template_push_static = gLibLookup.find("nk_layout_row_template_push_static").orElseThrow();
        MTD$nk_layout_row_template_push_static = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_template_push_static, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_layout_row_template_end = gLibLookup.find("nk_layout_row_template_end").orElseThrow();
        MTD$nk_layout_row_template_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_row_template_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_space_begin = gLibLookup.find("nk_layout_space_begin").orElseThrow();
        MTD$nk_layout_space_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_layout_space_push = gLibLookup.find("nk_layout_space_push").orElseThrow();
        MTD$nk_layout_space_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_push, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_layout_space_end = gLibLookup.find("nk_layout_space_end").orElseThrow();
        MTD$nk_layout_space_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_space_bounds = gLibLookup.find("nk_layout_space_bounds").orElseThrow();
        MTD$nk_layout_space_bounds = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_layout_space_to_screen = gLibLookup.find("nk_layout_space_to_screen").orElseThrow();
        MTD$nk_layout_space_to_screen = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_to_screen, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_layout_space_to_local = gLibLookup.find("nk_layout_space_to_local").orElseThrow();
        MTD$nk_layout_space_to_local = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_to_local, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_layout_space_rect_to_screen = gLibLookup.find("nk_layout_space_rect_to_screen").orElseThrow();
        MTD$nk_layout_space_rect_to_screen = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_rect_to_screen, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_layout_space_rect_to_local = gLibLookup.find("nk_layout_space_rect_to_local").orElseThrow();
        MTD$nk_layout_space_rect_to_local = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_layout_space_rect_to_local, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_spacer = gLibLookup.find("nk_spacer").orElseThrow();
        MTD$nk_spacer = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_spacer, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_group_begin = gLibLookup.find("nk_group_begin").orElseThrow();
        MTD$nk_group_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_group_begin_titled = gLibLookup.find("nk_group_begin_titled").orElseThrow();
        MTD$nk_group_begin_titled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_begin_titled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_group_end = gLibLookup.find("nk_group_end").orElseThrow();
        MTD$nk_group_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_group_scrolled_offset_begin = gLibLookup.find("nk_group_scrolled_offset_begin").orElseThrow();
        MTD$nk_group_scrolled_offset_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_scrolled_offset_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_group_scrolled_begin = gLibLookup.find("nk_group_scrolled_begin").orElseThrow();
        MTD$nk_group_scrolled_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_scrolled_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_group_scrolled_end = gLibLookup.find("nk_group_scrolled_end").orElseThrow();
        MTD$nk_group_scrolled_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_scrolled_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_group_get_scroll = gLibLookup.find("nk_group_get_scroll").orElseThrow();
        MTD$nk_group_get_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_group_set_scroll = gLibLookup.find("nk_group_set_scroll").orElseThrow();
        MTD$nk_group_set_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_group_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_tree_push_hashed = gLibLookup.find("nk_tree_push_hashed").orElseThrow();
        MTD$nk_tree_push_hashed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_tree_image_push_hashed = gLibLookup.find("nk_tree_image_push_hashed").orElseThrow();
        MTD$nk_tree_image_push_hashed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_image_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_tree_pop = gLibLookup.find("nk_tree_pop").orElseThrow();
        MTD$nk_tree_pop = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_pop, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tree_state_push = gLibLookup.find("nk_tree_state_push").orElseThrow();
        MTD$nk_tree_state_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_state_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tree_state_image_push = gLibLookup.find("nk_tree_state_image_push").orElseThrow();
        MTD$nk_tree_state_image_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_state_image_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tree_state_pop = gLibLookup.find("nk_tree_state_pop").orElseThrow();
        MTD$nk_tree_state_pop = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_state_pop, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tree_element_push_hashed = gLibLookup.find("nk_tree_element_push_hashed").orElseThrow();
        MTD$nk_tree_element_push_hashed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_element_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_tree_element_image_push_hashed = gLibLookup.find("nk_tree_element_image_push_hashed").orElseThrow();
        MTD$nk_tree_element_image_push_hashed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_element_image_push_hashed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_tree_element_pop = gLibLookup.find("nk_tree_element_pop").orElseThrow();
        MTD$nk_tree_element_pop = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tree_element_pop, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_list_view_begin = gLibLookup.find("nk_list_view_begin").orElseThrow();
        MTD$nk_list_view_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_list_view_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_list_view_end = gLibLookup.find("nk_list_view_end").orElseThrow();
        MTD$nk_list_view_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_list_view_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget = gLibLookup.find("nk_widget").orElseThrow();
        MTD$nk_widget = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_fitting = gLibLookup.find("nk_widget_fitting").orElseThrow();
        MTD$nk_widget_fitting = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_fitting, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_widget_bounds = gLibLookup.find("nk_widget_bounds").orElseThrow();
        MTD$nk_widget_bounds = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_bounds, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_position = gLibLookup.find("nk_widget_position").orElseThrow();
        MTD$nk_widget_position = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_position, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_size = gLibLookup.find("nk_widget_size").orElseThrow();
        MTD$nk_widget_size = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_width = gLibLookup.find("nk_widget_width").orElseThrow();
        MTD$nk_widget_width = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_width, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_height = gLibLookup.find("nk_widget_height").orElseThrow();
        MTD$nk_widget_height = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_height, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_is_hovered = gLibLookup.find("nk_widget_is_hovered").orElseThrow();
        MTD$nk_widget_is_hovered = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_is_hovered, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_is_mouse_clicked = gLibLookup.find("nk_widget_is_mouse_clicked").orElseThrow();
        MTD$nk_widget_is_mouse_clicked = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_is_mouse_clicked, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_widget_has_mouse_click_down = gLibLookup.find("nk_widget_has_mouse_click_down").orElseThrow();
        MTD$nk_widget_has_mouse_click_down = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_has_mouse_click_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_spacing = gLibLookup.find("nk_spacing").orElseThrow();
        MTD$nk_spacing = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_spacing, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_widget_disable_begin = gLibLookup.find("nk_widget_disable_begin").orElseThrow();
        MTD$nk_widget_disable_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_disable_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_widget_disable_end = gLibLookup.find("nk_widget_disable_end").orElseThrow();
        MTD$nk_widget_disable_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_widget_disable_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_text = gLibLookup.find("nk_text").orElseThrow();
        MTD$nk_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_text, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_text_colored = gLibLookup.find("nk_text_colored").orElseThrow();
        MTD$nk_text_colored = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_text_colored, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_text_wrap = gLibLookup.find("nk_text_wrap").orElseThrow();
        MTD$nk_text_wrap = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_text_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_text_wrap_colored = gLibLookup.find("nk_text_wrap_colored").orElseThrow();
        MTD$nk_text_wrap_colored = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_text_wrap_colored, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_label = gLibLookup.find("nk_label").orElseThrow();
        MTD$nk_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_label, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_label_colored = gLibLookup.find("nk_label_colored").orElseThrow();
        MTD$nk_label_colored = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_label_colored, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_label_wrap = gLibLookup.find("nk_label_wrap").orElseThrow();
        MTD$nk_label_wrap = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_label_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_label_colored_wrap = gLibLookup.find("nk_label_colored_wrap").orElseThrow();
        MTD$nk_label_colored_wrap = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_label_colored_wrap, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_image = gLibLookup.find("nk_image").orElseThrow();
        MTD$nk_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout));
        MTD_ADDRESS$nk_image_color = gLibLookup.find("nk_image_color").orElseThrow();
        MTD$nk_image_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image_color, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_button_text = gLibLookup.find("nk_button_text").orElseThrow();
        MTD$nk_button_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_label = gLibLookup.find("nk_button_label").orElseThrow();
        MTD$nk_button_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_button_color = gLibLookup.find("nk_button_color").orElseThrow();
        MTD$nk_button_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_button_symbol = gLibLookup.find("nk_button_symbol").orElseThrow();
        MTD$nk_button_symbol = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image = gLibLookup.find("nk_button_image").orElseThrow();
        MTD$nk_button_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout));
        MTD_ADDRESS$nk_button_symbol_label = gLibLookup.find("nk_button_symbol_label").orElseThrow();
        MTD$nk_button_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_symbol_text = gLibLookup.find("nk_button_symbol_text").orElseThrow();
        MTD$nk_button_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image_label = gLibLookup.find("nk_button_image_label").orElseThrow();
        MTD$nk_button_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image_text = gLibLookup.find("nk_button_image_text").orElseThrow();
        MTD$nk_button_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_text_styled = gLibLookup.find("nk_button_text_styled").orElseThrow();
        MTD$nk_button_text_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_label_styled = gLibLookup.find("nk_button_label_styled").orElseThrow();
        MTD$nk_button_label_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_button_symbol_styled = gLibLookup.find("nk_button_symbol_styled").orElseThrow();
        MTD$nk_button_symbol_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image_styled = gLibLookup.find("nk_button_image_styled").orElseThrow();
        MTD$nk_button_image_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout));
        MTD_ADDRESS$nk_button_symbol_text_styled = gLibLookup.find("nk_button_symbol_text_styled").orElseThrow();
        MTD$nk_button_symbol_text_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_symbol_label_styled = gLibLookup.find("nk_button_symbol_label_styled").orElseThrow();
        MTD$nk_button_symbol_label_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_symbol_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image_label_styled = gLibLookup.find("nk_button_image_label_styled").orElseThrow();
        MTD$nk_button_image_label_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image_label_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_image_text_styled = gLibLookup.find("nk_button_image_text_styled").orElseThrow();
        MTD$nk_button_image_text_styled = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_image_text_styled, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_set_behavior = gLibLookup.find("nk_button_set_behavior").orElseThrow();
        MTD$nk_button_set_behavior = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_set_behavior, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_push_behavior = gLibLookup.find("nk_button_push_behavior").orElseThrow();
        MTD$nk_button_push_behavior = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_push_behavior, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_button_pop_behavior = gLibLookup.find("nk_button_pop_behavior").orElseThrow();
        MTD$nk_button_pop_behavior = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_button_pop_behavior, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_check_label = gLibLookup.find("nk_check_label").orElseThrow();
        MTD$nk_check_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_check_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_check_text = gLibLookup.find("nk_check_text").orElseThrow();
        MTD$nk_check_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_check_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_check_text_align = gLibLookup.find("nk_check_text_align").orElseThrow();
        MTD$nk_check_text_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_check_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_check_flags_label = gLibLookup.find("nk_check_flags_label").orElseThrow();
        MTD$nk_check_flags_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_check_flags_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_check_flags_text = gLibLookup.find("nk_check_flags_text").orElseThrow();
        MTD$nk_check_flags_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_check_flags_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_checkbox_label = gLibLookup.find("nk_checkbox_label").orElseThrow();
        MTD$nk_checkbox_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_checkbox_label_align = gLibLookup.find("nk_checkbox_label_align").orElseThrow();
        MTD$nk_checkbox_label_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_checkbox_text = gLibLookup.find("nk_checkbox_text").orElseThrow();
        MTD$nk_checkbox_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_checkbox_text_align = gLibLookup.find("nk_checkbox_text_align").orElseThrow();
        MTD$nk_checkbox_text_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_checkbox_flags_label = gLibLookup.find("nk_checkbox_flags_label").orElseThrow();
        MTD$nk_checkbox_flags_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_flags_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_checkbox_flags_text = gLibLookup.find("nk_checkbox_flags_text").orElseThrow();
        MTD$nk_checkbox_flags_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_checkbox_flags_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_radio_label = gLibLookup.find("nk_radio_label").orElseThrow();
        MTD$nk_radio_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_radio_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_radio_label_align = gLibLookup.find("nk_radio_label_align").orElseThrow();
        MTD$nk_radio_label_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_radio_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_radio_text = gLibLookup.find("nk_radio_text").orElseThrow();
        MTD$nk_radio_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_radio_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_radio_text_align = gLibLookup.find("nk_radio_text_align").orElseThrow();
        MTD$nk_radio_text_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_radio_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_option_label = gLibLookup.find("nk_option_label").orElseThrow();
        MTD$nk_option_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_option_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_option_label_align = gLibLookup.find("nk_option_label_align").orElseThrow();
        MTD$nk_option_label_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_option_label_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_option_text = gLibLookup.find("nk_option_text").orElseThrow();
        MTD$nk_option_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_option_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_option_text_align = gLibLookup.find("nk_option_text_align").orElseThrow();
        MTD$nk_option_text_align = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_option_text_align, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_selectable_label = gLibLookup.find("nk_selectable_label").orElseThrow();
        MTD$nk_selectable_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_selectable_text = gLibLookup.find("nk_selectable_text").orElseThrow();
        MTD$nk_selectable_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_selectable_image_label = gLibLookup.find("nk_selectable_image_label").orElseThrow();
        MTD$nk_selectable_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_selectable_image_text = gLibLookup.find("nk_selectable_image_text").orElseThrow();
        MTD$nk_selectable_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_selectable_symbol_label = gLibLookup.find("nk_selectable_symbol_label").orElseThrow();
        MTD$nk_selectable_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_selectable_symbol_text = gLibLookup.find("nk_selectable_symbol_text").orElseThrow();
        MTD$nk_selectable_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_selectable_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_select_label = gLibLookup.find("nk_select_label").orElseThrow();
        MTD$nk_select_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_select_text = gLibLookup.find("nk_select_text").orElseThrow();
        MTD$nk_select_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_select_image_label = gLibLookup.find("nk_select_image_label").orElseThrow();
        MTD$nk_select_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_select_image_text = gLibLookup.find("nk_select_image_text").orElseThrow();
        MTD$nk_select_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_select_symbol_label = gLibLookup.find("nk_select_symbol_label").orElseThrow();
        MTD$nk_select_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_select_symbol_text = gLibLookup.find("nk_select_symbol_text").orElseThrow();
        MTD$nk_select_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_select_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_slide_float = gLibLookup.find("nk_slide_float").orElseThrow();
        MTD$nk_slide_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_slide_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_slide_int = gLibLookup.find("nk_slide_int").orElseThrow();
        MTD$nk_slide_int = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_slide_int, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_slider_float = gLibLookup.find("nk_slider_float").orElseThrow();
        MTD$nk_slider_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_slider_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_slider_int = gLibLookup.find("nk_slider_int").orElseThrow();
        MTD$nk_slider_int = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_slider_int, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_progress = gLibLookup.find("nk_progress").orElseThrow();
        MTD$nk_progress = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_progress, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_prog = gLibLookup.find("nk_prog").orElseThrow();
        MTD$nk_prog = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_prog, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_color_picker = gLibLookup.find("nk_color_picker").orElseThrow();
        MTD$nk_color_picker = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_picker, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_colorf.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_color_pick = gLibLookup.find("nk_color_pick").orElseThrow();
        MTD$nk_color_pick = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_pick, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_property_int = gLibLookup.find("nk_property_int").orElseThrow();
        MTD$nk_property_int = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_property_int, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_property_float = gLibLookup.find("nk_property_float").orElseThrow();
        MTD$nk_property_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_property_float, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_property_double = gLibLookup.find("nk_property_double").orElseThrow();
        MTD$nk_property_double = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_property_double, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_propertyi = gLibLookup.find("nk_propertyi").orElseThrow();
        MTD$nk_propertyi = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_propertyi, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_propertyf = gLibLookup.find("nk_propertyf").orElseThrow();
        MTD$nk_propertyf = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_propertyf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_propertyd = gLibLookup.find("nk_propertyd").orElseThrow();
        MTD$nk_propertyd = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_propertyd, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_edit_string = gLibLookup.find("nk_edit_string").orElseThrow();
        MTD$nk_edit_string = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_edit_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_edit_string_zero_terminated = gLibLookup.find("nk_edit_string_zero_terminated").orElseThrow();
        MTD$nk_edit_string_zero_terminated = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_edit_string_zero_terminated, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_edit_buffer = gLibLookup.find("nk_edit_buffer").orElseThrow();
        MTD$nk_edit_buffer = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_edit_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_edit_focus = gLibLookup.find("nk_edit_focus").orElseThrow();
        MTD$nk_edit_focus = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_edit_focus, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_edit_unfocus = gLibLookup.find("nk_edit_unfocus").orElseThrow();
        MTD$nk_edit_unfocus = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_edit_unfocus, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_chart_begin = gLibLookup.find("nk_chart_begin").orElseThrow();
        MTD$nk_chart_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_chart_begin_colored = gLibLookup.find("nk_chart_begin_colored").orElseThrow();
        MTD$nk_chart_begin_colored = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_begin_colored, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_chart_add_slot = gLibLookup.find("nk_chart_add_slot").orElseThrow();
        MTD$nk_chart_add_slot = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_add_slot, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_chart_add_slot_colored = gLibLookup.find("nk_chart_add_slot_colored").orElseThrow();
        MTD$nk_chart_add_slot_colored = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_add_slot_colored, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_chart_push = gLibLookup.find("nk_chart_push").orElseThrow();
        MTD$nk_chart_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_push, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_chart_push_slot = gLibLookup.find("nk_chart_push_slot").orElseThrow();
        MTD$nk_chart_push_slot = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_push_slot, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_chart_end = gLibLookup.find("nk_chart_end").orElseThrow();
        MTD$nk_chart_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_chart_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_plot = gLibLookup.find("nk_plot").orElseThrow();
        MTD$nk_plot = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_plot, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_plot_function = gLibLookup.find("nk_plot_function").orElseThrow();
        MTD$nk_plot_function = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_plot_function, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_popup_begin = gLibLookup.find("nk_popup_begin").orElseThrow();
        MTD$nk_popup_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_popup_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_popup_close = gLibLookup.find("nk_popup_close").orElseThrow();
        MTD$nk_popup_close = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_popup_close, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_popup_end = gLibLookup.find("nk_popup_end").orElseThrow();
        MTD$nk_popup_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_popup_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_popup_get_scroll = gLibLookup.find("nk_popup_get_scroll").orElseThrow();
        MTD$nk_popup_get_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_popup_get_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_popup_set_scroll = gLibLookup.find("nk_popup_set_scroll").orElseThrow();
        MTD$nk_popup_set_scroll = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_popup_set_scroll, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo = gLibLookup.find("nk_combo").orElseThrow();
        MTD$nk_combo = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_separator = gLibLookup.find("nk_combo_separator").orElseThrow();
        MTD$nk_combo_separator = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_separator, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_string = gLibLookup.find("nk_combo_string").orElseThrow();
        MTD$nk_combo_string = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_callback = gLibLookup.find("nk_combo_callback").orElseThrow();
        MTD$nk_combo_callback = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_callback, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combobox = gLibLookup.find("nk_combobox").orElseThrow();
        MTD$nk_combobox = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combobox, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combobox_string = gLibLookup.find("nk_combobox_string").orElseThrow();
        MTD$nk_combobox_string = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combobox_string, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combobox_separator = gLibLookup.find("nk_combobox_separator").orElseThrow();
        MTD$nk_combobox_separator = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combobox_separator, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combobox_callback = gLibLookup.find("nk_combobox_callback").orElseThrow();
        MTD$nk_combobox_callback = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combobox_callback, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_text = gLibLookup.find("nk_combo_begin_text").orElseThrow();
        MTD$nk_combo_begin_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_label = gLibLookup.find("nk_combo_begin_label").orElseThrow();
        MTD$nk_combo_begin_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_color = gLibLookup.find("nk_combo_begin_color").orElseThrow();
        MTD$nk_combo_begin_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_symbol = gLibLookup.find("nk_combo_begin_symbol").orElseThrow();
        MTD$nk_combo_begin_symbol = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_symbol_label = gLibLookup.find("nk_combo_begin_symbol_label").orElseThrow();
        MTD$nk_combo_begin_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_symbol_text = gLibLookup.find("nk_combo_begin_symbol_text").orElseThrow();
        MTD$nk_combo_begin_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_image = gLibLookup.find("nk_combo_begin_image").orElseThrow();
        MTD$nk_combo_begin_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_image_label = gLibLookup.find("nk_combo_begin_image_label").orElseThrow();
        MTD$nk_combo_begin_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_begin_image_text = gLibLookup.find("nk_combo_begin_image_text").orElseThrow();
        MTD$nk_combo_begin_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_begin_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_combo_item_label = gLibLookup.find("nk_combo_item_label").orElseThrow();
        MTD$nk_combo_item_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_item_text = gLibLookup.find("nk_combo_item_text").orElseThrow();
        MTD$nk_combo_item_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_item_image_label = gLibLookup.find("nk_combo_item_image_label").orElseThrow();
        MTD$nk_combo_item_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_item_image_text = gLibLookup.find("nk_combo_item_image_text").orElseThrow();
        MTD$nk_combo_item_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_item_symbol_label = gLibLookup.find("nk_combo_item_symbol_label").orElseThrow();
        MTD$nk_combo_item_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_item_symbol_text = gLibLookup.find("nk_combo_item_symbol_text").orElseThrow();
        MTD$nk_combo_item_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_combo_close = gLibLookup.find("nk_combo_close").orElseThrow();
        MTD$nk_combo_close = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_close, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_combo_end = gLibLookup.find("nk_combo_end").orElseThrow();
        MTD$nk_combo_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_combo_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_contextual_begin = gLibLookup.find("nk_contextual_begin").orElseThrow();
        MTD$nk_contextual_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_contextual_item_text = gLibLookup.find("nk_contextual_item_text").orElseThrow();
        MTD$nk_contextual_item_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_item_label = gLibLookup.find("nk_contextual_item_label").orElseThrow();
        MTD$nk_contextual_item_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_item_image_label = gLibLookup.find("nk_contextual_item_image_label").orElseThrow();
        MTD$nk_contextual_item_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_item_image_text = gLibLookup.find("nk_contextual_item_image_text").orElseThrow();
        MTD$nk_contextual_item_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_item_symbol_label = gLibLookup.find("nk_contextual_item_symbol_label").orElseThrow();
        MTD$nk_contextual_item_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_item_symbol_text = gLibLookup.find("nk_contextual_item_symbol_text").orElseThrow();
        MTD$nk_contextual_item_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_contextual_close = gLibLookup.find("nk_contextual_close").orElseThrow();
        MTD$nk_contextual_close = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_close, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_contextual_end = gLibLookup.find("nk_contextual_end").orElseThrow();
        MTD$nk_contextual_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_contextual_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tooltip = gLibLookup.find("nk_tooltip").orElseThrow();
        MTD$nk_tooltip = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tooltip, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_tooltip_begin = gLibLookup.find("nk_tooltip_begin").orElseThrow();
        MTD$nk_tooltip_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tooltip_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_tooltip_end = gLibLookup.find("nk_tooltip_end").orElseThrow();
        MTD$nk_tooltip_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_tooltip_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_menubar_begin = gLibLookup.find("nk_menubar_begin").orElseThrow();
        MTD$nk_menubar_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menubar_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_menubar_end = gLibLookup.find("nk_menubar_end").orElseThrow();
        MTD$nk_menubar_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menubar_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_menu_begin_text = gLibLookup.find("nk_menu_begin_text").orElseThrow();
        MTD$nk_menu_begin_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_label = gLibLookup.find("nk_menu_begin_label").orElseThrow();
        MTD$nk_menu_begin_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_image = gLibLookup.find("nk_menu_begin_image").orElseThrow();
        MTD$nk_menu_begin_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_image, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_image_text = gLibLookup.find("nk_menu_begin_image_text").orElseThrow();
        MTD$nk_menu_begin_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_image_label = gLibLookup.find("nk_menu_begin_image_label").orElseThrow();
        MTD$nk_menu_begin_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_image.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_symbol = gLibLookup.find("nk_menu_begin_symbol").orElseThrow();
        MTD$nk_menu_begin_symbol = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_symbol, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_symbol_text = gLibLookup.find("nk_menu_begin_symbol_text").orElseThrow();
        MTD$nk_menu_begin_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_begin_symbol_label = gLibLookup.find("nk_menu_begin_symbol_label").orElseThrow();
        MTD$nk_menu_begin_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_begin_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_menu_item_text = gLibLookup.find("nk_menu_item_text").orElseThrow();
        MTD$nk_menu_item_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_item_label = gLibLookup.find("nk_menu_item_label").orElseThrow();
        MTD$nk_menu_item_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_item_image_label = gLibLookup.find("nk_menu_item_image_label").orElseThrow();
        MTD$nk_menu_item_image_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_image_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_item_image_text = gLibLookup.find("nk_menu_item_image_text").orElseThrow();
        MTD$nk_menu_item_image_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_image_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_item_symbol_text = gLibLookup.find("nk_menu_item_symbol_text").orElseThrow();
        MTD$nk_menu_item_symbol_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_symbol_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_item_symbol_label = gLibLookup.find("nk_menu_item_symbol_label").orElseThrow();
        MTD$nk_menu_item_symbol_label = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_item_symbol_label, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_menu_close = gLibLookup.find("nk_menu_close").orElseThrow();
        MTD$nk_menu_close = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_close, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_menu_end = gLibLookup.find("nk_menu_end").orElseThrow();
        MTD$nk_menu_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_menu_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_default = gLibLookup.find("nk_style_default").orElseThrow();
        MTD$nk_style_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_default, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_from_table = gLibLookup.find("nk_style_from_table").orElseThrow();
        MTD$nk_style_from_table = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_from_table, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_load_cursor = gLibLookup.find("nk_style_load_cursor").orElseThrow();
        MTD$nk_style_load_cursor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_load_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_load_all_cursors = gLibLookup.find("nk_style_load_all_cursors").orElseThrow();
        MTD$nk_style_load_all_cursors = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_load_all_cursors, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_get_color_by_name = gLibLookup.find("nk_style_get_color_by_name").orElseThrow();
        MTD$nk_style_get_color_by_name = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_get_color_by_name, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_style_set_font = gLibLookup.find("nk_style_set_font").orElseThrow();
        MTD$nk_style_set_font = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_set_font, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_set_cursor = gLibLookup.find("nk_style_set_cursor").orElseThrow();
        MTD$nk_style_set_cursor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_set_cursor, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_style_show_cursor = gLibLookup.find("nk_style_show_cursor").orElseThrow();
        MTD$nk_style_show_cursor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_show_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_hide_cursor = gLibLookup.find("nk_style_hide_cursor").orElseThrow();
        MTD$nk_style_hide_cursor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_hide_cursor, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_push_font = gLibLookup.find("nk_style_push_font").orElseThrow();
        MTD$nk_style_push_font = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_font, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_push_float = gLibLookup.find("nk_style_push_float").orElseThrow();
        MTD$nk_style_push_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_style_push_vec2 = gLibLookup.find("nk_style_push_vec2").orElseThrow();
        MTD$nk_style_push_vec2 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_vec2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_style_push_style_item = gLibLookup.find("nk_style_push_style_item").orElseThrow();
        MTD$nk_style_push_style_item = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_style_item, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_style_item.gStructLayout));
        MTD_ADDRESS$nk_style_push_flags = gLibLookup.find("nk_style_push_flags").orElseThrow();
        MTD$nk_style_push_flags = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_flags, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_style_push_color = gLibLookup.find("nk_style_push_color").orElseThrow();
        MTD$nk_style_push_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_push_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_style_pop_font = gLibLookup.find("nk_style_pop_font").orElseThrow();
        MTD$nk_style_pop_font = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_font, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_pop_float = gLibLookup.find("nk_style_pop_float").orElseThrow();
        MTD$nk_style_pop_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_pop_vec2 = gLibLookup.find("nk_style_pop_vec2").orElseThrow();
        MTD$nk_style_pop_vec2 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_vec2, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_pop_style_item = gLibLookup.find("nk_style_pop_style_item").orElseThrow();
        MTD$nk_style_pop_style_item = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_style_item, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_pop_flags = gLibLookup.find("nk_style_pop_flags").orElseThrow();
        MTD$nk_style_pop_flags = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_flags, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_style_pop_color = gLibLookup.find("nk_style_pop_color").orElseThrow();
        MTD$nk_style_pop_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_pop_color, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgb = gLibLookup.find("nk_rgb").orElseThrow();
        MTD$nk_rgb = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_rgb_iv = gLibLookup.find("nk_rgb_iv").orElseThrow();
        MTD$nk_rgb_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgb_bv = gLibLookup.find("nk_rgb_bv").orElseThrow();
        MTD$nk_rgb_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgb_f = gLibLookup.find("nk_rgb_f").orElseThrow();
        MTD$nk_rgb_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_rgb_fv = gLibLookup.find("nk_rgb_fv").orElseThrow();
        MTD$nk_rgb_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgb_cf = gLibLookup.find("nk_rgb_cf").orElseThrow();
        MTD$nk_rgb_cf = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, nuklear.nk_colorf.gStructLayout));
        MTD_ADDRESS$nk_rgb_hex = gLibLookup.find("nk_rgb_hex").orElseThrow();
        MTD$nk_rgb_hex = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_hex, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgb_factor = gLibLookup.find("nk_rgb_factor").orElseThrow();
        MTD$nk_rgb_factor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgb_factor, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_rgba = gLibLookup.find("nk_rgba").orElseThrow();
        MTD$nk_rgba = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_rgba_u32 = gLibLookup.find("nk_rgba_u32").orElseThrow();
        MTD$nk_rgba_u32 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_u32, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_rgba_iv = gLibLookup.find("nk_rgba_iv").orElseThrow();
        MTD$nk_rgba_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgba_bv = gLibLookup.find("nk_rgba_bv").orElseThrow();
        MTD$nk_rgba_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgba_f = gLibLookup.find("nk_rgba_f").orElseThrow();
        MTD$nk_rgba_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_rgba_fv = gLibLookup.find("nk_rgba_fv").orElseThrow();
        MTD$nk_rgba_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rgba_cf = gLibLookup.find("nk_rgba_cf").orElseThrow();
        MTD$nk_rgba_cf = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, nuklear.nk_colorf.gStructLayout));
        MTD_ADDRESS$nk_rgba_hex = gLibLookup.find("nk_rgba_hex").orElseThrow();
        MTD$nk_rgba_hex = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rgba_hex, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsva_colorf = gLibLookup.find("nk_hsva_colorf").orElseThrow();
        MTD$nk_hsva_colorf = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_colorf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_hsva_colorfv = gLibLookup.find("nk_hsva_colorfv").orElseThrow();
        MTD$nk_hsva_colorfv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_colorfv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_colorf_hsva_f = gLibLookup.find("nk_colorf_hsva_f").orElseThrow();
        MTD$nk_colorf_hsva_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_colorf_hsva_f, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_colorf.gStructLayout));
        MTD_ADDRESS$nk_colorf_hsva_fv = gLibLookup.find("nk_colorf_hsva_fv").orElseThrow();
        MTD$nk_colorf_hsva_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_colorf_hsva_fv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_colorf.gStructLayout));
        MTD_ADDRESS$nk_hsv = gLibLookup.find("nk_hsv").orElseThrow();
        MTD$nk_hsv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_hsv_iv = gLibLookup.find("nk_hsv_iv").orElseThrow();
        MTD$nk_hsv_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsv_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsv_bv = gLibLookup.find("nk_hsv_bv").orElseThrow();
        MTD$nk_hsv_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsv_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsv_f = gLibLookup.find("nk_hsv_f").orElseThrow();
        MTD$nk_hsv_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsv_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_hsv_fv = gLibLookup.find("nk_hsv_fv").orElseThrow();
        MTD$nk_hsv_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsv_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsva = gLibLookup.find("nk_hsva").orElseThrow();
        MTD$nk_hsva = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_hsva_iv = gLibLookup.find("nk_hsva_iv").orElseThrow();
        MTD$nk_hsva_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsva_bv = gLibLookup.find("nk_hsva_bv").orElseThrow();
        MTD$nk_hsva_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_bv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_hsva_f = gLibLookup.find("nk_hsva_f").orElseThrow();
        MTD$nk_hsva_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_f, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_hsva_fv = gLibLookup.find("nk_hsva_fv").orElseThrow();
        MTD$nk_hsva_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_hsva_fv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_color_f = gLibLookup.find("nk_color_f").orElseThrow();
        MTD$nk_color_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_f, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_fv = gLibLookup.find("nk_color_fv").orElseThrow();
        MTD$nk_color_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_fv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_cf = gLibLookup.find("nk_color_cf").orElseThrow();
        MTD$nk_color_cf = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_cf, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_colorf.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_d = gLibLookup.find("nk_color_d").orElseThrow();
        MTD$nk_color_d = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_d, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_dv = gLibLookup.find("nk_color_dv").orElseThrow();
        MTD$nk_color_dv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_dv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_u32 = gLibLookup.find("nk_color_u32").orElseThrow();
        MTD$nk_color_u32 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_u32, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hex_rgba = gLibLookup.find("nk_color_hex_rgba").orElseThrow();
        MTD$nk_color_hex_rgba = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hex_rgba, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hex_rgb = gLibLookup.find("nk_color_hex_rgb").orElseThrow();
        MTD$nk_color_hex_rgb = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hex_rgb, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_i = gLibLookup.find("nk_color_hsv_i").orElseThrow();
        MTD$nk_color_hsv_i = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_i, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_b = gLibLookup.find("nk_color_hsv_b").orElseThrow();
        MTD$nk_color_hsv_b = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_b, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_iv = gLibLookup.find("nk_color_hsv_iv").orElseThrow();
        MTD$nk_color_hsv_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_iv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_bv = gLibLookup.find("nk_color_hsv_bv").orElseThrow();
        MTD$nk_color_hsv_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_bv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_f = gLibLookup.find("nk_color_hsv_f").orElseThrow();
        MTD$nk_color_hsv_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_f, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsv_fv = gLibLookup.find("nk_color_hsv_fv").orElseThrow();
        MTD$nk_color_hsv_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsv_fv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_i = gLibLookup.find("nk_color_hsva_i").orElseThrow();
        MTD$nk_color_hsva_i = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_i, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_b = gLibLookup.find("nk_color_hsva_b").orElseThrow();
        MTD$nk_color_hsva_b = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_b, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_iv = gLibLookup.find("nk_color_hsva_iv").orElseThrow();
        MTD$nk_color_hsva_iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_iv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_bv = gLibLookup.find("nk_color_hsva_bv").orElseThrow();
        MTD$nk_color_hsva_bv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_bv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_f = gLibLookup.find("nk_color_hsva_f").orElseThrow();
        MTD$nk_color_hsva_f = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_f, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_color_hsva_fv = gLibLookup.find("nk_color_hsva_fv").orElseThrow();
        MTD$nk_color_hsva_fv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_color_hsva_fv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_handle_ptr = gLibLookup.find("nk_handle_ptr").orElseThrow();
        MTD$nk_handle_ptr = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_handle_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_handle_id = gLibLookup.find("nk_handle_id").orElseThrow();
        MTD$nk_handle_id = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_handle_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_image_handle = gLibLookup.find("nk_image_handle").orElseThrow();
        MTD$nk_image_handle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, nuklear.nk_handle.gStructLayout));
        MTD_ADDRESS$nk_image_ptr = gLibLookup.find("nk_image_ptr").orElseThrow();
        MTD$nk_image_ptr = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_image_id = gLibLookup.find("nk_image_id").orElseThrow();
        MTD$nk_image_id = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_image_is_subimage = gLibLookup.find("nk_image_is_subimage").orElseThrow();
        MTD$nk_image_is_subimage = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_image_is_subimage, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_subimage_ptr = gLibLookup.find("nk_subimage_ptr").orElseThrow();
        MTD$nk_subimage_ptr = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_subimage_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_subimage_id = gLibLookup.find("nk_subimage_id").orElseThrow();
        MTD$nk_subimage_id = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_subimage_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_subimage_handle = gLibLookup.find("nk_subimage_handle").orElseThrow();
        MTD$nk_subimage_handle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_subimage_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_image.gStructLayout, nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_nine_slice_handle = gLibLookup.find("nk_nine_slice_handle").orElseThrow();
        MTD$nk_nine_slice_handle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_nine_slice_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_nine_slice_ptr = gLibLookup.find("nk_nine_slice_ptr").orElseThrow();
        MTD$nk_nine_slice_ptr = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_nine_slice_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_nine_slice_id = gLibLookup.find("nk_nine_slice_id").orElseThrow();
        MTD$nk_nine_slice_id = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_nine_slice_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_nine_slice_is_sub9slice = gLibLookup.find("nk_nine_slice_is_sub9slice").orElseThrow();
        MTD$nk_nine_slice_is_sub9slice = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_nine_slice_is_sub9slice, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_sub9slice_ptr = gLibLookup.find("nk_sub9slice_ptr").orElseThrow();
        MTD$nk_sub9slice_ptr = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_sub9slice_ptr, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_sub9slice_id = gLibLookup.find("nk_sub9slice_id").orElseThrow();
        MTD$nk_sub9slice_id = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_sub9slice_id, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_sub9slice_handle = gLibLookup.find("nk_sub9slice_handle").orElseThrow();
        MTD$nk_sub9slice_handle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_sub9slice_handle, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_nine_slice.gStructLayout, nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT, java.lang.foreign.ValueLayout.JAVA_SHORT));
        MTD_ADDRESS$nk_murmur_hash = gLibLookup.find("nk_murmur_hash").orElseThrow();
        MTD$nk_murmur_hash = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_murmur_hash, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_triangle_from_direction = gLibLookup.find("nk_triangle_from_direction").orElseThrow();
        MTD$nk_triangle_from_direction = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_triangle_from_direction, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_vec2 = gLibLookup.find("nk_vec2").orElseThrow();
        MTD$nk_vec2 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_vec2, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_vec2i = gLibLookup.find("nk_vec2i").orElseThrow();
        MTD$nk_vec2i = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_vec2i, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_vec2v = gLibLookup.find("nk_vec2v").orElseThrow();
        MTD$nk_vec2v = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_vec2v, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_vec2iv = gLibLookup.find("nk_vec2iv").orElseThrow();
        MTD$nk_vec2iv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_vec2iv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_get_null_rect = gLibLookup.find("nk_get_null_rect").orElseThrow();
        MTD$nk_get_null_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_get_null_rect, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_rect = gLibLookup.find("nk_rect").orElseThrow();
        MTD$nk_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rect, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_recti = gLibLookup.find("nk_recti").orElseThrow();
        MTD$nk_recti = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_recti, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_recta = gLibLookup.find("nk_recta").orElseThrow();
        MTD$nk_recta = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_recta, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_rectv = gLibLookup.find("nk_rectv").orElseThrow();
        MTD$nk_rectv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rectv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rectiv = gLibLookup.find("nk_rectiv").orElseThrow();
        MTD$nk_rectiv = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rectiv, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_rect_pos = gLibLookup.find("nk_rect_pos").orElseThrow();
        MTD$nk_rect_pos = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rect_pos, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_rect_size = gLibLookup.find("nk_rect_size").orElseThrow();
        MTD$nk_rect_size = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_rect_size, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_vec2.gStructLayout, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_strlen = gLibLookup.find("nk_strlen").orElseThrow();
        MTD$nk_strlen = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strlen, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_stricmp = gLibLookup.find("nk_stricmp").orElseThrow();
        MTD$nk_stricmp = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stricmp, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_stricmpn = gLibLookup.find("nk_stricmpn").orElseThrow();
        MTD$nk_stricmpn = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stricmpn, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_strtoi = gLibLookup.find("nk_strtoi").orElseThrow();
        MTD$nk_strtoi = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strtoi, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_strtof = gLibLookup.find("nk_strtof").orElseThrow();
        MTD$nk_strtof = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strtof, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_strtod = gLibLookup.find("nk_strtod").orElseThrow();
        MTD$nk_strtod = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strtod, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_DOUBLE, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_strfilter = gLibLookup.find("nk_strfilter").orElseThrow();
        MTD$nk_strfilter = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strfilter, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_strmatch_fuzzy_string = gLibLookup.find("nk_strmatch_fuzzy_string").orElseThrow();
        MTD$nk_strmatch_fuzzy_string = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strmatch_fuzzy_string, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_strmatch_fuzzy_text = gLibLookup.find("nk_strmatch_fuzzy_text").orElseThrow();
        MTD$nk_strmatch_fuzzy_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_strmatch_fuzzy_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_utf_decode = gLibLookup.find("nk_utf_decode").orElseThrow();
        MTD$nk_utf_decode = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_utf_decode, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_utf_encode = gLibLookup.find("nk_utf_encode").orElseThrow();
        MTD$nk_utf_encode = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_utf_encode, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_utf_len = gLibLookup.find("nk_utf_len").orElseThrow();
        MTD$nk_utf_len = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_utf_len, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_utf_at = gLibLookup.find("nk_utf_at").orElseThrow();
        MTD$nk_utf_at = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_utf_at, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_default_glyph_ranges = gLibLookup.find("nk_font_default_glyph_ranges").orElseThrow();
        MTD$nk_font_default_glyph_ranges = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_default_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_chinese_glyph_ranges = gLibLookup.find("nk_font_chinese_glyph_ranges").orElseThrow();
        MTD$nk_font_chinese_glyph_ranges = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_chinese_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_cyrillic_glyph_ranges = gLibLookup.find("nk_font_cyrillic_glyph_ranges").orElseThrow();
        MTD$nk_font_cyrillic_glyph_ranges = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_cyrillic_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_korean_glyph_ranges = gLibLookup.find("nk_font_korean_glyph_ranges").orElseThrow();
        MTD$nk_font_korean_glyph_ranges = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_korean_glyph_ranges, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_init_default = gLibLookup.find("nk_font_atlas_init_default").orElseThrow();
        MTD$nk_font_atlas_init_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_init = gLibLookup.find("nk_font_atlas_init").orElseThrow();
        MTD$nk_font_atlas_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_init, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_init_custom = gLibLookup.find("nk_font_atlas_init_custom").orElseThrow();
        MTD$nk_font_atlas_init_custom = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_init_custom, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_begin = gLibLookup.find("nk_font_atlas_begin").orElseThrow();
        MTD$nk_font_atlas_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_begin, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_config = gLibLookup.find("nk_font_config").orElseThrow();
        MTD$nk_font_config = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_config, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_font_config.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_font_atlas_add = gLibLookup.find("nk_font_atlas_add").orElseThrow();
        MTD$nk_font_atlas_add = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_add_default = gLibLookup.find("nk_font_atlas_add_default").orElseThrow();
        MTD$nk_font_atlas_add_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add_default, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_add_from_memory = gLibLookup.find("nk_font_atlas_add_from_memory").orElseThrow();
        MTD$nk_font_atlas_add_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_add_from_file = gLibLookup.find("nk_font_atlas_add_from_file").orElseThrow();
        MTD$nk_font_atlas_add_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_add_compressed = gLibLookup.find("nk_font_atlas_add_compressed").orElseThrow();
        MTD$nk_font_atlas_add_compressed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add_compressed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_add_compressed_base85 = gLibLookup.find("nk_font_atlas_add_compressed_base85").orElseThrow();
        MTD$nk_font_atlas_add_compressed_base85 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_add_compressed_base85, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_bake = gLibLookup.find("nk_font_atlas_bake").orElseThrow();
        MTD$nk_font_atlas_bake = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_bake, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_font_atlas_end = gLibLookup.find("nk_font_atlas_end").orElseThrow();
        MTD$nk_font_atlas_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_end, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_handle.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_find_glyph = gLibLookup.find("nk_font_find_glyph").orElseThrow();
        MTD$nk_font_find_glyph = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_find_glyph, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_font_atlas_cleanup = gLibLookup.find("nk_font_atlas_cleanup").orElseThrow();
        MTD$nk_font_atlas_cleanup = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_cleanup, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_font_atlas_clear = gLibLookup.find("nk_font_atlas_clear").orElseThrow();
        MTD$nk_font_atlas_clear = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_font_atlas_clear, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_init_default = gLibLookup.find("nk_buffer_init_default").orElseThrow();
        MTD$nk_buffer_init_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_init = gLibLookup.find("nk_buffer_init").orElseThrow();
        MTD$nk_buffer_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_init, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_buffer_init_fixed = gLibLookup.find("nk_buffer_init_fixed").orElseThrow();
        MTD$nk_buffer_init_fixed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_buffer_info = gLibLookup.find("nk_buffer_info").orElseThrow();
        MTD$nk_buffer_info = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_info, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_push = gLibLookup.find("nk_buffer_push").orElseThrow();
        MTD$nk_buffer_push = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_push, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_buffer_mark = gLibLookup.find("nk_buffer_mark").orElseThrow();
        MTD$nk_buffer_mark = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_mark, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_buffer_reset = gLibLookup.find("nk_buffer_reset").orElseThrow();
        MTD$nk_buffer_reset = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_reset, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_buffer_clear = gLibLookup.find("nk_buffer_clear").orElseThrow();
        MTD$nk_buffer_clear = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_clear, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_free = gLibLookup.find("nk_buffer_free").orElseThrow();
        MTD$nk_buffer_free = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_free, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_memory = gLibLookup.find("nk_buffer_memory").orElseThrow();
        MTD$nk_buffer_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_memory_const = gLibLookup.find("nk_buffer_memory_const").orElseThrow();
        MTD$nk_buffer_memory_const = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_memory_const, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_buffer_total = gLibLookup.find("nk_buffer_total").orElseThrow();
        MTD$nk_buffer_total = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_buffer_total, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_init_default = gLibLookup.find("nk_str_init_default").orElseThrow();
        MTD$nk_str_init_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_init = gLibLookup.find("nk_str_init").orElseThrow();
        MTD$nk_str_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_init, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_str_init_fixed = gLibLookup.find("nk_str_init_fixed").orElseThrow();
        MTD$nk_str_init_fixed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_str_clear = gLibLookup.find("nk_str_clear").orElseThrow();
        MTD$nk_str_clear = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_clear, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_free = gLibLookup.find("nk_str_free").orElseThrow();
        MTD$nk_str_free = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_free, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_append_text_char = gLibLookup.find("nk_str_append_text_char").orElseThrow();
        MTD$nk_str_append_text_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_text_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_append_str_char = gLibLookup.find("nk_str_append_str_char").orElseThrow();
        MTD$nk_str_append_str_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_str_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_append_text_utf8 = gLibLookup.find("nk_str_append_text_utf8").orElseThrow();
        MTD$nk_str_append_text_utf8 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_text_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_append_str_utf8 = gLibLookup.find("nk_str_append_str_utf8").orElseThrow();
        MTD$nk_str_append_str_utf8 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_str_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_append_text_runes = gLibLookup.find("nk_str_append_text_runes").orElseThrow();
        MTD$nk_str_append_text_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_text_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_append_str_runes = gLibLookup.find("nk_str_append_str_runes").orElseThrow();
        MTD$nk_str_append_str_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_append_str_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_insert_at_char = gLibLookup.find("nk_str_insert_at_char").orElseThrow();
        MTD$nk_str_insert_at_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_at_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_insert_at_rune = gLibLookup.find("nk_str_insert_at_rune").orElseThrow();
        MTD$nk_str_insert_at_rune = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_at_rune, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_insert_text_char = gLibLookup.find("nk_str_insert_text_char").orElseThrow();
        MTD$nk_str_insert_text_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_text_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_insert_str_char = gLibLookup.find("nk_str_insert_str_char").orElseThrow();
        MTD$nk_str_insert_str_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_str_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_insert_text_utf8 = gLibLookup.find("nk_str_insert_text_utf8").orElseThrow();
        MTD$nk_str_insert_text_utf8 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_text_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_insert_str_utf8 = gLibLookup.find("nk_str_insert_str_utf8").orElseThrow();
        MTD$nk_str_insert_str_utf8 = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_str_utf8, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_insert_text_runes = gLibLookup.find("nk_str_insert_text_runes").orElseThrow();
        MTD$nk_str_insert_text_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_text_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_insert_str_runes = gLibLookup.find("nk_str_insert_str_runes").orElseThrow();
        MTD$nk_str_insert_str_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_insert_str_runes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_remove_chars = gLibLookup.find("nk_str_remove_chars").orElseThrow();
        MTD$nk_str_remove_chars = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_remove_chars, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_remove_runes = gLibLookup.find("nk_str_remove_runes").orElseThrow();
        MTD$nk_str_remove_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_remove_runes, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_delete_chars = gLibLookup.find("nk_str_delete_chars").orElseThrow();
        MTD$nk_str_delete_chars = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_delete_chars, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_delete_runes = gLibLookup.find("nk_str_delete_runes").orElseThrow();
        MTD$nk_str_delete_runes = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_delete_runes, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_at_char = gLibLookup.find("nk_str_at_char").orElseThrow();
        MTD$nk_str_at_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_at_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_at_rune = gLibLookup.find("nk_str_at_rune").orElseThrow();
        MTD$nk_str_at_rune = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_at_rune, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_rune_at = gLibLookup.find("nk_str_rune_at").orElseThrow();
        MTD$nk_str_rune_at = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_rune_at, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_at_char_const = gLibLookup.find("nk_str_at_char_const").orElseThrow();
        MTD$nk_str_at_char_const = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_at_char_const, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_str_at_const = gLibLookup.find("nk_str_at_const").orElseThrow();
        MTD$nk_str_at_const = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_at_const, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_get = gLibLookup.find("nk_str_get").orElseThrow();
        MTD$nk_str_get = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_get, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_get_const = gLibLookup.find("nk_str_get_const").orElseThrow();
        MTD$nk_str_get_const = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_get_const, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_len = gLibLookup.find("nk_str_len").orElseThrow();
        MTD$nk_str_len = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_len, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_str_len_char = gLibLookup.find("nk_str_len_char").orElseThrow();
        MTD$nk_str_len_char = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_str_len_char, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_filter_default = gLibLookup.find("nk_filter_default").orElseThrow();
        MTD$nk_filter_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_default, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_ascii = gLibLookup.find("nk_filter_ascii").orElseThrow();
        MTD$nk_filter_ascii = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_ascii, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_float = gLibLookup.find("nk_filter_float").orElseThrow();
        MTD$nk_filter_float = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_float, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_decimal = gLibLookup.find("nk_filter_decimal").orElseThrow();
        MTD$nk_filter_decimal = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_decimal, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_hex = gLibLookup.find("nk_filter_hex").orElseThrow();
        MTD$nk_filter_hex = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_hex, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_oct = gLibLookup.find("nk_filter_oct").orElseThrow();
        MTD$nk_filter_oct = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_oct, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_filter_binary = gLibLookup.find("nk_filter_binary").orElseThrow();
        MTD$nk_filter_binary = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_filter_binary, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_textedit_init_default = gLibLookup.find("nk_textedit_init_default").orElseThrow();
        MTD$nk_textedit_init_default = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_init_default, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_init = gLibLookup.find("nk_textedit_init").orElseThrow();
        MTD$nk_textedit_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_init, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_textedit_init_fixed = gLibLookup.find("nk_textedit_init_fixed").orElseThrow();
        MTD$nk_textedit_init_fixed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_init_fixed, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$nk_textedit_free = gLibLookup.find("nk_textedit_free").orElseThrow();
        MTD$nk_textedit_free = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_free, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_text = gLibLookup.find("nk_textedit_text").orElseThrow();
        MTD$nk_textedit_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_text, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_textedit_delete = gLibLookup.find("nk_textedit_delete").orElseThrow();
        MTD$nk_textedit_delete = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_delete, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_textedit_delete_selection = gLibLookup.find("nk_textedit_delete_selection").orElseThrow();
        MTD$nk_textedit_delete_selection = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_delete_selection, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_select_all = gLibLookup.find("nk_textedit_select_all").orElseThrow();
        MTD$nk_textedit_select_all = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_select_all, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_cut = gLibLookup.find("nk_textedit_cut").orElseThrow();
        MTD$nk_textedit_cut = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_cut, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_paste = gLibLookup.find("nk_textedit_paste").orElseThrow();
        MTD$nk_textedit_paste = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_paste, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_textedit_undo = gLibLookup.find("nk_textedit_undo").orElseThrow();
        MTD$nk_textedit_undo = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_undo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_textedit_redo = gLibLookup.find("nk_textedit_redo").orElseThrow();
        MTD$nk_textedit_redo = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_textedit_redo, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_stroke_line = gLibLookup.find("nk_stroke_line").orElseThrow();
        MTD$nk_stroke_line = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_line, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_curve = gLibLookup.find("nk_stroke_curve").orElseThrow();
        MTD$nk_stroke_curve = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_curve, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_rect = gLibLookup.find("nk_stroke_rect").orElseThrow();
        MTD$nk_stroke_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_rect, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_circle = gLibLookup.find("nk_stroke_circle").orElseThrow();
        MTD$nk_stroke_circle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_circle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_arc = gLibLookup.find("nk_stroke_arc").orElseThrow();
        MTD$nk_stroke_arc = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_arc, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_triangle = gLibLookup.find("nk_stroke_triangle").orElseThrow();
        MTD$nk_stroke_triangle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_polyline = gLibLookup.find("nk_stroke_polyline").orElseThrow();
        MTD$nk_stroke_polyline = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_polyline, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_stroke_polygon = gLibLookup.find("nk_stroke_polygon").orElseThrow();
        MTD$nk_stroke_polygon = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_stroke_polygon, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_rect = gLibLookup.find("nk_fill_rect").orElseThrow();
        MTD$nk_fill_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_rect, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_rect_multi_color = gLibLookup.find("nk_fill_rect_multi_color").orElseThrow();
        MTD$nk_fill_rect_multi_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_rect_multi_color, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_circle = gLibLookup.find("nk_fill_circle").orElseThrow();
        MTD$nk_fill_circle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_circle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_arc = gLibLookup.find("nk_fill_arc").orElseThrow();
        MTD$nk_fill_arc = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_arc, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_triangle = gLibLookup.find("nk_fill_triangle").orElseThrow();
        MTD$nk_fill_triangle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_fill_polygon = gLibLookup.find("nk_fill_polygon").orElseThrow();
        MTD$nk_fill_polygon = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_fill_polygon, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_image = gLibLookup.find("nk_draw_image").orElseThrow();
        MTD$nk_draw_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_image, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_nine_slice = gLibLookup.find("nk_draw_nine_slice").orElseThrow();
        MTD$nk_draw_nine_slice = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_nine_slice, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_text = gLibLookup.find("nk_draw_text").orElseThrow();
        MTD$nk_draw_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_text, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_push_scissor = gLibLookup.find("nk_push_scissor").orElseThrow();
        MTD$nk_push_scissor = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_push_scissor, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_push_custom = gLibLookup.find("nk_push_custom").orElseThrow();
        MTD$nk_push_custom = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_push_custom, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_handle.gStructLayout));
        MTD_ADDRESS$nk_input_has_mouse_click = gLibLookup.find("nk_input_has_mouse_click").orElseThrow();
        MTD$nk_input_has_mouse_click = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_has_mouse_click, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_has_mouse_click_in_rect = gLibLookup.find("nk_input_has_mouse_click_in_rect").orElseThrow();
        MTD$nk_input_has_mouse_click_in_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_has_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_has_mouse_click_in_button_rect = gLibLookup.find("nk_input_has_mouse_click_in_button_rect").orElseThrow();
        MTD$nk_input_has_mouse_click_in_button_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_has_mouse_click_in_button_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_has_mouse_click_down_in_rect = gLibLookup.find("nk_input_has_mouse_click_down_in_rect").orElseThrow();
        MTD$nk_input_has_mouse_click_down_in_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_has_mouse_click_down_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_mouse_click_in_rect = gLibLookup.find("nk_input_is_mouse_click_in_rect").orElseThrow();
        MTD$nk_input_is_mouse_click_in_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_is_mouse_click_down_in_rect = gLibLookup.find("nk_input_is_mouse_click_down_in_rect").orElseThrow();
        MTD$nk_input_is_mouse_click_down_in_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_click_down_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_any_mouse_click_in_rect = gLibLookup.find("nk_input_any_mouse_click_in_rect").orElseThrow();
        MTD$nk_input_any_mouse_click_in_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_any_mouse_click_in_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_is_mouse_prev_hovering_rect = gLibLookup.find("nk_input_is_mouse_prev_hovering_rect").orElseThrow();
        MTD$nk_input_is_mouse_prev_hovering_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_prev_hovering_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_is_mouse_hovering_rect = gLibLookup.find("nk_input_is_mouse_hovering_rect").orElseThrow();
        MTD$nk_input_is_mouse_hovering_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_hovering_rect, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_mouse_clicked = gLibLookup.find("nk_input_mouse_clicked").orElseThrow();
        MTD$nk_input_mouse_clicked = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_mouse_clicked, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_rect.gStructLayout));
        MTD_ADDRESS$nk_input_is_mouse_down = gLibLookup.find("nk_input_is_mouse_down").orElseThrow();
        MTD$nk_input_is_mouse_down = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_mouse_pressed = gLibLookup.find("nk_input_is_mouse_pressed").orElseThrow();
        MTD$nk_input_is_mouse_pressed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_pressed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_mouse_released = gLibLookup.find("nk_input_is_mouse_released").orElseThrow();
        MTD$nk_input_is_mouse_released = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_mouse_released, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_key_pressed = gLibLookup.find("nk_input_is_key_pressed").orElseThrow();
        MTD$nk_input_is_key_pressed = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_key_pressed, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_key_released = gLibLookup.find("nk_input_is_key_released").orElseThrow();
        MTD$nk_input_is_key_released = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_key_released, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_input_is_key_down = gLibLookup.find("nk_input_is_key_down").orElseThrow();
        MTD$nk_input_is_key_down = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_input_is_key_down, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_init = gLibLookup.find("nk_draw_list_init").orElseThrow();
        MTD$nk_draw_list_init = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_init, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_draw_list_setup = gLibLookup.find("nk_draw_list_setup").orElseThrow();
        MTD$nk_draw_list_setup = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_setup, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk__draw_list_begin = gLibLookup.find("nk__draw_list_begin").orElseThrow();
        MTD$nk__draw_list_begin = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_list_begin, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__draw_list_next = gLibLookup.find("nk__draw_list_next").orElseThrow();
        MTD$nk__draw_list_next = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_list_next, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk__draw_list_end = gLibLookup.find("nk__draw_list_end").orElseThrow();
        MTD$nk__draw_list_end = gSystemLinker.downcallHandle(MTD_ADDRESS$nk__draw_list_end, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_draw_list_path_clear = gLibLookup.find("nk_draw_list_path_clear").orElseThrow();
        MTD$nk_draw_list_path_clear = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_clear, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$nk_draw_list_path_line_to = gLibLookup.find("nk_draw_list_path_line_to").orElseThrow();
        MTD$nk_draw_list_path_line_to = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_line_to, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout));
        MTD_ADDRESS$nk_draw_list_path_arc_to_fast = gLibLookup.find("nk_draw_list_path_arc_to_fast").orElseThrow();
        MTD$nk_draw_list_path_arc_to_fast = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_arc_to_fast, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_path_arc_to = gLibLookup.find("nk_draw_list_path_arc_to").orElseThrow();
        MTD$nk_draw_list_path_arc_to = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_arc_to, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_path_rect_to = gLibLookup.find("nk_draw_list_path_rect_to").orElseThrow();
        MTD$nk_draw_list_path_rect_to = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_rect_to, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_path_curve_to = gLibLookup.find("nk_draw_list_path_curve_to").orElseThrow();
        MTD$nk_draw_list_path_curve_to = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_curve_to, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_path_fill = gLibLookup.find("nk_draw_list_path_fill").orElseThrow();
        MTD$nk_draw_list_path_fill = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_fill, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_list_path_stroke = gLibLookup.find("nk_draw_list_path_stroke").orElseThrow();
        MTD$nk_draw_list_path_stroke = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_path_stroke, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_line = gLibLookup.find("nk_draw_list_stroke_line").orElseThrow();
        MTD$nk_draw_list_stroke_line = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_line, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_rect = gLibLookup.find("nk_draw_list_stroke_rect").orElseThrow();
        MTD$nk_draw_list_stroke_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_rect, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_triangle = gLibLookup.find("nk_draw_list_stroke_triangle").orElseThrow();
        MTD$nk_draw_list_stroke_triangle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_circle = gLibLookup.find("nk_draw_list_stroke_circle").orElseThrow();
        MTD$nk_draw_list_stroke_circle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_circle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_curve = gLibLookup.find("nk_draw_list_stroke_curve").orElseThrow();
        MTD$nk_draw_list_stroke_curve = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_curve, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_stroke_poly_line = gLibLookup.find("nk_draw_list_stroke_poly_line").orElseThrow();
        MTD$nk_draw_list_stroke_poly_line = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_stroke_poly_line, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_fill_rect = gLibLookup.find("nk_draw_list_fill_rect").orElseThrow();
        MTD$nk_draw_list_fill_rect = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_fill_rect, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$nk_draw_list_fill_rect_multi_color = gLibLookup.find("nk_draw_list_fill_rect_multi_color").orElseThrow();
        MTD$nk_draw_list_fill_rect_multi_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_fill_rect_multi_color, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_list_fill_triangle = gLibLookup.find("nk_draw_list_fill_triangle").orElseThrow();
        MTD$nk_draw_list_fill_triangle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_fill_triangle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_vec2.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_list_fill_circle = gLibLookup.find("nk_draw_list_fill_circle").orElseThrow();
        MTD$nk_draw_list_fill_circle = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_fill_circle, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_vec2.gStructLayout, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_fill_poly_convex = gLibLookup.find("nk_draw_list_fill_poly_convex").orElseThrow();
        MTD$nk_draw_list_fill_poly_convex = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_fill_poly_convex, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, nuklear.nk_color.gStructLayout, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$nk_draw_list_add_image = gLibLookup.find("nk_draw_list_add_image").orElseThrow();
        MTD$nk_draw_list_add_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_add_image, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_image.gStructLayout, nuklear.nk_rect.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_draw_list_add_text = gLibLookup.find("nk_draw_list_add_text").orElseThrow();
        MTD$nk_draw_list_add_text = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_draw_list_add_text, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, nuklear.nk_rect.gStructLayout, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_FLOAT, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_style_item_color = gLibLookup.find("nk_style_item_color").orElseThrow();
        MTD$nk_style_item_color = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_item_color, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gStructLayout, nuklear.nk_color.gStructLayout));
        MTD_ADDRESS$nk_style_item_image = gLibLookup.find("nk_style_item_image").orElseThrow();
        MTD$nk_style_item_image = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_item_image, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gStructLayout, nuklear.nk_image.gStructLayout));
        MTD_ADDRESS$nk_style_item_nine_slice = gLibLookup.find("nk_style_item_nine_slice").orElseThrow();
        MTD$nk_style_item_nine_slice = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_item_nine_slice, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gStructLayout, nuklear.nk_nine_slice.gStructLayout));
        MTD_ADDRESS$nk_style_item_hide = gLibLookup.find("nk_style_item_hide").orElseThrow();
        MTD$nk_style_item_hide = gSystemLinker.downcallHandle(MTD_ADDRESS$nk_style_item_hide, java.lang.foreign.FunctionDescriptor.of(nuklear.nk_style_item.gStructLayout));
    }
}
