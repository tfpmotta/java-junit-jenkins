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
                sh 'curl http://gitdev.clarobrasil.mobi/devops/plataforma/devops-tools/maturity/pipe-para-testes.git'
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
