//ass 34
import java.util.Scanner;

class Trapezoid{
  public static void main(String args[]){
    System.out.println(" base_1 : ");
    int base_1 = new Scanner(System.in).nextInt();
    System.out.println(" base_2 : ");
      int base_2 = new Scanner(System.in).nextInt();
    System.out.println(" height  : ");
      int height  = new Scanner(System.in).nextInt();
    System.out.println(" widearea  : ");
    float woodearea = 1/2f*( base_1 + base_2)*height;

    System.out.println("Enter wide : ");
    int wide = new Scanner(System.in).nextInt();
    int  widearea = wide*height;
    
    int total_area =(int) woodearea + widearea;
    System.out.println("Wooden area : "+woodearea+"wokeway area : "+ widearea+"after adding both area : "+total_area);

  }
}