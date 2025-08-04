import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number  : ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        int a = 64+j;
        char ch = (char)(a);
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}

