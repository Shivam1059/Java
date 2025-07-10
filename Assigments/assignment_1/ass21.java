//ass21
class Test{
  public static void main(String args[]){
      int bick_len = 15;
      int bick_bre = 8;
      int bick_hei = 5;
      int val_brecks = bick_len*bick_bre*bick_hei;

      int wall_len = 15;
      int wall_bri = 10;
      int wall_hei = 8;
      int val_wall = wall_len*wall_bri*wall_hei;

      int total_breck = val_wall/val_brecks;
      System.out.println("Total number of bricks : "+total_breck);
  }
}
