package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.setLogicOfGame;
import static hexlet.code.Engine.logicOfGame;
import static hexlet.code.Engine.setQuestionOfGame;
import static hexlet.code.Engine.setrightAnswerOfGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

/*
 * game Even
 * */
public class EvenGame {
    public static String gameEven() {
        setQuestionOfGame("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
//        rightAnswerOfTheGame = "yes";
        return Engine.evenGaming();
    }
    public static String resultOfGameEven() {
        int randomNumberForAnotherClass = generationOfNumber();
//        int randomNumberForAnotherClass2 = generationOfNumber();
        quizQuestion = Integer.toString(randomNumberForAnotherClass);
        setLogicOfGame(randomNumberForAnotherClass % 2 == 0);
//        logicOfGame = randomNumberForAnotherClass % 2 == 0;
        if (logicOfGame()) {
            setrightAnswerOfGame("yes");
//            rightAnswerOfTheGame = "yes";
        }
        if (!logicOfGame()) {
            setrightAnswerOfGame("no");
//            rightAnswerOfTheGame = "no";
        }
        return null;
    }
}
