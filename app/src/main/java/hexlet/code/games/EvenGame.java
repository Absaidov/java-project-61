package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.generationOfRandomNumber;

import static hexlet.code.Engine.*;
import static hexlet.code.generationOfRandomNumber.generationOfNumber;

/*
 * game Even
 * */
public class EvenGame {

    public static String gameEven() {
        questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        rightAnswerOfTheGame = "yes";
        rightAnswerOfTheGameNo = "no";
//        quizQuestion = quiestionsOfgfame();
        return Engine.evenGaming();
    }
}
