 import java.util.Scanner;

  class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the  number : ");
      int n = sc.nextInt();

      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
          if(i==n){
            System.out.print(j);
          }else{
            if( j==1 ||  j==i){
              System.out.print(j);
            }else{
                  System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }
  }