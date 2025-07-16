import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the r : ");
    int radious = new Scanner(System.in).nextInt();
    System.out.println("Enter the h : ");
    int height = new Scanner(System.in).nextInt();

    float  volum = (3.14f)*radious*height;
    System.out.println("Cylinder volum: "+volum);


  }
}