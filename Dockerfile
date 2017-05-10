FROM centos:7
MAINTAINER anton
ENV container docker
WORKDIR /devops
# init script for starting process, or should we just pass as a command?
ADD ./README.md /devops
ADD ./devops-init.sh /devops
# Git pull src from repo?
ADD ./target/devops-0.0.1-SNAPSHOT.jar /devops
#EXPOSE 22 should have ssh?
EXPOSE 8080
RUN yum -y install java-1.8.0-openjdk-headless.i686
CMD java -jar devops-0.0.1-SNAPSHOT.jar
#CMD [devops-init.sh]
# mvn package && java -jar target/devops-0.0.1.SNAPSHOT.jar
