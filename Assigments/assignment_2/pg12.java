
// area of right triangle : 1/2*base*height

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter hy vaue : ");
    double hy = new Scanner(System.in).nextInt();

    System.out.println("Enter height  vaue : ");
    double height = new Scanner(System.in).nextInt();

    double b  = (hy*hy)- (height*height);
    double  base = Math.sqrt(b);
   
    double area  = (1*base*height)/2;

   System.out.println(" Base of triangle base :"+base );
   System.out.println(" Base of triangle base :"+area );

  }
}