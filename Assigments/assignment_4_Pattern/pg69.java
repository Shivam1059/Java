import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the num : ");
    int n = sc.nextInt();
   
   int k=0;
    for(int i=1; i<n; i++){
      for(int j=1; j<i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=n-i-k; j++){
         System.out.print("*");
      }
      System.out.println();
       k++;
    }
  }
}

  