package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;
import static hexlet.code.ChoiceOfGame.gameNumberForAnotherClass;
import static hexlet.code.generationOfRandomNumber.resultOfGame;


public class Engine {
    public static String rightAnswerOfTheGame;
    public static String rightAnswerOfTheGameNo;
    public static int randomNumberForAnotherClass2;
    public static String brainGames = "Welcome to the Brain Games!";
    public static Scanner sc = new Scanner(System.in);
    public static String thisIsCorrect = "Correct!";
    public static String questionOfGame;
    public static String quizQuestion;
    public static String answerForAnotherClass;
    public static int randomNumberForAnotherClass;


    public static String evenGaming() {
        var i = 0;
        System.out.println(asking());
        System.out.println(brainGames);
        System.out.println(questionOfGame);
        while (i < 3) {
            resultOfGame();
            System.out.println("Question: " + quizQuestion);
            System.out.print("Your answer: ");
            answerForAnotherClass = sc.nextLine();
                    if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGame)) {
                        System.out.println(thisIsCorrect);
                    } else if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGameNo)) {
                        System.out.println(thisIsCorrect);
                    } else {
                        return answerForAnotherClass + " is wrong answer ;(. Correct answer was " + rightAnswerOfTheGame + ".\n" + "Let's try again, " + nameForAnotherClass;
                    }
            i++;
        }
            if (i == 3) {
                return "Congratulations, " + nameForAnotherClass + "!";
            }
            return null;
    }
}