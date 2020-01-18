plugins {
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

subprojects {

    group = "io.reflectoring.reviewapp"
    version = "0.0.1-SNAPSHOT"

    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java-library")

    repositories {
        jcenter()
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:2.1.9.RELEASE")
        }
    }

    configurations {
        configure<JavaPluginConvention> {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
    }
}
