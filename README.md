# ToDo

A simple Java-based To-Do list application built with Maven.

## 📝 Overview

This project provides a console-based (or potentially GUI-enabled) ToDo list manager. It allows users to:

* Add tasks
* Mark tasks as completed
* Remove tasks
* List current tasks

It’s structured using Maven for build and dependency management.

## 🚀 Tech Stack

* **Language:** Java
* **Build Tool:** Apache Maven
* **Project Structure:** Follows a standard Maven layout (`src/main/java`, `src/test/java`)
* **Version Control:** Git (hosted on GitHub)

## 📦 Getting Started

### Prerequisites

Make sure you have the following installed:

* Java JDK 8 or higher
* Maven 3.x
* Git

### Clone the Repository

```bash
git clone https://github.com/madbeast25/ToDo.git
cd ToDo
```

### Build the Project

```bash
mvn clean compile
```

### Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.example.todo.Main"
```

*Adjust the **`mainClass`** path based on your package structure.*

### Run Tests

```bash
mvn test
```

## 🛠️ Usage

Here’s how to interact with the application once running:

1. **Add a task**

   ```
   > add "Buy groceries"
   ```
2. **List pending tasks**

   ```
   > list
   ```
3. **Mark a task completed**

   ```
   > done 2
   ```
4. **Remove a task**

   ```
   > remove 3
   ```
5. **Exit app**

   ```
   > exit
   ```

*(These commands assume a CLI—adjust if you're using GUI or interactive menus.)*

## 🗂️ Project Structure

```
ToDo/
├── pom.xml
└── src/
    ├── main/java/...      # Application source code
    └── test/java/...      # Unit tests
```

### pom.xml Highlights

* Project coordinates (groupId, artifactId, version)
* Dependencies (testing frameworks like JUnit, CLI helpers, etc.)
* Build plugins (for compiling, packaging, executing)

## ✅ Contributing

Contributions are welcome! To contribute:

1. Fork the repo
2. Create a feature or bugfix branch:

   ```
   git checkout -b feature/your-feature
   ```
3. Commit your changes
4. Push your branch to GitHub
5. Open a Pull Request and describe what you’ve added

## 📄 License

This project is open-sourced under the **MIT License**. See [LICENSE](LICENSE) for details.

---

## 📌 Customize

You can extend this project by:

* Adding persistent storage (e.g., JSON, SQLite, files)
* Building a web or mobile interface
* Adding priority levels and due dates
* Enhancing with tagging and filtering

---

**Enjoy building with your ToDo app!**
