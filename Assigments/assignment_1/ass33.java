//ass 33
class Test{
  public static void main(String args[]){
    int garden_len = 30;
    int garden_bre = 20;
    int path_len = 3;
    int path_bre = 4;
    int garden_len_main = garden_len-path_len;//27

    int garden_bre_main = garden_bre-path_bre;
    float  one_garden_len = garden_len_main/2.0f;
    float one_garden_bre = garden_bre_main/2.0f;

    int garden_area = (int)(one_garden_len*one_garden_bre);
    int total_garden_area = 4*garden_area;
    System.out.println(total_garden_area);
  }
}