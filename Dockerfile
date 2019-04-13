FROM openjdk:8
#Debug port
EXPOSE 8080

#Install javaFX
RUN apt-get update && apt-get install -y --no-install-recommends openjfx && rm -rf /var/lib/apt/lists/*

#Copy java build files
COPY ./build/classes/java/main/ /usr
COPY ./lib/ /usr/lib
WORKDIR /usr
#ENTRYPOINT ["java","ScreenCapture"]
ENTRYPOINT ["sh","-c","java -server -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw ScreenCapture"]
#CMD ["/usr/bin/java", "-jar", "-Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw", "/fxDocker.jar"]



