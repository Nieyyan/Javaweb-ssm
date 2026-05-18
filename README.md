# Javaweb-ssm
This is a comprehensive course assignment for Java Web development.

## Tech Stack
Java, Spring, SpringMVC, MyBatis, MySQL, Maven

## Project Introduction
This project is built based on the SSM framework, which implements basic web functions such as user data management and CRUD operations.
It helps me systematically understand the integration and workflow of mainstream Java back-end frameworks during my university study.
 
## Project Structure
´´´bush
Javaweb-ssm-maven
├── src
│   ├── main
│   │   ├── java/com/woxueit/ssm
│   │   │   ├── config/                 # Configuration classes
│   │   │   ├── controller/             # Request handlers
│   │   │   │   ├── DeptController.java
│   │   │   │   └── UserController.java
│   │   │   ├── mapper/                 # MyBatis DAO interfaces
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
│   │       └── index.jsp                # Entry page
│   └── test/                            # Unit tests
├── pom.xml                              # Maven build & dependencies
└── .gitignore                           # Git ignore rules

´´´