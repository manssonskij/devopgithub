Description: DEVOPS WORKING PLAN DRAFT

Tentative title
=====
_Educational Institution_: [Nackademin](http://www.nackademin.se)

_Author_: Tor Mansson

_Email1_: tor.mansson@gmail.com

_Email2_: anton.mansson@yh.nackademin.se

_Project home_: https://github.com/manssonskij/devopgithub

### PREFACE

TODO: Write preface.


### Summary/Abstract

TODO: Write summary at end of project. Draft of exam paper of the Devops concept and CICD in practice. Use _funnel design_.

*Keywords:* Devops, Continous Integration, Continous Delivery, Continous Deployment. 




### DISCLAIMER
This is a living document and may at any time be subject to change.

Attempting to follow these steps may or may not cause harm to your system. This paper makes no attempt at being a complete coverage of all necessary steps. Attempting to implement the process step-by-step may fail due to a number of reasons. The author takes no responsibilies for any kind of damage done as a result of following these instructions. 
No attempts beyond trying to following basic security conventions has been made to secure the setup. Setting up a server and exposing a service has inherent risks and should not be done without clear understanding of the security settings and implications of these.

Links and resources on the internet may have changed in content and source since publication.




CONTENT
------

_Tentative structure_

1. INTRODUCTION
  1. Declaration of intent
  2. Concept and definitions


2. TIMEFRAME
2. SCOPE
3. PREPARATIONS
3. IMPLEMENTATION
6. APPENDIX
  * Tools and frameworks
  * Configuration files
  * Scripts
  * Source code snippets
  * References



INTRODUCTION
------


#### Declaration of intent

To implement a functional devops concept with Continous Integration and Continous Deployment (idealy, unless scope turns out to be to big, at which it could be limited to Continous Delivery).


Code under test
Application under test


###Concept and definitions

Context:

*Cloud models*
PaaS - Platform as a Service, Infrastructure as a Service - IaaS, Backend as a Service - BaaS, 
Service-Oriented Architecture (SOA)
Reusability

Pre/post-virtualisation
[Pets vs. Cattle](https://blog.engineyard.com/2014/pets-vs-cattle)

####Devops
####Continous Integration
####Continous Delivery
####Continous Deployment


### Governing principles

##### KEEP IT SIMPLE
Complexity increases risk of something going wrong somewhere. Aim to reduce uncesseray complexity. (Consider maven-driven build & deploy line?)

##### LESS IS MORE
Fewer tools, fewer dependencies, fewer steps. Try to minimise the number of steps to get things done. (as previous, consider maven-driven pipe?). Tools, plugins, frameworks, etc should be incorporated because of their usefulness.
This also relates to the issue of containers, in this case docker. The aim is to deliver a container as slim as possible without uncessary overhead in terms of code.

##### FAIL FAST
We want to fail as early as possible. I.e, local build stage? Build has to pass unit/integration tests etc to be able to be pushed further than from feature branch? This principle connects to the issue of testing and quality control.

##### VCS:
Stable Master "PROD" branch
Stable Master "DEV" branch

Evaluate to structure of the development cycle. 

Or even use different silo:ed repositories? Increased complexity brings increased risk of fail.

Initial prototyping against GitHub. Migrate to BitBucket when suitable.

Declarative rather than prescriptive?


### Testing

Testing philosophy:

### Governing principle
Initial: Code under test
Goal: Application under test

Rational: Given the complexity of the application and underlying application model, data, and critical implementation in production, tests should aim to test not just methods and classes but behaviour.
Code coverage should be highest possible.

Infrastructure testing:
Environment-, Build-, Deployment- configuration should be in version control. Should allow for rollbacks in case failures occurs due to misconfigured infrastructure.

Tentative testing frameworks under consideration: 

JUnit - unit testing
JaCoCo - code coverage
Jacoco Jenkins Plugin
Selenium - web interface

#### Devop principles
Configuration as Code:
All configuration should be in version control.

Code documentation: Application code, in the case of a Java application, should be documented with JavaDoc, which is to be genererated at build time. Documentation should be archived under version control, and therefor retain a history.


Which approach would be the best to take?


#### Prototype environment

#### Development enviroment
Plattform:
OS: GNU/Linux
Distribution: Fedora

Rational of choice:
As a prototyping development environment the choice fell on Fedora. Community developed Linux distribution with roots in Red Hat Linux, and downstream/upstream? of much of what ends up in RHEL (Red Hat Enterprise Linux).
Pro - Similiarties of deployment environment, easily scriptable, flexible, level of control. yum/dnf.
Con - Complexity, multitude of options, configuration issues. No `apt-get`.

Considering the plethora of distributions available, any choice could probably had made the cut in regards of dev env. Important aspect is the similiar configuration structure and software installation processes in rpm-based distributions.

Deployment environment:
CentOS: 
Docker images, Alpine?

Software stack:
IDE: Intellij Ultimate Edition
JAVA: OpenJDK

Prototype Java Project:
Springio web archtype.
- logging framework: slf4j
- Springboot

Tentative deployment environment:
Wildfly (script setup with puppet in docker)



TIMEFRAME
------

The given time fram spans between the fourthteen of april until the sevententh of of may. Work began with an orientation in the concept of Devops/CICD and relevant technologies. The first two weeks were mainly spent trying to digest the many options available, and move abstract thoughts into a more concrete shape meanwhile ordinary software development work ensued.

Proper prototyping can be said to have started at the fifth of may, thus reducing the time available for implementation and thereby affecting the scope in relation to proclaimed academical deadline.

Prototyping the Devops cycle aims to identify Best-pracices and a way to implement the cycle in accordance to previously stipulated Governance principles.



SCOPE
------

Pilot study:
Due to the complexity of the task at hand, and the multitude of options in regard to its implementation, the scope is defined in twofold. A preliminary pre-study covered by this document, with the aim of identifing potential avenues and pitfalls 




PREPARATIONS
------

Preparations for the prototyping has involved the installation and configuration of the development enivornment, such as Fedora, IntelliJ, 


IMPLEMENTATION
------

This section will map out the actual process of an attempt at implementing functional Devops loop.


CONCLUSION
------


APPENDIX
------

### Tools:

This section covers the most important toolsets utilized in the project.

#### MAVEN:
Resource: [Maven](https://maven.apache.org/ "Maven - Welcome to Apache Maven")

#### JENKINS:
Resource: [Jenkins](https://jenkins.io/)

Install the GIT Plugin-plugin

Rational of choice:
Well established 

Other options:
Ansible - pro: supported by RedHat

Code documentation:

Jenkins privilige escalation for sudo

jenkins    `ALL = NOPASSWD: /var/lib/jenkins/jobs/[job name]/workspace/script`

#### VAGRANT:
Resource: [Vagrant](https://www.vagrantup.com/ "Vagrant by HashiCorp")

#### DOCKER:
Resource: [Docker](https://www.docker.com/)

DooD, Docker outside of Docker
DinD, Docker-in-Docker

DOCKER image/container, image class, container object, container as a runtime instance of an image.
currently building an image and then building things in it, should make a new image with everything built that gets deployed as a container.

Rational of choice:
Integral aspect of current Devop trends. Containered application makes for mobile, scalable and simple deployment.






