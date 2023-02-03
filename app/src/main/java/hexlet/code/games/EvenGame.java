package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.getNumberOfRound;
import static hexlet.code.Utils.newGenerator;
import static hexlet.code.Engine.MAX_NUMBER_OF_NUMBERS;

/*
 * game Even
 * */
public class EvenGame {
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameEven() {
        String[][] arrData = new String[getNumberOfRound()][2];
        int i = 0;
        for (int j = 0; j < arrData.length; j++) {
            int randomNumber1 = newGenerator(1, MAX_NUMBER_OF_NUMBERS);
            arrData[j][0] = Integer.toString(randomNumber1);
            arrData[j][1] = isEven(randomNumber1) ? "yes" : "no";
            i++;
        }
        Engine.evenGaming(description, arrData);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
