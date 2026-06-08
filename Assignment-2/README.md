# 🧩 Assignment 2 — Adaptive Learning Management System (ALMS)

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Design](https://img.shields.io/badge/Focus-System%20Design-red.svg)
![Patterns](https://img.shields.io/badge/Design%20Patterns-Strategy%20%7C%20Observer%20%7C%20Template%20Method-purple.svg)
![Level](https://img.shields.io/badge/Difficulty-Intermediate--Advanced-orange.svg)

---

## 📌 Overview

You are required to design and implement an **Adaptive Learning Management System (ALMS)** for a modern university environment.

The system simulates how:

* Learning content is delivered using different teaching styles
* Notifications are broadcast to students and instructors
* Teaching workflows adapt dynamically based on course type

The goal is to build a **flexible, extensible, and loosely coupled architecture** that avoids rigid logic and duplicated implementations.

---

## 🧠 Problem Context

Modern learning platforms support multiple teaching approaches such as:

* Lecture-based learning
* Lab-based learning
* Project-based learning

Each approach differs in:

* How learning content is delivered
* How teaching steps are structured
* How system events are handled

Additionally:

* Notifications must be decoupled from core business logic
* Teaching workflows must remain reusable and consistent
* New learning behaviors must be introduced without modifying existing code

Current systems typically suffer from:

* hard-coded workflow selection logic
* duplicated notification handling
* tightly coupled components across modules

Your task is to redesign this system using proper design patterns.

---

## 🎯 System Requirements

### 1. Teaching Workflow Execution

The system must support multiple teaching workflows, such as:

* Lecture workflow
* Lab workflow
* Project workflow

Each workflow defines a **fixed execution structure**, for example:

* prepare → deliver → evaluate

However, each step may behave differently depending on the workflow type.

Requirements:

* The workflow execution structure must be consistent (fixed skeleton)
* Only specific steps should vary per workflow
* New workflows must be added without modifying existing ones

---

### 2. Notification System

The system must support event-driven notifications.

Events include:

* new lesson started
* assignment released
* lab session initialized

Requirements:

* Students and instructors must receive notifications
* Multiple receivers can subscribe independently
* Notification logic must be fully decoupled from business logic
* Adding new subscribers must not require modifying existing code

---

### 3. Learning Strategy Selection

The system must dynamically select how content is delivered based on context:

* Beginner mode → simplified explanations
* Advanced mode → detailed technical explanations
* Interactive mode → step-by-step guidance

Requirements:

* Selection must happen at runtime
* No hard-coded conditional logic for choosing strategies
* Strategies must be interchangeable without modifying core system logic

---

## 🧩 Required Design Patterns

You must use the following patterns only:

* **Template Method Pattern** → for defining the teaching workflow skeleton
* **Observer Pattern** → for event-driven notification system
* **Strategy Pattern** → for dynamic learning/content delivery behavior

Each pattern must be:

* clearly separated in responsibility
* correctly applied (not just syntactically used)
* integrated into a coherent system design

---

## ⚙️ Design Constraints

Your solution must follow these rules:

* Do NOT use `if/switch` for selecting workflows or strategies
* Do NOT duplicate notification logic across classes
* Do NOT tightly couple modules together
* Ensure each class has a single, clear responsibility
* Ensure the system is open for extension but closed for modification
* Keep the architecture clean and minimal, not over-engineered

---

## 🔄 Expected System Flow

Your system should simulate the following sequence:

1. A teaching workflow is initiated (Lecture / Lab / Project)
2. A learning strategy is selected at runtime
3. The workflow executes using a fixed structure (Template Method)
4. System events are triggered during execution
5. Notifications are broadcast to all subscribed users
6. Students and instructors react independently to events

All components must interact in a **loosely coupled and event-driven architecture**.

---

## 📦 Submission Requirements

Your submission must include:

* Full Java project
* UML class diagram (mandatory)
* Short design report (PDF/DOCX) including:

  * explanation of each design pattern used
  * design decisions and trade-offs
  * class responsibilities
  * system execution flow explanation
* Sample console output demonstrating system behavior

---

## 🚫 Important Notes

* Focus on **correct design pattern usage**, not system size or complexity
* Each pattern must have a clear and justified role
* Avoid unnecessary abstraction layers
* Keep the system readable and maintainable
* Ensure extensibility for new workflows, strategies, and event types

---

## 🎯 Learning Outcomes

After completing this assignment, students should be able to:

* design extensible workflow-based systems
* apply Strategy, Observer, and Template Method correctly
* separate event handling from core logic
* build runtime-flexible behavior systems
* avoid conditional-heavy architectural designs
