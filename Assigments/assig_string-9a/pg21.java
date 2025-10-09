// 21. Write a Java program to check whether a given string starts with the contents of another string
import java.util.Scanner;

public class StringStartsWithExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String prefix = sc.nextLine();

        boolean startsWith = str.startsWith(prefix);
        System.out.println(startsWith);

        sc.close();
    }
}
