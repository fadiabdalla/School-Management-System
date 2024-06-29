# School Management System

This project is a microservices-based School Management System that includes services for managing users, students, teachers, schedules, classes, grades, and attendance. The project uses Spring Boot for microservices, Spring Cloud Gateway for routing, and Spring Security for authentication and authorization.

## Table of Contents
- [Problem Statement](#problem-statement)
- [Use Cases](#use-cases)
- [System Architecture](#system-architecture)
- [Sequence Diagram](#sequence-diagram)
- [Features](#features)
- [Architecture](#architecture)

## Problem Statement
The current educational landscape is plagued by inefficiencies in managing schools, teachers, students, and parents due to outdated methods and disconnected communication. Manual administrative tasks, attendance tracking, grading processes, and communication gaps hinder the educational experience. The need for a digital School Management System is crucial to streamline operations, enhance communication, and create a seamless learning environment for all stakeholders.

## Use Cases
1. **Admin**:
   - Add/delete/update users (students, teachers, parents).
   - Assign students to classes or move them from class to another.
   - Assign teachers to classes or move them.
   - Read/update attendance of students.
   - Take/edit attendance of teachers.
   - Add/delete/update classes.
   - Set/update schedules.
   - Send messages to all users.
   - Add/update/delete/read announcements.

2. **Teacher**:
   - Take student attendance.
   - Read their teaching plan.
   - Assign grades to students.
   - Communicate with other teachers, students, admins, and parents.
   - Read announcements.
   - (Optional feature) Write something on the class whiteboard.

3. **Student**:
   - Check attendance.
   - Read their grades.
   - Read announcements.
   - Read their learning plan.
   - Communicate with their teachers, classmates, and admins.
   - Read class whiteboard.

4. **Parent**:
   - View their children's attendance.
   - View their children's grades.
   - Read announcements.
   - Communicate with admins and their children's teachers.

## System Architecture

![System_Architecture SMS](https://github.com/fadiabdalla/School-Management-System/assets/137774984/89bb3f74-1088-424a-9bb5-c7d53e5e322c)

## Sequence Diagram

![Sequence Diagram](https://github.com/fadiabdalla/School-Management-System/assets/137774984/29b32500-50a1-439a-b9c8-0754bbbf810b)

## Features
- User management (Admin, Student, Teacher)
- Class and schedule management
- Grade and attendance tracking
- Secure authentication and authorization
- API Gateway for routing and security
- Centralized configuration

## Architecture
The project is divided into multiple microservices:
- **User Service**: Manages user registration and authentication.
- **Student Service**: Manages student information.
- **Teacher Service**: Manages teacher information.
- **Class Service**: Manages class details.
- **Schedule Service**: Manages schedules.
- **Grade Service**: Manages grades.
- **Attendance Service**: Manages attendance records.
- **API Gateway**: Routes requests to appropriate services and handles security.


### Technologies Used
- Java 17 or higher
- Maven
- Eureka
- Api-Gateway
- Microservices
- Mapstruct

