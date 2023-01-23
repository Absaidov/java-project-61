package hexlet.code;
import java.util.Scanner;
import static hexlet.code.Engine.getBrainGames;

public class Cli {
    private static String nameForAnotherClass;
    public static String getNameForAnotherClass() {
        return nameForAnotherClass;
    }

    /*
    * asking name of gamer
    * */
    public static String asking() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getBrainGames());
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        nameForAnotherClass = name;
        return "Hello, " + name + "!";
    }
}
