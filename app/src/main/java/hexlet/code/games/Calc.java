package hexlet.code.games;

import hexlet.code.Engine;
//import static hexlet.code.Engine.randomNumberForAnotherClass3;
import static hexlet.code.Engine.setQuizQuestion;
import static hexlet.code.Engine.setQuestionOfGame;
import static hexlet.code.Engine.setrightAnswerOfGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForCalc;
/*
 * game Calc
 * */
public class Calc {
    public static String gameCalc() {
        setQuestionOfGame("What is the result of the expression?");
//        questionOfGame = "What is the result of the expression?";
        return Engine.evenGaming();
    }
    public static String resultOfGameCalc() {
        int randomNumberForAnotherClass = generationOfNumber();
        int randomNumberForAnotherClass2 = generationOfNumber();
        int randomNumberForAnotherClass3 = generationOfNumberForCalc();
        final int addNumbers = 1;
        final int minusNumbers = 2;
        final int multiNumbers = 3;
        switch (randomNumberForAnotherClass3) {
            case addNumbers -> {
                setQuizQuestion(randomNumberForAnotherClass + " + " + randomNumberForAnotherClass2);
//                quizQuestion = randomNumberForAnotherClass + " + " + randomNumberForAnotherClass2;
//                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass + randomNumberForAnotherClass2);
                setrightAnswerOfGame(Integer.toString(randomNumberForAnotherClass + randomNumberForAnotherClass2));
            }
            case minusNumbers -> {
                setQuizQuestion(randomNumberForAnotherClass + " - " + randomNumberForAnotherClass2);
//                quizQuestion = randomNumberForAnotherClass + " - " + randomNumberForAnotherClass2;
//                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass - randomNumberForAnotherClass2);
                setrightAnswerOfGame(Integer.toString(randomNumberForAnotherClass - randomNumberForAnotherClass2));
            }
            case multiNumbers -> {
                setQuizQuestion(randomNumberForAnotherClass + " * " + randomNumberForAnotherClass2);
//                quizQuestion = randomNumberForAnotherClass + " * " + randomNumberForAnotherClass2;
//                rightAnswerOfTheGame = Integer.toString(randomNumberForAnotherClass * randomNumberForAnotherClass2);
                setrightAnswerOfGame(Integer.toString(randomNumberForAnotherClass * randomNumberForAnotherClass2));
            }
            default -> {
                return "BADGATEWAY";
            }
        }
//        setLogicOfGame(getRightAnswerOfTheGame() getAnswerForAnotherClass());

//        logicOfGame = rightAnswerOfTheGame.equals(getAnswerForAnotherClass());
        return null;
    }
}

