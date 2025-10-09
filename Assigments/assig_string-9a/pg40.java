//40. Write a Java program to Count Number of Uppercase and Lowercase letters
import java.util.Scanner;

public class CountUpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }

        System.out.println("Number of uppercase letters: " + upperCount);
        System.out.println("Number of lowercase letters: " + lowerCount);

        sc.close();
    }
}
