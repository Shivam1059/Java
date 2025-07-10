//ass 26
class Test{
  public static void main(String args[]){
    int brick_len = 24;
    int brick_bre = 15;
    int breck_area = brick_len*brick_bre;
    // 100 m convert = 120*100 = 12000cm;
    // 2.4m convert = 2.4*100 = 240cm;
    int path_len = 12000;
    int path_bre = 240;

    int path_area = path_bre*path_len;
    int total_brecks_req = path_area/breck_area;
    System.out.println("Total brecks required : "+total_brecks_req);
  }
}