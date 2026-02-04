pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package' // On compile et on teste 🏗️
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Jenkins envoie le code à SonarQube pour examen 🧠
                sh 'mvn sonar:sonar'
            }
        }
        stage('Deploy to Nexus') {
            steps {
                // Jenkins envoie le JAR vers Nexus 📦
                sh 'mvn deploy'
            }
        }
    }
}