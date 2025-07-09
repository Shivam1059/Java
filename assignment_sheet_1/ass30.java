//ass30
class Test{
  public static void main(String args[]){
    int tiles_len = 5;
    int tiles_bre = 8;
    int tiles_area = tiles_len*tiles_bre;

    int floor_len = 200;
    int floor_bre = 400;
    int floor_area = floor_len*floor_bre;

    int total_tiles = floor_area/tiles_area;
    System.out.println(total_tiles);
  }
}