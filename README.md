# 🎤 Online Mock Interview Simulator

A desktop-based Java Swing application that lets students practice job interviews in a timed, structured environment and receive instant, automated performance feedback — built as a Semester Project for **Software Construction & Development**.

---

## 👤 Student Information


| **Student Name** | Noor-Ul-Eman |
| **Roll Number** | L1F23BSSE0180 |
| **Course** | Software Construction & Development |
| **Section** | SEF6 |
| **Semester** | 6th Semester |
| **Submitted To** | Sir Abdul Rehman Hashmi |

---

## 📋 Project Description

Most academic projects in this domain are simple CRUD applications. The **Online Mock Interview Simulator** instead gives students an interactive, pressure-tested way to prepare for real interviews. Users log in, pick an interview category, and answer randomly generated questions under a per-question countdown timer. Once the session ends, the system automatically calculates a score, assigns a performance grade, and generates tailored feedback on a dashboard.

The app is built entirely in **Java SE (Swing)** using in-memory data structures (`ArrayList` / `HashMap`) — no external database is required — and follows clean OOP design with abstraction, inheritance, encapsulation, and polymorphism across dedicated `model`, `session`, `report`, `gui`, and `util` packages.

**Tech stack:** Java SE · Java Swing (GUI) · `java.util.Timer` · `java.util.Random` · Eclipse IDE · GitHub (version control)

---

## ✨ Features

- 🔐 **Login & Session Management** — credential validation, active session handling, and logout
- 🗂️ **Category Selection** — choose between Technical, HR, or Behavioral interviews
- ❓ **Smart Question Engine** — randomly pulls questions per category with a live countdown timer and auto-advance on timeout
- ✅ **Answer Submission & Validation** — records each response and checks it against stored correct answers
- 📊 **Automatic Score Calculation** — tallies correct answers and computes a final percentage
- 🧠 **Tailored Feedback Generation** — performance grading (Excellent / Good / Average / Needs Improvement) with custom feedback messages
- 📈 **Performance Dashboard** — full session summary showing score, grade, feedback, and a question review
- 🔄 **Reset & Restart** — clear the current session and return to category selection at any time

---

## ⚙️ Installation Steps

> No external database setup is required — all data is stored in-memory for the session.

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/online-mock-interview-simulator.git
   ```
2. **Open in Eclipse IDE**
   - Launch Eclipse → `File` → `Import` → `Existing Projects into Workspace`
   - Select the cloned project folder and click `Finish`
3. **Verify JDK setup**
   - Ensure a JDK (Java 8 or later) is configured under `Project` → `Properties` → `Java Build Path`
4. **Run the application**
   - Locate `Main.java` inside the `main` package
   - Right-click → `Run As` → `Java Application`
5. **Log in and start practicing!**
   - Use the login screen to authenticate, pick a category, and begin your mock interview session

---

## 🖼️ Screenshots

**Login Screen**
![Login Screen](screenshots/01-login-screen.png)

**Select Interview Category**
![Category Selection](screenshots/02-category-selection.png)

**Mock Interview Session (Technical Category)**
![Technical Interview Session](screenshots/03-technical-interview-session.png)

**Interview Results & Feedback**
![Interview Results](screenshots/04-interview-results.png)

---

## 🚀 Future Enhancements

- 🤖 AI-based answer evaluation and feedback generation
- 🎙️ Voice input support for spoken mock interviews
- 📊 Advanced performance analytics and progress tracking over multiple sessions
- 🗄️ Migration from in-memory storage to a persistent database
- 🌐 Web-based version for cross-platform accessibility

---

*Submitted as part of the Software Construction & Development Semester Project.*
