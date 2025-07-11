# Project Title
#  QuizApp

A Java quiz application built with Maven, using a CSV file for questions.

---

## 🗂️ Project Structure

```
quizapp/
├── src/                # Java source files
├── question.csv        # Quiz questions in CSV format
├── pom.xml             # Maven build configuration
├── mvnw, mvnw.cmd      # Maven Wrapper scripts
└── .mvn/               # Maven Wrapper directory
```

---

## 🚀 Getting Started

### Prerequisites

- **Java 8+** or higher  
- **Maven** (if not using the included wrapper)  
- **Git** (for cloning)

### Clone & Build

```bash
git clone https://github.com/Chiranbaskota/quizapp.git
cd quizapp
./mvnw clean package       # Linux/macOS
mvnw.cmd clean package     # Windows
```

Or, if Maven is installed:

```bash
mvn clean package
```

### Run the Application

```bash
./mvnw exec:java           # Linux/macOS
mvnw.cmd exec:java         # Windows
```

This will launch the quiz in your console where you can answer questions from `question.csv`.

---

## 📝 CSV Format

Ensure each row in `question.csv` follows:

```
question,option1,option2,option3,option4,correctOptionIndex,explanation
```

**Example:**

```
What is the capital of France?,Paris,London,Berlin,Madrid,0,Paris is the capital city.
```

> 💡 *Make sure `correctOptionIndex` matches the zero-based position (0–3).*

---

## 🛠️ Features

- Loads questions from a CSV file
- Presents multiple-choice questions
- Validates answers
- Displays correct answers and explanations

---

## 🎯 How to Contribute

1. **Fork** this repository
2. Create a branch:  
   ```bash
   git checkout -b feature/my-feature
   ```
3. Commit your changes:  
   ```bash
   git commit -m "Add awesome feature"
   ```
4. Push to your fork:  
   ```bash
   git push origin feature/my-feature
   ```
5. Open a Pull Request

---

## 📚 To‑Do & Improvements

- [ ] Add timer for each question
- [ ] Support quiz categories
- [ ] Store high scores
- [ ] Add GUI (e.g., Java Swing or JavaFX)
- [ ] Write unit tests

---

## 💡 Ideas

- Use JSON instead of CSV for flexibility
- Generate HTML report after quiz
- Create admin CLI to add/edit questions

---


> Let me know if you'd like:
> - Tech stack badges
> - Screenshots or ASCII art
> - Live deployment instructions
> - Contribution guidelines template
> - Add sections for testing, CI, Docker, etc.
