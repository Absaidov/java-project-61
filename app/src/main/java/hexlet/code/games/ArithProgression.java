package hexlet.code.games;

import hexlet.code.Engine;
//import static hexlet.code.Engine.getQuestionOfGame;
import static hexlet.code.Engine.setrightAnswerOfGame;
import static hexlet.code.Engine.setQuizQuestion;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumber;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForLengthProgression;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForLenghtOfStep;
import static hexlet.code.GenerationOfRandomNumber.generationOfNumberForProg;
import static hexlet.code.Engine.setQuestionOfGame;






public class ArithProgression {
    private static int rightNumber;
    private static int randomNumber;

    public static int getRandomNumber() {
        return randomNumber;
    }

    private static String[] xxxForAnotherClass;


    public static String gameProgres() {
        setQuestionOfGame("What number is missing in the progression?");
//        questionOfGame = "What number is missing in the progression?";
        return Engine.evenGaming();
    }

    public static String[] resultOfGameConsecutiveNumbers() {
        randomNumber = generationOfNumberForLengthProgression();
        int randomNumberForAnotherClass = generationOfNumber();
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
        setrightAnswerOfGame(xxx[rightNumber]);
//        rightAnswerOfTheGame = xxx[rightNumber];
        xxx[rightNumber] = "..";
        xxxForAnotherClass = xxx;
        setQuizQuestion(quianother());
//        quizQuestion = quianother();
        return null;
    }

    public static String quianother() {
        int l;
        String quizQuestion = xxxForAnotherClass[0] + " ";
        for (l = 1; l < xxxForAnotherClass.length; l++) {
            quizQuestion += xxxForAnotherClass[l] + " ";
        }
        return quizQuestion;
    }
}
