package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.setQuizQuestion;
import static hexlet.code.Engine.setQuestionOfGame;
import static hexlet.code.Engine.setrightAnswerOfGame;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;

public class GCD {
    public static String gameGCD() {
        setQuestionOfGame("Find the greatest common divisor of given numbers.");
//        questionOfGame = "Find the greatest common divisor of given numbers.";
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
        setQuizQuestion(randomNumberForAnotherClass + " " + randomNumberForAnotherClass2);
//        quizQuestion = randomNumberForAnotherClass + " " + randomNumberForAnotherClass2;
        setrightAnswerOfGame(Integer.toString(generateGCD(randomNumberForAnotherClass, randomNumberForAnotherClass2)));
        return null;
    }
}
