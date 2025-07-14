
//rectangle area = len * bre;
//square area = side * side;


import java.util.Scanner;
class Test{
  public static void main(String args[]){
    //shelly
    System.out.println("rectangle len : ");
    int s_len = new Scanner(System.in).nextInt();
    System.out.println("rectangle bre : ");
    int s_bre = new Scanner(System.in).nextInt();
    
    //rachel
    System.out.println("square side : ");
    int r_side = new Scanner(System.in).nextInt();

    double s_gardenArea = s_len*s_bre;
    double r_gardenArea = r_side*r_side;

    double garden  = r_gardenArea-s_gardenArea;
    System.out.println(" how much Bigger garden : "+garden);
  


  }
}