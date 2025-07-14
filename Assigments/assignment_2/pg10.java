// area = a^2/2;

import java.util.Scanner;

class Test{
  public static void main(String args[]){
     System.out.println("Enter the side of triangle : ");

     int side = new Scanner(System.in).nextInt();
     int area = (side*side)/2;

     System.out.println("Area of triangle : "+area);
  }
}