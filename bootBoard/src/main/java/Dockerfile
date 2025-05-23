# 1. JDK 기반 이미지 선택
FROM openjdk:17

# 2. JAR 파일을 컨테이너 내부로 복사
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 3. 포트 오픈
EXPOSE 8080

# 4. 앱 실행 명령
ENTRYPOINT ["java", "-jar", "app.jar"]