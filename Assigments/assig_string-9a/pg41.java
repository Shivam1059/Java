//41. Write a program to Trim a given string using String.trim() method
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
