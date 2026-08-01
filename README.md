## **Matching Engine HFT — High‑Performance Trading System**

This project is a high‑performance matching engine inspired by modern electronic exchanges.
It is designed with Clean Architecture, low‑latency data structures, and a fully observable, event‑driven pipeline.

The system processes incoming orders, matches them according to price‑time priority, and publishes execution events — all while maintaining durability, scalability, and real‑time monitoring.

### **Core Features**
#### **Order Matching Engine**  
Implements price‑time priority for BUY/SELL orders, supporting limit and market orders.

#### **Event‑Driven Architecture**  
Orders are published to Kafka and processed asynchronously by dedicated consumers.

#### **Low‑Latency Processing**  
Uses Java concurrency optimizations, Virtual Threads, and optionally the LMAX Disruptor for multi‑threaded pipelines.

#### **Durable State Storage**  
RocksDB is used as a local state store for the order book, while Postgres acts as the event store for auditability and recovery.

#### **Clean Architecture**  
Domain logic is fully isolated from frameworks, ensuring testability and long‑term maintainability.

#### **REST API**  
Spring Boot exposes endpoints for submitting, modifying, and canceling orders.

#### **Observability**  
Metrics exposed via Actuator + Prometheus, with dashboards in Grafana.

#### **Technology Stack**
- **Java 21**

- **Spring Boot**

- **Apache Kafka**    

- **RocksDB**

- **Postgres**

- **LMAX Disruptor**

- **Prometheus & Grafana**

- **Docker Compose**

### **Project Goals**
- Build a realistic, low‑latency matching engine.
- Support multi‑threaded order processing using Disruptor.
- Provide durable recovery via snapshots + event replay.
- Simulate market data feeds and high‑load scenarios.
- Offer full observability for latency, throughput, and system health.
- Maintain a clean, modular architecture suitable for production‑grade systems.