package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String nameForAnotherClass;
    /*
    * asking name of gamer
    * */
    public static String asking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        nameForAnotherClass = name;
        return "Hello, " + name + "!";
    }
}
