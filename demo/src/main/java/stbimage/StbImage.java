package stbimage;

public final class StbImage
{private StbImage() {}

    public static final int STBI_VERSION = 1;

    public static final java.lang.foreign.Linker gSystemLinker;
    public static final java.lang.foreign.SymbolLookup gLibLookup;

    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_from_file;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_gif_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_gif_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_16_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_16_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_16_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_16_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_16;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_16;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_load_from_file_16;
    public static final java.lang.invoke.MethodHandle MTD$stbi_load_from_file_16;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_loadf_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_loadf_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_loadf_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_loadf_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_loadf;
    public static final java.lang.invoke.MethodHandle MTD$stbi_loadf;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_loadf_from_file;
    public static final java.lang.invoke.MethodHandle MTD$stbi_loadf_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_hdr_to_ldr_gamma;
    public static final java.lang.invoke.MethodHandle MTD$stbi_hdr_to_ldr_gamma;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_hdr_to_ldr_scale;
    public static final java.lang.invoke.MethodHandle MTD$stbi_hdr_to_ldr_scale;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_ldr_to_hdr_gamma;
    public static final java.lang.invoke.MethodHandle MTD$stbi_ldr_to_hdr_gamma;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_ldr_to_hdr_scale;
    public static final java.lang.invoke.MethodHandle MTD$stbi_ldr_to_hdr_scale;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_hdr_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_hdr_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_hdr_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_hdr_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_hdr;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_hdr;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_hdr_from_file;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_hdr_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_failure_reason;
    public static final java.lang.invoke.MethodHandle MTD$stbi_failure_reason;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_image_free;
    public static final java.lang.invoke.MethodHandle MTD$stbi_image_free;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_info_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_info_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_info_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_info_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_16_bit_from_memory;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_16_bit_from_memory;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_16_bit_from_callbacks;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_16_bit_from_callbacks;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_info;
    public static final java.lang.invoke.MethodHandle MTD$stbi_info;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_info_from_file;
    public static final java.lang.invoke.MethodHandle MTD$stbi_info_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_16_bit;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_16_bit;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_is_16_bit_from_file;
    public static final java.lang.invoke.MethodHandle MTD$stbi_is_16_bit_from_file;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_set_unpremultiply_on_load;
    public static final java.lang.invoke.MethodHandle MTD$stbi_set_unpremultiply_on_load;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_convert_iphone_png_to_rgb;
    public static final java.lang.invoke.MethodHandle MTD$stbi_convert_iphone_png_to_rgb;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_set_flip_vertically_on_load;
    public static final java.lang.invoke.MethodHandle MTD$stbi_set_flip_vertically_on_load;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_set_unpremultiply_on_load_thread;
    public static final java.lang.invoke.MethodHandle MTD$stbi_set_unpremultiply_on_load_thread;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_convert_iphone_png_to_rgb_thread;
    public static final java.lang.invoke.MethodHandle MTD$stbi_convert_iphone_png_to_rgb_thread;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_set_flip_vertically_on_load_thread;
    public static final java.lang.invoke.MethodHandle MTD$stbi_set_flip_vertically_on_load_thread;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_malloc_guesssize;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize_headerflag;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_malloc_guesssize_headerflag;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_malloc;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_malloc;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_buffer;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_buffer;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_noheader_malloc;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_noheader_malloc;
    public static final java.lang.foreign.MemorySegment MTD_ADDRESS$stbi_zlib_decode_noheader_buffer;
    public static final java.lang.invoke.MethodHandle MTD$stbi_zlib_decode_noheader_buffer;

