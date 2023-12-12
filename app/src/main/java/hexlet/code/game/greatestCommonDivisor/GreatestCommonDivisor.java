package hexlet.code.game.greatestCommonDivisor;

import hexlet.code.cli.Cli;

import java.util.Random;

public class GreatestCommonDivisor {
    public static void startGameGreatestCommonDivisor() {

        int firstOperator;
        int secondOperator;
        int result;

        Random random = new Random();

        String name = Cli.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {
            firstOperator = random.nextInt(100);
            secondOperator = random.nextInt(100);
            System.out.println("Question: " + firstOperator + " " + secondOperator);
            result = Math.min(firstOperator, secondOperator);

            for (int n = result; n >= 1; n--){
                if (firstOperator % n == 0 && secondOperator % n == 0){
                    result = n;
                    break;
                }
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
