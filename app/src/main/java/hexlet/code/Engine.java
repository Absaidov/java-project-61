package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String nameOfGamer;
    private static String brainGames = "Welcome to the Brain Games!";

    public static final int MAX_NUMBER_OF_NUMBERS = 99;
    public static int getNumberOfRound() {
        return NUMBER_OF_ROUND;
    }
    private static Scanner sc = new Scanner(System.in);
    private static final int NUMBER_OF_ROUND = 3;
    private static String answerForAnotherClass;

    public static void startEngine(String description, String[][] arrayData) {
        var i = 0;
        asking();
        System.out.println(description);
        while (i < arrayData.length) {
            String question = arrayData[i][0];
            String answer = arrayData[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            answerForAnotherClass = sc.nextLine();
            if (answerForAnotherClass.toLowerCase().equals(answer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println(answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                        + answer + ".\n" + "Let's try again, " + nameOfGamer + "!");
                return;
            }
        }
            System.out.println("Congratulations, " + nameOfGamer + "!");
    }
    public static void asking() {
        System.out.println(brainGames);
        System.out.print("May I have your name? ");
        nameOfGamer = sc.nextLine();
        System.out.println("Hello, " + nameOfGamer + "!");
    }
}

