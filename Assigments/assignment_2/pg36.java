import java.util.Scanner;
class Test{
  public static void main(String args[]){
  System.out.println(" Enter the diameter of cylinder  : ");
  int diameter  = new  Scanner(System.in).nextInt();
  System.out.println(" Enter the height of cylinder  : ");
  int height  = new  Scanner(System.in).nextInt();

  int radious = diameter/2;
  double  surface_area = 2*(3.14f)*radious*height + 2*(3.14)*radious*radious;
  System.out.println("Surface area of cylinder : "+surface_area);

  }
}
