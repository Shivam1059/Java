//24. Write a Java program to create a new string repeating every character twice of a given string
import java.util.Scanner;

public class RepeatCharactersTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }

        System.out.println(result.toString());
        sc.close();
    }
}
