package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Engine.*;
import static hexlet.code.GenerationOfRandomNumber.*;


public class ArithProgression {
    public static String[] number;
    public static String right2;
    public static int rightNumber;
    public static int randomNumber ;
    public static String[] xxxForAnotherClass;
    public static String rightAnswer;

    public static String gameProgres(){
        questionOfGame = "What number is missing in the progression?";
//        quizQuestion = rightAnswerMethod();
        return Engine.evenGaming();
    }
    public static String[] consecutiveNumbers() {
        randomNumber = generationOfNumberForLengthProgression();
        randomNumberForAnotherClass = generationOfNumber();
        int lengthOfArray = randomNumber;
        var i = randomNumberForAnotherClass;
        String[] xxx = new String[lengthOfArray];
        int j = 0;
        String k;
        int step = generationOfNumberForCalc4();
        while (i < randomNumberForAnotherClass + (step * lengthOfArray)) {
            i = i + step;
            k = i + "";
            xxx[j] = k;
            j++;
        }
        rightNumber = generationOfNumberForProg();
//        right2 = xxx[rightNumber];
//        rightAnswerOfTheGame = xxx[rightNumber] + "";
        rightAnswerOfTheGame = xxx[rightNumber];

        xxx[rightNumber] = "..";
        xxxForAnotherClass = xxx;
//        quizQuestion = rightAnswerMethod();
        int l;
        for (l = 0; l < xxx.length; l++){
            System.out.print(xxx[l] + " ");
            var a = xxx[l];
//            var b = xxx[l + 1];
            quizQuestion = a;
            quizQuestion = a + quizQuestion;
        }
        return xxx;
    }
//    public static String rightAnswerMethod(){
//        int l;
//        for (l = 0; l < xxxForAnotherClass.length; l++){
//            var a = xxxForAnotherClass[l] + " ";
//            System.out.print(a);
////            quizQuestion = quizQuestion + xxx[l] + " ";
//        };
//        return null;
//    }
}
