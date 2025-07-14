//  double area =((1.732/4)*a*a);

import java.util.Scanner;

class Test{
  public static void main(String args[]){
       System.out.println("Side of triangle : ");
       int a = new Scanner(System.in).nextInt();

       double area  = ((1.732/4)*a*a);
       System.out.println("Area of triangle : "+area);
  }
}