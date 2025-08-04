import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=n; j>=i; j--){
        int a = 70-i;
        char ch = (char)(a);
        System.out.print(ch);
      }
       System.out.println();
    }
  }
}