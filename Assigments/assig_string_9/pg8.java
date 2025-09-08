//13)WAP check if two Strings are anagrams of each other?
import java.util.Scanner;
class Anagram{
     public void checkanagram(String str1, String str2){
        int count = 0;
         for(int i=0; i<str1.length(); i++){
          for(int j=0; j<str2.length(); j++){
            if(str1.charAt(i) == str2.charAt(j)) {
                   count++;
            }
         }
       }
        if(count == str2.length()){
          System.out.println("It is anagram string");
         }else{
          System.out.println("It is anagram not string");
         }
   }  
}

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the str1 : ");
    String str1 = sc.nextLine();
    System.out.println("Enter the str2 : ");
    String str2 = sc.nextLine();

    Anagram a = new Anagram();
    a.checkanagram(str1, str2);
  }
}