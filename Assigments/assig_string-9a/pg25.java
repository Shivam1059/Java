//25. Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0
import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
