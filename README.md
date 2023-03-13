## BUILD DOCKER IMAGE

`mvn spring-boot:build-image \               
-Dspring-boot.build-image.imageName=cloudapp`

## RUN THE DOCKER IMAGE LOCALLY 
`docker run --rm -p 8080:8080 cloudapp:latest`
