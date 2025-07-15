import java.util.Scanner;
class Test{
  public static void main(String args[]){
     System.out.println("Enter  breck length  : ");
     int length = new Scanner(System.in).nextInt();
     System.out.println("Enter  breck breadth  : ");
     int breadth = new Scanner(System.in).nextInt();
    
    int area = length*breadth;
    int area_of_path = 100*area;
    System.out.println("Area of path : "+area_of_path);
  }
}