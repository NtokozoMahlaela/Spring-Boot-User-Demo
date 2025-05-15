Spring Boot User Demo 
Overview
This is a Spring Boot application demonstrating basic user management functionality. The project provides a foundation for building web applications with Spring Boot, including web MVC architecture and RESTful endpoints.

Prerequisites
Before running this project, ensure you have the following installed:

Java Development Kit (JDK) 17 or later

Gradle 8.4 or compatible version

Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

Internet connection (for downloading dependencies)

Project Structure
spring-boot-user-demo/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── controller/    # Contains web controllers
│   │   │   ├── model/         # Contains data models/entities
│   │   │   ├── repo/          # Contains repository interfaces
│   │   │   ├── service/       # Contains business logic
│   │   │   └── DemoApplication.java  # Main application class
│   │   └── resources/         # Contains configuration files
│   └── test/                  # Contains test classes
├── build.gradle               # Project build configuration
├── gradlew                    # Gradle wrapper for Unix systems
├── gradlew.bat                # Gradle wrapper for Windows
└── README.md                  # This file

Getting Started
1. Clone the Repository
git clone (https://github.com/NtokozoMahlaela/Spring-Boot-User-Demo.git)
cd spring-boot-user-demo

2. Build the Project
Using Gradle wrapper:
# For Windows
gradlew.bat build

3. Run the Application
bash
# Run with Gradle
./gradlew bootRun

4. Access the Application
Once running, you can access:

Swagger UI (if configured): http://localhost:8080/swagger-ui.html

Actuator endpoints: http://localhost:8080/actuator/health

Dependencies
The project uses the following main dependencies (managed by Spring Boot):

Spring Boot Starter Web: For building web applications

Spring Boot Starter Test: For testing support

Spring Boot Starter Data JPA: For database access (if added later)

H2 Database: In-memory database (if added later)

Configuration
The application can be configured via application.properties or application.yml in the src/main/resources directory. Common configurations include:

Server port: server.port

Database connection: spring.datasource.*

JPA properties: spring.jpa.*

Testing
To run tests:

bash
./gradlew test

Troubleshooting
If you encounter the build error about unable to delete directories:

Try Removing the binary first:
powershell
# Specific path removal 
Remove-Item -Recurse -Force 'C:\Users\giles\OneDrive\Documents\Springboot project\spring-boot-user-demo\spring-boot-user-demo\build\test-results\test\binary'

# More general approach 
Remove-Item -Recurse -Force "$env:USERPROFILE\OneDrive\Documents\Springboot project\spring-boot-user-demo\spring-boot-user-demo\build"

If that doesnt work try Cleaning first:
bash
./gradlew clean bootRun
Stop any running Gradle daemons:

bash
./gradlew --stop
Ensure no other processes are locking files (especially on Windows)

Contact
For questions or support, please contact:

Ntokozo Mahlaela

Email: Ntokozomahlaela@gmail.com

GitHub: NtokozoMahlaela
