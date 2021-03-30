pipeline {
    environment {
        registry = "avawulkan/projekt2021"
        registryCredential = '1c029a9a-9527-480c-8648-50705faa5647'
        dockerImage = 'Dockerfile'
    }
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

        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}



