//error in runtime
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the diameter  : ");
    System.out.println("Enter the height  : ");

    double diameter = new Scanner(System.in).nextInt();
    double radious = diameter/2;
    double height= new Scanner(System.in).nextInt();

    double volum = (3.14f)*radious*radious*height;
    System.out.println("Volue of cylinder : "+volum);
  }

}