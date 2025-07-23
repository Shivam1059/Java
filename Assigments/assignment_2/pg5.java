
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Total cost : ");
    int total_cost = new Scanner(System.in).nextInt();

    System.out.println("Total rate : ");
    int rate  = new Scanner(System.in).nextInt();

    System.out.println("Total len : ");
    int len  = new Scanner(System.in).nextInt();

    // parameter = 2*(l + b)
    int park_para = total_cost/rate;
    int p = park_para/2;
    int bre = p - len ;

    System.out.println("Park parameter : "+park_para+"  Parak breadth : "+bre);
  }
}