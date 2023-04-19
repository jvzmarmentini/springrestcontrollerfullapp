# Spring Boot Readme
b
This readme file contains instructions on how to run a Spring Boot project.

## Prerequisites

+ Java Development Kit (JDK) version 8 or later installed on your system

+ Maven or Gradle build tool installed on your system

## Getting Started
Clone the project repository to your local machine.

Open a terminal or command prompt and navigate to the project directory.

Run the following command to build the project:

```bash
mvn clean install
```

Once the build is complete, run the following command to start the application:

```bash
java -jar target/application-1.0.0.jar
```

## SQL

 MySQL database connection with the URL `jdbc:mysql://localhost:3306/mydatabase`, the username `root`, and the password `mysecretpassword`

## Using

### POST new user

```bash
curl -X POST \
  http://localhost:8080/register/student \
  -H 'Content-Type: application/json' \
  -d '{
        "name": "John Doe",
        "age": 20,
        "registrationNumber": "REG123456"
      }'
```

### GET all users

```bash
curl -X GET http://localhost:8080/student/allstudent
```

### POST register subject

```bash
curl -X POST \
    http://localhost:8080/register/subject \
    -H "Content-Type: application/json" \
    -d '{
        "code": "MATH101", 
        "description": "Calculus I", 
        "classCode": "C01"
    }'
```

### GET all subjects

```bash
curl -X GET http://localhost:8080/get/subjects
```