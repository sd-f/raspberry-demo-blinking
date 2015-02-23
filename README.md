# raspberry-demo-blinking
Demo Blinking LED on Raspberry B+ with jdk8, pi4j and maven

- Raspberry Demo Project for Maven

You need:
  - Raspberry B+ (i guess it will work on all the others the same way)
  - Raspbarian (nearly everything you need is set up already and pre-installed
  - Java JDK8 (at least i used it because it came pre-installed on pi, if you do not already have it --> http://www.raspberrypi.org/oracle-java-on-raspberry-pi/)
  - WiringPi (follow steps on http://wiringpi.com/download-and-install/)
  - PI4J (I installed pi4j with the guide on http://pi4j.com/install.html very easy)
  - Maven (and JDK8) on the Machine you are developing on (http://maven.apache.org/)
  - (optional) Your favourite IDE (Netbeans, Eclipse)

Compile and Run:
  - Run "mvn clean install" in root directory of my repo
  - You will get a "blinking-with-pi4j.jar" in the target folder
  - (optional if you developing on another device then the pi iteselt) copy jar to your pi
  - Run command in console "sudo java -jar blinking-with-pi4j.jar"
  - And if you have a led attached to you GPIO 1 port you should see it blinking away for a few seconds...
  - Have fun..

I did this because of the Maven setup and giving JDK8 on pi a chance ;) and i must say it worked from the first moment
