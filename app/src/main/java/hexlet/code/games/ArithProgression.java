package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.generatesRandomNumbers;

public class ArithProgression {
    private static String description = "What number is missing in the progression?";
    public static final int MAX_NUMBER_FOR_STEP = 5;
    private static final int MINIMUM_ARRAY_LENGTH_NUMBER = 8;
    private static final int MAXIMUM_ARRAY_LENGTH_NUMBER = 10;
    private static final int MAXIMUM_RANDOM_NUMBER = 100;

    public static void progresGameStart() {
        String[][] arrayData = new String[NUMBER_OF_ROUND][2];
        for (int k = 0; k < arrayData.length; k++) {
            int randomNumber = generatesRandomNumbers(1, MAXIMUM_RANDOM_NUMBER);
            int length = generatesRandomNumbers(MINIMUM_ARRAY_LENGTH_NUMBER, MAXIMUM_ARRAY_LENGTH_NUMBER);
            int step = generatesRandomNumbers(2, MAX_NUMBER_FOR_STEP);

            int[] arrPrg = generateSequence(randomNumber, length, step);
            StringBuilder stringBuilder = new StringBuilder();
            int rightNumber = generatesRandomNumbers(1, arrPrg.length - 1);
            var indNumber = arrPrg[rightNumber];
            for (int j = 0; j < arrPrg.length; j++) {
                if (j == rightNumber) {
                    stringBuilder.append(".. ");
                    continue;
                }
                stringBuilder.append(arrPrg[j]).append(" ");
                arrayData[k][0] = String.valueOf(stringBuilder);
                arrayData[k][1] = String.valueOf(indNumber);
            }
        }
        Engine.startEngine(description, arrayData);
    }

    private static int[] generateSequence(int nextRandomNumber, int numberOfArrayLength, int stepOfSubsequence) {
        int[] arrayOfNumbers = new int[numberOfArrayLength];
        for (int j = 0; j < arrayOfNumbers.length; j++) {
            nextRandomNumber = nextRandomNumber + stepOfSubsequence;
            arrayOfNumbers[j] = nextRandomNumber;
        }
        return arrayOfNumbers;
    }
}
