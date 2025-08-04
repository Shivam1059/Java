import java.util.Scanner;

class Test{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the num : ");
    int n = sc.nextInt();

    for(int i=0; i<=n; i++){
      for(int j=1; j<=n-i; j++){
          System.out.print(" ");
        }
      for(int j=1; j<=i; j++){
          System.out.print(j);
        }

        System.out.println();
    }
  }  
}