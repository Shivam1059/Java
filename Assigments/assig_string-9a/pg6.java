import java.util.Scanner;

public class ConcatenateStringsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();


        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();


        String result1 = str1 + str2;
        System.out.println("\nUsing '+' operator: " + result1);

        String result2 = str1.concat(str2);
        System.out.println("Using concat() method: " + result2);

      
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);
        System.out.println("Using StringBuilder: " + sb.toString());

        sc.close();
    }
}
