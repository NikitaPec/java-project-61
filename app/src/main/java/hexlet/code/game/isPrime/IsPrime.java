package hexlet.code.game.isPrime;

import hexlet.code.cli.Cli;

import java.util.Random;

public class IsPrime {
    public static void startGameIsPrime() {
        Random random = new Random();

        String result;

        int randomNumber;
        int maxRandomNumber = 100;
        int numberOfQuestions = 3;

        String name = Cli.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < numberOfQuestions; i++) {
            randomNumber = random.nextInt(maxRandomNumber);
            System.out.println("Question: " + randomNumber);

            String answer = Cli.answer();
            result = isPrime(randomNumber);

            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                Cli.wrongAnswer(result, answer, name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String isPrime(Integer number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
