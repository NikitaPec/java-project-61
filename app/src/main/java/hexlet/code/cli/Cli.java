package hexlet.code.cli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cli {
    public static String greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello, " + name + "!");
        return name;

    }
    public static String selector() {

        int selectUser;

        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        try {
            selectUser = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Unknown team.");
            return "Exit";
        }
        if (selectUser == 0) {
            return "Exit";
        } else if (selectUser == 1) {
            return "Greet";
        } else if (selectUser == 2) {
            return "Even";
        } else if (selectUser == 3) {
            return "Calc";
        } else if (selectUser == 4) {
            return "GCD";
        } else if (selectUser == 5) {
            return "Progression";
        } else if (selectUser == 6) {
            return "Prime";
        } else {
            System.out.println("Unknown team.");
            return "Exit";
        }
    }
    public static String answer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: ");
        return sc.nextLine().toLowerCase();
    }

    public static void wrongAnswer(String correct, String notCorrect, String name) {
        System.out.println("'" + notCorrect + "' is wrong answer ;(. Correct answer was '"
                + correct + "'.\n"
                + "Let's try again, " + name + "!");
    }
}
