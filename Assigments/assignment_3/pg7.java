
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
       System.out.println("Not  sit in exam ");
     }

   }
}