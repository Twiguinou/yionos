cmake_minimum_required(VERSION 3.22)

project(NATIVE-LIBS)

option(NL_BUILD_GLFW "Build GLFW" ON)
option(NL_BUILD_ASSIMP "Build Assimp" ON)
option(NL_BUILD_STB_IMAGE "Build stb_image" ON)
option(NL_BUILD_VMA "Build VMA" ON)
option(NL_BUILD_NUKLEAR "Build Nuklear" ON)

set(BUILD_SHARED_LIBS ON CACHE BOOL "")

if (NL_BUILD_GLFW)
    set(GLFW_BUILD_EXAMPLES OFF CACHE BOOL "")
    set(GLFW_BUILD_TESTS OFF CACHE BOOL "")
    set(GLFW_BUILD_DOCS OFF CACHE BOOL "")
    set(GLFW_INSTALL OFF CACHE BOOL "")

    add_subdirectory(extern/glfw)
endif()

if (NL_BUILD_ASSIMP)
    set(ASSIMP_BUILD_TESTS OFF CACHE BOOL "")
    set(ASSIMP_INSTALL OFF CACHE BOOL "")
    set(ASSIMP_BUILD_ASSIMP_VIEW OFF CACHE BOOL "")
    set(ASSIMP_BUILD_ALL_IMPORTERS_BY_DEFAULT OFF CACHE BOOL "")
    set(ASSIMP_BUILD_OBJ_IMPORTER ON CACHE BOOL "")
    set(ASSIMP_BUILD_ALL_EXPORTERS_BY_DEFAULT OFF CACHE BOOL "")

    add_subdirectory(extern/assimp)
endif()

if (NL_BUILD_STB_IMAGE)
    add_library(stb_image SHARED STB_IMAGE_IMPL.c)
    target_include_directories(stb_image PRIVATE extern/stb)
endif()

if (NL_BUILD_VMA)
    if (WIN32)
        find_path(VULKAN_INCLUDE NAMES vulkan/vulkan.h PATHS "$ENV{VULKAN_SDK}/Include")
    else()
        find_path(VULKAN_INCLUDE NAMES vulkan/vulkan.h PATHS "$ENV{VULKAN_SDK}/include")
    endif()

    add_library(vma SHARED VMA_IMPL.cpp)
    target_include_directories(vma PRIVATE extern/VulkanMemoryAllocator/include ${VULKAN_INCLUDE})
endif()

if (NL_BUILD_NUKLEAR)
    add_library(nuklear SHARED NUKLEAR_IMPL.c)
    target_include_directories(nuklear PRIVATE extern/Nuklear)
endif()
