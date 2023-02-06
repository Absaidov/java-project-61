package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.generatesRandomNumbers;

public class ArithProgression {
    private static String description = "What number is missing in the progression?";
    public static final int MAX_NUMBER_FOR_STEP = 5;
    private static final int minimumArrayLengthNumber = 8;
    private static final int maximumArrayLengthNumber = 10;
    private static final int maximumRandomNumber = 100;
    private static final int randomNumber = generatesRandomNumbers(minimumArrayLengthNumber, maximumArrayLengthNumber);
    private static final int generatesNumber = generatesRandomNumbers(1, maximumRandomNumber);


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
        int i = generatesNumber;
        String[] arrayOfNumbers = new String[randomNumber];
        int j = 0;
        String k;
        int step = generatesRandomNumbers(2, MAX_NUMBER_FOR_STEP);
        while (i < generatesNumber + (step * randomNumber)) {
            i = i + step;
            k = i + "";
            arrayOfNumbers[j] = k;
            j++;
        }
        return arrayOfNumbers;
    }
}
