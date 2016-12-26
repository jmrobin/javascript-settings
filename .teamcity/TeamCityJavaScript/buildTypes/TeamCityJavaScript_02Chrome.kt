package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamCityJavaScript_02Chrome : BuildType({
    template(TeamCityJavaScript.buildTypes.TeamCityJavaScript_JmrTemplate)
    uuid = "2e7d0789-615e-4d41-a864-e1851e04f0c3"
    extId = "TeamCityJavaScript_02Chrome"
    name = "02 Chrome"

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
