import java.util.Scanner;

public class UnicodeCodePointCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter a string: ");
        String str = sc.nextLine();


        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();


        if (start >= 0 && end <= str.length() && start < end) {
        
            System.out.println("Number of Unicode code points from index " + start + " to " + (end - 1) + " is: " + count);
        } else {
            System.out.println("Invalid range! Please ensure 0 ≤ start < end ≤ " + str.length());
        }

        sc.close();
    }
}
