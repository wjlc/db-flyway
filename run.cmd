#!/bin/bash

set a="prod"

if [[ $1 == $a ]]
then
    mvn clean package && java -jar target/flyway-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
else
    mvn clean package && java -jar target/flyway-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
fi