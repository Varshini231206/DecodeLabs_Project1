# Number Guess Game (Java)

## 📌 Project Overview

The Number Guess Game is a console-based Java application developed as part of the DecodeLabs Java Programming Internship. The game challenges players to guess a target number between 1 and 100 within a limited number of attempts. The application provides hints after each guess and maintains the player's score across multiple rounds.

This project demonstrates fundamental Java programming concepts, including loops, conditional statements, exception handling, user input validation, and game logic implementation.

---

## 🎯 Features

* Guess a number between 1 and 100
* Maximum of 7 attempts per round
* High/Low hints after each guess
* Input validation for invalid entries
* Exception handling using `InputMismatchException`
* Score tracking across multiple rounds
* Play Again functionality
* Interactive console-based user interface

---

## 🛠 Technologies Used

* Java
* Scanner Class
* Random Class
* Exception Handling

---

## 📂 Project Structure

```text
DecodeLabs_Project1/
│
├── src/
│   ├── DecodeLabs_Java_P1.java
│   └── DecodeLabs_Java_P1.class
│
├── README.md
├── Requirements.md
└── .gitignore
```

> Note: The `.class` file is the compiled Java bytecode generated after compilation.

---

## ⚙️ Requirements

### Software Requirements

* Java JDK 8 or above
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans) or Command Prompt/Terminal

### Hardware Requirements

* Processor: Any modern CPU
* RAM: 2 GB or higher
* Storage: 50 MB free space

---

## ▶️ How to Run

### Clone the Repository

```bash
git clone https://github.com/Varshini231206/DecodeLabs_Project1.git
```

### Navigate to the Project Folder

```bash
cd DecodeLabs_Project1
```

### Compile the Program

```bash
javac src/DecodeLabs_Java_P1.java
```

### Run the Program

```bash
java -cp src DecodeLabs_Java_P1
```

---

## 🎮 Game Rules

1. A target number is selected between 1 and 100.
2. The player has a maximum of 7 attempts to guess the number.
3. The game provides hints after each guess:

   * **Too Low!** if the guess is less than the target number.
   * **Too High!** if the guess is greater than the target number.
4. The remaining attempts are displayed after each valid guess.
5. If the player guesses correctly, the score increases by one.
6. The player can choose to play another round after each game.

---

## 📸 Sample Output

```text
=====================================
 WELCOME TO NUMBER GUESS GAME
=====================================

A random number between 1 and 100 has been generated!
You have only 7 attempts.

Enter your guess: 40
Too Low! Try Again.
Remaining Attempts: 6

Enter your guess: 60
Too High! Try Again.
Remaining Attempts: 5

Enter your guess: 50

Congratulations! You guessed the correct number!
You guessed it in 3 attempts.

Current Score: 1
```

---

## 🚀 Future Enhancements

* Generate a new random number for every round
* Add multiple difficulty levels
* Implement a high-score system
* Add a timer-based challenge mode
* Develop a GUI version using Java Swing or JavaFX

---

## 📚 Learning Outcomes

Through this project, the following Java concepts were practiced:

* Variables and Data Types
* Conditional Statements
* Loops
* Exception Handling
* User Input Processing
* Random Number Generation
* Console-Based Application Development

---

## 👩‍💻 Author

**Srivarshini Yekambaram**

DecodeLabs Java Programming Internship Project
