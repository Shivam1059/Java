//convert UpperCase to LowerCase

import java.util.Scanner;

class Test{
     public static void  toLowerCase(char arr[]){
       for(int i=0; i<arr.length; i++){
          int a = (int)(arr[i]);
          if(a>64 && a<97){
            int b = a+32;
            char ch = (char)(b);
            System.out.print(ch);
          }else{
            System.out.print(arr[i]);
          }
          
       }
     }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the any word : ");
     String str = sc.nextLine();
     char[] arr = str.toCharArray();
      Test.toLowerCase(arr);
    
  }
}