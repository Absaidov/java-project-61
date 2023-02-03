package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.newGenerator;

public class Prime {
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void gamePrime() {
        String[][] arrData = new String[getNumberOfRound()][2];
        int i = 0;
        for (int j = 0; j < arrData.length; j++) {
            int randomNumber1 = newGenerator(1, MAX_NUMBER_OF_NUMBERS);
            arrData[j][0] = Integer.toString(randomNumber1);
            arrData[j][1] = isSimple(randomNumber1) ? "yes" : "no";
            i++;
        }
        Engine.evenGaming(description, arrData);
    }
    public static boolean isSimple(int randomNumber1) {
        if (randomNumber1 < 2) {
            return false;
        }
        for (int i = 2; i < randomNumber1 / 2; i++) {
            if (randomNumber1 % i == 0) {
                return false;
            }
        }
        return true;
    }
}
