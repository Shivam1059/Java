//33. Write a Java program to find the maximum occurring character in a string
import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = ' ';
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        sc.close();
    }
}
