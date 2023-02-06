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
    private static final int NUMBER_OF_ARRAYLENGTH =
            generatesRandomNumbers(MINIMUM_ARRAY_LENGTH_NUMBER, MAXIMUM_ARRAY_LENGTH_NUMBER);
    private static final int RANDOM_NUMBER = generatesRandomNumbers(1, MAXIMUM_RANDOM_NUMBER);


    public static void resultOfGameConsecutiveNumbers() {
        String[][] arrayData = new String[getNumberOfRound()][2];
        for (int k = 0; k < arrayData.length; k++) {
            StringBuilder stringBuilder = new StringBuilder();
            int rightNumber = generatesRandomNumbers(1, generatesNumbers().length - 1);
            String[] arrPrg = generatesNumbers();
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
        Engine.evenGaming(description, arrayData);
    }

    public static String[] generatesNumbers() {
        int i = RANDOM_NUMBER;
        String[] arrayOfNumbers = new String[NUMBER_OF_ARRAYLENGTH];
        int j = 0;
        String k;
        int step = generatesRandomNumbers(2, MAX_NUMBER_FOR_STEP);
        while (i < RANDOM_NUMBER + (step * NUMBER_OF_ARRAYLENGTH)) {
            i = i + step;
            k = i + "";
            arrayOfNumbers[j] = k;
            j++;
        }
        return arrayOfNumbers;
    }
}
