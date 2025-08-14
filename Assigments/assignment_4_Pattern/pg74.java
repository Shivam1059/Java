import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.print("Ente the number : ");
     int n =  sc.nextInt();
     int k =0;
     for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=n-i-k;j++){
         if(j==1 ||j==n-i-k||i==0){
          System.out.print(j);
         }else{
          System.out.print(" ");
         }
      }
      System.out.println();
      k++;
     }
  }
}