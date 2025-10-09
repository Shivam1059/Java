import java.util.Scanner;

public class StringContainsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String sequence = sc.nextLine();

        boolean contains = str.contains(sequence);
        System.out.println(contains);

        sc.close();
    }
}

