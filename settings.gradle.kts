rootProject.name = "spring-boot-kotlin-modules-gradle"
include("app")
include("common")
include("service")

pluginManagement {
    val kotlinPluginVersion: String by settings
    val springBootPluginVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinPluginVersion
        kotlin("plugin.spring") version kotlinPluginVersion
        id("org.springframework.boot") version springBootPluginVersion
        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
    }

}