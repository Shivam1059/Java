//ass5

class Test{
  public static void main(String args[]){
    int total_cost = 1600;
    int rate = 25;
    int len = 20;
    // parameter = 2*(l + b)
    int park_para = total_cost/rate;
    int p = park_para/2;
    int bre = p - len ;

    System.out.println("Parak parameter : "+park_para+"/n Parak breadth : "+bre);
  }
}