# Spring Boot User Management Demo

![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.7.0-green.svg)
![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Gradle](https://img.shields.io/badge/Gradle-7.4.2-blue.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

A simple Spring Boot demo application that manages user data in-memory, following the MVC architecture. Demonstrates basic implementation of models, services, repositories, and unit testing.

## 📌 Overview

This project is ideal for learning or demonstrating:
- Spring Boot project structure
- Service and repository layers
- Unit testing with JUnit
- Gradle-based project setup

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed:
- Java 17+
- Gradle
- Git (optional)

### Installation
```bash
git clone https://github.com/NtokozoMahlaela/Spring-Boot-User-Demo.git
cd Spring-Boot-User-Demo

```
## ▶️ Running the Application
Use the Gradle wrapper to run the application:

```bash
./gradlew bootRun
```
## � Project Structure

| Layer        | Component           | Description                              |
|--------------|---------------------|------------------------------------------|
| Model        | `User.java`         | Represents the User entity               |
| Repository   | `FakeRepo.java`     | In-memory user storage implementation    |
| Service      | `UserServiceImpl.java` | Business logic for user operations     |
| Tests        | `UserServiceTests.java` | Unit tests for the service layer      |

## Troubleshooting

If you encounter issues with test binaries:

```powershell
Remove-Item -Recurse -Force 'C:\Users\giles\OneDrive\Documents\Springboot project\spring-boot-user-demo\spring-boot-user-demo\build\test-results\test\binary'
```

## 📂 Technologies Used
- **Java 17**
- **Spring Boot**
- **Gradle**
- **JUnit 5**
- **In-memory data structure** (no database)

## ✍️ Author
**Ntokozo Mahlaela**  
📧 **Email:** [Ntokozomahlaela@gmail.com](mailto:Ntokozomahlaela@gmail.com)  
🔗 **GitHub:** [@NtokozoMahlaela](https://github.com/NtokozoMahlaela)
