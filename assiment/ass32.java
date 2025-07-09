//Assiment 32
class Test{
  public static void main(String args[]){
    //swimming pool
    int pool_side = 25;
    int pool_area = pool_side*pool_side;

    //garden area
    int garden_side = 150;
    int garden_area = garden_side*garden_side;

    int remaning_area_of_garden = garden_area-pool_area;
    System.out.println(remaning_area_of_garden);
  }
}