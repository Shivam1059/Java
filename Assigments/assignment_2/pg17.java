import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Park len : ");
    int len = new Scanner(System.in).nextInt();

    System.out.println("Park bre : ");
    int bre  = new Scanner(System.in).nextInt();

    int perimiter = 2*(len+bre);
    int total_dis = perimiter*10;

    System.out.println("Total cover area : "+total_dis);

  }
}