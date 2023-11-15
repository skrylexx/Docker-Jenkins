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

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ENV JENKINS_USER=admine
ENV JENKINS_PASS=admine

RUN echo "JAVA_OPTS=\"\${JAVA_OPTS} -Djenkins.install.runSetupWizard=false\"" >> /etc/default/jenkins

EXPOSE 8080

CMD java -jar /usr/share/java/jenkins.war --httpPort=8080 --httpListenAddress=0.0.0.0
