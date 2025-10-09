import java.util.Scanner;

public class StringCanonicalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String canonicalStr1 = str1.intern();
        String canonicalStr2 = str2.intern();

        System.out.println(canonicalStr1 == canonicalStr2);

        sc.close();
    }
}

