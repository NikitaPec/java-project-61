package hexlet.code.game.progression;

import hexlet.code.cli.Cli;

import java.util.Random;

public class Progression {
    public static void startGameProgression() {

        Random random = new Random();

        int quantity;
        int step;
        int positionOfUnknownElement;
        int startingNumber;
        int result = 0;
        int minQuantity = 5;
        int maxQuantity = 10;
        int minStep = 2;
        int maxStep = 10;
        int minPositionOfUnknownElement = 2;
        int minStartingNumber = 1;
        int maxStartingNumber = 30;
        int numberOfQuestions = 3;

        String name = Cli.greetings();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < numberOfQuestions; i++) {
            var question = new StringBuilder();
            quantity = random.nextInt(minQuantity, maxQuantity);
            step = random.nextInt(minStep, maxStep);
            startingNumber = random.nextInt(minStartingNumber, maxStartingNumber);
            positionOfUnknownElement = random.nextInt(minPositionOfUnknownElement, quantity);
            for (int j = 0; j < quantity; j++) {
                startingNumber = startingNumber + step;
                if (j + 1 == positionOfUnknownElement) {
                    question.append(".. ");
                    result = startingNumber;
                } else {
                    question.append(startingNumber).append(" ");
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
