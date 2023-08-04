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
                git 'https://github.com/tfpmotta/java-junit-jenkins.git'
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
