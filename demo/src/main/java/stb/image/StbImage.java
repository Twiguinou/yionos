package stb.image;

public final class StbImage
{private StbImage() {}

    public static final int STBI_default = 0;
    public static final int STBI_grey = 1;
    public static final int STBI_grey_alpha = 2;
    public static final int STBI_rgb = 3;
    public static final int STBI_rgb_alpha = 4;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_from_memory;
    public static java.lang.foreign.MemorySegment stbi_load_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load;
    public static java.lang.foreign.MemorySegment stbi_load(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_from_file;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_from_file;
    public static java.lang.foreign.MemorySegment stbi_load_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_from_file.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_gif_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_gif_from_memory;
    public static java.lang.foreign.MemorySegment stbi_load_gif_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment delays, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment z, java.lang.foreign.MemorySegment comp, int req_comp)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_gif_from_memory.invokeExact(buffer, len, delays, x, y, z, comp, req_comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_16_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_16_from_memory;
    public static java.lang.foreign.MemorySegment stbi_load_16_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_16_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_16;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_16;
    public static java.lang.foreign.MemorySegment stbi_load_16(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_16.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_load_from_file_16;
    public static final java.lang.invoke.MethodHandle MTD__stbi_load_from_file_16;
    public static java.lang.foreign.MemorySegment stbi_load_from_file_16(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_load_from_file_16.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_loadf_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_loadf_from_memory;
    public static java.lang.foreign.MemorySegment stbi_loadf_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_loadf_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_loadf;
    public static final java.lang.invoke.MethodHandle MTD__stbi_loadf;
    public static java.lang.foreign.MemorySegment stbi_loadf(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_loadf.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_loadf_from_file;
    public static final java.lang.invoke.MethodHandle MTD__stbi_loadf_from_file;
    public static java.lang.foreign.MemorySegment stbi_loadf_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_loadf_from_file.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_hdr_to_ldr_gamma;
    public static final java.lang.invoke.MethodHandle MTD__stbi_hdr_to_ldr_gamma;
    public static void stbi_hdr_to_ldr_gamma(float gamma)
    {
        try {MTD__stbi_hdr_to_ldr_gamma.invokeExact(gamma);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_hdr_to_ldr_scale;
    public static final java.lang.invoke.MethodHandle MTD__stbi_hdr_to_ldr_scale;
    public static void stbi_hdr_to_ldr_scale(float scale)
    {
        try {MTD__stbi_hdr_to_ldr_scale.invokeExact(scale);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_ldr_to_hdr_gamma;
    public static final java.lang.invoke.MethodHandle MTD__stbi_ldr_to_hdr_gamma;
    public static void stbi_ldr_to_hdr_gamma(float gamma)
    {
        try {MTD__stbi_ldr_to_hdr_gamma.invokeExact(gamma);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_ldr_to_hdr_scale;
    public static final java.lang.invoke.MethodHandle MTD__stbi_ldr_to_hdr_scale;
    public static void stbi_ldr_to_hdr_scale(float scale)
    {
        try {MTD__stbi_ldr_to_hdr_scale.invokeExact(scale);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_hdr_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_hdr_from_memory;
    public static int stbi_is_hdr_from_memory(java.lang.foreign.MemorySegment buffer, int len)
    {
        try {return (int)MTD__stbi_is_hdr_from_memory.invokeExact(buffer, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_hdr;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_hdr;
    public static int stbi_is_hdr(java.lang.foreign.MemorySegment filename)
    {
        try {return (int)MTD__stbi_is_hdr.invokeExact(filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_hdr_from_file;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_hdr_from_file;
    public static int stbi_is_hdr_from_file(java.lang.foreign.MemorySegment f)
    {
        try {return (int)MTD__stbi_is_hdr_from_file.invokeExact(f);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_failure_reason;
    public static final java.lang.invoke.MethodHandle MTD__stbi_failure_reason;
    public static java.lang.foreign.MemorySegment stbi_failure_reason()
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_failure_reason.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_image_free;
    public static final java.lang.invoke.MethodHandle MTD__stbi_image_free;
    public static void stbi_image_free(java.lang.foreign.MemorySegment retval_from_stbi_load)
    {
        try {MTD__stbi_image_free.invokeExact(retval_from_stbi_load);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_info_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_info_from_memory;
    public static int stbi_info_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD__stbi_info_from_memory.invokeExact(buffer, len, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_16_bit_from_memory;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_16_bit_from_memory;
    public static int stbi_is_16_bit_from_memory(java.lang.foreign.MemorySegment buffer, int len)
    {
        try {return (int)MTD__stbi_is_16_bit_from_memory.invokeExact(buffer, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_info;
    public static final java.lang.invoke.MethodHandle MTD__stbi_info;
    public static int stbi_info(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD__stbi_info.invokeExact(filename, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_info_from_file;
    public static final java.lang.invoke.MethodHandle MTD__stbi_info_from_file;
    public static int stbi_info_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD__stbi_info_from_file.invokeExact(f, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_16_bit;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_16_bit;
    public static int stbi_is_16_bit(java.lang.foreign.MemorySegment filename)
    {
        try {return (int)MTD__stbi_is_16_bit.invokeExact(filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_is_16_bit_from_file;
    public static final java.lang.invoke.MethodHandle MTD__stbi_is_16_bit_from_file;
    public static int stbi_is_16_bit_from_file(java.lang.foreign.MemorySegment f)
    {
        try {return (int)MTD__stbi_is_16_bit_from_file.invokeExact(f);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_set_unpremultiply_on_load;
    public static final java.lang.invoke.MethodHandle MTD__stbi_set_unpremultiply_on_load;
    public static void stbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply)
    {
        try {MTD__stbi_set_unpremultiply_on_load.invokeExact(flag_true_if_should_unpremultiply);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_convert_iphone_png_to_rgb;
    public static final java.lang.invoke.MethodHandle MTD__stbi_convert_iphone_png_to_rgb;
    public static void stbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert)
    {
        try {MTD__stbi_convert_iphone_png_to_rgb.invokeExact(flag_true_if_should_convert);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_set_flip_vertically_on_load;
    public static final java.lang.invoke.MethodHandle MTD__stbi_set_flip_vertically_on_load;
    public static void stbi_set_flip_vertically_on_load(int flag_true_if_should_flip)
    {
        try {MTD__stbi_set_flip_vertically_on_load.invokeExact(flag_true_if_should_flip);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_set_unpremultiply_on_load_thread;
    public static final java.lang.invoke.MethodHandle MTD__stbi_set_unpremultiply_on_load_thread;
    public static void stbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply)
    {
        try {MTD__stbi_set_unpremultiply_on_load_thread.invokeExact(flag_true_if_should_unpremultiply);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_convert_iphone_png_to_rgb_thread;
    public static final java.lang.invoke.MethodHandle MTD__stbi_convert_iphone_png_to_rgb_thread;
    public static void stbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert)
    {
        try {MTD__stbi_convert_iphone_png_to_rgb_thread.invokeExact(flag_true_if_should_convert);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_set_flip_vertically_on_load_thread;
    public static final java.lang.invoke.MethodHandle MTD__stbi_set_flip_vertically_on_load_thread;
    public static void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip)
    {
        try {MTD__stbi_set_flip_vertically_on_load_thread.invokeExact(flag_true_if_should_flip);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_malloc_guesssize;
    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize(java.lang.foreign.MemorySegment buffer, int len, int initial_size, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_zlib_decode_malloc_guesssize.invokeExact(buffer, len, initial_size, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize_headerflag;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_malloc_guesssize_headerflag;
    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(java.lang.foreign.MemorySegment buffer, int len, int initial_size, java.lang.foreign.MemorySegment outlen, int parse_header)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(buffer, len, initial_size, outlen, parse_header);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_malloc;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_malloc;
    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_zlib_decode_malloc.invokeExact(buffer, len, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_buffer;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_buffer;
    public static int stbi_zlib_decode_buffer(java.lang.foreign.MemorySegment obuffer, int olen, java.lang.foreign.MemorySegment ibuffer, int ilen)
    {
        try {return (int)MTD__stbi_zlib_decode_buffer.invokeExact(obuffer, olen, ibuffer, ilen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_noheader_malloc;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_noheader_malloc;
    public static java.lang.foreign.MemorySegment stbi_zlib_decode_noheader_malloc(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD__stbi_zlib_decode_noheader_malloc.invokeExact(buffer, len, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS__stbi_zlib_decode_noheader_buffer;
    public static final java.lang.invoke.MethodHandle MTD__stbi_zlib_decode_noheader_buffer;
    public static int stbi_zlib_decode_noheader_buffer(java.lang.foreign.MemorySegment obuffer, int olen, java.lang.foreign.MemorySegment ibuffer, int ilen)
    {
        try {return (int)MTD__stbi_zlib_decode_noheader_buffer.invokeExact(obuffer, olen, ibuffer, ilen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));

        MTD_ADDRESS__stbi_load_from_memory = lookup.find("stbi_load_from_memory").orElseThrow();
        MTD__stbi_load_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_from_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load = lookup.find("stbi_load").orElseThrow();
        MTD__stbi_load = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load_from_file = lookup.find("stbi_load_from_file").orElseThrow();
        MTD__stbi_load_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_from_file, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load_gif_from_memory = lookup.find("stbi_load_gif_from_memory").orElseThrow();
        MTD__stbi_load_gif_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_gif_from_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load_16_from_memory = lookup.find("stbi_load_16_from_memory").orElseThrow();
        MTD__stbi_load_16_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_16_from_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load_16 = lookup.find("stbi_load_16").orElseThrow();
        MTD__stbi_load_16 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_16, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_load_from_file_16 = lookup.find("stbi_load_from_file_16").orElseThrow();
        MTD__stbi_load_from_file_16 = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_load_from_file_16, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_loadf_from_memory = lookup.find("stbi_loadf_from_memory").orElseThrow();
        MTD__stbi_loadf_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_loadf_from_memory, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_loadf = lookup.find("stbi_loadf").orElseThrow();
        MTD__stbi_loadf = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_loadf, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_loadf_from_file = lookup.find("stbi_loadf_from_file").orElseThrow();
        MTD__stbi_loadf_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_loadf_from_file, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_hdr_to_ldr_gamma = lookup.find("stbi_hdr_to_ldr_gamma").orElseThrow();
        MTD__stbi_hdr_to_ldr_gamma = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_hdr_to_ldr_gamma, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__stbi_hdr_to_ldr_scale = lookup.find("stbi_hdr_to_ldr_scale").orElseThrow();
        MTD__stbi_hdr_to_ldr_scale = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_hdr_to_ldr_scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__stbi_ldr_to_hdr_gamma = lookup.find("stbi_ldr_to_hdr_gamma").orElseThrow();
        MTD__stbi_ldr_to_hdr_gamma = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_ldr_to_hdr_gamma, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__stbi_ldr_to_hdr_scale = lookup.find("stbi_ldr_to_hdr_scale").orElseThrow();
        MTD__stbi_ldr_to_hdr_scale = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_ldr_to_hdr_scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS__stbi_is_hdr_from_memory = lookup.find("stbi_is_hdr_from_memory").orElseThrow();
        MTD__stbi_is_hdr_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_hdr_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_is_hdr = lookup.find("stbi_is_hdr").orElseThrow();
        MTD__stbi_is_hdr = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_hdr, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_is_hdr_from_file = lookup.find("stbi_is_hdr_from_file").orElseThrow();
        MTD__stbi_is_hdr_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_hdr_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_failure_reason = lookup.find("stbi_failure_reason").orElseThrow();
        MTD__stbi_failure_reason = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_failure_reason, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_image_free = lookup.find("stbi_image_free").orElseThrow();
        MTD__stbi_image_free = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_image_free, java.lang.foreign.FunctionDescriptor.ofVoid(jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_info_from_memory = lookup.find("stbi_info_from_memory").orElseThrow();
        MTD__stbi_info_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_info_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_is_16_bit_from_memory = lookup.find("stbi_is_16_bit_from_memory").orElseThrow();
        MTD__stbi_is_16_bit_from_memory = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_16_bit_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_info = lookup.find("stbi_info").orElseThrow();
        MTD__stbi_info = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_info, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_info_from_file = lookup.find("stbi_info_from_file").orElseThrow();
        MTD__stbi_info_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_info_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_is_16_bit = lookup.find("stbi_is_16_bit").orElseThrow();
        MTD__stbi_is_16_bit = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_16_bit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_is_16_bit_from_file = lookup.find("stbi_is_16_bit_from_file").orElseThrow();
        MTD__stbi_is_16_bit_from_file = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_is_16_bit_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_set_unpremultiply_on_load = lookup.find("stbi_set_unpremultiply_on_load").orElseThrow();
        MTD__stbi_set_unpremultiply_on_load = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_set_unpremultiply_on_load, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_convert_iphone_png_to_rgb = lookup.find("stbi_convert_iphone_png_to_rgb").orElseThrow();
        MTD__stbi_convert_iphone_png_to_rgb = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_convert_iphone_png_to_rgb, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_set_flip_vertically_on_load = lookup.find("stbi_set_flip_vertically_on_load").orElseThrow();
        MTD__stbi_set_flip_vertically_on_load = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_set_flip_vertically_on_load, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_set_unpremultiply_on_load_thread = lookup.find("stbi_set_unpremultiply_on_load_thread").orElseThrow();
        MTD__stbi_set_unpremultiply_on_load_thread = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_set_unpremultiply_on_load_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_convert_iphone_png_to_rgb_thread = lookup.find("stbi_convert_iphone_png_to_rgb_thread").orElseThrow();
        MTD__stbi_convert_iphone_png_to_rgb_thread = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_convert_iphone_png_to_rgb_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_set_flip_vertically_on_load_thread = lookup.find("stbi_set_flip_vertically_on_load_thread").orElseThrow();
        MTD__stbi_set_flip_vertically_on_load_thread = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_set_flip_vertically_on_load_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize = lookup.find("stbi_zlib_decode_malloc_guesssize").orElseThrow();
        MTD__stbi_zlib_decode_malloc_guesssize = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize_headerflag = lookup.find("stbi_zlib_decode_malloc_guesssize_headerflag").orElseThrow();
        MTD__stbi_zlib_decode_malloc_guesssize_headerflag = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_malloc_guesssize_headerflag, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_zlib_decode_malloc = lookup.find("stbi_zlib_decode_malloc").orElseThrow();
        MTD__stbi_zlib_decode_malloc = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_malloc, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_zlib_decode_buffer = lookup.find("stbi_zlib_decode_buffer").orElseThrow();
        MTD__stbi_zlib_decode_buffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS__stbi_zlib_decode_noheader_malloc = lookup.find("stbi_zlib_decode_noheader_malloc").orElseThrow();
        MTD__stbi_zlib_decode_noheader_malloc = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_noheader_malloc, java.lang.foreign.FunctionDescriptor.of(jpgen.NativeTypes.UNBOUNDED_POINTER, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER));
        MTD_ADDRESS__stbi_zlib_decode_noheader_buffer = lookup.find("stbi_zlib_decode_noheader_buffer").orElseThrow();
        MTD__stbi_zlib_decode_noheader_buffer = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__stbi_zlib_decode_noheader_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT, jpgen.NativeTypes.UNBOUNDED_POINTER, java.lang.foreign.ValueLayout.JAVA_INT));
    }
}
