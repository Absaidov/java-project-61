package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.newGenerator;

public class GCD {
    private static String description = "Find the greatest common divisor of given numbers.";

    public static void resultOfGameGCD() {
        String[][] arrData = new String[getNumberOfRound()][2];
        int i = 0;
        for (int j = 0; j < arrData.length; j++) {
            int randomNumber1 = newGenerator(1, 100);
            int randomNumber2 = newGenerator(1, 100);
            String question = randomNumber1 + " " + randomNumber2;
            arrData[j][0] = question;
            arrData[j][1] = String.valueOf(generateGCD(randomNumber1, randomNumber2));
            i++;
        }
        Engine.evenGaming(description, arrData);
    }
    public static int generateGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return generateGCD(n2, n1 % n2);
    }
}
