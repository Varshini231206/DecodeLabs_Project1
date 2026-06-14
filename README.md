# Number Guess Game (Java)

## 📌 Project Description

This is a simple console-based Number Guess Game developed in Java. The program generates a target number and allows the player to guess it within a limited number of attempts. The game provides hints whether the guessed number is too high or too low and keeps track of the player's score across multiple rounds.

## 🎯 Features

* Guess a number between 1 and 100
* Maximum of 7 attempts per round
* Input validation for invalid entries
* Hints for high and low guesses
* Score tracking system
* Play Again option
* User-friendly console interface

## 🛠 Technologies Used

* Java
* Scanner Class
* Random Class
* Exception Handling (`InputMismatchException`)

## 📂 Project Structure

NumberGuessGame/
│
├── DecodeLabs_Java_P1.java
├── README.md
└── .gitignore

## ▶️ How to Run

### Compile the Program

```bash
javac DecodeLabs_Java_P1.java
```

### Run the Program

```bash
java DecodeLabs_Java_P1
```

## 🎮 Game Rules

1. The system selects a target number.
2. The player must guess the number between 1 and 100.
3. The player has only 7 attempts.
4. After each guess:

   * "Too Low!" is displayed if the guess is smaller.
   * "Too High!" is displayed if the guess is larger.
5. If the player guesses correctly, the score increases by 1.
6. After each round, the player can choose to play again.

## 📸 Sample Output

=====================================
WELCOME TO NUMBER GUESS GAME
============================

A random number between 1 and 100 has been generated!
You have only 7 attempts.

Enter your guess: 40
Too Low! Try Again.

Enter your guess: 60
Too High! Try Again.

Enter your guess: 50

Congratulations! You guessed the correct number!

## 🚀 Future Enhancements

* Generate a truly random number using `random.nextInt(100) + 1`
* Add difficulty levels
* Save high scores
* GUI version using Java Swing or JavaFX

## 👨‍💻 Author

Yekambaram Srivarshini
