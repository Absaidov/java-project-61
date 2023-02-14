package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);
    public static final int NUMBER_OF_ROUND = 3;
    private static String answerFromConsole;

    public static void startEngine(String description, String[][] arrayData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);
        for (int i = 0; i < arrayData.length; i++) {
            String question = arrayData[i][0];
            String answer = arrayData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            answerFromConsole = sc.nextLine();
            if (answerFromConsole.toLowerCase().equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answerFromConsole + " is wrong answer ;(. Correct answer was "
                        + answer + ".\n" + "Let's try again, " + playerName + "!");
                return;
            }
        }
            System.out.println("Congratulations, " + playerName + "!");
    }
}

