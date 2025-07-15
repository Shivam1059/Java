import java.util.Scanner;
class Test{
  public static void main(String args[]){
    //brick
    System.out.println("Enter the breck len : ");
    int len = new Scanner(System.in).nextInt();

    System.out.println("Enter the breck bre : ");
    int bre = new Scanner(System.in).nextInt();

    System.out.println("Enter the breck hei : ");
    int hei = new Scanner(System.in).nextInt();

    //wall
    System.out.println("Enter the wall len : ");
    int wall_len = new Scanner(System.in).nextInt();
    System.out.println("Enter the wall bre : ");
    int wall_bre = new Scanner(System.in).nextInt();
    System.out.println("Enter the wall hei : ");
    int wall_hei = new Scanner(System.in).nextInt();

    int breck_area = len*bre*hei;
    System.out.println("Total breck : "+breck_area);
    int wall_area =( wall_len*100)*(wall_bre*100)*(wall_hei*100);
    System.out.println("Total breck : "+wall_area);

    int total_brick = wall_area/breck_area;
    System.out.println("Total breck : "+total_brick);

  }
}