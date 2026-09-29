# 🏛️ Microservices Architecture Specialization

This repository is dedicated to developing resilient, scalable, and distributed microservices leveraging the **Spring Cloud, Spring Boot, Docker, and Kubernetes** ecosystem, based on the specialization led by Leandro Costa.

The primary goal of this project is to master the complete software development lifecycle and the transition from monolithic architectures to fault-tolerant distributed systems.

---

## 🛠️ Tech Stack & Ecosystem Tools

* **Back-end:** Java 21, Spring Boot 3.x
* **Distributed Architecture:** Spring Cloud Config, Feign Client, Rest Template
* **Containers & Orchestration:** Docker, Docker Compose, Kubernetes
* **Documentation:** OpenAPI 3 / Swagger (Spring REST Doc)
* **Data Persistence:** PostgreSQL, MongoDB (NoSQL)

---

## 📈 Repository Progress & Roadmap

### 🔄 In Development (Current Phase)
* **RESTful API Fundamentals with Spring Boot & Java 21**
  * [x] Initial project setup via Spring Initializr and version control with Git.
  * [x] Creating REST endpoints with clean routing mapping (`@RestController`, `@RequestMapping`, `@PathVariable`).
  * [x] **Resilience from the ground up:** Implementing a centralized global exception handling mechanism with `@ControllerAdvice` and `@ExceptionHandler`.
  * [x] Standardizing custom error payloads utilizing **Java Records** (`ExceptionResponse`).

### 🚀 Upcoming Milestones (Course Curriculum)
- [ ] **Distributed Systems Theory:** Deep dive into microservices patterns, challenges, and core concepts.
- [ ] **Centralized Configuration:** Managing microservice properties dynamically with *Spring Cloud Config*.
- [ ] **Inter-Service Communication:** Consuming synchronous APIs using *Feign Client* and *Rest Template*.
- [ ] **Asynchronous Processing:** Messaging and event-driven communication between services.
- [ ] **Advanced Containerization:** Packaging services with *Docker* and orchestrating them via *Docker Compose* and *Kubernetes*.
- [ ] **AI Integration:** Connecting microservices to the OpenAI ChatGPT API.

---

## 🗂️ Applied Architectural Structure

The project follows a strict layered architecture to ensure high cohesion and low coupling, which is vital for microservices isolation:

```text
 └── src/main/java/com/github/fwerther28/...
      ├── controllers/      # REST API endpoints layer
      ├── exception/        # Custom exceptions and error-handling infrastructure
      │    └── handler/     # Global interceptor (@ControllerAdvice)
      ├── model/            # Business entities and data representation
      └── RestWithSpringBootAndJavaApplication.java # Spring Boot bootstrapper



<- Implement ZipkinCustomSenderConfig with OkHttp sender for span trigger-update: 2026-09-29 -->
