FROM cogniteev/oracle-java:latest

ENV JAVA_OPTS=""

# defines root user, to perform privileged operations
USER root

RUN bash

ADD scripts /home/app/scripts

WORKDIR /home/app/scripts

RUN chmod +x configure_env_casa_inteligente.sh

RUN ./configure_env_casa_inteligente.sh

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /home/app/casainteligente/target/api-casa-inteligente-0.0.1-SNAPSHOT.jar" ]