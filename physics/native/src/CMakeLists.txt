set(YIONOS_CONTRAPTION_HEADERS
        Contraption/CommonToolset.h
        Contraption/MathDefinitions.h
        Contraption/Transform.h
        Contraption/Vector3.h
        Contraption/Quaternion.h
        Contraption/Identifiers.h
        Contraption/Matrix3.h
        Contraption/GenericArrayList.h
        Contraption/WideTypes.h
)
set(YIONOS_CONTRAPTION_IMPLEMENTATIONS
)
set(YIONOS_CONTRAPTION_SOURCES ${YIONOS_CONTRAPTION_HEADERS} ${YIONOS_CONTRAPTION_IMPLEMENTATIONS})

set(YIONOS_DYNAMICS_HEADERS
        Dynamics/PhysicsVerse.h
)
set(YIONOS_DYNAMICS_IMPLEMENTATIONS
        Dynamics/PhysicsVerse.cpp
)
set(YIONOS_DYNAMICS_SOURCES ${YIONOS_DYNAMICS_HEADERS} ${YIONOS_DYNAMICS_IMPLEMENTATIONS})

set(YIONOS_SOURCES ${YIONOS_CONTRAPTION_SOURCES} ${YIONOS_DYNAMICS_SOURCES})
source_group(TREE ${CMAKE_CURRENT_SOURCE_DIR} FILES ${YIONOS_SOURCES})

add_library(yionos-native STATIC ${YIONOS_SOURCES})
set_target_properties(yionos-native PROPERTIES LINKER_LANGUAGE CXX)
target_include_directories(yionos-native PUBLIC ${CMAKE_CURRENT_SOURCE_DIR} ${HIGHWAY_LIB_DIRECTORY})
target_link_libraries(yionos-native PRIVATE m)

target_link_libraries(yionos-native PUBLIC hwy)

set(CMAKE_CXX_FLAGS_DEBUG "${CMAKE_CXX_FLAGS_DEBUG} -DYIONOS_DEBUG=1")
