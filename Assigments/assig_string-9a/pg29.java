//29. Write a Java program to Reverse Each Word of a String
import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}
