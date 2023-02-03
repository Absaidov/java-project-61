package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.newGenerator;

public class ArithProgression {
    private static int randomNumber;
    public static final int maxNumberForStep = 4;
    private static String description = "What number is missing in the progression?";


    public static void resultOfGameConsecutiveNumbers() {
        String[][] arrData = new String[getNumberOfRound()][2];
        int i = 0;
        for (int k = 0; k < arrData.length; k++) {
            StringBuilder stringBuilder = new StringBuilder();
            int rightNumber = newGenerator(1, arrayToProgGame().length - 1);
            String[] arrPrg = arrayToProgGame();
            var indNumber = arrPrg[rightNumber];
            for (int j = 0; j < arrPrg.length; j++) {
                if (j == rightNumber) {
                    stringBuilder.append(".. ");
                    continue;
                }
                stringBuilder.append(arrPrg[j]).append(" ");
                arrData[k][0] = String.valueOf(stringBuilder);
                arrData[k][1] = String.valueOf(indNumber);
                i++;
            }
        }
        Engine.evenGaming(description, arrData);
    }

    public static String[] arrayToProgGame() {
        final int numberMin = 8;
        final int numberMax = 10;
        final int numberMaxRandom = 100;
        final int numberMaxForStep = 4;
        randomNumber = newGenerator(numberMin, numberMax);
        int randomNumberForAnotherClass = newGenerator(1, numberMaxRandom);
        var i = randomNumberForAnotherClass;
        String[] xxx = new String[randomNumber];
        int j = 0;
        String k;
        int step = newGenerator(2, maxNumberForStep);
        while (i < randomNumberForAnotherClass + (step * randomNumber)) {
            i = i + step;
            k = i + "";
            xxx[j] = k;
            j++;
        }
        return xxx;
    }
}
