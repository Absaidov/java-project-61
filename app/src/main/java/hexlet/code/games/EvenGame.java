package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Utils.generatesRandomNumbers;

public class EvenGame {
    private static final int MAX_NUMBER_OF_NUMBERS = 99;
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGameStart() {
        String[][] arrayData = new String[NUMBER_OF_ROUND][2];
        for (int j = 0; j < arrayData.length; j++) {
            int randomNumber1 = generatesRandomNumbers(1, MAX_NUMBER_OF_NUMBERS);
            arrayData[j][0] = Integer.toString(randomNumber1);
            arrayData[j][1] = isEven(randomNumber1) ? "yes" : "no";
        }
        Engine.startEngine(description, arrayData);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
