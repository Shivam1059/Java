import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the n : ");
    int n = new Scanner(System.in).nextInt();
    // float n = 28 , sn ;
    System.out.println("Enter the a : ");
    int a = new Scanner(System.in).nextInt();
    System.out.println("Enter the b : ");
    int d  = new Scanner(System.in).nextInt();
 
    float  sn = (float)(n/2*(2*a+(n-1)*d));
    System.out.printf("The sum upto 28th term will be %.0f ", sn);
  }
}