import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("ICE_cream len : ");
    int len = new Scanner(System.in).nextInt();

    System.out.println("ICE_cream bre : ");
    int bre = new Scanner(System.in).nextInt();

    System.out.println("ICE_cream hei : ");
    int hei = new Scanner(System.in).nextInt();

    int volume = len*bre*hei;
    System.out.println("Voluem : "+volume);
  }
}