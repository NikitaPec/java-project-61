package hexlet.code;

import hexlet.code.cli.Cli;

import static hexlet.code.game.calc.Calc.startGameCalculator;
import static hexlet.code.game.greatestCommonDivisor.GreatestCommonDivisor.startGameGreatestCommonDivisor;
import static hexlet.code.game.isPrime.IsPrime.startGameIsPrime;
import static hexlet.code.game.isEven.IsEven.startGameParityCheck;
import static hexlet.code.game.progression.Progression.startGameProgression;

public class App {
    public static void main(String[] args) {
        String select = Cli.selector();
        switch (select) {
            case "Exit":
                System.out.println("Exit");
                break;
            case "Greet":
                System.out.println("Welcome to the Brain Games!");
                Cli.greetings();
                break;
            case "Even":
                startGameParityCheck();
                break;
            case "Calc":
                startGameCalculator();
                break;
            case "GCD":
                startGameGreatestCommonDivisor();
                break;
            case "Progression":
                startGameProgression();
                break;
            case "Prime":
                startGameIsPrime();
                break;
            default:
                break;
        }

    }
}
