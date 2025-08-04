// import java.util.Scanner;

// class Test{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the start num  : ");
//     int start = sc.nextInt();
//     System.out.println("Enter the end num  : ");
//     int end = sc.nextInt();

//     while(start < end){
//        int n = start;
//        int i = 2;
//        while(n%i != 0){
//        System.out.println("Prime number : "+n);
//         i++;
//        }
//        start++;
//     }

    
//   }
// }

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number n : ");
    int n = sc.nextInt();
    int i = 2;
    boolean code = false;
    
    while(i<=n/2){
      if(n%i == 0){
         code = true;
         break;
      }
      i++;
    }
    if(code){
      System.out.println("Not Prime");
    }
    else{
      System.out.println("it is prime");
    }
     

  }
}