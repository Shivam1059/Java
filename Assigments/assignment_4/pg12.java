import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println("Enter to print N natural number : ");
    int i=1;
    while(i<n){
      System.out.println(i);
      i++;
    }
  }
}