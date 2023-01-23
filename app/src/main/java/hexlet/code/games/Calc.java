package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.questionOfGame;
import static hexlet.code.Engine.randomNumberForAnotherClass;
import static hexlet.code.Engine.randomNumberForAnotherClass2;
import static hexlet.code.Engine.randomNumberForAnotherClass3;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.rightAnswerOfTheGame;
import static hexlet.code.Engine.logicOfGame;
import static hexlet.code.Engine.getAnswerForAnotherClass;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForCalc;
/*
 * game Calc
 * */
public class Calc {
    public static String gameCalc() {
        questionOfGame = "What is the result of the expression?";
        return Engine.evenGaming();
    }
    public static String resultOfGameCalc() {
        randomNumberForAnotherClass = generationOfNumber();
        randomNumberForAnotherClass2 = generationOfNumber();
        randomNumberForAnotherClass3 = generationOfNumberForCalc();

        switch (randomNumberForAnotherClass3) {
            case 1 -> {
                quizQuestion = randomNumberForAnotherClass + " + " + randomNumberForAnotherClass2;
                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass + randomNumberForAnotherClass2);
            }
            case 2 -> {
                quizQuestion = randomNumberForAnotherClass + " - " + randomNumberForAnotherClass2;
                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass - randomNumberForAnotherClass2);
            }
            case 3 -> {
                quizQuestion = randomNumberForAnotherClass + " * " + randomNumberForAnotherClass2;
                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass * randomNumberForAnotherClass2);
            }
            default -> {
                return "BADGATEWAY";
            }
        }
        logicOfGame = rightAnswerOfTheGame.equals(getAnswerForAnotherClass());
        return null;
    }
}

