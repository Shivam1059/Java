import java.util.Scanner;
import java.util.InputMismatchException;



class TestMain{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

   int  rollnumber = 0;
   boolean valid = true;
  while(valid){
   try{
    System.out.println("Enter the rollnumber : ");
     rollnumber = sc.nextInt();
     valid = false;
     System.out.println("Thank you ");
   }catch(InputMismatchException e){
       System.out.println("Enter invalid rollnumer ");
       sc.nextLine();
   }
  }
  
  
  }
}