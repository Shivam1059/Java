//float problem

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println(" breck len : ");
    int length = new Scanner(System.in).nextInt();
    System.out.println(" breck bre : ");
    int breadth = new Scanner(System.in).nextInt();
    System.out.println(" breck height  : ");
    float height = new Scanner(System.in).nextInt();
    int area = length*breadth*(int)height;


    System.out.println(" wall len : ");
    int wall_len = new Scanner(System.in).nextInt();
    System.out.println(" wall bre : ");
    int wall_bre = new Scanner(System.in).nextInt();
    System.out.println(" wall height  : ");
    float wall_height = new Scanner(System.in).nextInt();
    int wall_area = (wall_len*100)*(wall_bre*100)*((int)wall_len*100);

    int brecks = wall_area/area;
    int cost = brecks*900;
    System.out.println("Cost of buil wall : "+cost);

    



  }
}