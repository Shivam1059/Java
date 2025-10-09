//48. Write a program to String concatenation with primitive data type values
import java.util.Scanner;

public class StringConcatenationWithPrimitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int intValue = sc.nextInt();
        double doubleValue = sc.nextDouble();
        boolean boolValue = sc.nextBoolean();
        sc.nextLine(); // consume newline
        char charValue = sc.nextLine().charAt(0);

        String result = str + intValue + doubleValue + boolValue + charValue;
        System.out.println(result);

        sc.close();
    }
}
