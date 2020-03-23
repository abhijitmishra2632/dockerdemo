From openjdk:8
EXPOSE 8085
copy ./target/questionapp.jar questionapp.jar
CMD ["java","-jar","questionapp.jar"]