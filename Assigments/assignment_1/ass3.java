//ass3 
class Test{
  public static void main(String args[]){

    //find out one tiles area;
    int one_Tile_Len = 13;
    int one_Tile_bre = 7;
    int one_Tile_area = one_Tile_Len*one_Tile_bre;

   //find out all cover area:
   int len = 520;
   int bre = 140;
   int cover_area = len*bre;
   int total_Tiles  = cover_area/one_Tile_area;
    System.out.println("Total number of Tiles : "+ total_Tiles);
  }
}