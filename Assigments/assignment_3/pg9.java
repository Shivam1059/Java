import java.util.Scanner;
class check{
  public static void main(String  args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the any charecter : ");
  
         char ch = sc.next().charAt(0);
         if( ch >= 'a' && ch <= 'z'){
           System.out.println("The character is Lowercase ");
         }
         else if( ch >= 'A' && ch <= 'Z'){
           System.out.println("The character is Uppercase ");
         }
         else{
           System.out.println("The character is not alphabet letter ");
         }
      
  }
}