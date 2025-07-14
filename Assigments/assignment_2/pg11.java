

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Area of triangle : ");
    double area = new Scanner(System.in).nextInt();

    System.out.println("ratio base : ");
    int ratio_b = new Scanner(System.in).nextInt();

    System.out.println("ratio height : ");
    int ratio_h = new Scanner(System.in).nextInt();
    

    //area = 1/2*base*height
    // int x  = (area*2)/(ratio_h*ratio_b);
    double xSquar  = area/20;
    double x = Math.sqrt(xSquar);
    double height = ratio_h*x;
    double base  = ratio_b*x;

    System.out.println("Base of triangle : "+base);
    System.out.println("height of triangle : "+height);
  }
}