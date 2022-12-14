package hexlet.code;

import java.util.Scanner;

public class cli {
    /*
    * asking name of gamer
    * */
    public static String asking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String s = sc.nextLine();
        return "Hello, " + s + "!";
    }
}
