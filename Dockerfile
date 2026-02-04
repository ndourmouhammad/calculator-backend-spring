# Étape 1 : Utiliser une image de base Java
FROM eclipse-temurin:17-jdk-alpine

# Étape 2 : Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Étape 3 : Copier le fichier JAR généré par Maven vers le conteneur
COPY target/*.jar app.jar

# Étape 4 : Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]