import java.util.Scanner;
class Test{
  public static void main(String args[]){
  System.out.println("Enter the parameter : ");
  int perimiter = new Scanner(System.in).nextInt();

  int side = perimiter/4;
  System.out.println("side of parameter : "+side);
  }
}