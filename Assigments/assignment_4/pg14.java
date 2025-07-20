import java.util.Scanner;

class Test{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the table for you want number : ");
    int n = sc.nextInt();
    int m = n*10;
    int i = 1;
    while(i<=n){
      int a = n*i;
      System.out.println(a);
      i++;
    }
  }
}