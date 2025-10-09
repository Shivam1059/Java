//32. Write a Java program to print after removing duplicates from a given string

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
