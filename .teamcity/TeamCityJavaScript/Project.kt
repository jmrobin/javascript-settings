package TeamCityJavaScript

import TeamCityJavaScript.buildTypes.*
import TeamCityJavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "775dbe8b-ea6c-4cf4-8db0-dadc3ffe5e7f"
    extId = "TeamCityJavaScript"
    parentId = "_Root"
    name = "TeamCity JavaScript"
    description = "Wes Higbee JavaScript tutorial"

    vcsRoot(TeamCityJavaScript_HttpsGithubComJmrobinTeamcityCourseCards)

    buildType(TeamCityJavaScript_01FastTests)
    buildType(TeamCityJavaScript_02Chrome)
    buildType(TeamCityJavaScript_02Firefox)
    buildType(TeamCityJavaScript_03DeployToStaging)

    template(TeamCityJavaScript_JmrTemplate)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComJmrobinJavascriptSettings"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
