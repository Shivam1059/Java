import java.util.Scanner;

class circle{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radious : ");
      int radious = sc.nextInt();

      float circle_area = (3.14f)*radious*radious;
      System.out.println("Area of circle : "+circle_area);
  }
}