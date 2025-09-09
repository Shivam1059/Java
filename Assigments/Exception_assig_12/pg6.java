import java.util.Scanner;
import java.util.*;

class TestMain{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Enter the number   : ");
        int  number  = sc.nextInt();
        System.out.println("number  "+ number );
    }catch(InputMismatchException e){
      e.printStackTrace();
    }finally{
      System.out.println("Finally block excute");
    }
  }
}