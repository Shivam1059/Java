import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter n number of terms :  ");
    int n = sc.nextInt();

    int sum = 0;
    int i = 1;
    while(i<=n){
      sum = sum + i;
      System.out.println(i);
      i++;
    }
    System.out.println(sum);
  }
}