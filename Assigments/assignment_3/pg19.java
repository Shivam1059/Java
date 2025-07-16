import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value a : ");
     int a  = sc.nextInt();
     System.out.println("Enter the value b  : ");
     int b  = sc.nextInt();

     int temp = a;
      a = b;
      b = temp;

     System.out.println("Value a : "+a);
     System.out.println("Value b : "+b);

  }
}