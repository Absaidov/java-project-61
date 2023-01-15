package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.ChoiceOfGame.gameNumberForAnotherClass;
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
        return Engine.evenGaming();
    }
    public static String resultOfGameEven(){
        randomNumberForAnotherClass = generationOfNumber();
        randomNumberForAnotherClass2 = generationOfNumber();
        if (gameNumberForAnotherClass == 2) {
            quizQuestion = Integer.toString(randomNumberForAnotherClass);
        }
        return null;
    }
}
