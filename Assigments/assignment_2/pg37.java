import java.util.Scanner;
class Test{
 public static void main (String args[]){
    System.out.println("Enter the surface of cylinder : ");
    int area = new Scanner(System.in).nextInt();

    System.out.println("Enter the surface of height : ");
    int height = new Scanner(System.in).nextInt();

    float radious = area/(2*(3.14f)*height);
    float diameter = radious*2;
    System.out.println("Diameter of cylinder : "+diameter);
 }
}