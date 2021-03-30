pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Hello World'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Push image') {
            docker.withRegistry('https://registry.hub.docker.com') {
                app.push("${env.BUILD_NUMBER}")
                app.push("latest")
            }
        }
    }
}



