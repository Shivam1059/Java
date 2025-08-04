import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
         if(i==n){
           if(j%2 == 0){
             System.out.print(0);
            }else{
               System.out.print(1);
            }
         }else{
          if(j==1 || j==i){
             if(j%2 == 0){
             System.out.print(0);
            }else{
               System.out.print(1);
            }
          }else{
            System.out.print(" ");
          }
         }
      }
      System.out.println();
    }
  }
}