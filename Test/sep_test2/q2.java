// 2. Exception Handling Problem #1
// 📌 Problem: Division Calculator

// Write a program that:

// Takes two integers as input.

// Performs division and handles ArithmeticException if the denominator is zero.

// Use a finally block to print "Program Completed".

// Sample Input/Output:

import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value a : ");
     int a = sc.nextInt();
     System.out.println("Enter the value b : ");
     int b = sc.nextInt();
    
     try{
        int ans = a/b;
        System.out.println(" Ans : "+ans);
     }catch(ArithmeticException e){
       System.out.println("Enter invalid input ");
     }
     finally{
      System.out.println("Program Completed");
     }
  }
}

