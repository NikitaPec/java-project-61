package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello, " + name + "!");
        sc.close();

    }
}
