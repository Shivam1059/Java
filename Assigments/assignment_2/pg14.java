 // formula = 1/2*d*(h1+h2);

import java.util.Scanner;
class Test{
  public static void main(String args[]){
   
   System.out.println("Diagonal of trigle : ");
   int diagonal  = new Scanner(System.in).nextInt();
   
   System.out.println("Diagonal of h1 : ");
   int h1  = new Scanner(System.in).nextInt();
   
   System.out.println("Diagonal of h2 : ");
   int h2  = new Scanner(System.in).nextInt();
   
    int area = (diagonal*(h1+h2))/2;
    System.out.println(" area of field : "+area);
  }
}