mvn package
sudo docker build -t devopss .
sudo docker -d -p 8080:8181 devopss
