package hexlet.code;

import static hexlet.code.ChoiceOfGame.gameNumberForAnotherClass;
import static hexlet.code.Engine.randomNumberForAnotherClass;
import static hexlet.code.Engine.randomNumberForAnotherClass2;
import static hexlet.code.Engine.quizQuestion;
import static hexlet.code.Engine.rightAnswerOfTheGame;





public class generationOfRandomNumber {
    public static int generationOfNumber() {
        return (int) (Math.random() * 100);
    }

    public static String resultOfGame() {
        randomNumberForAnotherClass = generationOfNumber();
        randomNumberForAnotherClass2 = generationOfNumber();
        if (gameNumberForAnotherClass == 2) {
            quizQuestion = Integer.toString(randomNumberForAnotherClass);
        }
        if (gameNumberForAnotherClass == 3) {
            quizQuestion = Integer.toString(randomNumberForAnotherClass) + " + " + Integer.toString(randomNumberForAnotherClass2);
            var rightAnswer = randomNumberForAnotherClass + randomNumberForAnotherClass2;
            rightAnswerOfTheGame = Integer.toString(rightAnswer);

        }
        return null;
    }

//    public static int logicOfEvenGame(int randomNumber) {
//        var i = 0;
//        while (i < 3){
//        }
//    }

//    public static boolean threeTime() {
//        var i = 0;
//        while (i < 3) {
//            System.out.println(LogicMy());
//            i++;
//        }
//    }
}

//    public static int randomN = generationOfNumber();

//    public static int getRandomN() {
//        int i = 0;
//        while (i< 3){
////            i++;
//            return generationOfNumber();
//        }
//    } return generationOfRandomNumber();

