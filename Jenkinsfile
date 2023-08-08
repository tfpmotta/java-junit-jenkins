pipeline {
  agent {
    label 'ecs'
  }
  tools {
        maven "mvn"
        // Adicione a instalação do Telnet
        install 'Telnet', 'telnet-1:0.17-83.amzn2023.0.2.x86_64'
  }
  stages {
        stage('Clonar') {
            steps {
                sh 'telnet gitdev.clarobrasil.mobi 22'
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
