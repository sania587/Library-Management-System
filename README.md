# 📚 Library Management System (JavaFX)

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX-512BD4?style=for-the-badge&logo=java&logoColor=white)
![FXML](https://img.shields.io/badge/FXML-333333?style=for-the-badge&logo=xml&logoColor=white)
![Vercel](https://img.shields.io/badge/Vercel-000000?style=for-the-badge&logo=vercel&logoColor=white)

A feature-rich desktop application for managing library inventory, including book records, search functionality, and administrative tools.

</div>

---

## 📋 Table of Contents
- [Overview](#-overview)
- [Key Features](#-key-features)
- [Project Structure](#-project-structure)
- [Screens & Navigation](#-screens--navigation)
- [Installation & Setup](#-installation--setup)
- [Web Demo](#-web-demo)
- [Deployment](#-deployment)
- [Technologies Used](#-technologies-used)

---

## 🔍 Overview
The **Library Management System** is a robust desktop application built using **JavaFX** and **FXML**. It provides a user-friendly graphical interface for librarians to efficiently manage their catalog. The system handles everything from adding new arrivals to complex searches and catalog editing.

---

## ✨ Key Features
- **📖 Catalog Management**: Add, edit, and delete book records with ease.
- **🔍 Advanced Search**: Quickly find books by title, author, or ISBN.
- **📊 View All Books**: Comprehensive table view of the entire library inventory.
- **🖼️ Graphical UI**: Built with JavaFX FXML for a modern and clean user experience.
- **⚙️ Controller Logic**: Robust backend logic handled by `controller.java`.

---

## 📁 Project Structure
```
Library_Management_System/
├── src/
│   └── application/
│       ├── Main.java             # Entry point of the JavaFX app
│       ├── controller.java       # Main business logic and event handling
│       ├── home.fxml             # Landing dashboard UI
│       ├── addbook.fxml          # Form for adding new books
│       ├── searchbook.fxml       # Search interface
│       ├── editingbook.fxml      # Edit book records
│       ├── deletebook.fxml       # Delete book records
│       ├── viewallbook.fxml      # Table view for all books
│       └── application.css       # Global styles for the UI
└── public/                       # Web-based demo version (Vercel)
```

---

## 🖥 Screens & Navigation
- **Home**: The central hub for all library operations.
- **Add Book**: Capture details like Title, Author, ISBN, and Category.
- **View All**: A sortable list of every book in the database.
- **Search**: Real-time filtering to locate specific titles.
- **Edit/Delete**: Administrative tools for maintaining catalog accuracy.

---

## 🚀 Installation & Setup

1. **Prerequisites**
   - [JDK 17 or higher](https://www.oracle.com/java/technologies/downloads/)
   - [JavaFX SDK](https://openjfx.io/)
   - An IDE like IntelliJ IDEA or Eclipse.

2. **Configuration**
   - Add the JavaFX library to your project's build path.
   - Set VM options to include the JavaFX modules:
     ```bash
     --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
     ```

3. **Run the App**
   - Run `Main.java` from your IDE.

---

## 🌐 Web Demo
We have created a **Web-based Landing Page** for this project so you can preview the UI style and features directly in your browser.

👉 [**View Live Demo on Vercel**](#-deployment)

---

## ☁️ Deployment
The landing page of this project is deployed on **Vercel**.

### Production Deploy
```bash
npx vercel --prod
```

---

## 🛠 Technologies Used
- **Language**: Java
- **UI Framework**: JavaFX
- **UI Layout**: FXML
- **Styling**: CSS
- **Deployment**: Vercel (for Landing Page)

---

<div align="center">

Modern Solutions for Traditional Libraries

⭐ Star this repo if you found it helpful!

</div>
