package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.generatesRandomNumbers;

public class Prime {
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void gamePrime() {
        String[][] arrayData = new String[getNumberOfRound()][2];
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            arrayData[j][0] = Integer.toString(randomNumber1);
            arrayData[j][1] = isSimple(randomNumber1) ? "yes" : "no";
        }
        Engine.startEngine(description, arrayData);
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
