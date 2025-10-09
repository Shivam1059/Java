import java.util.Scanner;
import java.util.Arrays;

public class StringToCharArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        System.out.println(Arrays.toString(charArray));

        sc.close();
    }
}
