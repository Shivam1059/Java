//27. Write a Java program to Swap Two Strings
import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("After swapping:");
        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);

        sc.close();
    }
}
