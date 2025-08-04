import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num  : ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      if(i%2 == 0){
        for(int j=n-i; j>0; j--){
          System.out.print(j);
        }
      }else{
         for(int j=1; j<=n-i; j++){
          System.out.print(j);
        }
      }
           System.out.println();
    }
  }
}