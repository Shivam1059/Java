import java.util.Scanner;
 import java.util.*;

class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int number1  = 0;
     int number2 = 0;
     try{
      System.out.println("Enter the first value : ");
        number1 = sc.nextInt();
      System.out.println("Enter the first value : ");
        number2 = sc.nextInt();
     }catch(InputMismatchException e){
       System.out.println("Enter the valid input : ");
         e.printStackTrace();
     }
     int ans = number1 + number2;
     System.out.println("Answer : "+ans);


  }
}