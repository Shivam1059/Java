import java.util.Scanner;

class rangle{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("rectangle len : ");
     int length = sc.nextInt();

     System.out.println("rectangle bre  : ");
     int breadth = sc.nextInt();

     int r_area = length*breadth;
     System.out.println("rectangle area : "+r_area);

   }
}