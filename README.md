<div align="center">

# 🏫 School Insert Room

### Android Student Management App with Room Database

![Android](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)
![Room](https://img.shields.io/badge/Database-Room-blue?style=for-the-badge&logo=sqlite&logoColor=white)
![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-blue?style=for-the-badge&logo=android-studio&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

</div>

---

## 📖 About

A simple Android application for managing student records 
using **Room Database**. Users can add student information 
(first name, last name, phone number) and view the list 
of all saved students.

Built as a practical demonstration of **Room Persistence 
Library** in Android development.

---

## 📸 Screenshots

<div align="center">
<table>
<tr>
<td><img src="screenshots/add_student.png" width="200" /></td>
<td><img src="screenshots/student_list.png" width="200" /></td>
</tr>
<tr>
<td align="center"><b>Add Student</b></td>
<td align="center"><b>Student List</b></td>
</tr>
</table>
</div>

---

## ⚡ Features

- ✅ Add student records (First Name, Last Name, Phone)
- ✅ View list of all saved students
- ✅ Local data storage with Room Database
- ✅ Input validation (empty field check)
- ✅ Clean and simple UI
- ✅ Persian/Farsi language support
- ✅ Singleton database pattern

---

## 🏗️ Architecture
┌─────────────────┐ ┌─────────────┐ ┌──────────┐
│ MainActivity │────▶│ UserDao │────▶│ Room │
│ (Add Student) │ │ (Queries) │ │ SQLite │
└─────────────────┘ └─────────────┘ │ UserDB │
└──────────┘
┌─────────────────┐ ┌─────────────┐ │
│ UserListActivity │────▶│ Database │──────────┘
│ (View Students) │ │ Client │
└─────────────────┘ │ (Singleton) │
└─────────────┘

text


---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Programming Language |
| **Android Studio** | IDE |
| **Room Database** | Local Data Persistence |
| **SQLite** | Underlying Database Engine |
| **XML** | UI Layout Design |
| **DAO Pattern** | Data Access Object |
| **Singleton Pattern** | Database Instance Management |

---

## 📁 Project Structure
app/src/main/java/com/example/myapplication/
├── MainActivity.java # Add student form
├── UserListActivity.java # Display student list
├── User.java # Entity (data model)
├── UserDao.java # Database queries
├── AppDatabase.java # Room database config
└── DatabaseClient.java # Singleton DB instance

app/src/main/res/layout/
├── activity_main.xml # Add student UI
└── activity_user_list.xml # Student list UI

text


---

## 📋 Database Schema

### User Table

| Column | Type | Description |
|--------|------|-------------|
| `id` | INTEGER (PK) | Auto-generated ID |
| `firstName` | TEXT | Student's first name |
| `lastName` | TEXT | Student's last name |
| `phoneNumber` | TEXT | Student's phone number |

---

## 🔧 Key Components

### AppDatabase
- Room database configuration
- Defines `User` entity
- Version: 1

### DatabaseClient
- Singleton pattern for database instance
- Thread-safe with `synchronized`
- Provides single access point to Room DB

### MainActivity
- Input form with 3 fields
- Validates empty fields
- Inserts data via Room DAO
- Navigates to UserListActivity after save

### UserDao
- Data Access Object interface
- Insert, Query, Delete operations

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- JDK 8+
- Android SDK (API 21+)

### Installation

**Step 1:** Clone the repository
```bash
git clone https://github.com/ehsanrezaiegit/school-insert-room.git
Step 2: Open in Android Studio

text

File → Open → Select project folder
Wait for Gradle sync to complete
Step 3: Run the app

text

Connect Android device or start emulator
Click ▶️ Run
📝 How to Use
text

1. Open the app
2. Enter student's First Name
3. Enter student's Last Name  
4. Enter student's Phone Number
5. Tap "Save" button
6. View the student list automatically
🤝 Contributing
Contributions are welcome!

Fork this repository
Create a new branch
Bash

git checkout -b feature/new-feature
Make your changes
Commit
Bash

git commit -m "Add: new feature"
Push
Bash

git push origin feature/new-feature
Open a Pull Request
📄 License
text

MIT License
Copyright (c) 2024 Ehsan Rezaie
<div align="center">
👤 Author
Ehsan Rezaie

Portfolio
GitHub
Email

⭐ If you found this useful, give it a star!
</div> ```

android, java, room-database, sqlite, 
android-studio, student-management, 
crud, database, mobile-app
