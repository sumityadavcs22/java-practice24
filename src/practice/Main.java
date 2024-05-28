package practice;

import java.util.Scanner;

class NumberGuessingGame {
    private final int minRange;
    private final int maxRange;
    private final int targetNumber;
    private int attempts;

    public NumberGuessingGame(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.targetNumber = generateRandomNumber(minRange, maxRange);
        this.attempts = 0;
    }

    private int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + minRange + " and " + maxRange + ":");

        while (true) {
            try {
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                            " in " + attempts + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Try again! You guessed too low.");
                } else {
                    System.out.println("Try again! You guessed too high.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame(1, 100);
        game.play();
    }
}
