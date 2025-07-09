//ass 29
class Test{
  public static void main(String args[]){
    int tiles_side = 10;
    int tiles_area = tiles_side*tiles_side;

    int floor_len = 800;
    int floor_wide = 900;

    int floor_area = floor_len*floor_wide;
    int total_tiles = floor_area/tiles_area;
    System.out.println(total_tiles);
  }
}