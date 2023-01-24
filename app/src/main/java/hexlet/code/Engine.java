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
    private static boolean logicOfGame;

    public static boolean logicOfGame() {
        return logicOfGame;
    }
    public static void setLogicOfGame(boolean setLogicOfGame) {
        Engine.logicOfGame = setLogicOfGame;
    }

    private static String rightAnswerOfTheGame;
    public static boolean getRightAnswerOfTheGame() {
        return logicOfGame;
    }
    public static void setrightAnswerOfGame(String setrightAnswerOfGame) {
        Engine.rightAnswerOfTheGame = setrightAnswerOfGame;
    }
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

//    private static int randomNumberForAnotherClass;
//
//    public static int getRandomNumberForAnotherClass() {
//        return randomNumberForAnotherClass;
//    }
//
//    private static int randomNumberForAnotherClass2;
//    private static int randomNumberForAnotherClass3;

    public static String evenGaming() {
        var i = 0;
        System.out.println(asking());
        System.out.println(questionOfGame);
        final int maxAttempts = 3;
        final int greetGameEven = 2;
        final int greetGameCalc = 3;
        final int greetGameGCD = 4;
        final int greetGameProgression = 5;
        final int greetGamePrime = 6;
        while (i < maxAttempts) {
            switch (getGameNumberForAnotherClass()) {
                case greetGameEven -> resultOfGameEven();
                case greetGameCalc -> resultOfGameCalc();
                case greetGameGCD -> resultOfGameGCD();
                case greetGameProgression -> resultOfGameConsecutiveNumbers();
                case greetGamePrime -> resultOfGamePrime();
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

        if (i == maxAttempts) {
            return "Congratulations, " + getNameForAnotherClass() + "!";
        }
        return null;
    }
}

