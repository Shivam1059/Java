//30. Write a Java program How to search a word inside a string?
import java.util.Scanner;

public class SearchWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = sc.nextLine();

        if (str.contains(word)) {
            System.out.println("The word is present in the string.");
        } else {
            System.out.println("The word is not present in the string.");
        }

        sc.close();
    }
}
