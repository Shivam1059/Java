import java.util.Scanner;

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();


        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("Both strings are lexicographically equal (ignoring case).");
        } else if (result > 0) {
            System.out.println("First string \"" + str1 + "\" is lexicographically greater than \"" + str2 + "\" (ignoring case).");
        } else {
            System.out.println("First string \"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\" (ignoring case).");
        }

        sc.close();
    }
}
