package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.generatesRandomNumbers;

public class ArithProgression {
    private static String description = "What number is missing in the progression?";
    public static final int MAX_NUMBER_FOR_STEP = 5;
    private static final int MINIMUM_ARRAY_LENGTH_NUMBER = 8;
    private static final int MAXIMUM_ARRAY_LENGTH_NUMBER = 10;
    private static final int MAXIMUM_RANDOM_NUMBER = 100;
//    private static final int RANDOM_NUMBER_OF_ARRAYLENGTH =
//            generatesRandomNumbers(MINIMUM_ARRAY_LENGTH_NUMBER, MAXIMUM_ARRAY_LENGTH_NUMBER);
//    private static final int RANDOM_NUMBER = generatesRandomNumbers(1, MAXIMUM_RANDOM_NUMBER);


    public static void resultOfGameConsecutiveNumbers() {
        String[][] arrayData = new String[getNumberOfRound()][2];
        for (int k = 0; k < arrayData.length; k++) {
            /*
            * передаем числа в метод генерации массива последовательных чисел*/
            int[] arrPrg = generateSequence(generatesRandomNumbers(1, MAXIMUM_RANDOM_NUMBER),
                    generatesRandomNumbers(MINIMUM_ARRAY_LENGTH_NUMBER, MAXIMUM_ARRAY_LENGTH_NUMBER)
                    , generatesRandomNumbers(2, MAX_NUMBER_FOR_STEP));
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

    public static int[] generateSequence(int nextRandomNumber, int numberOfArrayLength, int stepOfSubsequence) {
        int[] arrayOfNumbers = new int[numberOfArrayLength];
        int j = 0;
        while (j < arrayOfNumbers.length) {
            nextRandomNumber = nextRandomNumber + stepOfSubsequence;
            arrayOfNumbers[j] = nextRandomNumber;
            j++;
        }
        return arrayOfNumbers;
    }
}
