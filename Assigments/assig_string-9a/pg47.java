//47. Write a program to Convert a character array to string
import java.util.Scanner;

public class CharArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] charArray = input.toCharArray();

        String str = new String(charArray);
        System.out.println(str);

        sc.close();
    }
}
