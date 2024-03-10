import me.champeau.jmh.JmhBytecodeGeneratorTask

plugins {
    id("java-library")
    id("me.champeau.jmh") version "0.7.2"
}

tasks.withType<JmhBytecodeGeneratorTask>().configureEach {
    jvmArgs.addAll(listOf(
        "--enable-preview",
        "--add-modules", "jdk.incubator.vector"
    ))
}

jmh {
    includes.set(listOf("yionos.experiments.*"))
    jvmArgsAppend.set(listOf(
        "--enable-preview",
        "--enable-native-access=ALL-UNNAMED",
        "--add-modules", "jdk.incubator.vector",
        "-Djdk.incubator.vector.VECTOR_ACCESS_OOB_CHECK=0",
        "-XX:UseAVX=2",
        "-XX:+UnlockDiagnosticVMOptions",
        "-XX:CompileCommand=print,*MemoryAlignment.nativeSegmentLoads*"
    ))

    benchmarkMode.add("avgt")
    threads.set(1)
    jmhTimeout.set("3s")
    timeOnIteration.set("3s")
    timeUnit.set("ns")
    warmupIterations.set(3)
    iterations.set(5)
    fork.set(1)
}

tasks.withType<JavaCompile> {
    options.compilerArgs.addAll(listOf(
        "--add-modules", "jdk.incubator.vector"
    ))
}
