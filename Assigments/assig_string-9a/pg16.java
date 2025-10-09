import java.util.Scanner;

public class StringToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();

        System.out.println(lowerStr);

        sc.close();
    }
}
