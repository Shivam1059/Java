import java.util.Scanner;

class Test{
  public static void main(String args[]){
    
    System.out.println("Enter rectangular plot len :");
    int len = new Scanner(System.in).nextInt();

    System.out.println("Enter rectangular plot bre :");
    int bre  = new Scanner(System.in).nextInt();

    int area = len*bre;
    int cost_of_tiling = area*6;

    System.out.println("Cost of tiling : "+cost_of_tiling);

  }
}