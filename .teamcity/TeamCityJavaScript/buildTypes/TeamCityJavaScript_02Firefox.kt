package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamCityJavaScript_02Firefox : BuildType({
    template(TeamCityJavaScript.buildTypes.TeamCityJavaScript_JmrTemplate)
    uuid = "0d4470d0-6d93-4205-9e53-c97d371f70f5"
    extId = "TeamCityJavaScript_02Firefox"
    name = "02 Firefox"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(TeamCityJavaScript.buildTypes.TeamCityJavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
