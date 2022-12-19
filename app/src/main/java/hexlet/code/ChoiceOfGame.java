package hexlet.code;
import java.util.Scanner;

public class ChoiceOfGame {
    /*
     * asking the number of game
     * */
    public static String games(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit\n" +
                "Your choice: " );
        int gameNumber = sc.nextInt();
        String greetGame = "Welcome to the Brain Games!";
        if (gameNumber == 1){
            return greetGame;
        }
        return greetGame;
    }
}
