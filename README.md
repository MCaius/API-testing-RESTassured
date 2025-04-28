# 📬 ATR API Testing Project

This project is a lightweight API test automation framework for basic CRUD operations using Java, RestAssured, and TestNG. It covers creating, reading, updating, and deleting users through API tests, following a clean and simple structure suitable for learning, improving, and scaling API tests.


---

## ✅ Test Automation Architecture & Features

- ✔ **HTTP validations:**
    - Status code verification
    - Header verification
    - Response body structure validation
- ✔ **CRUD Operations covered:**
    - Create User
    - Get Single User
    - Update User
    - Delete User
- ✔ **Clean separation between:**
    - Models (User objects)
    - Services (API request methods)
    - Tests (Test scenarios)
- ✔ Reusable and easy to maintain
- ✔ Organized folder structure for scalability
- ✔ Test execution controlled via TestNG XML Suites
- ✔ Built-in lightweight logging with SimpleLogger

---

## 📂 Project Structure

```
src
└── test
    └── java
        └── com.atr.api
            ├── models
            │   └── User.java                    # POJO model for User entity
            ├── services
            │   └── UserService.java             # Service class to manage user-related API requests
            └── tests
                ├── CreateUserTest.java          # Test for creating a new user
                ├── DeleteUserTest.java          # Test for deleting a user
                ├── GetSingleUserTest.java       # Test for fetching a user by ID
                ├── HeaderTest.java              # Test for verifying response headers
                ├── ResponseBodyTest.java        # Test for verifying response body structure
                ├── StatusCodeTest.java          # Test for verifying HTTP status codes
                ├── TestBase.java                # Base test class with shared setup
                └── UpdateUserTest.java          # Test for updating an existing user
└── resources
    ├── CRUD-tests.xml                          # TestNG suite for CRUD operation tests
    ├── mandatory-tests.xml                     # TestNG suite for mandatory basic tests (status, headers, body)
    └── simplelogger.properties                 # SimpleLogger configuration


``` 

---

## 🚀 How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/MCaius/API-testing-RESTassured
   ```
2. **Run the test suites using Maven:**:
- Run all CRUD tests:
   ```bash
   git mvn test -DsuiteXmlFile=CRUD-tests.xml
   ```
- Run mandatory (basic) tests:
   ```bash
   git mvn test -DsuiteXmlFile=CRUD-tests.xml
   ```
  (Make sure your working directory is at project root when running Maven commands.)

---

## ✨ Features
- ✅ Full coverage of basic CRUD operations
- ✅ Modular service classes for API actions
- ✅ JSON serialization and deserialization using POJO (User)
- ✅ Flexible TestNG XML suite execution
- ✅ Lightweight, readable, beginner-friendly structure
- ✅ SimpleLogger for cleaner console output without extra libraries
---

## 🛠 Tech Stack
- Java
- RestAssured
- TestNG
- Maven

---
## ➡️ Notes
- This project focuses on simplicity and can be easily expanded to more complex test scenarios.
- Great for educational purposes, interview preparation, and bootstrapping more serious API frameworks later.
- No external environment needed: It uses public dummy API endpoints.