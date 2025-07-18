import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    
    // int a = 0;
    int i=1;
    while(i<=n){

      System.out.println(i);
     
      int ans = (n-1)+(n-2);
      System.out.println(ans);
    }
  }
}