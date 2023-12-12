package hexlet.code.game.progression;

import hexlet.code.cli.Cli;

import java.util.Random;

public class Progression {
    public static void startGameProgression() {

        Random random = new Random();

        int quantity;
        int step;
        int missingElement;
        int startElement;
        int result = 0;

        String name = Cli.greetings();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < 3; i++) {
            var question = new StringBuilder();
            quantity = random.nextInt(5, 10);
            step = random.nextInt(2, 10);
            startElement = random.nextInt(2, 30);
            missingElement = random.nextInt(1, quantity);
            for (int j = 0; j < quantity; j++) {
                startElement = startElement + step;
                if (j + 1 == missingElement) {
                    question.append(".. ");
                    result = startElement;
                } else {
                    question.append(startElement).append(" ");
                }
            }
            System.out.println("Question: " + question);
            String answer = Cli.answer();

            try {
                if (result == Integer.parseInt(answer)) {
                    System.out.println("Correct!");
                } else {
                    Cli.wrongAnswer(Integer.toString(result), answer, name);
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("It looks like you didn't understand the rules of the game, try again :-)");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
