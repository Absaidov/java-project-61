package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.*;
import static hexlet.code.generationOfRandomNumber.generationOfNumber;
import static hexlet.code.generationOfRandomNumber.generationOfNumberForCalc;
/*
 * game Calc
 * */
public class Calc {
    public static String gameCalc(){
        questionOfGame = "What is the result of the expression?";
        return Engine.evenGaming();
    }
    public static String resultOfGameCalc() {
        randomNumberForAnotherClass = generationOfNumber();
        randomNumberForAnotherClass2 = generationOfNumber();
        randomNumberForAnotherClass3 = generationOfNumberForCalc();

            switch (randomNumberForAnotherClass3){
                case 1:
                    quizQuestion = randomNumberForAnotherClass + " + " + randomNumberForAnotherClass2;
                    rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass + randomNumberForAnotherClass2);
                    break;
                case 2:
                    quizQuestion = randomNumberForAnotherClass + " - " + randomNumberForAnotherClass2;
                    rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass - randomNumberForAnotherClass2);
                    break;
                case 3:
                    quizQuestion = randomNumberForAnotherClass + " * " + randomNumberForAnotherClass2;
                    rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass * randomNumberForAnotherClass2);
                    break;
                }
        return null;
    }
}

