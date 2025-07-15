//ass 33
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("garden len : ");
    int garden_len = new Scanner(System.in).nextInt();
    System.out.println("garden bre : ");
    int garden_bre =  new Scanner(System.in).nextInt();

    System.out.println("path  len : ");
    int path_len =  new Scanner(System.in).nextInt();
    System.out.println("path  bre : ");
    int path_bre =  new Scanner(System.in).nextInt();
   
    int garden_len_main = garden_len-path_len;//27

    int garden_bre_main = garden_bre-path_bre;
    float  one_garden_len = garden_len_main/2.0f;
    float one_garden_bre = garden_bre_main/2.0f;

    int garden_area = (int)(one_garden_len*one_garden_bre);
    int total_garden_area = 4*garden_area;
    System.out.println(total_garden_area);
  }
}