// 22. Write a Java program to get a substring of a given string between two specified positions
import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start >= 0 && end <= str.length() && start < end) {
            String substr = str.substring(start, end);
            System.out.println(substr);
        } else {
            System.out.println("Invalid indices!");
        }

        sc.close();
    }
}
