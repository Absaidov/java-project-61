package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.questionOfGame;
import static hexlet.code.Engine.rightAnswerOfTheGame;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.logicOfGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

/*
 * game Even
 * */
public class EvenGame {
    public static String gameEven() {
        questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        rightAnswerOfTheGame = "yes";
        return Engine.evenGaming();
    }
    public static String resultOfGameEven() {
        int randomNumberForAnotherClass = generationOfNumber();
//        int randomNumberForAnotherClass2 = generationOfNumber();
        quizQuestion = Integer.toString(randomNumberForAnotherClass);
        logicOfGame = randomNumberForAnotherClass % 2 == 0;
        if (logicOfGame) {
            rightAnswerOfTheGame = "yes";
        }
        if (!logicOfGame) {
            rightAnswerOfTheGame = "no";
        }
        return null;
    }
}
