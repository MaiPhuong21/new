
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = getString(sc, "Enter string: ", false);
        System.out.println(printReverse(input));
    }

    public static String printReverse(String s) {
        String result = "";
        char[] chr = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            result += chr[i];
        }
        return result;
    }

    public static String getString(Scanner sc, String msg, boolean isEmpty) {
        String line = "";
        do {
            System.out.print(msg);
            line = sc.nextLine();
            if (line.isEmpty() && !isEmpty) {
                continue;
            } else {
                break;
            }
        } while (true);
        return line;
    }
}
