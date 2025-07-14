// 1m = 100cm   
//0.8m  = 80cm

import java.util.Scanner;
class Test{
public static void main(String args[]){
  System.out.println("Altitude of triangle : ");
  int Altitude = new Scanner(System.in).nextInt();
  System.out.println("Altitude of area  : ");
  int area = new Scanner(System.in).nextInt();


  int base = (area*2)/20;
  System.out.println("Triagle of base : "+base);
  }
}