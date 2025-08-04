import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the num : ");
    int n = sc.nextInt();

    for(int i=0;i<n; i++){
      for(int j=0; j<n-i; j++){
        if(i==0){
          System.out.print(n);
        }else{
          if(j==0 || j == n-i-1){
                System.out.print(n-i);
          }else{
              System.out.print(" ");
          }
        }
      }
          System.out.println();
    }
  }
}