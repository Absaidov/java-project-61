package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.questionOfGame;
import static hexlet.code.Engine.randomNumberForAnotherClass;
import static hexlet.code.Engine.rightAnswerOfTheGame;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForLengthProgression;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForLenghtOfStep;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForProg;





public class ArithProgression {
    public static int rightNumber;
    public static int randomNumber;
    public static String[] xxxForAnotherClass;
    public static String[] number;


    public static String gameProgres() {
        questionOfGame = "What number is missing in the progression?";
        return Engine.evenGaming();
    }

    public static String[] resultOfGameConsecutiveNumbers() {
        randomNumber = generationOfNumberForLengthProgression();
        randomNumberForAnotherClass = generationOfNumber();
        int lengthOfArray = randomNumber;
        var i = randomNumberForAnotherClass;
        String[] xxx = new String[lengthOfArray];
        int j = 0;
        String k;
        int step = generationOfNumberForLenghtOfStep();
        while (i < randomNumberForAnotherClass + (step * lengthOfArray)) {
            i = i + step;
            k = i + "";
            xxx[j] = k;
            j++;
        }
        rightNumber = generationOfNumberForProg();
        rightAnswerOfTheGame = xxx[rightNumber];
        xxx[rightNumber] = "..";
        xxxForAnotherClass = xxx;
        quizQuestion = quianother();
        return null;
    }

    public static String quianother() {
        int l;
        quizQuestion = xxxForAnotherClass[0] + " ";
        for (l = 1; l < xxxForAnotherClass.length; l++) {
            quizQuestion += xxxForAnotherClass[l] + " ";
        }
        return quizQuestion;
    }
}