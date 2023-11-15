# Docker-Jenkins

Pour installer le docker de Jenkins sur votre serveur, il vous faut en premier lieu créer votre Dockerfile avec le code suivant :

"""
FROM ubuntu:latest

RUN apt update && apt upgrade -y 
RUN apt install wget fontconfig openjdk-17-jre ca-certificates -y

RUN wget -O /usr/share/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
 RUN echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
    https://pkg.jenkins.io/debian-stable binary/ | tee \
    /etc/apt/sources.list.d/jenkins.list > /dev/null

RUN apt update
RUN apt install jenkins -y

EXPOSE 8080

CMD ["java", "-jar", "/usr/share/java/jenkins.war", "--httpPort=8080", "--httpListenAddress=0.0.0.0"]
"""

Une fois le téléchargement des ressources terminées, il ne reste plus qu'à construire l'image du docker avec la commande :
"""
docker build -t leeroy -f path .
"""

Puis de la lancer :
"""
docker run -p 8080:8080 -d leeroy
"""
