package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;

import java.util.Scanner;
import static hexlet.code.Cli.asking;

public class ChoiceOfGame {
    /*
     * asking the number of game
     * */
    public static String games() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit\n" +
                "Your choice: ");
        int gameNumber = sc.nextInt();
        if (gameNumber == 1) {
            return asking();
        } if (gameNumber == 2) {
            return EvenGame.gameEven();
        } if (gameNumber == 3){
            return Calc.gameCalc();
        } else {
            return "badGateWay";
        }
    }
}