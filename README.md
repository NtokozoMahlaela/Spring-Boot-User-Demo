
**Spring Boot User Management Demo**

**📌 Overview**

This is a simple Spring Boot demo application that manages user data in-memory, following the MVC architecture. It demonstrates the basic implementation of models, services, repositories, and unit testing within a Spring Boot project.

This project is ideal for learning or demonstrating:

Spring Boot project structure

Service and repository layers

Unit testing with JUnit

Gradle-based project setup

**🚀 Getting Started**
Prerequisites
Ensure the following are installed:

Java 17+

Gradle

Git (optional)

Clone the Repository

bash

Copy
Edit
git clone (https://github.com/NtokozoMahlaela/Spring-Boot-User-Demo.git)

▶️ Running the Application
Use the Gradle wrapper to run the application:

bash

Copy
Edit

./gradlew bootRun
Once started, the application will be accessible at http://localhost:8080 (default port).

🧪 Running Tests
To execute the unit tests:

bash

Copy

Edit

./gradlew test
The test results will be available in the build/reports/tests/test/index.html file.

**Trouble shooting: First remove the binary**

powershell

Remove-Item -Recurse -Force 'C:\Users\giles\OneDrive\Documents\Springboot project\spring-boot-user-demo\spring-boot-user-demo\build\test-results\test\binary'

**🧱 Project Structure**

Layer	Component	Description

Model	User.java	Represents the User entity

Repository	FakeRepo.java	In-memory user storage implementation

Service	UserServiceImpl.java	Business logic for user operations

Tests	UserServiceTests.java	Unit tests for the service layer

**📂 Technologies Used**

Java 17

Spring Boot

Gradle

JUnit 5

In-memory data structure (no database)

**✍️ Author**

Ntokozo Mahlaela

Email: Ntokozomahlaela@gmail.com

