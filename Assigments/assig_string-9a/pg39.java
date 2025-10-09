//39. Write a Java program to Given string Convert Uppercase to Lowercase
import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();

        System.out.println(lowerStr);

        sc.close();
    }
}
