//42. Write a program to Replace string with another string in java using String.replace() method
import java.util.Scanner;

public class ReplaceStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();

        String result = str.replace(target, replacement);
        System.out.println(result);

        sc.close();
    }
}
