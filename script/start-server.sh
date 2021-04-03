#!/bin/bash
base_dir="/nebula"

JAVA_OPTS="-server -Xms${JVM_XMS:-128m} -Xmx${JVM_XMX:-512} -Dfile.encoding=utf-8 -Dserver.port=8888 --jar nebula-server.jar --spring.config.location=${base_dir}/config/application.yaml"

java ${JAVA_OPTS} 2>&1