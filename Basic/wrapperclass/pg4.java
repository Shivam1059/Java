//WAP To enter name of user and check whether it valid name or not.
import java.util.Scanner;

class TestMain{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   String name = "";
    System.out.println("Enter the user name : ");
    name = sc.nextLine();
   
   char[] ch = name.toCharArray();
   int i;
   for( i=0; i<ch.length; i++){
      if(Character.isDigit(ch[i]))
      break; 
   } 

   if(i==ch.length){
      System.out.println("valid name");
   }
   else{
     System.out.println("invalid name");
   }

  }
}