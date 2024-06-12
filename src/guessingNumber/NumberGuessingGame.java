package guessingNumber;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            rounds++;
            int attempts = 0;
            int maxAttempts = 10;
            int rangeStart = 1;
            int rangeEnd = 100;
            int randomNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;

            System.out.println("Round " + rounds + ":");
            System.out.println("Guess the number between " + rangeStart + " and " + rangeEnd + " (You have " + maxAttempts + " attempts)");

            boolean correctGuess = false;
            while (attempts < maxAttempts && !correctGuess) {
                System.out.print("Enter your guess: ");
                int guess;
                try {
                    guess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    continue;
                }

                attempts++;
                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else if (guess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct!");
                    correctGuess = true;
                    score += (maxAttempts - attempts + 1); // more points for fewer attempts
                }
            }

            if (!correctGuess) {
                System.out.println("You've used all " + maxAttempts + " attempts! The correct number was " + randomNumber + ".");
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Game over! You played " + rounds + " rounds with a final score of " + score + ".");
        scanner.close();
    }
}