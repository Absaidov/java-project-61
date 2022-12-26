package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.*;
/*
 * game Even
 * */
public class EvenGame {
    public static int randoMMM(){
        return (int) (Math.random() * 100);
    }
    public static String gameEven(){
        questionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        rightAnswerOfTheGame = "yes";
        wrongAnswerOfTheGame = "no";
//        int randomNumber = (int) (Math.random() * 100);
        logicOfgame = randoMMM() % 2 == 0;
        quizQuestion = Integer.toString(randoMMM());
        return Engine.evenGaming();
    }
}
