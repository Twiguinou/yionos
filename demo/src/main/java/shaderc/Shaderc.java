package shaderc;

public final class Shaderc
{private Shaderc() {}

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compiler_initialize;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compiler_initialize;
    public static java.lang.foreign.MemorySegment shaderc_compiler_initialize()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compiler_initialize.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compiler_release;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compiler_release;
    public static void shaderc_compiler_release(java.lang.foreign.MemorySegment __arg1)
    {
        try {MTD__shaderc_compiler_release.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_initialize;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_initialize;
    public static java.lang.foreign.MemorySegment shaderc_compile_options_initialize()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compile_options_initialize.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_clone;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_clone;
    public static java.lang.foreign.MemorySegment shaderc_compile_options_clone(java.lang.foreign.MemorySegment options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compile_options_clone.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_release;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_release;
    public static void shaderc_compile_options_release(java.lang.foreign.MemorySegment options)
    {
        try {MTD__shaderc_compile_options_release.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_add_macro_definition;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_add_macro_definition;
    public static void shaderc_compile_options_add_macro_definition(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment name, long name_length, java.lang.foreign.MemorySegment value, long value_length)
    {
        try {MTD__shaderc_compile_options_add_macro_definition.invokeExact(options, name, name_length, value, value_length);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_source_language;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_source_language;
    public static void shaderc_compile_options_set_source_language(java.lang.foreign.MemorySegment options, int lang)
    {
        try {MTD__shaderc_compile_options_set_source_language.invokeExact(options, lang);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_generate_debug_info;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_generate_debug_info;
    public static void shaderc_compile_options_set_generate_debug_info(java.lang.foreign.MemorySegment options)
    {
        try {MTD__shaderc_compile_options_set_generate_debug_info.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_optimization_level;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_optimization_level;
    public static void shaderc_compile_options_set_optimization_level(java.lang.foreign.MemorySegment options, int level)
    {
        try {MTD__shaderc_compile_options_set_optimization_level.invokeExact(options, level);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_forced_version_profile;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_forced_version_profile;
    public static void shaderc_compile_options_set_forced_version_profile(java.lang.foreign.MemorySegment options, int version, int profile)
    {
        try {MTD__shaderc_compile_options_set_forced_version_profile.invokeExact(options, version, profile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_include_callbacks;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_include_callbacks;
    public static void shaderc_compile_options_set_include_callbacks(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment resolver, java.lang.foreign.MemorySegment result_releaser, java.lang.foreign.MemorySegment user_data)
    {
        try {MTD__shaderc_compile_options_set_include_callbacks.invokeExact(options, resolver, result_releaser, user_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_suppress_warnings;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_suppress_warnings;
    public static void shaderc_compile_options_set_suppress_warnings(java.lang.foreign.MemorySegment options)
    {
        try {MTD__shaderc_compile_options_set_suppress_warnings.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_target_env;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_target_env;
    public static void shaderc_compile_options_set_target_env(java.lang.foreign.MemorySegment options, int target, int version)
    {
        try {MTD__shaderc_compile_options_set_target_env.invokeExact(options, target, version);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_target_spirv;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_target_spirv;
    public static void shaderc_compile_options_set_target_spirv(java.lang.foreign.MemorySegment options, int version)
    {
        try {MTD__shaderc_compile_options_set_target_spirv.invokeExact(options, version);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_warnings_as_errors;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_warnings_as_errors;
    public static void shaderc_compile_options_set_warnings_as_errors(java.lang.foreign.MemorySegment options)
    {
        try {MTD__shaderc_compile_options_set_warnings_as_errors.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_limit;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_limit;
    public static void shaderc_compile_options_set_limit(java.lang.foreign.MemorySegment options, int limit, int value)
    {
        try {MTD__shaderc_compile_options_set_limit.invokeExact(options, limit, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_auto_bind_uniforms;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_auto_bind_uniforms;
    public static void shaderc_compile_options_set_auto_bind_uniforms(java.lang.foreign.MemorySegment options, boolean auto_bind)
    {
        try {MTD__shaderc_compile_options_set_auto_bind_uniforms.invokeExact(options, auto_bind);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_auto_combined_image_sampler;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_auto_combined_image_sampler;
    public static void shaderc_compile_options_set_auto_combined_image_sampler(java.lang.foreign.MemorySegment options, boolean upgrade)
    {
        try {MTD__shaderc_compile_options_set_auto_combined_image_sampler.invokeExact(options, upgrade);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_io_mapping;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_io_mapping;
    public static void shaderc_compile_options_set_hlsl_io_mapping(java.lang.foreign.MemorySegment options, boolean hlsl_iomap)
    {
        try {MTD__shaderc_compile_options_set_hlsl_io_mapping.invokeExact(options, hlsl_iomap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_offsets;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_offsets;
    public static void shaderc_compile_options_set_hlsl_offsets(java.lang.foreign.MemorySegment options, boolean hlsl_offsets)
    {
        try {MTD__shaderc_compile_options_set_hlsl_offsets.invokeExact(options, hlsl_offsets);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_binding_base;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_binding_base;
    public static void shaderc_compile_options_set_binding_base(java.lang.foreign.MemorySegment options, int kind, int base)
    {
        try {MTD__shaderc_compile_options_set_binding_base.invokeExact(options, kind, base);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_binding_base_for_stage;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_binding_base_for_stage;
    public static void shaderc_compile_options_set_binding_base_for_stage(java.lang.foreign.MemorySegment options, int shader_kind, int kind, int base)
    {
        try {MTD__shaderc_compile_options_set_binding_base_for_stage.invokeExact(options, shader_kind, kind, base);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_preserve_bindings;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_preserve_bindings;
    public static void shaderc_compile_options_set_preserve_bindings(java.lang.foreign.MemorySegment options, boolean preserve_bindings)
    {
        try {MTD__shaderc_compile_options_set_preserve_bindings.invokeExact(options, preserve_bindings);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_auto_map_locations;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_auto_map_locations;
    public static void shaderc_compile_options_set_auto_map_locations(java.lang.foreign.MemorySegment options, boolean auto_map)
    {
        try {MTD__shaderc_compile_options_set_auto_map_locations.invokeExact(options, auto_map);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage;
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(java.lang.foreign.MemorySegment options, int shader_kind, java.lang.foreign.MemorySegment reg, java.lang.foreign.MemorySegment set, java.lang.foreign.MemorySegment binding)
    {
        try {MTD__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage.invokeExact(options, shader_kind, reg, set, binding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_register_set_and_binding;
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment reg, java.lang.foreign.MemorySegment set, java.lang.foreign.MemorySegment binding)
    {
        try {MTD__shaderc_compile_options_set_hlsl_register_set_and_binding.invokeExact(options, reg, set, binding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_functionality1;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_functionality1;
    public static void shaderc_compile_options_set_hlsl_functionality1(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD__shaderc_compile_options_set_hlsl_functionality1.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_hlsl_16bit_types;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_hlsl_16bit_types;
    public static void shaderc_compile_options_set_hlsl_16bit_types(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD__shaderc_compile_options_set_hlsl_16bit_types.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_vulkan_rules_relaxed;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_vulkan_rules_relaxed;
    public static void shaderc_compile_options_set_vulkan_rules_relaxed(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD__shaderc_compile_options_set_vulkan_rules_relaxed.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_invert_y;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_invert_y;
    public static void shaderc_compile_options_set_invert_y(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD__shaderc_compile_options_set_invert_y.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_options_set_nan_clamp;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_options_set_nan_clamp;
    public static void shaderc_compile_options_set_nan_clamp(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD__shaderc_compile_options_set_nan_clamp.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_into_spv;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_into_spv;
    public static java.lang.foreign.MemorySegment shaderc_compile_into_spv(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compile_into_spv.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_into_spv_assembly;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_into_spv_assembly;
    public static java.lang.foreign.MemorySegment shaderc_compile_into_spv_assembly(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compile_into_spv_assembly.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_compile_into_preprocessed_text;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_compile_into_preprocessed_text;
    public static java.lang.foreign.MemorySegment shaderc_compile_into_preprocessed_text(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_compile_into_preprocessed_text.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_assemble_into_spv;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_assemble_into_spv;
    public static java.lang.foreign.MemorySegment shaderc_assemble_into_spv(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_assembly, long source_assembly_size, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_assemble_into_spv.invokeExact(compiler, source_assembly, source_assembly_size, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_release;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_release;
    public static void shaderc_result_release(java.lang.foreign.MemorySegment result)
    {
        try {MTD__shaderc_result_release.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_length;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_length;
    public static long shaderc_result_get_length(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD__shaderc_result_get_length.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_num_warnings;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_num_warnings;
    public static long shaderc_result_get_num_warnings(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD__shaderc_result_get_num_warnings.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_num_errors;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_num_errors;
    public static long shaderc_result_get_num_errors(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD__shaderc_result_get_num_errors.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_compilation_status;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_compilation_status;
    public static int shaderc_result_get_compilation_status(java.lang.foreign.MemorySegment __arg1)
    {
        try {return (int)MTD__shaderc_result_get_compilation_status.invokeExact(__arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_bytes;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_bytes;
    public static java.lang.foreign.MemorySegment shaderc_result_get_bytes(java.lang.foreign.MemorySegment result)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_result_get_bytes.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_result_get_error_message;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_result_get_error_message;
    public static java.lang.foreign.MemorySegment shaderc_result_get_error_message(java.lang.foreign.MemorySegment result)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__shaderc_result_get_error_message.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_get_spv_version;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_get_spv_version;
    public static void shaderc_get_spv_version(java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment revision)
    {
        try {MTD__shaderc_get_spv_version.invokeExact(version, revision);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__shaderc_parse_version_profile;
    public static final java.lang.invoke.MethodHandle MTD__shaderc_parse_version_profile;
    public static boolean shaderc_parse_version_profile(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment profile)
    {
        try {return (boolean)MTD__shaderc_parse_version_profile.invokeExact(str, version, profile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));

        MTD_ADDRESS__shaderc_compiler_initialize = lookup.find("shaderc_compiler_initialize").orElseThrow();
        MTD__shaderc_compiler_initialize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compiler_initialize, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compiler_release = lookup.find("shaderc_compiler_release").orElseThrow();
        MTD__shaderc_compiler_release = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compiler_release, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_initialize = lookup.find("shaderc_compile_options_initialize").orElseThrow();
        MTD__shaderc_compile_options_initialize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_initialize, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_clone = lookup.find("shaderc_compile_options_clone").orElseThrow();
        MTD__shaderc_compile_options_clone = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_clone, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_release = lookup.find("shaderc_compile_options_release").orElseThrow();
        MTD__shaderc_compile_options_release = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_release, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_add_macro_definition = lookup.find("shaderc_compile_options_add_macro_definition").orElseThrow();
        MTD__shaderc_compile_options_add_macro_definition = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_add_macro_definition, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS__shaderc_compile_options_set_source_language = lookup.find("shaderc_compile_options_set_source_language").orElseThrow();
        MTD__shaderc_compile_options_set_source_language = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_source_language, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_generate_debug_info = lookup.find("shaderc_compile_options_set_generate_debug_info").orElseThrow();
        MTD__shaderc_compile_options_set_generate_debug_info = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_generate_debug_info, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_optimization_level = lookup.find("shaderc_compile_options_set_optimization_level").orElseThrow();
        MTD__shaderc_compile_options_set_optimization_level = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_optimization_level, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_forced_version_profile = lookup.find("shaderc_compile_options_set_forced_version_profile").orElseThrow();
        MTD__shaderc_compile_options_set_forced_version_profile = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_forced_version_profile, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_include_callbacks = lookup.find("shaderc_compile_options_set_include_callbacks").orElseThrow();
        MTD__shaderc_compile_options_set_include_callbacks = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_include_callbacks, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_suppress_warnings = lookup.find("shaderc_compile_options_set_suppress_warnings").orElseThrow();
        MTD__shaderc_compile_options_set_suppress_warnings = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_suppress_warnings, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_target_env = lookup.find("shaderc_compile_options_set_target_env").orElseThrow();
        MTD__shaderc_compile_options_set_target_env = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_target_env, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_target_spirv = lookup.find("shaderc_compile_options_set_target_spirv").orElseThrow();
        MTD__shaderc_compile_options_set_target_spirv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_target_spirv, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_warnings_as_errors = lookup.find("shaderc_compile_options_set_warnings_as_errors").orElseThrow();
        MTD__shaderc_compile_options_set_warnings_as_errors = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_warnings_as_errors, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_limit = lookup.find("shaderc_compile_options_set_limit").orElseThrow();
        MTD__shaderc_compile_options_set_limit = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_limit, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_auto_bind_uniforms = lookup.find("shaderc_compile_options_set_auto_bind_uniforms").orElseThrow();
        MTD__shaderc_compile_options_set_auto_bind_uniforms = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_auto_bind_uniforms, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_auto_combined_image_sampler = lookup.find("shaderc_compile_options_set_auto_combined_image_sampler").orElseThrow();
        MTD__shaderc_compile_options_set_auto_combined_image_sampler = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_auto_combined_image_sampler, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_io_mapping = lookup.find("shaderc_compile_options_set_hlsl_io_mapping").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_io_mapping = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_io_mapping, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_offsets = lookup.find("shaderc_compile_options_set_hlsl_offsets").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_offsets = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_offsets, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_binding_base = lookup.find("shaderc_compile_options_set_binding_base").orElseThrow();
        MTD__shaderc_compile_options_set_binding_base = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_binding_base, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_binding_base_for_stage = lookup.find("shaderc_compile_options_set_binding_base_for_stage").orElseThrow();
        MTD__shaderc_compile_options_set_binding_base_for_stage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_binding_base_for_stage, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__shaderc_compile_options_set_preserve_bindings = lookup.find("shaderc_compile_options_set_preserve_bindings").orElseThrow();
        MTD__shaderc_compile_options_set_preserve_bindings = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_preserve_bindings, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_auto_map_locations = lookup.find("shaderc_compile_options_set_auto_map_locations").orElseThrow();
        MTD__shaderc_compile_options_set_auto_map_locations = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_auto_map_locations, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = lookup.find("shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding = lookup.find("shaderc_compile_options_set_hlsl_register_set_and_binding").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_register_set_and_binding = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_register_set_and_binding, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_functionality1 = lookup.find("shaderc_compile_options_set_hlsl_functionality1").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_functionality1 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_functionality1, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_hlsl_16bit_types = lookup.find("shaderc_compile_options_set_hlsl_16bit_types").orElseThrow();
        MTD__shaderc_compile_options_set_hlsl_16bit_types = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_hlsl_16bit_types, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_vulkan_rules_relaxed = lookup.find("shaderc_compile_options_set_vulkan_rules_relaxed").orElseThrow();
        MTD__shaderc_compile_options_set_vulkan_rules_relaxed = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_vulkan_rules_relaxed, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_invert_y = lookup.find("shaderc_compile_options_set_invert_y").orElseThrow();
        MTD__shaderc_compile_options_set_invert_y = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_invert_y, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_options_set_nan_clamp = lookup.find("shaderc_compile_options_set_nan_clamp").orElseThrow();
        MTD__shaderc_compile_options_set_nan_clamp = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_options_set_nan_clamp, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS__shaderc_compile_into_spv = lookup.find("shaderc_compile_into_spv").orElseThrow();
        MTD__shaderc_compile_into_spv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_into_spv, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_into_spv_assembly = lookup.find("shaderc_compile_into_spv_assembly").orElseThrow();
        MTD__shaderc_compile_into_spv_assembly = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_into_spv_assembly, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_compile_into_preprocessed_text = lookup.find("shaderc_compile_into_preprocessed_text").orElseThrow();
        MTD__shaderc_compile_into_preprocessed_text = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_compile_into_preprocessed_text, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_assemble_into_spv = lookup.find("shaderc_assemble_into_spv").orElseThrow();
        MTD__shaderc_assemble_into_spv = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_assemble_into_spv, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_release = lookup.find("shaderc_result_release").orElseThrow();
        MTD__shaderc_result_release = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_release, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_length = lookup.find("shaderc_result_get_length").orElseThrow();
        MTD__shaderc_result_get_length = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_num_warnings = lookup.find("shaderc_result_get_num_warnings").orElseThrow();
        MTD__shaderc_result_get_num_warnings = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_num_warnings, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_num_errors = lookup.find("shaderc_result_get_num_errors").orElseThrow();
        MTD__shaderc_result_get_num_errors = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_num_errors, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_compilation_status = lookup.find("shaderc_result_get_compilation_status").orElseThrow();
        MTD__shaderc_result_get_compilation_status = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_compilation_status, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_bytes = lookup.find("shaderc_result_get_bytes").orElseThrow();
        MTD__shaderc_result_get_bytes = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_bytes, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_result_get_error_message = lookup.find("shaderc_result_get_error_message").orElseThrow();
        MTD__shaderc_result_get_error_message = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_result_get_error_message, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_get_spv_version = lookup.find("shaderc_get_spv_version").orElseThrow();
        MTD__shaderc_get_spv_version = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_get_spv_version, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__shaderc_parse_version_profile = lookup.find("shaderc_parse_version_profile").orElseThrow();
        MTD__shaderc_parse_version_profile = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__shaderc_parse_version_profile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BOOLEAN, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
    }
}
