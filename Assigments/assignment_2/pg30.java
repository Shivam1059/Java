import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println(" tiles len : ");
    int tile_len = new Scanner(System.in).nextInt();
    System.out.println(" tiles bre  : ");
    int tile_bre = new Scanner(System.in).nextInt();
    int area = tile_len*tile_bre;

    System.out.println(" floor len : ");
    int floor_len = new Scanner(System.in).nextInt();
    System.out.println(" floor bre : ");
    int floor_bre = new Scanner(System.in).nextInt();
    int floor_area = floor_len*floor_bre;

    int total_tiles = floor_area/area;
    System.out.println("Total tiles : "+total_tiles);


  }
}