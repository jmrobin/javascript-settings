package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamCityJavaScript_02IE : BuildType({
    template(TeamCityJavaScript.buildTypes.TeamCityJavaScript_JmrTemplate)
    uuid = "javascript_02ie"
    extId = "TeamCityJavaScript_02IE"
    name = "02 Internet Explorer"

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
