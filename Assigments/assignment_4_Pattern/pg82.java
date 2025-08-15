import java.util.Scanner;
class Test{
  public static void main(String ags[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int n = sc.nextInt();


      int k = 0;
      int l = 0;
    for(int i=1; i<=n; i++){
       if(i<=n/2){

          for(int j=0; j<=n-i; j++){
          System.out.print(" ");
        }
           for(int j=1; j<=i+k; j++){
            System.out.print("*");
        }
         
       }else{

         for(int j=0; j<=i; j++){
            System.out.print(" ");
         }
          for(int j=1; j<=i+k-l; j++){
            System.out.print("*");
         }
           l=l+4;
          
       }
        System.out.println();
         k++;
       
        
    }
  }

}  
