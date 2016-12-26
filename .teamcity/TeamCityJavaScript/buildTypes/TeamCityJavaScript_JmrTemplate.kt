package TeamCityJavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object TeamCityJavaScript_JmrTemplate : Template({
    uuid = "f2537b79-64f2-47fd-8c09-c6f0000bb8ab"
    extId = "TeamCityJavaScript_JmrTemplate"
    name = "JmrTemplate"

    vcs {
        root(TeamCityJavaScript.vcsRoots.TeamCityJavaScript_HttpsGithubComJmrobinTeamcityCourseCards)

    }

    steps {
        script {
            name = "NPM Install"
            id = "RUNNER_6"
            scriptContent = "npm install"
        }
        script {
            name = "NPM Tests"
            id = "RUNNER_7"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false  --reporters teamcity"
        }
    }


})
