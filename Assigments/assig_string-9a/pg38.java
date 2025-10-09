//38. Write a Java program to Given string Convert Lowercase to Uppercase
import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String upperStr = str.toUpperCase();

        System.out.println(upperStr);

        sc.close();
    }
}
