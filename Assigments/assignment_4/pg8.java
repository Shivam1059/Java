import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the num : ");
    int n = sc.nextInt();

    int i = 1;
    while(i<= n){
      int a = 2*i;
      System.out.println(a);
      i=a;
    }
  }
}