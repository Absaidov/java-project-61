package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.getNameForAnotherClass;


public class Engine {

    private static int NUMBER_OF_ROUND = 3;
    public static int getNumberOfRound() {
        return NUMBER_OF_ROUND;
    }

    private static String brainGames = "Welcome to the Brain Games!";

    public static String getBrainGames() {
        return brainGames;
    }

    private static Scanner sc = new Scanner(System.in);
    private static String thisIsCorrect = "Correct!";

    private static String answerForAnotherClass;


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
        if (i == maxAttempts){
            System.out.println("Congratulations, " + getNameForAnotherClass() + "!");
        }
    }
}

