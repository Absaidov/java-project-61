package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

import java.util.Scanner;
import static hexlet.code.Cli.asking;

public class ChoiceOfGame {
    /*
     * asking the number of game
     * */
    static Scanner sc = new Scanner(System.in);
    public static int gameNumberForAnotherClass;
    public static String games() {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit\n" +
                "Your choice: ");
        gameNumberForAnotherClass = sc.nextInt();
        if (gameNumberForAnotherClass == 1) {
            return asking();
        } if (gameNumberForAnotherClass == 2) {
            return EvenGame.gameEven();
        } if (gameNumberForAnotherClass == 3){
            return Calc.gameCalc();
        } else {
            return "badGateWay";
        }
    }
}