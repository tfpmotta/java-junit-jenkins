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
                git 'https://gitdev.clarobrasil.mobi/CCoE/Portal/ccoe-front.git'
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
