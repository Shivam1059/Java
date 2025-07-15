//ass 17
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter  len : ");
    int len = new Scanner(System.in).nextInt();

    System.out.println("Enter  bre : ");
    int bre = new Scanner(System.in).nextInt();

    int parameter_borad = 2*(len+bre);
    System.out.println(" length of ribben : "+parameter_borad);
  }
}