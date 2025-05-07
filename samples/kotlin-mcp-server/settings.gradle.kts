plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "kotlin-mcp-server"

dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url="https://maven.aliyun.com/repository/google")
        maven(url="https://maven.aliyun.com/repository/public")
        mavenCentral()
//        maven("https://maven.pkg.jetbrains.space/public/p/kotlin-mcp-sdk/sdk")
    }
}
