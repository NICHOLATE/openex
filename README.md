# OpenEx Trading Platform – Week 1 Backend Development (Futuristic eXchange)

## Project Overview

OpenEx is a trading platform application designed to provide users with account registration, authentication, portfolio management, market data visualization, and trading functionality.

This repository contains the Week 1 backend implementation focused on user authentication and database integration.

---

## Week 1 Objectives

### Completed Tasks

* Spring Boot Backend Setup
* PostgreSQL Database Integration
* User Registration API
* User Login API
* Password Encryption using BCrypt
* JWT Authentication Implementation
* Spring Security Configuration
* Postman API Testing
* GitHub Branch Management

---

## Technology Stack

### Backend

* Java 26
* Spring Boot 4
* Spring Security
* Spring Data JPA
* Hibernate
* Maven

### Database

* PostgreSQL

### Authentication

* BCrypt Password Hashing
* JWT (JSON Web Token)

### Testing

* Postman

### Version Control

* Git
* GitHub

---

## Database Schema

### User Table

| Field            | Type   |
| ---------------- | ------ |
| id               | Long   |
| name             | String |
| surname          | String |
| email            | String |
| phoneNumber      | String |
| jobType          | String |
| hobbies          | String |
| employmentStatus | String |
| incomeType       | String |
| password         | String |

---

## API Endpoints

### Register User

POST

/api/auth/register

Request Body

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john@example.com",
  "phoneNumber": "0712345678",
  "jobType": "Software Developer",
  "hobbies": "Coding",
  "employmentStatus": "Employed",
  "incomeType": "Salary",
  "password": "Password123",
  "confirmPassword": "Password123"
}
```

Response

```json
{
  "message": "User registered successfully"
}
```

---

### Login User

POST

/api/auth/login

Request Body

```json
{
  "email": "nozwelo.com",
  "password": "Password123"
}
```

Response

```json
{
  "token": "JWT_TOKEN_HERE"
}
```

---

## Security Features

### Password Encryption

Passwords are securely stored using BCrypt hashing.

### JWT Authentication

Upon successful login:

* JWT token is generated
* Token is returned to the client
* Protected APIs require a valid JWT token

---

## Postman Testing

### Tested Successfully

#### Registration Endpoint

Status:

200 OK

Result:

User successfully stored in PostgreSQL database.

---

#### Login Endpoint

Status:

200 OK

Result:

User authenticated successfully and JWT token generated.

---

#### Invalid Login

Status:

401 Unauthorized

Result:

Authentication rejected.

---

## Project Structure

backend
├── config
│ └── SecurityConfig.java
├── controller
│ ├── AuthController.java
│ └── UserController.java
├── dto
│ ├── RegisterRequest.java
│ └── LoginRequest.java
├── model
│ └── User.java
├── repository
│ └── UserRepository.java
├── service
│ └── AuthService.java
├── security
│ └── JwtUtil.java
└── BackendApplication.java


## Week 1 Deliverables Achieved

✔ Backend Setup

✔ PostgreSQL Integration

✔ User Registration

✔ User Login

✔ Password Encryption

✔ JWT Authentication

✔ API Testing with Postman

✔ GitHub Version Control

---

## Next Phase

Week 2 – Frontend Development

Planned Activities:

* React Frontend Setup
* Registration Page
* Login Page
* Dashboard UI
* API Integration
* Chart.js Integration
* Live Data Visualization

---

Author

Nozwelo Sibiya

Information Technology Graduate

Software Developer

