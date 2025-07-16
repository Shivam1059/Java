import java.util.Scanner;
class Test{
public static void main(String args[]){
  System.out.println("Enter the radius : ");
  float radius = new Scanner(System.in).nextInt();
  System.out.println("Enter the height : ");
  int height = new Scanner(System.in).nextInt();

  double surface_area = 2*(3.14f)*radius*radius + 2*(3.14)*radius*((float)height);
  System.out.println("Surface area of cylinders : "+surface_area);
}
}
