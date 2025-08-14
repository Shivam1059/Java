// import java.util.Scanner;
// class Test{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println(" Enter the number : ");
//     int n = sc.nextInt();

//     for(int i=n; i>0; i--){
//       for(int j=1; j<i; j++){
//          System.out.print(" ");
//       }
//       for(int j=1; j<=n-i; j++){
//         if(j==1||j==n-i||i==1){
//           System.out.print(i);
//         }else{
//           System.out.print("_");
//         }
//       }
//       System.out.println();
//     }
    
//   }
// }

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int n = sc.nextInt();
    for(int i=0; i<=n; i++){
       for(int j=1; j<=i; j++){
        System.out.print(" ");
      }
      for(int j=1; j<=n-i; j++){
        if(j==1||j==n-i||i==0){
         System.out.print(n-i);
        }else{
             System.out.print("_");
        }
        
      }
      System.out.println();
    }
  }
}