    ////////////////////////////////////
    //
    // 8-bits-per-channel interface
    //
    public static java.lang.foreign.MemorySegment stbi_load_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_from_file.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_gif_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment delays, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment z, java.lang.foreign.MemorySegment comp, int req_comp)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_gif_from_memory.invokeExact(buffer, len, delays, x, y, z, comp, req_comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    ////////////////////////////////////
    //
    // 16-bits-per-channel interface
    //
    public static java.lang.foreign.MemorySegment stbi_load_16_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_16_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_16_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_16_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_16(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_16.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_load_from_file_16(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_load_from_file_16.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_loadf_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_loadf_from_memory.invokeExact(buffer, len, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_loadf_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_loadf_from_callbacks.invokeExact(clbk, user, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_loadf(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_loadf.invokeExact(filename, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_loadf_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment channels_in_file, int desired_channels)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_loadf_from_file.invokeExact(f, x, y, channels_in_file, desired_channels);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_hdr_to_ldr_gamma(float gamma)
    {
        try {MTD$stbi_hdr_to_ldr_gamma.invokeExact(gamma);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_hdr_to_ldr_scale(float scale)
    {
        try {MTD$stbi_hdr_to_ldr_scale.invokeExact(scale);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_ldr_to_hdr_gamma(float gamma)
    {
        try {MTD$stbi_ldr_to_hdr_gamma.invokeExact(gamma);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_ldr_to_hdr_scale(float scale)
    {
        try {MTD$stbi_ldr_to_hdr_scale.invokeExact(scale);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // stbi_is_hdr is always defined, but always returns false if STBI_NO_HDR
    public static int stbi_is_hdr_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user)
    {
        try {return (int)MTD$stbi_is_hdr_from_callbacks.invokeExact(clbk, user);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_hdr_from_memory(java.lang.foreign.MemorySegment buffer, int len)
    {
        try {return (int)MTD$stbi_is_hdr_from_memory.invokeExact(buffer, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_hdr(java.lang.foreign.MemorySegment filename)
    {
        try {return (int)MTD$stbi_is_hdr.invokeExact(filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_hdr_from_file(java.lang.foreign.MemorySegment f)
    {
        try {return (int)MTD$stbi_is_hdr_from_file.invokeExact(f);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // get a VERY brief reason for failure
    // on most compilers (and ALL modern mainstream compilers) this is threadsafe
    public static java.lang.foreign.MemorySegment stbi_failure_reason()
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_failure_reason.invokeExact();}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // free the loaded image -- this is just free()
    public static void stbi_image_free(java.lang.foreign.MemorySegment retval_from_stbi_load)
    {
        try {MTD$stbi_image_free.invokeExact(retval_from_stbi_load);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // get image dimensions & components without fully decoding
    public static int stbi_info_from_memory(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD$stbi_info_from_memory.invokeExact(buffer, len, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_info_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD$stbi_info_from_callbacks.invokeExact(clbk, user, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_16_bit_from_memory(java.lang.foreign.MemorySegment buffer, int len)
    {
        try {return (int)MTD$stbi_is_16_bit_from_memory.invokeExact(buffer, len);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_16_bit_from_callbacks(java.lang.foreign.MemorySegment clbk, java.lang.foreign.MemorySegment user)
    {
        try {return (int)MTD$stbi_is_16_bit_from_callbacks.invokeExact(clbk, user);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_info(java.lang.foreign.MemorySegment filename, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD$stbi_info.invokeExact(filename, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_info_from_file(java.lang.foreign.MemorySegment f, java.lang.foreign.MemorySegment x, java.lang.foreign.MemorySegment y, java.lang.foreign.MemorySegment comp)
    {
        try {return (int)MTD$stbi_info_from_file.invokeExact(f, x, y, comp);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_16_bit(java.lang.foreign.MemorySegment filename)
    {
        try {return (int)MTD$stbi_is_16_bit.invokeExact(filename);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_is_16_bit_from_file(java.lang.foreign.MemorySegment f)
    {
        try {return (int)MTD$stbi_is_16_bit_from_file.invokeExact(f);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // for image formats that explicitly notate that they have premultiplied alpha,
    // we just return the colors as stored in the file. set this flag to force
    // unpremultiplication. results are undefined if the unpremultiply overflow.
    public static void stbi_set_unpremultiply_on_load(int flag_true_if_should_unpremultiply)
    {
        try {MTD$stbi_set_unpremultiply_on_load.invokeExact(flag_true_if_should_unpremultiply);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // indicate whether we should process iphone images back to canonical format,
    // or just pass them through "as-is"
    public static void stbi_convert_iphone_png_to_rgb(int flag_true_if_should_convert)
    {
        try {MTD$stbi_convert_iphone_png_to_rgb.invokeExact(flag_true_if_should_convert);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // flip the image vertically, so the first pixel in the output array is the bottom left
    public static void stbi_set_flip_vertically_on_load(int flag_true_if_should_flip)
    {
        try {MTD$stbi_set_flip_vertically_on_load.invokeExact(flag_true_if_should_flip);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // as above, but only applies to images loaded on the thread that calls the function
    // this function is only available if your compiler supports thread-local variables;
    // calling it will fail to link if your compiler doesn't
    public static void stbi_set_unpremultiply_on_load_thread(int flag_true_if_should_unpremultiply)
    {
        try {MTD$stbi_set_unpremultiply_on_load_thread.invokeExact(flag_true_if_should_unpremultiply);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_convert_iphone_png_to_rgb_thread(int flag_true_if_should_convert)
    {
        try {MTD$stbi_convert_iphone_png_to_rgb_thread.invokeExact(flag_true_if_should_convert);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static void stbi_set_flip_vertically_on_load_thread(int flag_true_if_should_flip)
    {
        try {MTD$stbi_set_flip_vertically_on_load_thread.invokeExact(flag_true_if_should_flip);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    // ZLIB client - used by PNG, available for other purposes
    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize(java.lang.foreign.MemorySegment buffer, int len, int initial_size, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_zlib_decode_malloc_guesssize.invokeExact(buffer, len, initial_size, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc_guesssize_headerflag(java.lang.foreign.MemorySegment buffer, int len, int initial_size, java.lang.foreign.MemorySegment outlen, int parse_header)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(buffer, len, initial_size, outlen, parse_header);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_zlib_decode_malloc(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_zlib_decode_malloc.invokeExact(buffer, len, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_zlib_decode_buffer(java.lang.foreign.MemorySegment obuffer, int olen, java.lang.foreign.MemorySegment ibuffer, int ilen)
    {
        try {return (int)MTD$stbi_zlib_decode_buffer.invokeExact(obuffer, olen, ibuffer, ilen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static java.lang.foreign.MemorySegment stbi_zlib_decode_noheader_malloc(java.lang.foreign.MemorySegment buffer, int len, java.lang.foreign.MemorySegment outlen)
    {
        try {return (java.lang.foreign.MemorySegment)MTD$stbi_zlib_decode_noheader_malloc.invokeExact(buffer, len, outlen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    public static int stbi_zlib_decode_noheader_buffer(java.lang.foreign.MemorySegment obuffer, int olen, java.lang.foreign.MemorySegment ibuffer, int ilen)
    {
        try {return (int)MTD$stbi_zlib_decode_noheader_buffer.invokeExact(obuffer, olen, ibuffer, ilen);}
        catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}
    }

    static
    {
        java.lang.System.loadLibrary("libstbimage");
        gSystemLinker = java.lang.foreign.Linker.nativeLinker();
        gLibLookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> gSystemLinker.defaultLookup().find(name));

        MTD_ADDRESS$stbi_load_from_memory = gLibLookup.find("stbi_load_from_memory").orElseThrow();
        MTD$stbi_load_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_from_callbacks = gLibLookup.find("stbi_load_from_callbacks").orElseThrow();
        MTD$stbi_load_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load = gLibLookup.find("stbi_load").orElseThrow();
        MTD$stbi_load = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_from_file = gLibLookup.find("stbi_load_from_file").orElseThrow();
        MTD$stbi_load_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_gif_from_memory = gLibLookup.find("stbi_load_gif_from_memory").orElseThrow();
        MTD$stbi_load_gif_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_gif_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_16_from_memory = gLibLookup.find("stbi_load_16_from_memory").orElseThrow();
        MTD$stbi_load_16_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_16_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_16_from_callbacks = gLibLookup.find("stbi_load_16_from_callbacks").orElseThrow();
        MTD$stbi_load_16_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_16_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_16 = gLibLookup.find("stbi_load_16").orElseThrow();
        MTD$stbi_load_16 = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_16, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_load_from_file_16 = gLibLookup.find("stbi_load_from_file_16").orElseThrow();
        MTD$stbi_load_from_file_16 = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_load_from_file_16, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_loadf_from_memory = gLibLookup.find("stbi_loadf_from_memory").orElseThrow();
        MTD$stbi_loadf_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_loadf_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_loadf_from_callbacks = gLibLookup.find("stbi_loadf_from_callbacks").orElseThrow();
        MTD$stbi_loadf_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_loadf_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_loadf = gLibLookup.find("stbi_loadf").orElseThrow();
        MTD$stbi_loadf = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_loadf, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_loadf_from_file = gLibLookup.find("stbi_loadf_from_file").orElseThrow();
        MTD$stbi_loadf_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_loadf_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_hdr_to_ldr_gamma = gLibLookup.find("stbi_hdr_to_ldr_gamma").orElseThrow();
        MTD$stbi_hdr_to_ldr_gamma = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_hdr_to_ldr_gamma, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$stbi_hdr_to_ldr_scale = gLibLookup.find("stbi_hdr_to_ldr_scale").orElseThrow();
        MTD$stbi_hdr_to_ldr_scale = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_hdr_to_ldr_scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$stbi_ldr_to_hdr_gamma = gLibLookup.find("stbi_ldr_to_hdr_gamma").orElseThrow();
        MTD$stbi_ldr_to_hdr_gamma = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_ldr_to_hdr_gamma, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$stbi_ldr_to_hdr_scale = gLibLookup.find("stbi_ldr_to_hdr_scale").orElseThrow();
        MTD$stbi_ldr_to_hdr_scale = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_ldr_to_hdr_scale, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_FLOAT));
        MTD_ADDRESS$stbi_is_hdr_from_callbacks = gLibLookup.find("stbi_is_hdr_from_callbacks").orElseThrow();
        MTD$stbi_is_hdr_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_hdr_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_is_hdr_from_memory = gLibLookup.find("stbi_is_hdr_from_memory").orElseThrow();
        MTD$stbi_is_hdr_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_hdr_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_is_hdr = gLibLookup.find("stbi_is_hdr").orElseThrow();
        MTD$stbi_is_hdr = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_hdr, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_is_hdr_from_file = gLibLookup.find("stbi_is_hdr_from_file").orElseThrow();
        MTD$stbi_is_hdr_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_hdr_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_failure_reason = gLibLookup.find("stbi_failure_reason").orElseThrow();
        MTD$stbi_failure_reason = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_failure_reason, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_image_free = gLibLookup.find("stbi_image_free").orElseThrow();
        MTD$stbi_image_free = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_image_free, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_info_from_memory = gLibLookup.find("stbi_info_from_memory").orElseThrow();
        MTD$stbi_info_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_info_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_info_from_callbacks = gLibLookup.find("stbi_info_from_callbacks").orElseThrow();
        MTD$stbi_info_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_info_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_is_16_bit_from_memory = gLibLookup.find("stbi_is_16_bit_from_memory").orElseThrow();
        MTD$stbi_is_16_bit_from_memory = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_16_bit_from_memory, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_is_16_bit_from_callbacks = gLibLookup.find("stbi_is_16_bit_from_callbacks").orElseThrow();
        MTD$stbi_is_16_bit_from_callbacks = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_16_bit_from_callbacks, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_info = gLibLookup.find("stbi_info").orElseThrow();
        MTD$stbi_info = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_info, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_info_from_file = gLibLookup.find("stbi_info_from_file").orElseThrow();
        MTD$stbi_info_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_info_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_is_16_bit = gLibLookup.find("stbi_is_16_bit").orElseThrow();
        MTD$stbi_is_16_bit = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_16_bit, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_is_16_bit_from_file = gLibLookup.find("stbi_is_16_bit_from_file").orElseThrow();
        MTD$stbi_is_16_bit_from_file = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_is_16_bit_from_file, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_set_unpremultiply_on_load = gLibLookup.find("stbi_set_unpremultiply_on_load").orElseThrow();
        MTD$stbi_set_unpremultiply_on_load = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_set_unpremultiply_on_load, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_convert_iphone_png_to_rgb = gLibLookup.find("stbi_convert_iphone_png_to_rgb").orElseThrow();
        MTD$stbi_convert_iphone_png_to_rgb = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_convert_iphone_png_to_rgb, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_set_flip_vertically_on_load = gLibLookup.find("stbi_set_flip_vertically_on_load").orElseThrow();
        MTD$stbi_set_flip_vertically_on_load = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_set_flip_vertically_on_load, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_set_unpremultiply_on_load_thread = gLibLookup.find("stbi_set_unpremultiply_on_load_thread").orElseThrow();
        MTD$stbi_set_unpremultiply_on_load_thread = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_set_unpremultiply_on_load_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_convert_iphone_png_to_rgb_thread = gLibLookup.find("stbi_convert_iphone_png_to_rgb_thread").orElseThrow();
        MTD$stbi_convert_iphone_png_to_rgb_thread = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_convert_iphone_png_to_rgb_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_set_flip_vertically_on_load_thread = gLibLookup.find("stbi_set_flip_vertically_on_load_thread").orElseThrow();
        MTD$stbi_set_flip_vertically_on_load_thread = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_set_flip_vertically_on_load_thread, java.lang.foreign.FunctionDescriptor.ofVoid(java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize = gLibLookup.find("stbi_zlib_decode_malloc_guesssize").orElseThrow();
        MTD$stbi_zlib_decode_malloc_guesssize = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize_headerflag = gLibLookup.find("stbi_zlib_decode_malloc_guesssize_headerflag").orElseThrow();
        MTD$stbi_zlib_decode_malloc_guesssize_headerflag = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_malloc_guesssize_headerflag, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_zlib_decode_malloc = gLibLookup.find("stbi_zlib_decode_malloc").orElseThrow();
        MTD$stbi_zlib_decode_malloc = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_malloc, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_zlib_decode_buffer = gLibLookup.find("stbi_zlib_decode_buffer").orElseThrow();
        MTD$stbi_zlib_decode_buffer = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
        MTD_ADDRESS$stbi_zlib_decode_noheader_malloc = gLibLookup.find("stbi_zlib_decode_noheader_malloc").orElseThrow();
        MTD$stbi_zlib_decode_noheader_malloc = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_noheader_malloc, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS));
        MTD_ADDRESS$stbi_zlib_decode_noheader_buffer = gLibLookup.find("stbi_zlib_decode_noheader_buffer").orElseThrow();
        MTD$stbi_zlib_decode_noheader_buffer = gSystemLinker.downcallHandle(MTD_ADDRESS$stbi_zlib_decode_noheader_buffer, java.lang.foreign.FunctionDescriptor.of(java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT, java.lang.foreign.ValueLayout.ADDRESS, java.lang.foreign.ValueLayout.JAVA_INT));
    }
}
