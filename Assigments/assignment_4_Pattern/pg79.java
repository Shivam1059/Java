import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();
  

    for(int i=1; i<=n; i++){
      if(i>n/2){
          for(int j=1; j<=i-n/2; j++){
          System.out.print(" ");
        }
        for(int j=1; j<n-i; j++){
          System.out.print(j);
        }
      }else{
        for(int j=1; j<=n/2-i; j++){
          System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}