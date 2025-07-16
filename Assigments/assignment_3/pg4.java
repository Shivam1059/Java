import java.util.Scanner;
class student{
  public static void main(String args[]){
    Scanner grad = new Scanner(System.in);

    System.out.println("Enter your marks : ");
    int marks = grad.nextInt();

   // check marks accoding grad 
    if(marks >= 80){
      System.out.println("Grad : A ");
    }
    else if(marks >= 60 && marks <= 79){
      System.out.println("Grad : B ");
    }
    else if(marks >= 50 && marks <= 59){
      System.out.println("Grad : C ");
    }
    else if(marks >= 45 && marks <= 49){
      System.out.println("Grad : D ");
    }
    else if(marks >= 25 && marks <= 44){
      System.out.println("Grad : E ");
    }
    else{
      System.out.println("Grad : F ");
    }
  }
}