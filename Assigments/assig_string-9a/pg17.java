import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String upperStr = str.toUpperCase();

        System.out.println(upperStr);

        sc.close();
    }
}

