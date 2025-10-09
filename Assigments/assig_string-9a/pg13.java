import java.util.Scanner;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;

public class StringToByteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(byteArray));

        sc.close();
    }
}
