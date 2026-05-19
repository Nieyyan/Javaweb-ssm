# Javaweb-ssm
This is a comprehensive course assignment for Java Web development.

## Tech Stack
Java

Spring 6.2.18

SpringMVC 6

MyBatis 3.5.16

MySQL 8.0

Maven

JDK 17

## Project Introduction
This project is built based on the SSM framework, which implements basic web functions such as user data management and CRUD operations.
It helps me systematically understand the integration and workflow of mainstream Java back-end frameworks during my university study.
 
## Project Structure

```bush
Javaweb-ssm-maven
├── src
│   ├── main
│   │   ├── java/com/woxueit/ssm
│   │   │   ├── config/               
│   │   │   ├── controller/             # Request handlers
│   │   │   │   ├── DeptController.java   # Department management
│   │   │   │   ├── FileUpcontroller.java    # File upload
│   │   │   │   └── UserController.java    # User management

│   │   │   ├── mapper/                 # Data access layer
│   │   │   │   ├── DeptMapper.java
│   │   │   │   └── UserMapper.java
│   │   │   ├── pojo/                   # Entity classes (model)
│   │   │   │   ├── Dept.java
│   │   │   │   └── User.java
│   │   │   ├── service/                # Business logic layer
│   │   │   │   ├── DeptService.java
│   │   │   │   ├── DeptServiceImpl.java
│   │   │   │   ├── UserService.java
│   │   │   │   └── UserServiceImpl.java
│   │   │   └── utils/                   # Common utility classes
│   │   ├── resources/
│   │   │   ├── mapper/                 # MyBatis Mapper XML files
│   │   │   │   ├── DeptMapper.xml
│   │   │   │   └── UserMapper.xml
│   │   │   ├── jdbc.properties         # Database connection config
│   │   │   ├── mybatis-config.xml       # MyBatis core config
│   │   │   ├── spring-mybatis.xml      # Spring + MyBatis integration
│   │   │   └── spring-mvc.xml          # Spring MVC config
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       └── index.jsp                
│   └── test/                           
├── pom.xml                              
└── .gitignore                           

```
## Features

### File Upload

| Endpoint | Method | Description |
| --- | --- | --- |
| `/file/upload` | POST | Single file upload, param name: `file` |
| `/file/uploadBatch` | POST | Multiple files upload, param name: `files` |

### User Management

| Endpoint | Method | Description |
| --- | --- | --- |
| `/user/list` | GET | Get all users |

### Department Management

| Endpoint | Method | Description |
| --- | --- | --- |
| `/dept/list` | GET | Get all departments |
| `/dept/add` | POST | Add department (form submission) |
| `/dept/add2` | POST | Add department (JSON submission, requires `@RequestBody`) |

## The problem I met
I used ***Spring 6*** and ***Jakarta Servlet API 6.0*** in my pom.xml at first,so when i used my ***Tomcat 8.5*** to run the project,and resulted in startup errors

### Reason
**Tomcat 8.5** only support **javax.servlet**, howerver **Spring 6** use jakarta.servlet. The two are imcompatible

### Solution
* Upgrade Tomcat to 10+(I chose this one,cuz no need to change the code)
* Or downgrade Spring to 5.x(a lot of configurations need to be changed)

