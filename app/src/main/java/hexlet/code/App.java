package hexlet.code;

import hexlet.code.cli.Cli;

import static hexlet.code.game.calc.Calc.startGameCalculator;
import static hexlet.code.game.greatestCommonDivisor.GreatestCommonDivisor.startGameGreatestCommonDivisor;
import static hexlet.code.game.isPrime.IsPrime.startGameIsPrime;
import static hexlet.code.game.isEven.IsEven.startGameParityCheck;
import static hexlet.code.game.progression.Progression.startGameProgression;

public class App {
    public static void main(String[] args) {
        int select = Cli.selector();
        switch (select) {
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetings();
                break;
            case 2:
                startGameParityCheck();
                break;
            case 3:
                startGameCalculator();
                break;
            case 4:
                startGameGreatestCommonDivisor();
                break;
            case 5:
                startGameProgression();
                break;
            case 6:
                startGameIsPrime();
                break;
            default:
                break;
        }

    }
}
