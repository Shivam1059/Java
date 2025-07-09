//ass24
class Test{
  public static void main(String args[]){
  int breck_len = 25;
  int breck_bre = 10;
  int breck_heg = 75/10;
  int one_breck_val = breck_len*breck_bre*breck_heg;

  int wall_len = 2000;
  int wall_bri = 200;
  int wall_hei = 75;

  int wall_val = wall_len*wall_bri*wall_hei;
  int num_of_breck = wall_val/one_breck_val;
  int total_cost = num_of_breck*900;

  System.out.println("Total breacks : "+ total_cost);
  }
}