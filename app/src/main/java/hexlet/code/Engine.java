package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String nameForAnotherClass;
    public static String getNameForAnotherClass() {
        return nameForAnotherClass;
    }
    private static String brainGames = "Welcome to the Brain Games!";

    public static final int MAX_NUMBER_OF_NUMBERS = 99;
    public static int getNumberOfRound() {
        return NUMBER_OF_ROUND;
    }
    private static Scanner sc = new Scanner(System.in);
    private static String thisIsCorrect = "Correct!";
    private static final int NUMBER_OF_ROUND = 3;
    private static String answerForAnotherClass;

    public static void evenGaming(String description, String[][] arrayData) {
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
                System.out.println(thisIsCorrect);
                i++;
            } else {
                System.out.println(answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                        + answer + ".\n" + "Let's try again, " + getNameForAnotherClass() + "!");
                break;
            }
        }
        if (i == arrayData.length) {
            System.out.println("Congratulations, " + getNameForAnotherClass() + "!");
        }
    }
    public static void asking() {
        Scanner sc = new Scanner(System.in);
        System.out.println(brainGames);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        nameForAnotherClass = name;
        System.out.println("Hello, " + name + "!");
    }
}

