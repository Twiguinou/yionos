package shaderc;

public final class Shaderc
{private Shaderc() {}

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compiler_initialize;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compiler_initialize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compiler_release;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compiler_release;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_initialize;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_initialize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_clone;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_clone;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_release;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_release;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_add_macro_definition;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_add_macro_definition;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_source_language;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_source_language;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_generate_debug_info;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_generate_debug_info;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_optimization_level;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_optimization_level;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_forced_version_profile;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_forced_version_profile;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_include_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_include_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_suppress_warnings;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_suppress_warnings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_target_env;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_target_env;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_target_spirv;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_target_spirv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_warnings_as_errors;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_warnings_as_errors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_limit;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_limit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_auto_bind_uniforms;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_auto_bind_uniforms;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_auto_combined_image_sampler;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_auto_combined_image_sampler;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_io_mapping;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_io_mapping;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_offsets;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_offsets;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_binding_base;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_binding_base;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_binding_base_for_stage;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_binding_base_for_stage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_preserve_bindings;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_preserve_bindings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_auto_map_locations;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_auto_map_locations;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_register_set_and_binding;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_functionality1;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_functionality1;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_hlsl_16bit_types;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_hlsl_16bit_types;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_invert_y;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_invert_y;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_options_set_nan_clamp;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_options_set_nan_clamp;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_into_spv;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_into_spv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_into_spv_assembly;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_into_spv_assembly;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_compile_into_preprocessed_text;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_compile_into_preprocessed_text;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_assemble_into_spv;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_assemble_into_spv;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_release;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_release;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_length;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_length;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_num_warnings;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_num_warnings;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_num_errors;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_num_errors;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_compilation_status;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_compilation_status;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_bytes;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_bytes;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_result_get_error_message;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_result_get_error_message;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_get_spv_version;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_get_spv_version;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$shaderc_parse_version_profile;
    public static final java.lang.invoke.MethodHandle MTD$shaderc_parse_version_profile;

