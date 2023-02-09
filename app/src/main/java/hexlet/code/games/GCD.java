package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.generatesRandomNumbers;

public class GCD {
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void GCDGameStart() {
        String[][] arrayData = new String[NUMBER_OF_ROUND][2];
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            int randomNumber2 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            String question = randomNumber1 + " " + randomNumber2;
            arrayData[j][0] = question;
            arrayData[j][1] = String.valueOf(generateGCD(randomNumber1, randomNumber2));
        }
        Engine.startEngine(description, arrayData);
    }
    public static int generateGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return generateGCD(n2, n1 % n2);
    }
}
