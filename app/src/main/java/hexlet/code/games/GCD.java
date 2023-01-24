package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.questionOfGame;
import static hexlet.code.Engine.setrightAnswerOfTheGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

public class GCD {
    public static String gameGCD() {
        questionOfGame = "Find the greatest common divisor of given numbers.";
        return Engine.evenGaming();
    }
    public static int generateGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return generateGCD(n2, n1 % n2);
    }
    public static String resultOfGameGCD() {
        int randomNumberForAnotherClass = generationOfNumber();
        int randomNumberForAnotherClass2 = generationOfNumber();
        quizQuestion = randomNumberForAnotherClass + " " + randomNumberForAnotherClass2;
//        rightAnswerOfTheGame = Integer.toString(generateGCD(randomNumberForAnotherClass, randomNumberForAnotherClass2));
        setrightAnswerOfTheGame(Integer.toString(generateGCD(randomNumberForAnotherClass, randomNumberForAnotherClass2)));
        return null;
    }
}
