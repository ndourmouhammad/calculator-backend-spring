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
                // Cette commande utilise le fichier de config que vous avez créé dans Managed Files
                configFileProvider([configFile(fileId: 'my-nexus-settings', variable: 'MAVEN_SETTINGS')]) {
                    sh "mvn -s $MAVEN_SETTINGS deploy"
                }
            }
        }
    }
}