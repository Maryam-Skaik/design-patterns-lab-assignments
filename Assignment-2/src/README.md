# 🧠 Design Patterns Lab — Assignment 2 (Solution Documentation)

## 📦 Adaptive Learning Management System (ALMS)

---

## 📌 Overview

This document describes the implementation of the **Adaptive Learning Management System (ALMS)**, which demonstrates the application of three core design patterns:

* Template Method Pattern
* Strategy Pattern
* Observer Pattern

The system simulates how university courses deliver content dynamically, notify students and instructors, and execute structured teaching workflows.

---

## 📂 Source Code Structure

```text
src/
├── app/                     → Application entry point
├── workflow/                → Teaching workflow skeleton (Template Method)
├── strategy/                → Learning strategies (Strategy Pattern)
├── notification/            → Observer pattern implementation
│   ├── observer/            → Observers (Students, Instructors)
│   └── subject/             → Event manager / Subject
└── main/                    → Main class to run simulation
```

This structure follows a **layered separation of concerns**:

* workflow definition (Template Method)
* dynamic behavior (Strategy)
* event-driven communication (Observer)
* execution layer (app)

---

## 🧠 Architectural Design

The system is designed around the following principles:

* **Separation of responsibilities**
* **Open/Closed Principle (OCP)** — easy to extend workflows, strategies, and observers without modifying existing code
* **Decoupling event notifications from business logic**
* **Runtime flexibility** for content delivery and workflow execution

---

## 🧩 Design Patterns Used

---

## 1. 📐 Template Method Pattern — Teaching Workflows

### 📍 Purpose

Defines the **fixed structure of a teaching workflow**, while allowing subclasses to customize specific steps.

### 📍 Responsibility

The abstract `TeachingWorkflow` class provides the **workflow skeleton**:

* prepare materials
* deliver content
* evaluate students

Subclasses implement specific behaviors for **LectureWorkflow**, **LabWorkflow**, or future workflows.

### 📍 Design Benefit

* Enforces consistency in workflow execution
* Reduces duplicate code
* Provides hooks for extension without modifying the base class

### 📍 Key Insight

The system can introduce new workflows (e.g., ProjectWorkflow) by subclassing `TeachingWorkflow` without touching existing code.

---

## 2. ⚡ Strategy Pattern — Learning Behavior

### 📍 Purpose

Encapsulates the **dynamic learning/content delivery behavior**, allowing runtime selection of strategies.

### 📍 Responsibility

`LearningStrategy` interface defines:

* `deliverContent()`

Concrete implementations:

* `BeginnerStrategy` → simplified content
* `AdvancedStrategy` → technical content
* `InteractiveStrategy` → step-by-step guidance

### 📍 Design Benefit

* Avoids conditional-based content selection
* Supports runtime switching of strategies
* Promotes flexible, decoupled system behavior

### 📍 Key Insight

Content delivery can evolve independently from the workflow. New strategies can be added without modifying existing workflows.

---

## 3. 🔔 Observer Pattern — Notification System

### 📍 Purpose

Handles **event-driven communication** between the system and subscribers (students, instructors).

### 📍 Responsibility

* `EventManager` acts as the Subject, managing subscription and notifying observers
* `Observer` interface defines `update(String event)`
* Concrete observers: `Student` and `Instructor`

### 📍 Design Benefit

* Decouples notifications from core workflow logic
* Supports multiple subscribers reacting independently
* Allows adding new observer types without modifying existing components

### 📍 Key Insight

The notification system is **scalable**, extensible, and independent from the workflow and content delivery logic.

---

## 🧩 Domain Model Overview

---

### 🎓 TeachingWorkflow (Abstract Layer)

Defines a fixed workflow skeleton:

* `prepareMaterials()`
* `deliverContent()`
* `evaluateStudents()`
* Optional hook: `postProcess()`

Subclasses implement the specific steps.

---

### 🏫 Concrete Workflows

* `LectureWorkflow` → lecture-based teaching
* `LabWorkflow` → lab-based teaching

Future workflows can be added by creating new subclasses.

---

### ⚙️ LearningStrategy

Represents dynamic learning behavior:

* `deliverContent()` is executed at runtime according to the selected strategy

Strategies can be switched without changing workflows.

---

### 🔔 Observer / EventManager

* `EventManager` → manages subscriptions and broadcasts events
* `Student` and `Instructor` → concrete observers reacting to system events

---

## 🚀 System Execution Flow

The runtime behavior of the system follows this sequence:

1. Observers (students/instructors) subscribe to `EventManager`
2. A teaching workflow is selected (`LabWorkflow`, `LectureWorkflow`)
3. A learning strategy is selected dynamically (`Beginner`, `Advanced`, `Interactive`)
4. Workflow executes using Template Method
5. Strategy delivers content according to the selected mode
6. EventManager notifies all subscribers of system events

All components interact **loosely coupled** and **extensibly**.

---

## 🧠 Design Highlights

### ✔ No conditional-based workflow or strategy selection

All selection is done via polymorphism and runtime assignment.

---

### ✔ High extensibility

New workflows, strategies, or observer types can be added without modifying existing code.

---

### ✔ Clean separation of concerns

Each package has a single responsibility:

* `workflow` → defines structured workflows
* `strategy` → encapsulates dynamic behavior
* `notification` → manages event-driven communication
* `app` → system entry point and orchestration

---

### ✔ Real-world backend simulation

The system reflects patterns commonly used in:

* adaptive learning platforms
* enterprise software with dynamic workflows
* event-driven architectures

---

## 📌 Key Takeaways

After reviewing this solution, students should understand:

* Structuring workflows using Template Method
* Decoupling dynamic behavior using Strategy
* Managing notifications with Observer
* Designing maintainable and extensible Java backend systems

---

## 🎯 Final Remark

This implementation focuses on:

> clarity of design, correctness of pattern application, and runtime flexibility

rather than unnecessary complexity, ensuring long-term maintainability and extensibility.
