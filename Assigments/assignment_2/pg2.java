import java.util.Scanner;
class Test {
  public static void main(String args[]){
   
   System.out.println(" Enter the area of rectangle : ");
   int area = new Scanner(System.in).nextInt();

   System.out.println(" Enter the breadth of rectangle : ");
   int breadth = new Scanner(System.in).nextInt();

   int length = area/breadth;
   int perimeter = 2*(length+breadth);

   System.out.println("Length : "+length);
   System.out.println("perimeter : "+perimeter);
  }
  
}