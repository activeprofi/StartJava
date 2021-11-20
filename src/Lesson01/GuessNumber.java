package Lesson01;

import java.util.Random;

public class GuessNumber {
    public static int MAX_GUESS_NUMBER = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int guessNumber = random.nextInt(MAX_GUESS_NUMBER);
        int computerInputNumber;
        int from = 0;
        int to = MAX_GUESS_NUMBER + 1;

        while (true) {
            System.out.print("Enter you number (1..100): ");
            computerInputNumber = random.nextInt(from, to);
            System.out.println(computerInputNumber);

            if (computerInputNumber == guessNumber) {
                System.out.println("You win!");
                System.out.println("Guessed number was: " + guessNumber);
                break;
            }

            if (computerInputNumber > guessNumber) {
                System.out.println("Your number is greater that guessed.");
                to = computerInputNumber;
                continue;
            }

            if (computerInputNumber < guessNumber) {
                System.out.println("Your number is lower that guessed.");
                from = computerInputNumber;
                continue;
            }
        }
    }
}
