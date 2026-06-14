import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("=====================================");
        System.out.println(" WELCOME TO NUMBER GUESS GAME");
        System.out.println("=====================================");

        do {

            // Generate random number between 1 and 100
            int targetNumber = 50;

            // Attempt limit
            int maxAttempts = 7;
            int attempts = 0;

            boolean guessedCorrectly = false;

            System.out.println("\nA random number between 1 and 100 has been generated!");
            System.out.println("You have only " + maxAttempts + " attempts.");

            // Game loop
            while (attempts < maxAttempts && !guessedCorrectly) {

                try {
                    System.out.print("\nEnter your guess: ");
                    int guess = sc.nextInt();

                    attempts++;

                    // Input validation
                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                        continue;
                    }

                    // Check guess
                    if (guess == targetNumber) {

                        System.out.println("\nCongratulations! You guessed the correct number!");
                        System.out.println("You guessed it in " + attempts + " attempts.");

                        guessedCorrectly = true;
                        totalScore++;

                    } else if (guess < targetNumber) {

                        System.out.println("Too Low! Try Again.");

                    } else {

                        System.out.println("Too High! Try Again.");
                    }

                    // Remaining attempts
                    System.out.println("Remaining Attempts: " + (maxAttempts - attempts));

                } catch (InputMismatchException e) {

                    System.out.println("Invalid Input! Please enter numbers only.");
                    sc.nextLine(); // clear invalid input
                }
            }

            // If player loses
            if (!guessedCorrectly) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + targetNumber);
            }

            // Score display
            System.out.println("\nCurrent Score: " + totalScore);

            // Play again option
            System.out.print("\nDo you want to play again? (Y/N): ");
            String choice = sc.next().toUpperCase();

            if (!choice.equals("Y")) {
                playAgain = false;
            }

        } while (playAgain);

        // Final message
        System.out.println("\n=====================================");
        System.out.println(" THANK YOU FOR PLAYING!");
        System.out.println(" Final Score: " + totalScore);
        System.out.println("=====================================");

        sc.close();
    }
}
