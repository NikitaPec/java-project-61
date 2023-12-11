package hexlet.code.game.parityCheck;

import hexlet.code.cli.Cli;

import java.util.Random;

public class ParityCheck {
    public static void startGameParityCheck() {
        Random random = new Random();
        int randomNumber;
        String name = Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            String answer = Cli.answer();
            if (answer.equals("no") && (randomNumber % 2 != 0) || answer.equals("yes") && (randomNumber % 2 == 0)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (answer.equals("no") ? "yes" : "no") + "'.\n"
                        + "Let's try again, " + name + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
