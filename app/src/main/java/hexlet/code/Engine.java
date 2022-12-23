package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;

public class Engine {
    public static int randomNumber = (int) (Math.random() * 100);
    public static int randomNumber2 = (int) (Math.random() * 100);
    public static String brainGames = "Welcome to the Brain Games!";
    public static Scanner sc = new Scanner(System.in);
    public static String rightAnswerEvengame = "yes";
    public static String wrongAnswerEvengame = "no";
    public static int rightAnswerint;
    public static int wrongAnswerint;
    public static boolean logicOfgame = randomNumber % 2 == 0;
    public static String thisIsCorrect = "Correct!";
    public static String congratulationOfGamer = "Congratulations, " + nameForAnotherClass + "!";


    public static String questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String evenGaming() {
            var i = 0;
            System.out.println(asking());
            System.out.println(brainGames);
            System.out.println(questionOfGame);
            while (i < 3) {
                System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                String answer = sc.nextLine();
                if (logicOfgame) {
                    if (answer.equals(rightAnswerEvengame)) {
                        System.out.println(thisIsCorrect);
                    } else {
                        break;
                    }
                } else {
                    if (answer.equals(wrongAnswerEvengame)) {
                        System.out.println(thisIsCorrect);
                    } else {
                        break;
                    }
                }
                i++;
                if (i == 3){
                    return congratulationOfGamer;
                }
            }
            return  wrongAnswerEvengame + "is wrong answer ;(. Correct answer was " + rightAnswerEvengame + ".\n" +
                    "Let's try again," + nameForAnotherClass;
        }
}
