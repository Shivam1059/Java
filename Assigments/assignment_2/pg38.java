import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the cyl volume  : ");
    int volume = new Scanner(System.in).nextInt();

    System.out.println("Enter of radious : ");
    int radious = new Scanner(System.in).nextInt();
    
    float height = volume/((3.14f)*radious*radious);
    float  area = 2*(3.14f)*radious*height;
    System.out.println("Area of cylinder : "+area);
  }
}