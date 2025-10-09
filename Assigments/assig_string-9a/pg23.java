//23. Write a Java program to trim any leading or trailing whitespace from a given string
import java.util.Scanner;

public class TrimStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String trimmedStr = str.trim();

        System.out.println(trimmedStr);

        sc.close();
    }
}
