object Versions {

    //Kotlin
    const val kotlin = "1.3.21"
    const val coroutines = "1.1.1"

    //Docker
    const val dockerClient = "8.15.2"

    //Logback
    const val logback = "1.2.3"

    //Jopt
    const val joptSimple = "5.0.4"

    //Koin
    const val koin = "2.+"

    //Jackson
    const val jackson = "2.9.+"

}

object Dependencies {

    //Kotlin
    const val kotlinStandard = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    //Docker
    const val dockerClient = "com.spotify:docker-client:${Versions.dockerClient}"

    //Logback
    const val logbackCore = "ch.qos.logback:logback-core:${Versions.logback}"
    const val logbackClassic = "ch.qos.logback:logback-classic:${Versions.logback}"

    //Jopt
    const val joptSimple = "net.sf.jopt-simple:jopt-simple:${Versions.joptSimple}"

    //Koin
    const val koin = "org.koin:koin-core:${Versions.koin}"

    //Jackson
    const val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jackson}"
    const val jacksonYaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:${Versions.jackson}"

}