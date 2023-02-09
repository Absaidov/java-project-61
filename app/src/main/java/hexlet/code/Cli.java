package hexlet.code;

import java.util.Scanner;

public class Cli {
        public static void greetGameStart() {
            Scanner scanner = new Scanner(System.in);
            String nameOfGamer;
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            nameOfGamer = scanner.nextLine();
            System.out.println("Hello, " + nameOfGamer + "!");
    }
}
