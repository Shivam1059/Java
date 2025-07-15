// how to taken a inout in java
import java.util.Scanner;

class Test{
  public static void main(String args[]){
   System.out.println("Room len : ");
   int r_len = new Scanner(System.in).nextInt();

   System.out.println("Room bre : ");
   int r_bre = new Scanner(System.in).nextInt();

   int area = r_len*r_bre;
   System.out.println("Room area : "+area);
  }
}