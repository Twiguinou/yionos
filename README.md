## Building shared libraries

- Before compiling every dependent library, here is a list of what you need depending on your system:
    - CMake, any recent distribution will work.
    - On 64-bit Windows, you will need a working MinGW distribution, along with clang, clang++ and mingw32-make.
    - On OSX, clang, clang++ and make.
- You will also need `vulkan-1.dll`, which is available in lots of places, MinGW is one of them.
- shaderc cannot be compiled following this section, you will need to get it somewhere else.
- Then, some gradle tasks are available under the `bindings` project, for that you need every submodule cloned and then run one of the tasks going by `generateXXXXSharedLibs`.
- When you are done acquiring every shared library, you can then proceed to place it wherever your system will be able to search for them.

### Building issues with shaderc

- shaderc is a pain in the ass to compile because of nested dependencies, at the moment it is better to rely on binaries available on the internet.