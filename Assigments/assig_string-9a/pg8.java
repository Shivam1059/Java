import java.util.Scanner;

public class StringEndsWithExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String suffix = sc.nextLine();

        boolean endsWith = str.endsWith(suffix);
        System.out.println(endsWith);

        sc.close();
    }
}

