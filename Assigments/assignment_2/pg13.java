//area = 1/2*base*height

import java.util.Scanner;
class Test{
  public static void main(String args[]){

    System.out.println("Enter the area of triangle : ");
    int area = new Scanner(System.in).nextInt();
    System.out.println("Enter the len of triangle : ");
    int len = new Scanner(System.in).nextInt();
   
    int base = area*2/len;
    System.out.println("base of triangle : "+base);
  }
}