import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the height : ");
    System.out.println("Enter the diameter  : ");

    int height = new Scanner(System.in).nextInt();
    int diameter = new Scanner(System.in).nextInt();

    int radious = diameter/2;
    double volum = (3.14f)*radious*radious*height;
    System.out.println("Volume : "+volum);
  }
}