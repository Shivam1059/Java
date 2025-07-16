//error 

import java.util.Scanner;

class check{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int num = sc.nextInt();
    // int n = num%2;
  
   int number = num;
    switch(number%2 ){
      case 0:
        System.out.println(" number is even");
        break;
      case 1:
        System.out.println(" number is odd");
        break;
      default:
       System.out.println(" Nither even ot not odd");
    }

  }
}