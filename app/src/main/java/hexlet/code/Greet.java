package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.nameForAnotherClass;

/*
 * game greet
 * */

public class Greet {
    public static String greetGame() {
        var i = 0;
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
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again," + nameForAnotherClass);
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again," + nameForAnotherClass);
                    break;
                }
            }
            i++;
            if (i == 3){
                return "Congratulations, " + nameForAnotherClass + "!";
            }
        }
        return null;
    }
}