    // Returns a shaderc_compiler_t that can be used to compile modules.
    // A return of NULL indicates that there was an error initializing the compiler.
    // Any function operating on shaderc_compiler_t must offer the basic
    // thread-safety guarantee.
    // [http://herbsutter.com/2014/01/13/gotw-95-solution-thread-safety-and-synchronization/]
    // That is: concurrent invocation of these functions on DIFFERENT objects needs
    // no synchronization; concurrent invocation of these functions on the SAME
    // object requires synchronization IF AND ONLY IF some of them take a non-const
    // argument.
    public static java.lang.foreign.MemorySegment shaderc_compiler_initialize()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compiler_initialize.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Releases the resources held by the shaderc_compiler_t.
    // After this call it is invalid to make any future calls to functions
    // involving this shaderc_compiler_t.
    public static void shaderc_compiler_release(java.lang.foreign.MemorySegment arg1)
    {
        try {MTD$shaderc_compiler_release.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns a default-initialized shaderc_compile_options_t that can be used
    // to modify the functionality of a compiled module.
    // A return of NULL indicates that there was an error initializing the options.
    // Any function operating on shaderc_compile_options_t must offer the
    // basic thread-safety guarantee.
    public static java.lang.foreign.MemorySegment shaderc_compile_options_initialize()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compile_options_initialize.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns a copy of the given shaderc_compile_options_t.
    // If NULL is passed as the parameter the call is the same as
    // shaderc_compile_options_init.
    public static java.lang.foreign.MemorySegment shaderc_compile_options_clone(java.lang.foreign.MemorySegment options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compile_options_clone.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Releases the compilation options. It is invalid to use the given
    // shaderc_compile_options_t object in any future calls. It is safe to pass
    // NULL to this function, and doing such will have no effect.
    public static void shaderc_compile_options_release(java.lang.foreign.MemorySegment options)
    {
        try {MTD$shaderc_compile_options_release.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Adds a predefined macro to the compilation options. This has the same
    // effect as passing -Dname=value to the command-line compiler.  If value
    // is NULL, it has the same effect as passing -Dname to the command-line
    // compiler. If a macro definition with the same name has previously been
    // added, the value is replaced with the new value. The macro name and
    // value are passed in with char pointers, which point to their data, and
    // the lengths of their data. The strings that the name and value pointers
    // point to must remain valid for the duration of the call, but can be
    // modified or deleted after this function has returned. In case of adding
    // a valueless macro, the value argument should be a null pointer or the
    // value_length should be 0u.
    public static void shaderc_compile_options_add_macro_definition(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment name, long name_length, java.lang.foreign.MemorySegment value, long value_length)
    {
        try {MTD$shaderc_compile_options_add_macro_definition.invokeExact(options, name, name_length, value, value_length);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the source language.  The default is GLSL.
    public static void shaderc_compile_options_set_source_language(java.lang.foreign.MemorySegment options, int lang)
    {
        try {MTD$shaderc_compile_options_set_source_language.invokeExact(options, lang);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the compiler mode to generate debug information in the output.
    public static void shaderc_compile_options_set_generate_debug_info(java.lang.foreign.MemorySegment options)
    {
        try {MTD$shaderc_compile_options_set_generate_debug_info.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the compiler optimization level to the given level. Only the last one
    // takes effect if multiple calls of this function exist.
    public static void shaderc_compile_options_set_optimization_level(java.lang.foreign.MemorySegment options, int level)
    {
        try {MTD$shaderc_compile_options_set_optimization_level.invokeExact(options, level);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Forces the GLSL language version and profile to a given pair. The version
    // number is the same as would appear in the #version annotation in the source.
    // Version and profile specified here overrides the #version annotation in the
    // source. Use profile: 'shaderc_profile_none' for GLSL versions that do not
    // define profiles, e.g. versions below 150.
    public static void shaderc_compile_options_set_forced_version_profile(java.lang.foreign.MemorySegment options, int version, int profile)
    {
        try {MTD$shaderc_compile_options_set_forced_version_profile.invokeExact(options, version, profile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets includer callback functions.
    public static void shaderc_compile_options_set_include_callbacks(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment resolver, java.lang.foreign.MemorySegment result_releaser, java.lang.foreign.MemorySegment user_data)
    {
        try {MTD$shaderc_compile_options_set_include_callbacks.invokeExact(options, resolver, result_releaser, user_data);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the compiler mode to suppress warnings, overriding warnings-as-errors
    // mode. When both suppress-warnings and warnings-as-errors modes are
    // turned on, warning messages will be inhibited, and will not be emitted
    // as error messages.
    public static void shaderc_compile_options_set_suppress_warnings(java.lang.foreign.MemorySegment options)
    {
        try {MTD$shaderc_compile_options_set_suppress_warnings.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the target shader environment, affecting which warnings or errors will
    // be issued.  The version will be for distinguishing between different versions
    // of the target environment.  The version value should be either 0 or
    // a value listed in shaderc_env_version.  The 0 value maps to Vulkan 1.0 if
    // |target| is Vulkan, and it maps to OpenGL 4.5 if |target| is OpenGL.
    public static void shaderc_compile_options_set_target_env(java.lang.foreign.MemorySegment options, int target, int version)
    {
        try {MTD$shaderc_compile_options_set_target_env.invokeExact(options, target, version);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the target SPIR-V version. The generated module will use this version
    // of SPIR-V.  Each target environment determines what versions of SPIR-V
    // it can consume.  Defaults to the highest version of SPIR-V 1.0 which is
    // required to be supported by the target environment.  E.g. Default to SPIR-V
    // 1.0 for Vulkan 1.0 and SPIR-V 1.3 for Vulkan 1.1.
    public static void shaderc_compile_options_set_target_spirv(java.lang.foreign.MemorySegment options, int version)
    {
        try {MTD$shaderc_compile_options_set_target_spirv.invokeExact(options, version);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the compiler mode to treat all warnings as errors. Note the
    // suppress-warnings mode overrides this option, i.e. if both
    // warning-as-errors and suppress-warnings modes are set, warnings will not
    // be emitted as error messages.
    public static void shaderc_compile_options_set_warnings_as_errors(java.lang.foreign.MemorySegment options)
    {
        try {MTD$shaderc_compile_options_set_warnings_as_errors.invokeExact(options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets a resource limit.
    public static void shaderc_compile_options_set_limit(java.lang.foreign.MemorySegment options, int limit, int value)
    {
        try {MTD$shaderc_compile_options_set_limit.invokeExact(options, limit, value);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should automatically assign bindings to uniforms
    // that aren't already explicitly bound in the shader source.
    public static void shaderc_compile_options_set_auto_bind_uniforms(java.lang.foreign.MemorySegment options, boolean auto_bind)
    {
        try {MTD$shaderc_compile_options_set_auto_bind_uniforms.invokeExact(options, auto_bind);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should automatically remove sampler variables
    // and convert image variables to combined image-sampler variables.
    public static void shaderc_compile_options_set_auto_combined_image_sampler(java.lang.foreign.MemorySegment options, boolean upgrade)
    {
        try {MTD$shaderc_compile_options_set_auto_combined_image_sampler.invokeExact(options, upgrade);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should use HLSL IO mapping rules for bindings.
    // Defaults to false.
    public static void shaderc_compile_options_set_hlsl_io_mapping(java.lang.foreign.MemorySegment options, boolean hlsl_iomap)
    {
        try {MTD$shaderc_compile_options_set_hlsl_io_mapping.invokeExact(options, hlsl_iomap);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should determine block member offsets using HLSL
    // packing rules instead of standard GLSL rules.  Defaults to false.  Only
    // affects GLSL compilation.  HLSL rules are always used when compiling HLSL.
    public static void shaderc_compile_options_set_hlsl_offsets(java.lang.foreign.MemorySegment options, boolean hlsl_offsets)
    {
        try {MTD$shaderc_compile_options_set_hlsl_offsets.invokeExact(options, hlsl_offsets);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets the base binding number used for for a uniform resource type when
    // automatically assigning bindings.  For GLSL compilation, sets the lowest
    // automatically assigned number.  For HLSL compilation, the regsiter number
    // assigned to the resource is added to this specified base.
    public static void shaderc_compile_options_set_binding_base(java.lang.foreign.MemorySegment options, int kind, int base)
    {
        try {MTD$shaderc_compile_options_set_binding_base.invokeExact(options, kind, base);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Like shaderc_compile_options_set_binding_base, but only takes effect when
    // compiling a given shader stage.  The stage is assumed to be one of vertex,
    // fragment, tessellation evaluation, tesselation control, geometry, or compute.
    public static void shaderc_compile_options_set_binding_base_for_stage(java.lang.foreign.MemorySegment options, int shader_kind, int kind, int base)
    {
        try {MTD$shaderc_compile_options_set_binding_base_for_stage.invokeExact(options, shader_kind, kind, base);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should preserve all bindings, even when those
    // bindings are not used.
    public static void shaderc_compile_options_set_preserve_bindings(java.lang.foreign.MemorySegment options, boolean preserve_bindings)
    {
        try {MTD$shaderc_compile_options_set_preserve_bindings.invokeExact(options, preserve_bindings);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should automatically assign locations to
    // uniform variables that don't have explicit locations in the shader source.
    public static void shaderc_compile_options_set_auto_map_locations(java.lang.foreign.MemorySegment options, boolean auto_map)
    {
        try {MTD$shaderc_compile_options_set_auto_map_locations.invokeExact(options, auto_map);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets a descriptor set and binding for an HLSL register in the given stage.
    // This method keeps a copy of the string data.
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage(java.lang.foreign.MemorySegment options, int shader_kind, java.lang.foreign.MemorySegment reg, java.lang.foreign.MemorySegment set, java.lang.foreign.MemorySegment binding)
    {
        try {MTD$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage.invokeExact(options, shader_kind, reg, set, binding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Like shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage,
    // but affects all shader stages.
    public static void shaderc_compile_options_set_hlsl_register_set_and_binding(java.lang.foreign.MemorySegment options, java.lang.foreign.MemorySegment reg, java.lang.foreign.MemorySegment set, java.lang.foreign.MemorySegment binding)
    {
        try {MTD$shaderc_compile_options_set_hlsl_register_set_and_binding.invokeExact(options, reg, set, binding);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should enable extension
    // SPV_GOOGLE_hlsl_functionality1.
    public static void shaderc_compile_options_set_hlsl_functionality1(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD$shaderc_compile_options_set_hlsl_functionality1.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether 16-bit types are supported in HLSL or not.
    public static void shaderc_compile_options_set_hlsl_16bit_types(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD$shaderc_compile_options_set_hlsl_16bit_types.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler should invert position.Y output in vertex shader.
    public static void shaderc_compile_options_set_invert_y(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD$shaderc_compile_options_set_invert_y.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Sets whether the compiler generates code for max and min builtins which,
    // if given a NaN operand, will return the other operand. Similarly, the clamp
    // builtin will favour the non-NaN operands, as if clamp were implemented
    // as a composition of max and min.
    public static void shaderc_compile_options_set_nan_clamp(java.lang.foreign.MemorySegment options, boolean enable)
    {
        try {MTD$shaderc_compile_options_set_nan_clamp.invokeExact(options, enable);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Takes a GLSL source string and the associated shader kind, input file
    // name, compiles it according to the given additional_options. If the shader
    // kind is not set to a specified kind, but shaderc_glslc_infer_from_source,
    // the compiler will try to deduce the shader kind from the source
    // string and a failure in deducing will generate an error. Currently only
    // #pragma annotation is supported. If the shader kind is set to one of the
    // default shader kinds, the compiler will fall back to the default shader
    // kind in case it failed to deduce the shader kind from source string.
    // The input_file_name is a null-termintated string. It is used as a tag to
    // identify the source string in cases like emitting error messages. It
    // doesn't have to be a 'file name'.
    // The source string will be compiled into SPIR-V binary and a
    // shaderc_compilation_result will be returned to hold the results.
    // The entry_point_name null-terminated string defines the name of the entry
    // point to associate with this GLSL source. If the additional_options
    // parameter is not null, then the compilation is modified by any options
    // present.  May be safely called from multiple threads without explicit
    // synchronization. If there was failure in allocating the compiler object,
    // null will be returned.
    public static java.lang.foreign.MemorySegment shaderc_compile_into_spv(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compile_into_spv.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Like shaderc_compile_into_spv, but the result contains SPIR-V assembly text
    // instead of a SPIR-V binary module.  The SPIR-V assembly syntax is as defined
    // by the SPIRV-Tools open source project.
    public static java.lang.foreign.MemorySegment shaderc_compile_into_spv_assembly(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compile_into_spv_assembly.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Like shaderc_compile_into_spv, but the result contains preprocessed source
    // code instead of a SPIR-V binary module
    public static java.lang.foreign.MemorySegment shaderc_compile_into_preprocessed_text(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_text, long source_text_size, int shader_kind, java.lang.foreign.MemorySegment input_file_name, java.lang.foreign.MemorySegment entry_point_name, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_compile_into_preprocessed_text.invokeExact(compiler, source_text, source_text_size, shader_kind, input_file_name, entry_point_name, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Takes an assembly string of the format defined in the SPIRV-Tools project
    // (https://github.com/KhronosGroup/SPIRV-Tools/blob/master/syntax.md),
    // assembles it into SPIR-V binary and a shaderc_compilation_result will be
    // returned to hold the results.
    // The assembling will pick options suitable for assembling specified in the
    // additional_options parameter.
    // May be safely called from multiple threads without explicit synchronization.
    // If there was failure in allocating the compiler object, null will be
    // returned.
    public static java.lang.foreign.MemorySegment shaderc_assemble_into_spv(java.lang.foreign.MemorySegment compiler, java.lang.foreign.MemorySegment source_assembly, long source_assembly_size, java.lang.foreign.MemorySegment additional_options)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_assemble_into_spv.invokeExact(compiler, source_assembly, source_assembly_size, additional_options);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Releases the resources held by the result object. It is invalid to use the
    // result object for any further operations.
    public static void shaderc_result_release(java.lang.foreign.MemorySegment result)
    {
        try {MTD$shaderc_result_release.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns the number of bytes of the compilation output data in a result
    // object.
    public static long shaderc_result_get_length(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD$shaderc_result_get_length.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns the number of warnings generated during the compilation.
    public static long shaderc_result_get_num_warnings(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD$shaderc_result_get_num_warnings.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns the number of errors generated during the compilation.
    public static long shaderc_result_get_num_errors(java.lang.foreign.MemorySegment result)
    {
        try {return (long)MTD$shaderc_result_get_num_errors.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns the compilation status, indicating whether the compilation succeeded,
    // or failed due to some reasons, like invalid shader stage or compilation
    // errors.
    public static int shaderc_result_get_compilation_status(java.lang.foreign.MemorySegment arg1)
    {
        try {return (int)MTD$shaderc_result_get_compilation_status.invokeExact(arg1);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns a pointer to the start of the compilation output data bytes, either
    // SPIR-V binary or char string. When the source string is compiled into SPIR-V
    // binary, this is guaranteed to be castable to a uint32_t*. If the result
    // contains assembly text or preprocessed source text, the pointer will point to
    // the resulting array of characters.
    public static java.lang.foreign.MemorySegment shaderc_result_get_bytes(java.lang.foreign.MemorySegment result)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_result_get_bytes.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Returns a null-terminated string that contains any error messages generated
    // during the compilation.
    public static java.lang.foreign.MemorySegment shaderc_result_get_error_message(java.lang.foreign.MemorySegment result)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$shaderc_result_get_error_message.invokeExact(result);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Provides the version & revision of the SPIR-V which will be produced
    public static void shaderc_get_spv_version(java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment revision)
    {
        try {MTD$shaderc_get_spv_version.invokeExact(version, revision);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // Parses the version and profile from a given null-terminated string
    // containing both version and profile, like: '450core'. Returns false if
    // the string can not be parsed. Returns true when the parsing succeeds. The
    // parsed version and profile are returned through arguments.
    public static boolean shaderc_parse_version_profile(java.lang.foreign.MemorySegment str, java.lang.foreign.MemorySegment version, java.lang.foreign.MemorySegment profile)
    {
        try {return (boolean)MTD$shaderc_parse_version_profile.invokeExact(str, version, profile);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libshaderc_shared");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$shaderc_compiler_initialize = gLibLookup.find("shaderc_compiler_initialize").orElseThrow();
        MTD$shaderc_compiler_initialize = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compiler_initialize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compiler_release = gLibLookup.find("shaderc_compiler_release").orElseThrow();
        MTD$shaderc_compiler_release = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compiler_release, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_initialize = gLibLookup.find("shaderc_compile_options_initialize").orElseThrow();
        MTD$shaderc_compile_options_initialize = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_initialize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_clone = gLibLookup.find("shaderc_compile_options_clone").orElseThrow();
        MTD$shaderc_compile_options_clone = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_clone, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_release = gLibLookup.find("shaderc_compile_options_release").orElseThrow();
        MTD$shaderc_compile_options_release = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_release, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_add_macro_definition = gLibLookup.find("shaderc_compile_options_add_macro_definition").orElseThrow();
        MTD$shaderc_compile_options_add_macro_definition = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_add_macro_definition, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG));
        MTD_ADDRESS$shaderc_compile_options_set_source_language = gLibLookup.find("shaderc_compile_options_set_source_language").orElseThrow();
        MTD$shaderc_compile_options_set_source_language = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_source_language, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_generate_debug_info = gLibLookup.find("shaderc_compile_options_set_generate_debug_info").orElseThrow();
        MTD$shaderc_compile_options_set_generate_debug_info = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_generate_debug_info, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_optimization_level = gLibLookup.find("shaderc_compile_options_set_optimization_level").orElseThrow();
        MTD$shaderc_compile_options_set_optimization_level = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_optimization_level, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_forced_version_profile = gLibLookup.find("shaderc_compile_options_set_forced_version_profile").orElseThrow();
        MTD$shaderc_compile_options_set_forced_version_profile = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_forced_version_profile, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_include_callbacks = gLibLookup.find("shaderc_compile_options_set_include_callbacks").orElseThrow();
        MTD$shaderc_compile_options_set_include_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_include_callbacks, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_suppress_warnings = gLibLookup.find("shaderc_compile_options_set_suppress_warnings").orElseThrow();
        MTD$shaderc_compile_options_set_suppress_warnings = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_suppress_warnings, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_target_env = gLibLookup.find("shaderc_compile_options_set_target_env").orElseThrow();
        MTD$shaderc_compile_options_set_target_env = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_target_env, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_target_spirv = gLibLookup.find("shaderc_compile_options_set_target_spirv").orElseThrow();
        MTD$shaderc_compile_options_set_target_spirv = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_target_spirv, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_warnings_as_errors = gLibLookup.find("shaderc_compile_options_set_warnings_as_errors").orElseThrow();
        MTD$shaderc_compile_options_set_warnings_as_errors = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_warnings_as_errors, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_limit = gLibLookup.find("shaderc_compile_options_set_limit").orElseThrow();
        MTD$shaderc_compile_options_set_limit = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_limit, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_auto_bind_uniforms = gLibLookup.find("shaderc_compile_options_set_auto_bind_uniforms").orElseThrow();
        MTD$shaderc_compile_options_set_auto_bind_uniforms = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_auto_bind_uniforms, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_auto_combined_image_sampler = gLibLookup.find("shaderc_compile_options_set_auto_combined_image_sampler").orElseThrow();
        MTD$shaderc_compile_options_set_auto_combined_image_sampler = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_auto_combined_image_sampler, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_io_mapping = gLibLookup.find("shaderc_compile_options_set_hlsl_io_mapping").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_io_mapping = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_io_mapping, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_offsets = gLibLookup.find("shaderc_compile_options_set_hlsl_offsets").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_offsets = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_offsets, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_binding_base = gLibLookup.find("shaderc_compile_options_set_binding_base").orElseThrow();
        MTD$shaderc_compile_options_set_binding_base = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_binding_base, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_binding_base_for_stage = gLibLookup.find("shaderc_compile_options_set_binding_base_for_stage").orElseThrow();
        MTD$shaderc_compile_options_set_binding_base_for_stage = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_binding_base_for_stage, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$shaderc_compile_options_set_preserve_bindings = gLibLookup.find("shaderc_compile_options_set_preserve_bindings").orElseThrow();
        MTD$shaderc_compile_options_set_preserve_bindings = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_preserve_bindings, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_auto_map_locations = gLibLookup.find("shaderc_compile_options_set_auto_map_locations").orElseThrow();
        MTD$shaderc_compile_options_set_auto_map_locations = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_auto_map_locations, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = gLibLookup.find("shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding_for_stage, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding = gLibLookup.find("shaderc_compile_options_set_hlsl_register_set_and_binding").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_register_set_and_binding = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_register_set_and_binding, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_functionality1 = gLibLookup.find("shaderc_compile_options_set_hlsl_functionality1").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_functionality1 = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_functionality1, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_hlsl_16bit_types = gLibLookup.find("shaderc_compile_options_set_hlsl_16bit_types").orElseThrow();
        MTD$shaderc_compile_options_set_hlsl_16bit_types = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_hlsl_16bit_types, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_invert_y = gLibLookup.find("shaderc_compile_options_set_invert_y").orElseThrow();
        MTD$shaderc_compile_options_set_invert_y = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_invert_y, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_options_set_nan_clamp = gLibLookup.find("shaderc_compile_options_set_nan_clamp").orElseThrow();
        MTD$shaderc_compile_options_set_nan_clamp = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_options_set_nan_clamp, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_BOOLEAN));
        MTD_ADDRESS$shaderc_compile_into_spv = gLibLookup.find("shaderc_compile_into_spv").orElseThrow();
        MTD$shaderc_compile_into_spv = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_into_spv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_into_spv_assembly = gLibLookup.find("shaderc_compile_into_spv_assembly").orElseThrow();
        MTD$shaderc_compile_into_spv_assembly = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_into_spv_assembly, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_compile_into_preprocessed_text = gLibLookup.find("shaderc_compile_into_preprocessed_text").orElseThrow();
        MTD$shaderc_compile_into_preprocessed_text = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_compile_into_preprocessed_text, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_assemble_into_spv = gLibLookup.find("shaderc_assemble_into_spv").orElseThrow();
        MTD$shaderc_assemble_into_spv = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_assemble_into_spv, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_release = gLibLookup.find("shaderc_result_release").orElseThrow();
        MTD$shaderc_result_release = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_release, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_length = gLibLookup.find("shaderc_result_get_length").orElseThrow();
        MTD$shaderc_result_get_length = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_length, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_num_warnings = gLibLookup.find("shaderc_result_get_num_warnings").orElseThrow();
        MTD$shaderc_result_get_num_warnings = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_num_warnings, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_num_errors = gLibLookup.find("shaderc_result_get_num_errors").orElseThrow();
        MTD$shaderc_result_get_num_errors = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_num_errors, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_LONG, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_compilation_status = gLibLookup.find("shaderc_result_get_compilation_status").orElseThrow();
        MTD$shaderc_result_get_compilation_status = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_compilation_status, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_bytes = gLibLookup.find("shaderc_result_get_bytes").orElseThrow();
        MTD$shaderc_result_get_bytes = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_bytes, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_result_get_error_message = gLibLookup.find("shaderc_result_get_error_message").orElseThrow();
        MTD$shaderc_result_get_error_message = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_result_get_error_message, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_get_spv_version = gLibLookup.find("shaderc_get_spv_version").orElseThrow();
        MTD$shaderc_get_spv_version = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_get_spv_version, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$shaderc_parse_version_profile = gLibLookup.find("shaderc_parse_version_profile").orElseThrow();
        MTD$shaderc_parse_version_profile = gSystemLinker.downcallHandle(MTD_ADDRESS$shaderc_parse_version_profile, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_BOOLEAN, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
    }
}
