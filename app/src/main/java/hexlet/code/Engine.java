package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;
import static hexlet.code.games.EvenGame.*;
import static hexlet.code.games.Calc.*;


public class Engine {
    public static int randomNumberForAnotherClass;
    public static int randomNumberForAnotherClass2;
    public static String brainGames = "Welcome to the Brain Games!";
    public static Scanner sc = new Scanner(System.in);
    public static boolean logicOfgame;
    public static String thisIsCorrect = "Correct!";
    public static String questionOfGame;

    public static String evenGaming() {
            var i = 0;
            System.out.println(asking());
            System.out.println(brainGames);
            System.out.println(questionOfGame);
            while (i < 3) {
                int randomNumber = (int) (Math.random() * 100);
                int randomNumber2 = (int) (Math.random() * 100);
                randomNumberForAnotherClass = randomNumber;
                randomNumberForAnotherClass2 = randomNumber2;
                System.out.println("Question: " + randomNumber);
                System.out.print("Your answer: ");
                String answer = sc.nextLine();
                if (logicOfThegame()) {
                    if (answer.toLowerCase().equals(rightAnswerOfEvengame())) {
                        System.out.println(thisIsCorrect);
                    } else {
                        break;
                    }
                } else {
                    if (answer.toLowerCase().equals(wrongAnswerOfEvengame())) {
                        System.out.println(thisIsCorrect);
                    } else {
                        break;
                    }
                }
                i++;
                if (i == 3){
                    return "Congratulations, " + nameForAnotherClass + "!";
                }
            }
            return  wrongAnswerOfEvengame() + " is wrong answer ;(. Correct answer was " + rightAnswerOfEvengame() + ".\n" +
                    "Let's try again, " + nameForAnotherClass;
        }
}
