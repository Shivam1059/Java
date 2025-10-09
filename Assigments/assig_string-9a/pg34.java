//34. Write a Java program to reverse words in a given string
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}
