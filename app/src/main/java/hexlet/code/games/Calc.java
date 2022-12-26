package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.*;
import static hexlet.code.games.EvenGame.randoMMM;

public class Calc {
    public static String gameCalc(){
        questionOfGame = "What is the result of the expression?";
        rightAnswerOfTheGame = Integer.toString(randoMMM() * randoMMM());
        wrongAnswerOfTheGame = "no";
        quizQuestion = randoMMM() + " * " + randoMMM();
//        int randomNumber = (int) (Math.random() * 100);
//        logicOfgame = ;
        return Engine.evenGaming();
    }
}
