# 🧠 Design Patterns Lab — Assignment 1 (Solution Documentation)

## 📦 Smart University Lab Resource Management System

---

## 📌 Overview

This document describes the implementation of the **Smart University Lab Resource Management System**, which demonstrates the application of three core design patterns:

* Factory Method Pattern
* Builder Pattern
* Singleton Pattern

The system models how university lab sessions are created, how students submit resource requests, and how global system constraints are enforced.

---

## 📂 Source Code Structure

```text
src/
├── config/                 → Global system configuration (Singleton)
├── lab/                    → Lab session hierarchy (Polymorphism)
├── factory/                → Lab creation logic (Factory Method)
├── request/                → Resource request model
├── request/builder/        → Request construction (Builder Pattern)
└── app/                    → Application entry point
```

This structure follows a **layered separation of concerns**:

* creation logic (factory)
* domain models (lab, request)
* system configuration (config)
* execution layer (app)

---

## 🧠 Architectural Design

The system is designed around the following principles:

* **Encapsulation of object creation**
* **Separation of responsibilities**
* **Open/Closed Principle (OCP)**
* **Avoidance of conditional-based instantiation**
* **Extensibility for future lab types and request formats**

---

## 🧩 Design Patterns Used

---

## 1. 🧠 Singleton Pattern — System Configuration

### 📍 Purpose

Ensures a single shared configuration instance across the entire system.

### 📍 Responsibility

The `SystemConfig` class centralizes:

* lab capacity
* allowed resources
* global system constraints

### 📍 Design Benefit

* Prevents inconsistent configuration states
* Provides global controlled access
* Ensures system-wide consistency

### 📍 Key Insight

All lab sessions implicitly depend on the same configuration instance, ensuring unified system behavior.

---

## 2. 🏭 Factory Method Pattern — Lab Creation

### 📍 Purpose

Encapsulates object creation logic for different lab types.

### 📍 Responsibility

Each factory class is responsible for creating a specific type of `LabSession`:

* AI Lab
* Robotics Lab
* Cyber Security Lab

### 📍 Design Benefit

* Eliminates direct object instantiation in client code
* Supports extension without modifying existing factories
* Promotes polymorphic creation of objects

### 📍 Key Insight

New lab types can be introduced without changing existing system logic, only by adding new factory + class implementations.

---

## 3. 🧱 Builder Pattern — Resource Request Construction

### 📍 Purpose

Provides a flexible and readable way to construct complex `ResourceRequest` objects.

### 📍 Responsibility

`ResourceRequestBuilder` handles:

* optional parameters
* step-by-step object construction
* improved readability of request creation

### 📍 Design Benefit

* Avoids telescoping constructors
* Supports optional fields cleanly
* Improves code clarity and maintainability

### 📍 Key Insight

Request objects can evolve without modifying constructors or breaking existing code.

---

## 🧩 Domain Model Overview

---

### 🏫 LabSession (Abstract Layer)

Defines a common contract for all lab types:

* `processRequest(ResourceRequest request)`

Each lab type implements its own behavior.

---

### 🧪 Concrete Lab Implementations

* `AILabSession`
* `RoboticsLabSession`
* `CyberSecurityLabSession`

Each class represents a specialized lab environment with its own processing logic.

---

### 📦 ResourceRequest

Represents a student request including:

* student name
* resource type
* duration
* priority

Built using the Builder pattern.

---

## 🚀 System Execution Flow

The runtime behavior of the system follows this sequence:

1. A lab session is created using a Factory
2. A resource request is constructed using the Builder
3. The lab processes the request polymorphically
4. System-wide rules are implicitly governed by Singleton configuration

---

## 🧠 Design Highlights

### ✔ No conditional-based object creation

All object creation is delegated to factories.

---

### ✔ High extensibility

New lab types or request attributes can be added without modifying existing code.

---

### ✔ Clean separation of concerns

Each package has a single responsibility:

* `config` → system state
* `factory` → creation logic
* `lab` → business behavior
* `request` → data model
* `builder` → construction logic

---

### ✔ Real-world backend simulation

The system reflects patterns commonly used in:

* enterprise backend systems
* microservice architectures
* scalable application design

---

## 📌 Key Takeaways

After reviewing this solution, the key learning outcomes are:

* Understanding object creation abstraction
* Designing extensible systems using Factory Method
* Managing complex object construction using Builder
* Ensuring global consistency using Singleton
* Structuring maintainable Java backend systems

---

## 🎯 Final Remark

This implementation focuses on:

> clarity of design, correctness of patterns, and long-term extensibility

rather than unnecessary complexity.
