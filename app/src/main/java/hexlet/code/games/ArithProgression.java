package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;
import static hexlet.code.GenerationOfRandomNumber.*;


public class ArithProgression {
    public static String[] number;
    public static int rightNumber;
    public static int randomNumber ;
    public static String rightAnswer;
    public static String gameProgres(){
        questionOfGame = "What number is missing in the progression?";
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
            k = i + " ";
            xxx[j] = k;
            j++;
        }
        rightNumber = generationOfNumberForProg();
        rightAnswerOfTheGame = xxx[rightNumber] + "";
        xxx[rightNumber] = ".. ";
        int l;
        for (l = 0; l < xxx.length; l++){
//            System.out.print(xxx[l]);
            quizQuestion = quizQuestion + xxx[l];
        }
        return xxx;
    }
}
