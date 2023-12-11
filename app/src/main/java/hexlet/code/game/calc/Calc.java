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
        String[] myArray = {" - ", " + ", " * "};
        String name = Cli.greetings();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            firstOperator = random.nextInt(20);
            secondOperator = random.nextInt(20);
            numSign = random.nextInt(3);
            System.out.println("Question: " + firstOperator + myArray[numSign] + secondOperator);
            String answer = Cli.answer();
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
            if (result == Integer.parseInt(answer)) {
                System.out.println("Correct!");
            } else {
                Cli.wrongAnswer(Integer.toString(result), answer, name);
                break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
