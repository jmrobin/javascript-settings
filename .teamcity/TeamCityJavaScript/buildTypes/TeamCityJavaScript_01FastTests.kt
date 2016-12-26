package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object TeamCityJavaScript_01FastTests : BuildType({
    template(TeamCityJavaScript.buildTypes.TeamCityJavaScript_JmrTemplate)
    uuid = "8abd72ff-a363-41ca-920a-02475083a1f7"
    extId = "TeamCityJavaScript_01FastTests"
    name = "01 Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
