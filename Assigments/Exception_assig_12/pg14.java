import java.util.Scanner;
 import java.util.*;

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

      System.out.println("Enter the total amount : ");
      int amount  = sc.nextInt();
      boolean valid = true;

    while(valid){    
      try{
         System.out.println("Enter the quantity : ");
         int quantity  = sc.nextInt();

         int price = amount/quantity;
         valid = false;
         System.out.print("item price : "+price);
      }catch(ArithmeticException e){
          e.printStackTrace();
      }catch(InputMismatchException e){
          System.out.println("You enter the wrong value of quantity");
          sc.nextLine();
      }
    }

  }
}