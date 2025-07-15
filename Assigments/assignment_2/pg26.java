import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of bricks : ");
    int length = sc.nextInt();
    System.out.println("Enter the breadth of bricks : ");
    int breadth = sc.nextInt();
    int  breck_area = length*breadth;

   System.out.println("Path len : "); 
   int path_len = sc.nextInt();
   System.out.println("Path bre : "); 
   int path_bre = sc.nextInt();
   int path_area = (path_len*100)*(path_bre*100);

   int total_bricks = path_area/breck_area;
   System.out.println("Total bricks : "+total_bricks);

  }
}