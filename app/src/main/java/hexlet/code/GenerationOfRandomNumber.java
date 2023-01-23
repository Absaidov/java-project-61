package hexlet.code;

import static hexlet.code.games.ArithProgression.getRandomNumber;

public class GenerationOfRandomNumber {
    public static int generationOfNumber() {
        return (int) (Math.random() * 100);
    }
    public static int generationOfNumberForCalc() {
        int min = 1;
        int max = 3;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }

    /*
    * */
    public static int generationOfNumberForProg() {
        int min = 0;
        int max = getRandomNumber() - 1;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int generationOfNumberForLengthProgression() {
        int min = 5;
        int max = 15;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int generationOfNumberForLenghtOfStep() {
        int min = 2;
        int max = getRandomNumber();
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }

}
