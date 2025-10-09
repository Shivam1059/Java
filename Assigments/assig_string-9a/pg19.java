// 19. Write a Java program to replace a specified character with another character
import java.util.Scanner;

public class ReplaceCharacterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        String replacedStr = str.replace(oldChar, newChar);
        System.out.println(replacedStr);

        sc.close();
    }
}
