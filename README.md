# Driveon-Backend

## Project Overview
Driveon-Backend is a Spring Boot backend application for the **DriveOn** car rental platform. It exposes a RESTful API to manage car inventory, user accounts, and rental bookings. This backend handles core business logic and data persistence, enabling clients (like React frontend or mobile apps) to interact seamlessly with the system.

---

## Features

- **User Management**: Register, login, and manage user profiles  
- **Vehicle Inventory**: Add, update, list, delete vehicles  
- **Rental Management**: Create, update, cancel car rentals  
- **Booking History**: View past/current rentals for each user  
- **Secure Endpoints**: (Optional) JWT or Spring Security integration  
- **Data Validation**: Ensures API data consistency and error handling  

---

## Technology Stack

| Layer      | Tool/Framework              |
|------------|-----------------------------|
| Language   | Java 17                  |
| Framework  | Spring Boot (MVC, Data JPA) |
| Database   | H2 (in-memory) / MySQL      |
| Build Tool | Maven                       |
| Dev Tools  | Spring Tool Suite, IntelliJ |
| API Test   | Postman                     |

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/Driveon-Backend.git
cd Driveon-Backend
```

### 2. Import into IDE

```text
# In STS or Eclipse:
File > Import > Maven > Existing Maven Projects

# In IntelliJ:
File > Open > Select project folder > Maven project
```

### 3. Configure the Database (Optional)

Update the `src/main/resources/application.properties`:

```properties
# MySQL configuration
spring.datasource.url=jdbc:mysql://localhost:3306/driveon
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the Application

#### From IDE

```text
Run the main class: DriveonBackendApplication.java
```

#### From Terminal

```bash
mvn spring-boot:run
```

#### Or Build and Run the JAR

```bash
mvn clean package
java -jar target/Driveon-Backend-0.0.1-SNAPSHOT.jar
```

### 5. Access the API

```http
http://localhost:8080
```

---

## API Documentation

Postman Collection (coming soon)

---

## Folder Structure

```bash
Driveon-Backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/driveon/...
│   │   │       ├── controller/...
│   │   │       ├── model/...
│   │   │       ├── repository/...
│   │   │       └── service/
│   │   └── resources/
│   │       ├── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

---

## Notes

- You can switch between H2 (in-memory) or MySQL for development.
- Optionally integrate JWT or Spring Security for authentication in production.

---
