# Order Management & Delivery Tracking System (OMDTS)

A Java Spring Boot-based backend system that manages customer orders, tracks deliveries in real-time, and provides logistics visibility — inspired by enterprise-grade supply chain solutions like those developed by Capgemini.

## 🧭 Project Objective

To build a scalable backend solution that enables:
- Order placement, tracking, and status updates
- Delivery route assignment and real-time delivery updates
- Integration-ready REST APIs for frontend or external logistics partners

This project aligns with Capgemini’s Intelligent Supply Chain strategy, focusing on **streamlined order lifecycle management** and **enhanced customer experience** through real-time logistics tracking.

## ⚙️ Tech Stack

| Tech         | Usage                        |
|--------------|------------------------------|
| Java         | Backend language              |
| Spring Boot  | REST APIs, MVC, DI            |
| Spring Data JPA | ORM for MySQL               |
| MySQL        | Relational database           |
| Postman      | API testing                   |
| Swagger/OpenAPI | API documentation          |
| Maven        | Dependency management         |


## 📦 Features

- 📝 Customer Order Creation
- 📦 Item-wise Order Listing
- 🚚 Delivery Assignment and Status Updates
- 📍 Real-time Order Status (e.g., Ordered, Dispatched, Delivered)
- 📊 Admin Dashboard APIs (summary of orders & delivery stats)
- 🔐 Basic Authentication (Spring Security)


## 📁 Project Structure

com.example.omdts
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config


## 🧪 Sample API Endpoints

| Method | Endpoint                    | Description                      |
|--------|-----------------------------|----------------------------------|
| POST   | `/api/orders`              | Create a new order               |
| GET    | `/api/orders/{id}`         | Get order details by ID          |
| PUT    | `/api/orders/{id}/status`  | Update order status              |
| GET    | `/api/deliveries`          | List all delivery assignments    |
| POST   | `/api/deliveries`          | Assign delivery to an order      |


## 🧠 Business Relevance

This backend system mirrors core components of:
- Capgemini's **Order Management Accelerator**
- Solutions deployed for **logistics** and **e-commerce** clients
- Goals like **lower delivery turnaround time**, **inventory accuracy**, and **real-time order visibility**


## 🚀 Getting Started

```bash
git clone https://github.com/your-username/order-management-system.git
cd order-management-system
mvn clean install

Ensure MySQL is running, and configure credentials in application.properties.

Future Enhancements
Role-based access with JWT

Geo-tracking using Google Maps API

Kafka integration for event-driven updates

Frontend using React or Angular

👨‍💻 Author
Priya Vishwakarma

#Architecture

Java Backend Developer | Aspiring to work on real-world Capgemini supply chain solutions

Client (Frontend or Postman)
     |
     v
Spring Boot REST Controller
     |
     v
Service Layer (Business Logic)
     |
     v
Repository Layer (Spring Data JPA)
     |
     v
MySQL Database
