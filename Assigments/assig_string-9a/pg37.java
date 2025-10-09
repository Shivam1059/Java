//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
public class CheckLetterX {
    public static void main(String[] args) {
        String str = "String Exercises";

        if (str.indexOf('x') != -1) {
            System.out.println("The letter 'x' is present in the string.");
        } else {
            System.out.println("The letter 'x' is not present in the string.");
        }
    }
}
