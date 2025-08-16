import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();

  //uppercase 
    for(int i=1; i<n; i++){
      for(int j=0; j<n-1; j++){
        System.out.print("*");
      }
      for(int j=1; j<=i; j++){
           if(j==i){
            System.out.print(j);
           }
          //  else{
          //   System.out.print("_");
          //  }
       }
        
      System.out.println();
    }
    
    //middel line
      for(int j=1; j<=n; j++){
          System.out.print(j);
      }
      for(int j=n-1; j>0; j--){
          System.out.print(j);
      }
         System.out.println();

  //lower case       
  for(int i=1; i<n; i++){
      for(int j=0; j<n-1; j++){
        System.out.print("*");
      }
      for(int j=n; j>0; j--){
        if(j==n-i){
          System.out.print(j);
        }
        // else{
        //   System.out.print("_");
        // }
      }
       System.out.println();
    }
        
  }
}