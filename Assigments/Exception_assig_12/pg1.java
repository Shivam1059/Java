//Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero
import java.util.Scanner;

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first value : ");
    int  num1 = sc.nextInt();
    System.out.println("Enter the second value : ");
    int  num2 = sc.nextInt();
 
    try{
      int ans  =  num1/num2;
      System.out.println("Answer :  "+ans);
    }catch(ArithmeticException e){
       System.out.println("Enter the invalid numaber ");
       e.printStackTrace();
    }

  }
}