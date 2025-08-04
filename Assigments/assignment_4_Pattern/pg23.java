import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if(i==n){
          int a = 96+j;
          char ch = (char)(a);
          System.out.print(" "+ch);
        }else{
          if(j==1 || j==i){
               int a = 96+j;
          char ch = (char)(a);
          System.out.print(" "+ch);
          }else{
              System.out.print("  ");
          }
        }
      }
      System.out.println();
    }
  }
}