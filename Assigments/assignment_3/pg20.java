import java.util.Scanner;

class test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter val a : ");
     System.out.println("Enter val b : ");

     int a = sc.nextInt();
     int b = sc.nextInt();

//using bitwish operator
      a = a^b;
      b = a^b;
      a = a^b;

     System.out.println("a : "+a);
     System.out.println("b : "+b);
  }
}