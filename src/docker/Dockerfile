FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /volume

ADD api-casa-inteligente-0.0.1-SNAPSHOT.jar

RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS=""
ENV SPRING_PROFILES_ACTIVE="container"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
