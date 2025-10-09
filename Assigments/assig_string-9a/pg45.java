//45. Write a program to Compare the strings using equals(), compareTo() and == operator
import java.util.Scanner;

public class CompareStringsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        if (str1.equals(str2)) {
            System.out.println("Using equals(): Strings are equal.");
        } else {
            System.out.println("Using equals(): Strings are not equal.");
        }


        int cmp = str1.compareTo(str2);
        if (cmp == 0) {
            System.out.println("Using compareTo(): Strings are equal.");
        } else if (cmp > 0) {
            System.out.println("Using compareTo(): First string is greater.");
        } else {
            System.out.println("Using compareTo(): Second string is greater.");
        }

        if (str1 == str2) {
            System.out.println("Using == operator: Strings are equal (same reference).");
        } else {
            System.out.println("Using == operator: Strings are not equal (different references).");
        }

        sc.close();
    }
}
