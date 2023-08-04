pipeline {
  agent {
    label 'ecs'
  }
  tools {
    maven "mvn"
  }
  stages {
        stage('Clonar') {
            steps {
                sh 'ping gitdev.clarobrasil.mobi'
            }
        }

        stage('SonarQube Analysis') {
            steps {
              withSonarQubeEnv('sonarqubeserver') {
                sh "mvn clean verify sonar:sonar -Dsonar.projectKey=sonar-dev-teste -Dsonar.projectName='sonar-dev-teste'"
              }
            }
        }
    }
}
