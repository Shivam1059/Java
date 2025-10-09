//18. Write a java program to get the length of a given string
import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int length = str.length();

        System.out.println(length);

        sc.close();
    }
}
