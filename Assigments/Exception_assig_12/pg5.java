import java.util.Scanner;
import java.util.*;

class TestMain{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
  
   int num1 = 0;
   int num2 = 0;

  try{
    System.out.println("Enter the value first : ");
      num1 = sc.nextInt();

    System.out.println("Enter the value Second : ");
      num2 = sc.nextInt();
  }catch(InputMismatchException e){
    e.printStackTrace();
  }

  try{
     int ans = num1/num2;
     System.out.print("Anser : "+ans);
  }catch(ArithmeticException e){
     e.printStackTrace();
  }

  }
}