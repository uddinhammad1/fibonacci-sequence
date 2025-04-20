pipeline {
    agent any

    tools {
        jdk 'jdk17'
}

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/uddinhammad1/fibonacci-sequence.git'
            }
        }

        stage('Build with Maven') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t fibonacci-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run --rm fibonacci-app'
            }
        }
    }
}
