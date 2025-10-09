//46. Write a program to First alphabet capital of each word in given string
import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        System.out.println(result.toString().trim());
        sc.close();
    }
}
