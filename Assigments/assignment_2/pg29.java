import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the side : ");
    int side = new Scanner(System.in).nextInt();
    int area = side*side;

    System.out.println("Enter the len : ");
    int len = new Scanner(System.in).nextInt();
    System.out.println("Enter the bre : ");
    int bre  = new Scanner(System.in).nextInt();
    int floor_area = len*bre;

    int total_tiles = floor_area/area;
    System.out.println("Total tiles : "+total_tiles);
  }
}