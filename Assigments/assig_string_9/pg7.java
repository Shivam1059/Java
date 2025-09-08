//Input name of a person and count how many vowels it contains. Use String class methods.
import java.util.Scanner;
class Test{

    public  static void countVowel(String s){
         int count = 0;
         for(int i=0; i<s.length(); i++){
          if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u'){
            count++;
          }
         }
         System.out.print("Number of vowel in string  : " +count);
    }


   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name : ");
      String str = sc.nextLine();
      countVowel(str);

   }
}