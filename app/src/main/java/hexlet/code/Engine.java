package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static int numberOfRound = 3;
    public static int getNumberOfRound() {
        return numberOfRound;
    }
    private static String brainGames = "Welcome to the Brain Games!";

    private static Scanner sc = new Scanner(System.in);
    private static String thisIsCorrect = "Correct!";

    private static String answerForAnotherClass;
    private static String nameForAnotherClass;
    public static String getNameForAnotherClass() {
        return nameForAnotherClass;
    }


    public static void evenGaming(String description, String[][] arrData) {
        var i = 0;
        System.out.println(asking());
        System.out.println(description);
        final int maxAttempts = 3;
        while (i < maxAttempts) {
            String question = arrData[i][0];
            String answer = arrData[i][1];
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
        if (i == maxAttempts) {
            System.out.println("Congratulations, " + getNameForAnotherClass() + "!");
        }
    }
    public static String asking() {
        Scanner sc = new Scanner(System.in);
        System.out.println(brainGames);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        nameForAnotherClass = name;
        return "Hello, " + name + "!";
    }
}

