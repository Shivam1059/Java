import java.util.Scanner;

class Test{
  public static void main(String args[]){
     System.out.println("base of triangle  : ");
     int base  = new Scanner(System.in).nextInt();

     System.out.println("len of triangle  : ");
     int len   = new Scanner(System.in).nextInt();

     System.out.println("para  of triangle  : ");
     int para   = new Scanner(System.in).nextInt();


     int height  = para-(len+base);
     int a = (base*height);
     int area  = (base*height)/2;

     System.out.println("Area of triangle : "+area);

  
  }
}