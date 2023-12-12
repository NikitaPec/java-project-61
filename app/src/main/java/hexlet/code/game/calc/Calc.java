package hexlet.code.game.calc;

import hexlet.code.cli.Cli;

import java.util.Random;

public class Calc {

    public static void startGameCalculator() {
        Random random = new Random();

        int firstOperator;
        int secondOperator;
        int numSign;
        int result = 0;
        int numberOfQuestions = 3;
        int maxOperator = 20;
        int maxNumSign = 3;

        String[] myArray = {" - ", " + ", " * "};

        String name = Cli.greetings();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < numberOfQuestions; i++) {
            firstOperator = random.nextInt(maxOperator);
            secondOperator = random.nextInt(maxOperator);
            numSign = random.nextInt(maxNumSign);
            System.out.println("Question: " + firstOperator + myArray[numSign] + secondOperator);

            switch (numSign) {
                case 0:
                    result = firstOperator - secondOperator;
                    break;
                case 1:
                    result = firstOperator + secondOperator;
                    break;
                case 2:
                    result = firstOperator * secondOperator;
                    break;
                default:
                    break;
            }

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
