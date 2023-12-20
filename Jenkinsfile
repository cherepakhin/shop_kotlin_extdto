
pipeline {

    agent any
    options {
        durabilityHint 'MAX_SURVIVABILITY'
    }
    stages {
        stage('Unit tests') {
            steps {
                git url: 'https://github.com/cherepakhin/shop_kotlin_extdto.git', branch: 'main'
                sh './gradlew clean test --tests *Test'
            }
        }

        stage('Build') {
            steps {
                git url: 'https://github.com/cherepakhin/shop_kotlin_extdto.git', branch: 'main'
                sh './gradlew build'
            }
        }

        stage('Publish to Nexus') {
           environment {
              NEXUS_CRED = credentials('nexus_admin')
           }
           steps {
                git url: 'https://github.com/cherepakhin/shop_kotlin_extdto.git', branch: 'main'
                sh './gradlew publish'
            }
        }
    }
}