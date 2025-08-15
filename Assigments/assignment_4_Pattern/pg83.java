import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();

    int k=0;
    int l=0;
    for(int i=1; i<=n; i++){
      if(i<=n/2){
        for(int j=0; j<n-i; j++){
          System.out.print(" ");
        }
        for(int j=1; j<=i+k; j++){
          if(j==1||j==i+k){
             System.out.print("*");
          }else{
            System.out.print("_");
          }
        }
      }
        else{
             for(int j=0; j<i; j++){
               System.out.print(" ");
             }
             for(int j=1; j<=i+k-l; j++){
              if(j==1||j==i+k-l){
                 System.out.print("*");
               }else{
                  System.out.print("_");
               }
             }
             l=l+4;
          }
          System.out.println();
          k++;
      }
    }
  }
