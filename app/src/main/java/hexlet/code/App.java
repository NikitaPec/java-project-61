package hexlet.code;

import hexlet.code.cli.Cli;

import static hexlet.code.game.calc.Calc.startGameCalculator;
import static hexlet.code.game.parityCheck.ParityCheck.startGameParityCheck;

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
            default:
                break;
        }

    }
}
