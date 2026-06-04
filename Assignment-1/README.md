# 🧩 Assignment 1 — Smart University Lab Resource Management System

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Design](https://img.shields.io/badge/Focus-System%20Design-red.svg)
![Patterns](https://img.shields.io/badge/Design%20Patterns-Factory%20%7C%20Builder%20%7C%20Singleton-purple.svg)
![Level](https://img.shields.io/badge/Difficulty-Intermediate-orange.svg)

---

## 📌 Overview

You are required to design and implement a **Smart Lab Resource Management System** for a modern university environment.

The system models how lab sessions are created, how students request resources, and how system-wide rules are enforced in a consistent and scalable way.

The goal is to move from a **rigid, tightly coupled design** to a **flexible, extensible architecture** using proper object-oriented design principles and design patterns.

---

## 🧠 Problem Context

Modern university labs (AI, Robotics, Cybersecurity, etc.) have different behaviors and requirements, such as:

* different lab session types
* dynamic student resource requests
* shared system-wide constraints

However, the current system suffers from:

* repeated object creation logic
* rigid structure when adding new lab types
* complex and inconsistent request construction
* duplicated configuration logic across the system

Your task is to redesign this system using proper design principles.

---

## 🎯 System Requirements

### 1. Lab Session Creation

* The system must support multiple types of lab sessions.
* Each lab type has its own behavior and setup rules.
* The design must allow adding new lab types **without modifying existing code**.

---

### 2. Resource Requests

* Students can submit requests for lab resources.
* Requests may contain optional and varying data.
* Construction of requests must be clean and flexible.

---

### 3. System Configuration

* A single shared configuration must exist across the system.
* It should define:

  * lab capacity
  * allowed resources
  * global constraints
* All components must rely on this shared configuration.

---

## 🧩 Required Design Patterns

You must use the following patterns:

* **Factory Method Pattern** → for creating lab sessions
* **Builder Pattern** → for constructing resource requests
* **Singleton Pattern** → for managing system configuration

Each pattern must be used **correctly and meaningfully**, not only syntactically.

---

## ⚙️ Design Constraints

Your solution must follow these rules:

* Avoid `if/switch` logic for object creation
* Avoid tight coupling between classes
* Avoid duplicate configuration logic
* Ensure classes have clear responsibilities
* Ensure the system is open for extension but closed for modification

---

## 🔄 Expected System Flow

Your system should simulate the following flow:

1. A lab session is created
2. Students submit resource requests
3. Requests are built using a flexible structure
4. System configuration is applied consistently
5. Requests are processed according to lab rules

---

## 📦 Submission Requirements

Your submission must include:

* Full Java project
* UML class diagram (mandatory)
* Design report (PDF or DOCX) including:

  * design decisions
  * pattern usage explanation
  * class responsibilities
* Example execution output (console)

---

## 🚫 Important Notes

* Focus on **design correctness**, not complexity
* Each pattern must have a clear responsibility
* Avoid over-engineering beyond requirements
* Ensure code is readable and maintainable
* Ensure extensibility for future lab types and features

---

## 🎯 Learning Outcomes

After completing this assignment, students should be able to:

* design extensible object creation systems
* apply Factory, Builder, and Singleton correctly
* separate concerns in system architecture
* model real-world systems using OOP principles
* avoid rigid and tightly coupled designs
