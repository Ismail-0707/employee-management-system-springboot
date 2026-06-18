# Employee Management System - Spring Boot

## Overview

A RESTful Employee Management System built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Features

- Add Employee
- Get All Employees
- Get Employee By ID
- Update Employee
- Delete Employee

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## API Endpoints

| Method | Endpoint | Description |
|----------|------------|------------|
| GET | /employees | Get all employees |
| GET | /employees/{id} | Get employee by ID |
| POST | /employees | Add employee |
| PUT | /employees/{id} | Update employee |
| DELETE | /employees/{id} | Delete employee |

## Sample Request

```json
{
  "name": "Ismail",
  "salary": 50000
}
```

## Project Structure

src/main/java

├── controller

├── service

├── repository

├── entity

└── EmployeeManagementApplication

## Author

Ismail
