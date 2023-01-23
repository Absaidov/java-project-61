package hexlet.code;
import java.util.Scanner;
import static hexlet.code.ChoiceOfGame.getGameNumberForAnotherClass;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.nameForAnotherClass;
import static hexlet.code.games.ArithProgression.resultOfGameConsecutiveNumbers;
import static hexlet.code.games.Calc.resultOfGameCalc;
import static hexlet.code.games.EvenGame.resultOfGameEven;
import static hexlet.code.games.GCD.resultOfGameGCD;
import static hexlet.code.games.Prime.resultOfGamePrime;

public class Engine {
    public static boolean logicOfGame;
    public static String rightAnswerOfTheGame;
    public static String brainGames = "Welcome to the Brain Games!";
    public static Scanner sc = new Scanner(System.in);
    public static String thisIsCorrect = "Correct!";
    public static String questionOfGame;
    public static String quizQuestion;
    public static String answerForAnotherClass;
    public static int randomNumberForAnotherClass;
    public static int randomNumberForAnotherClass2;
    public static int randomNumberForAnotherClass3;
    public static String evenGaming() {
        var i = 0;
        System.out.println(asking());
        System.out.println(questionOfGame);
        while (i < 3) {
            switch (getGameNumberForAnotherClass()) {
                case 2 -> resultOfGameEven();
                case 3 -> resultOfGameCalc();
                case 4 -> resultOfGameGCD();
                case 5 -> resultOfGameConsecutiveNumbers();
                case 6 -> resultOfGamePrime();
                default -> {
                    return "BADGATEWAY";
                }
            }
            System.out.println("Question: " + quizQuestion);
            System.out.print("Your answer: ");
            answerForAnotherClass = sc.nextLine();
            if (logicOfGame) {
                if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGame)) {
                    System.out.println(thisIsCorrect);
                } else {
                    return answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                            + rightAnswerOfTheGame + ".\n" + "Let's try again, " + nameForAnotherClass + "!";
                }
            }
            if (!logicOfGame) {
                if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGame)) {
                    System.out.println(thisIsCorrect);
                } else {
                    return answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                            + rightAnswerOfTheGame + ".\n" + "Let's try again, " + nameForAnotherClass + "!";
                }
            }
            i++;
        }
        if (i == 3) {
            return "Congratulations, " + nameForAnotherClass + "!";
        }
        return null;
    }
}
