
kotlin.sourceSets.commonMain {
    dependencies {
        api(project(":ktor-network"))
        api(project(":ktor-http:ktor-http-cio"))
    }
}