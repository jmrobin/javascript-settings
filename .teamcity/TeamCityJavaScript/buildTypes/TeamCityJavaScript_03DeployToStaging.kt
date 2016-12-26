package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object TeamCityJavaScript_03DeployToStaging : BuildType({
    uuid = "471db62c-fa51-4d36-ade2-31ee66c29929"
    extId = "TeamCityJavaScript_03DeployToStaging"
    name = "03 Deploy To Staging"

    vcs {
        root(TeamCityJavaScript.vcsRoots.TeamCityJavaScript_HttpsGithubComJmrobinTeamcityCourseCards)

    }

    dependencies {
        dependency(TeamCityJavaScript.buildTypes.TeamCityJavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(TeamCityJavaScript.buildTypes.TeamCityJavaScript_02Firefox) {
            snapshot {
            }
        }
        dependency(TeamCityJavaScript.buildTypes.TeamCityJavaScript_02IE) {
            snapshot {
            }
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
        }
    }
})
