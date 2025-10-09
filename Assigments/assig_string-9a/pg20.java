
// 20. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
import java.util.Scanner;

public class ReplaceSubstringRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String regex = sc.nextLine();
        String replacement = sc.nextLine();

        String result = str.replaceAll(regex, replacement);
        System.out.println(result);

        sc.close();
    }
}
