FROM openjdk:8-alpine
#Debug port
EXPOSE 8080

#Install openjfx
RUN apk --no-cache add ca-certificates wget
RUN wget --quiet --output-document=/etc/apk/keys/sgerrand.rsa.pub https://alpine-pkgs.sgerrand.com/sgerrand.rsa.pub
RUN wget https://github.com/sgerrand/alpine-pkg-java-openjfx/releases/download/8.151.12-r0/java-openjfx-8.151.12-r0.apk
RUN apk add --no-cache java-openjfx-8.151.12-r0.apk


#Copy java build files
COPY ./build/libs/all-in-one-jar-1.0-SNAPSHOT.jar /usr
COPY ./lib/ /usr/lib
WORKDIR /usr
#ENTRYPOINT ["java","ScreenCapture"]
#ENTRYPOINT ["sh","-c","java -server -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw ScreenCapture"]
ENTRYPOINT ["sh","-c","java -jar -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw -Dprism.verbose=true all-in-one-jar-1.0-SNAPSHOT.jar"]
#CMD ["/usr/bin/java", "-jar", "-Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw", "/fxDocker.jar"]



