import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    // int ans = 1;
    // int k = 1;
    for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<=n-i; j++){
         System.out.print("*"+" ");
      }
       System.out.println();
      //  ans += k++;
    }
  }
}

