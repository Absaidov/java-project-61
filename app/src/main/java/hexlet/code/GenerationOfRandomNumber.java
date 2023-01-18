package hexlet.code;

import static hexlet.code.games.ArithProgression.randomNumber;

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
        int max = randomNumber - 1;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int generationOfNumberForLengthProgression() {
        int min = 5;
        int max = 15;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
    public static int generationOfNumberForCalc4() {
        int min = 2;
        int max = randomNumber;
        max = max - min;
        return ((int) (Math.random() * ++max)) + min;
    }
//    public static int generationOfNumberForCalc2() {
//        int min = 1;
//        int max = 3;
//        max = max - min;
//        return ((int) (Math.random() * ++max)) + min;
        public static int generationOfNumberForCalc3() {
            return (int) (Math.random() * 100);
        }
    }

