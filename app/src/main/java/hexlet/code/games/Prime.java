package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.questionOfGame;
import static hexlet.code.Engine.randomNumberForAnotherClass;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.logicOfGame;
import static hexlet.code.Engine.rightAnswerOfTheGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

public class Prime {
    public static String gamePrime() {
        questionOfGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return Engine.evenGaming();
    }
    public static boolean isSimple() {
        randomNumberForAnotherClass = generationOfNumber();
        quizQuestion = Integer.toString(randomNumberForAnotherClass);
        if (randomNumberForAnotherClass < 2) {
            return false;
        }
        for (int i = 2; i < randomNumberForAnotherClass / 2; i++) {
            if (randomNumberForAnotherClass % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String resultOfGamePrime() {
        logicOfGame = isSimple();
        if (logicOfGame) {
            rightAnswerOfTheGame = "yes";
        }
        if (!logicOfGame) {
            rightAnswerOfTheGame = "no";
        }

        return null;
    }
}
