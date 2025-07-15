import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Pond len : ");
    int len = new Scanner(System.in).nextInt();

    System.out.println("Pond bre : ");
    int bre = new Scanner(System.in).nextInt();

    System.out.println("Pond hei : ");
    int hei = new Scanner(System.in).nextInt();

    int pond_valum = len*bre*hei;
    System.out.println("Pond of capacity : "+pond_valum);
  }
}