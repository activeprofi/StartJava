package Lesson01;

import java.util.Random;

public class GuessNumber {
    public static int MAX_GUESS_NUMBER = 100;

    public static void main(String[] args) {
        Random random = new Random();
        int guessNumber = random.nextInt(MAX_GUESS_NUMBER);
        int computerInput;
        int from = 0;
        int to = MAX_GUESS_NUMBER + 1;

        while (true) {
            System.out.print("Enter you number (1..100): ");
            computerInput = random.nextInt(from, to);
            System.out.println(computerInput);

            if (computerInput == guessNumber) {
                System.out.println("You win!");
                System.out.println("Guessed number was: " + guessNumber);
                break;
            }

            if (computerInput > guessNumber) {
                System.out.println("Your number is greater that guessed.");
                to = computerInput;
                continue;
            }

            System.out.println("Your number is lower that guessed.");
            from = computerInput;
        }
    }
}
