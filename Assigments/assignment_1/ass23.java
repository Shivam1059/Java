//ass23
class Test{
  public static void main(String args[]){
    int  side = 3;
    int cubical_boxes_val = side*side*side;

    int carton_val = 15*9*12;
    int number_of_cubic_box = carton_val/cubical_boxes_val;
    System.out.println("Total Number of cubical boxes : "+number_of_cubic_box);
  }
}