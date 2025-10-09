import java.util.Scanner;
import java.util.Arrays;

public class StringToByteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        byte[] byteArray = str.getBytes();

        System.out.println(Arrays.toString(byteArray));

        sc.close();
    }
}
