import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the n : ");
     float n = new Scanner(System.in).nextInt();

      System.out.println("Enter the a : ");
       int a = new Scanner(System.in).nextInt();

      System.out.println("Enter the b : ");
      int b = new Scanner(System.in).nextInt();

    float an = (float)(a + (n-1)*b);
    System.out.println("The 28th term will be "+ an);
    
  }
}