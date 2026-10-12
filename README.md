# 🏛️ Microservices Architecture Specialization

This repository is dedicated to developing resilient, scalable, and distributed microservices leveraging the **Spring Cloud, Spring Boot, Docker, and Kubernetes** ecosystem, based on the specialization led by Leandro Costa.

The primary goal is to master the entire software engineering lifecycle: decomposing monolithic logic, orchestrating multi-service communication, distributed observability, container packaging, automated CI/CD pipelines, and cloud-native Kubernetes orchestration on Google Cloud Platform (GCP).

---

## 🛠️ Tech Stack & Ecosystem Tools

- **Back-end:** Java 21, Spring Boot 3.x, Maven
- **Distributed Architecture:** Spring Cloud (Spring Cloud Config, Netflix Eureka, OpenFeign, RestTemplate)
- **Observability & Tracing:** Zipkin (Distributed Tracing with custom sender / span configurations)
- **Containers & DevOps:** Docker, Docker Compose, Docker Hub, GitHub Actions (CI/CD Pipelines)
- **Cloud & Orchestration (Upcoming):** Kubernetes, Google Kubernetes Engine (GKE)
- **Data Persistence & Tools:** MySQL, PostgreSQL, H2 Database, HeidiSQL, Spring Data JPA / Hibernate
- **API Documentation:** OpenAPI 3 / Swagger (Spring REST Doc / Springdoc)

---

## 📈 Repository Progress & Roadmap

### ✅ Completed Milestones

- [x] **RESTful API Foundations:** Layered architecture, centralized global exception handling (`@ControllerAdvice`), and standardized error payloads with Java Records.
- [x] **Data Persistence & Management:** Relational database integration via Spring Data JPA and database administration with HeidiSQL.
- [x] **Centralized Configuration & Service Discovery:** Dynamic service lookup and registry using **Netflix Eureka Server** and centralized configuration with **Spring Cloud Config**.
- [x] **Inter-Service Communication:** Synchronous client consumption across services leveraging **OpenFeign** and **RestTemplate**.
- [x] **Distributed Tracing & Observability:** End-to-end request tracing integrated with **Zipkin**.
- [x] **Stack Containerization:** Multi-container packaging using custom **Dockerfiles** and multi-service orchestration with **Docker Compose**.

---

### 🔄 In Development (Current Phase — Section 16)

- [ ] **Continuous Delivery (CI/CD):** Automating build validation and delivery pipelines to push container images to **Docker Hub** via **GitHub Actions**.

---

### 🚀 Upcoming Core Milestones (Sections 17–19)

- [ ] **Section 17 — Kubernetes & Docker Architecture:** Deploying and managing containerized Spring Boot microservices on Kubernetes.
- [ ] **Section 18 — Cloud-Native Kubernetes:** Running Kubernetes on Google Cloud using **Google Kubernetes Engine (GKE)**.
- [ ] **Section 19 — Multi-Service Cluster Deployment:** Deploying the full Spring Boot & Spring Cloud microservices ecosystem into Kubernetes clusters.

---

### 🎁 Extra Modules & Extensions

- [ ] **Section 20:** Advanced Maven Archetypes beyond dependency management.
- [ ] **Section 21:** AI Integration — Connecting microservice workflows to the **OpenAI ChatGPT API**.

---

## 🗂️ Applied Architectural Structure

The repository maintains modular microservice components with continuous delivery configurations:

```text
├── .github/workflows/          # Automated CI/CD pipelines (GitHub Actions)
├── docker-compose.yml          # Container orchestration (App services, DB, Eureka, Zipkin)
├── naming-server/              # Service Discovery server (Netflix Eureka)
├── microservice-a/             # Business microservice
│    ├── src/main/java/...
│    │    ├── controllers/      # REST endpoints
│    │    ├── services/         # Business logic & Feign clients
│    │    ├── configuration/    # Tracing, CORS, and sender configurations
│    │    └── exception/        # Exception handlers
│    └── Dockerfile             # Multi-stage image definition
└── microservice-b/             # Downstream microservice
