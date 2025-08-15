import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number ");
    int n = sc.nextInt();
  
    int k = 0;
    for(int i=1; i<=n; i++){
      for(int j=0; j<n-i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<i+k; j++ ){
         if(j%2==0){
          System.out.print("1");
         }else{
          System.out.print("0");
         }
      }
      System.out.println();
      k++;
    }
  }
}