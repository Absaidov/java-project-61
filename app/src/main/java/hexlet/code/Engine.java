package hexlet.code;
import java.util.Scanner;
import static hexlet.code.ChoiceOfGame.getGameNumberForAnotherClass;
import static hexlet.code.Cli.asking;
import static hexlet.code.Cli.getNameForAnotherClass;
import static hexlet.code.games.ArithProgression.resultOfGameConsecutiveNumbers;
import static hexlet.code.games.Calc.resultOfGameCalc;
import static hexlet.code.games.EvenGame.resultOfGameEven;
import static hexlet.code.games.GCD.resultOfGameGCD;
import static hexlet.code.games.Prime.resultOfGamePrime;

public class Engine {
    public static boolean logicOfGame;

    public static boolean logicOfGame() {
        return logicOfGame;
    }
//    public boolean setlogicOfGame(boolean logicOfGame){
//        return logicOfGame;
//    }
    public static String rightAnswerOfTheGame;
    private static String brainGames = "Welcome to the Brain Games!";
    public static String getBrainGames() {
        return brainGames;
    }
    private static Scanner sc = new Scanner(System.in);
    private static String thisIsCorrect = "Correct!";

    public static String questionOfGame;
    public static String quizQuestion;
    private static String answerForAnotherClass;

    public static String getAnswerForAnotherClass() {
        return answerForAnotherClass;
    }

    public static int randomNumberForAnotherClass;

    public static int getRandomNumberForAnotherClass() {
        return randomNumberForAnotherClass;
    }

    public static int randomNumberForAnotherClass2;
    public static int randomNumberForAnotherClass3;
    public static String evenGaming() {
        var i = 0;
        System.out.println(asking());
        System.out.println(questionOfGame);
        var maxAttempts = 3;

        while (i < maxAttempts) {
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
            if (logicOfGame()) {
                if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGame)) {
                    System.out.println(thisIsCorrect);
                } else {
                    return answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                            + rightAnswerOfTheGame + ".\n" + "Let's try again, " + getNameForAnotherClass() + "!";
                }
            }
            if (!logicOfGame()) {
                if (answerForAnotherClass.toLowerCase().equals(rightAnswerOfTheGame)) {
                    System.out.println(thisIsCorrect);
                } else {
                    return answerForAnotherClass + " is wrong answer ;(. Correct answer was "
                            + rightAnswerOfTheGame + ".\n" + "Let's try again, " + getNameForAnotherClass() + "!";
                }
            }
            i++;
        }
        if (i == 3) {
            return "Congratulations, " + getNameForAnotherClass() + "!";
        }
        return null;
    }
}
