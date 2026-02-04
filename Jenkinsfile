pipeline {
    agent any
    tools {
            // Le nom ici doit être EXACTEMENT le même
            // que celui donné dans "Global Tool Configuration"
            maven 'M3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package' // On compile et on teste 🏗️
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('MySonarServer') { // Le nom configuré dans Jenkins
                    sh 'mvn sonar:sonar'
                }
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