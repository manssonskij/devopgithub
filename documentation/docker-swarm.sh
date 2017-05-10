#!/bin/bash
#services
docker swarm init
docker stack deploy -c docker-compose.yml APPNAME

# docker stack ps APPNAME
# docker stack deploy -c docker-compose.yml APPNAME
# docker stack rm APPNAME

#swarms
docker swarm init
# or
# docker swarm join
# docker-machine create --driver virtualbox myvm1
# docker-machine ssh myvm1 "docker swarm init"
# docker swarm join --token <token> <ip>:<port>
