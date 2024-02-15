pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven-3.9.6"
    }

    stages {
        stage('Source') {
            steps {
                // Get some code from a GitHub repository
                checkout([$class:'GitSCM',branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Kowsika76/vrzn-app-repo']]])

                // Run Maven on a Unix agent.
                // cmd "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
             stage('Build') {
            steps {
                // Get some code from a GitHub repository
                // checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Kowsika76/vrzn-app-repo']])

                // Run Maven on a Unix agent.
                // cmd "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
             }
}
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    