FROM openjdk:8

RUN rm -rf /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

VOLUME /etc/zhishiyun/conf
VOLUME /var/lib/zhishiyun

ARG ADMIN_PASSWORD='admin123'
ARG ACTIVE_ENV='docker'
ARG LOG_LEVEL='info'

COPY echarts-yun-backend/echarts-yun-main/build/libs/zhishiyun.jar /opt/zhishiyun/zhishiyun.jar
COPY echarts-yun-backend/echarts-yun-main/src/main/resources/application-docker.yml /etc/zhishiyun/conf/
COPY ./resources/jdbc/system /var/lib/zhishiyun/jdbc/system

EXPOSE 8080

ENV ADMIN_PASSWORD=${ADMIN_PASSWORD}
ENV ACTIVE_ENV=${ACTIVE_ENV}
ENV LOG_LEVEL=${LOG_LEVEL}

CMD java -jar /opt/zhishiyun/zhishiyun.jar --logging.level.root=${LOG_LEVEL} --spring.profiles.active=${ACTIVE_ENV} --isx-app.admin-passwd=${ADMIN_PASSWORD} --spring.config.additional-location=/etc/zhishiyun/conf/