import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size : ");
     int n = sc.nextInt();

     for(int i=0; i<n; i++){
      for(int j=0; j<n-i; j++){
        if(i==0){
          char ch = (char)(65+j);
          System.out.print(ch+" ");
        }else{
          if(j==0 || j==n-i-1){
            char ch = (char)(65+j);
            System.out.print(ch+" ");
          }else{
               System.out.print("  ");
          }
        }
         
      }
         System.out.println();
     }
  }
}