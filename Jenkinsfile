pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'master', url: 'https://github.com/gitfordemo-all/rajdevopsdemo.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Gradle wrapper
                echo 'Building the project...'
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                echo 'Running tests...'
                sh './gradlew test'
            }
        }

        stage('Package') {
            steps {
                // Create a JAR file
                echo 'Packaging the application...'
                sh './gradlew jar'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}