package hexlet.code.cli;

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
    public static int selector() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        return sc.nextInt();
    }
    public static String answer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: ");
        return sc.nextLine().toLowerCase();
    }
}
