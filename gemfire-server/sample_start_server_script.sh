#!/usr/bin/sh
export MYSQL_URI=<mysql uri>
export MYSQL_USERNAME=<username>
export MYSQL_PASSWORD=<password>
export CACHE_SERVER_HOSTNAME=<gemfire hostname or IP>
nohup java -Xmx4g -jar -Dgemfire.cache.server.hostname-for-clients=<gemfire hostname or IP> -Dspring.datasource.tomcat.max-active=20 -Dgemfire.pdx.disk-store-dir=/home/devops/server/server1 -Dgemfire.async-event.dispatcher-thread=5 -Dgemfire.async-event.batch-size=1000 -Dgemfire.cache.server.port=40404 -Dgemfire.server.name=DefaultGemfireServer1 -Dgemfire.manager.port=1096 ../*.jar &
