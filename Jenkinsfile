pipeline {
  agent any
  environment {
            // SonarQube
            SONAR_URL = 'http://internal-dev-tools-th-jenkins-alb-1090643772.us-east-1.elb.amazonaws.com:9000'
            SONAR_SERVER = 'sonarqubeserver'
            SONAR_PROFILE = 'sonar-dev-teste'
  }
  stage('SonarQube') {
                steps {
                    script {
                        echo 'Creating sonar-project.properties file'
                        sh "printf '%s\\n' \
                        'sonar.host.url=${SONAR_URL}' \
                        'sonar.projectKey=${SONAR_PROJECT}' \
                        'sonar.projectName=${SONAR_PROJECT}' \
                        'sonar.language=ts' \
                        'sonar.sources=src/components' \
                        'sonar.tests=src/components' \
                        'sonar.javascript.file.suffixes=.js,.jsx' \
                        'sonar.test.inclusions=src/**/*.test.tsx' \
                        'sonar.testExecutionReportPaths=coverage/test-reporter.xml' \
                        'sonar.exclusions=**/*test.tsx,**/*story.ts*,**/*mock.ts*,**/*parser.ts*,**/*preview.ts*' \
                        'sonar.coverage.exclusions = **/*.test.js, src/aws/**, src/aws-exports.js, jest.config.js, \
                        config-overrides.js, src/index.js, src/serviceWorker.js' \
                        'sonar.typescript.coveragePlugin=lcof' \
                        'sonar.typescript.lcov.reportPaths=coverage/lcov.info' > sonar-project.properties"
                        echo 'Running Sonar Scanner'
                        withSonarQubeEnv('sonarqubeserver') {
                            sh "docker run -v '${WORKSPACE}:/usr/src' sonarsource/sonar-scanner-cli"
                        }
                    }
                }
            }
}
