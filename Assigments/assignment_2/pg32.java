import java.util.Scanner;
class Test{
  public static void main(String args[]){
    //pool
    System.out.println("Enter pool side : ");
    int side = new Scanner(System.in).nextInt();
    int pool_area = side*side;

    System.out.println("Enter garden  side : ");
    int garden_side = new Scanner(System.in).nextInt();
    int garden_area = garden_side*garden_side;

    int area = garden_area-pool_area;
    System.out.println("remain garden area : "+area);
  }
}