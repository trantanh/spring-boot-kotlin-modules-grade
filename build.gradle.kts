plugins {
    id ("org.sonarqube") version "2.8"
    id ("base")
}

allprojects {
    group = "cz.trantanh"
    version = "1.0.0-SNAPSHOT"

    repositories {
        mavenCentral()
        maven {
            url = uri("http://repository.mapr.com/maven/")
        }
    }

}
