package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

public class GCD {
    public static String gameGCD() {
        questionOfGame = "What is the result of the expression?";
        return Engine.evenGaming();
    }
    public static int generateGCD (int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return generateGCD(n2, n1 % n2);
    }
    public static String resultOfGameGCD() {
        randomNumberForAnotherClass = generationOfNumber();
        randomNumberForAnotherClass2 = generationOfNumber();
        quizQuestion = randomNumberForAnotherClass + " " + randomNumberForAnotherClass2;
        rightAnswerOfTheGame = Integer.toString(generateGCD(randomNumberForAnotherClass,randomNumberForAnotherClass2));
        return null;
    }
}
