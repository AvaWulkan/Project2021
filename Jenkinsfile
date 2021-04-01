pipeline {
    environment {
        registry = "avawulkan/projekt2021"
        registryCredential = '1c029a9a-9527-480c-8648-50705faa5647'
        dockerImage = ''
    }
    agent any
    tools {
        maven 'Maven 3.6.3'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Starting to build Greeter'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    /*    stage('Package'){
            steps{
                sh 'mvn package'
            }
        } */
        stage('Dockerbuild') {
            steps {
                script {
                    dockerImage = docker.build("avawulkan/projekt2021")
                }
            }
        }
        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry('https://registry-1.docker.io/v2/', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}



