import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<=i; j++){
        int a = 65+j; 
        char ch = (char)(a);
        System.out.print(ch+" ");
      }
      System.out.println();
    }
  }
}