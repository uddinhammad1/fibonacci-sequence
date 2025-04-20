pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/uddinhammad1/fibonacci-sequence.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t fibonacci-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run --rm fibonacci-app'
            }
        }
    }
}
