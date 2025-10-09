//43. Write a program to Convert any type of value to string value using String.valueOf() method
import java.util.Scanner;

public class ConvertToStringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intValue = sc.nextInt();
        double doubleValue = sc.nextDouble();
        boolean boolValue = sc.nextBoolean();
        sc.nextLine(); // consume newline
        char charValue = sc.nextLine().charAt(0);

        String intStr = String.valueOf(intValue);
        String doubleStr = String.valueOf(doubleValue);
        String boolStr = String.valueOf(boolValue);
        String charStr = String.valueOf(charValue);

        System.out.println("Integer as String: " + intStr);
        System.out.println("Double as String: " + doubleStr);
        System.out.println("Boolean as String: " + boolStr);
        System.out.println("Character as String: " + charStr);

        sc.close();
    }
}
