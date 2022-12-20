package hexlet.code;
import java.util.Scanner;

import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;

/*
 * game greet
 * */

public class EvenGame {
    public static String evenGaming() {
        var i = 0;
        System.out.println(asking());
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (i < 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (randomNumber % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                } else {
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    break;
                }
            }
            i++;
            if (i == 3){
                return "Congratulations, " + nameForAnotherClass + "!";
            }
        }
        return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                "Let's try again," + nameForAnotherClass;
    }
}
