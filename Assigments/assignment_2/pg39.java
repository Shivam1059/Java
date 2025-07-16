import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the diameter : ");
    int diameter = new Scanner(System.in).nextInt();
    int radious = diameter/2;

    System.out.println("Enter the height : ");
    int height = new Scanner(System.in).nextInt();

    double surface_area = 2*(3.14f)*radious*height + 2*(3.14f)*radious*radious*height;
  System.out.println("Area of cylinder : "+surface_area);
    
  }
}