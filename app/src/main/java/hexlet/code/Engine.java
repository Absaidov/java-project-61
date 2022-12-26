package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;
import static hexlet.code.games.EvenGame.randoMMM;

public class Engine {

    public static String rightAnswerOfTheGame;
    public static String wrongAnswerOfTheGame;
    public static int randomNumberForAnotherClass;
    public static int randomNumberForAnotherClass2;
    public static String brainGames = "Welcome to the Brain Games!";
    public static Scanner sc = new Scanner(System.in);
    public static String thisIsCorrect = "Correct!";
    public static String questionOfGame;
    public static boolean logicOfgame;
    public static String quizQuestion;


    public static String evenGaming() {
            var i = 0;
            System.out.println(asking());
            System.out.println(brainGames);
            System.out.println(questionOfGame);
            while (i < 3) {
                randomNumberForAnotherClass = randoMMM();
                System.out.println("Question: " + quizQuestion);
                System.out.print("Your answer: ");
                String answer = sc.nextLine();
                if (logicOfgame) {
                    if (answer.toLowerCase().equals(rightAnswerOfTheGame)) {
                        System.out.println(thisIsCorrect);
                    } else {
                        return  answer + " is wrong answer ;(. Correct answer was " + rightAnswerOfTheGame + ".\n" +
                                "Let's try again, " + nameForAnotherClass;
                    }
                } else  {
                    if (answer.toLowerCase().equals(wrongAnswerOfTheGame)) {
                        System.out.println(thisIsCorrect);
                    } else {
                        return  answer + " is wrong answer ;(. Correct answer was " + wrongAnswerOfTheGame + ".\n" + "Let's try again, " + nameForAnotherClass;
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
