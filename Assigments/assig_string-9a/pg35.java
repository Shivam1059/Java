//35. Write a Java program to find maximum between two string
import java.util.Scanner;

public class MaxBetweenTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String maxStr = str1;  
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) > str2.charAt(i)) {
                maxStr = str1;
                break;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                maxStr = str2;
                break;
            }
        }

        if (maxStr.equals(str1) && str1.length() < str2.length()) {
            maxStr = str2;
        }

        System.out.println("Maximum string: " + maxStr);
        sc.close();
    }
}

