//31. Write a Java program to find first non repeating character in a string
import java.util.Scanner;

public class FirstNonRepeatingCharacterSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char firstNonRepeating = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
