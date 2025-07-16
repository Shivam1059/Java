
import java.util.Scanner;
class Student{
   public static void main(String args[]){
     Scanner std = new Scanner(System.in);

     System.out.println("Enter the total classes held : ");
     float  classe_held = std.nextInt();
     System.out.println("Enter the total classes held : ");
     float  attendence  = std.nextInt();

     boolean a = true;
     while(a){
       if(attendence <= classe_held){
          System.out.println("your attendence is : "+attendence);
          a = false;
       }else{
         System.out.println("Enter the valid attendence : ");
         attendence = std.nextInt();
        }
      }
   
     float attend = (attendence/classe_held)*100f;
     System.out.println("My attend : " +attend+"%");
     
     if(attend >= 75){
       System.out.println("allow sit in exam ");
     
     }else{
      System.out.println("You have medical cause  'Y' or 'N' ") ;
      System.out.println("Enter your answer : ");
      String inputStr = std.next().toUpperCase();
      char ans = inputStr.charAt(0);

      if(ans == 'Y'){
        System.out.println("Allow sit in Exam ");
      }else{
          System.out.println("Not sit in Exam ");
      }
     }
   }
}