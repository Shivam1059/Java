//
import java.util.Scanner;
class Test{
  public static void main(String args[]){
   //cube
   System.out.println("Enter the side : ");
   int cube_s = new Scanner(System.in).nextInt();

   System.out.println("Enter the coboid len : ");
   int coboid_l = new Scanner(System.in).nextInt();

   System.out.println("Enter the coboid bre : ");
   int coboid_b = new Scanner(System.in).nextInt();

   System.out.println("Enter the coboid hei : ");
   int coboid_h = new Scanner(System.in).nextInt();

   int cube_v = cube_s*cube_s*cube_s;
   int coboid_v = coboid_b*coboid_h*coboid_l;

   int volue = cube_v-coboid_v;
   System.out.println("More volue : "+volue);
  }
}