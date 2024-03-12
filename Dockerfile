FROM openjdk:17
ADD target/Product-service-0.0.1-SNAPSHOT.jar.original Product-serviceSNAPSHOT.jar.original
ENTRYPOINT ["java","-jar","/Product-serviceSNAPSHOT.jar.original"]