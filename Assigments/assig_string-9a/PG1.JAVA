// Program to Concatenate Two Strings in Java
public class ConcatenateStrings {
    public static void main(String[] args) {
        
  
        String str1 = "Hello";
        String str2 = "World";
     
        String result1 = str1 + " " + str2;
        System.out.println("Using + operator: " + result1);

        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using concat() method: " + result2);

        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        System.out.println("Using StringBuilder: " + sb.toString());
    }
}
