package hexlet.code.game.isEven;

import hexlet.code.cli.Cli;

import java.util.Random;

public class IsEven {
    public static void startGameParityCheck() {
        Random random = new Random();

        String result;
        int randomNumber;
        int maxRandomNumber = 100;
        int numberOfQuestions = 3;

        String name = Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < numberOfQuestions; i++) {
            randomNumber = random.nextInt(maxRandomNumber);
            System.out.println("Question: " + randomNumber);

            String answer = Cli.answer();
            result = isEven(randomNumber);

            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                Cli.wrongAnswer(result, answer, name);
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String isEven(Integer number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
