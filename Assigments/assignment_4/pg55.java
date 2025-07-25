//61
// import java.util.Scanner;

// class Test{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//    System.out.println("Enter n1 = ");
//    int n1 = sc.nextInt();
//    System.out.println("Enter n2 = ");
//    int n2 = sc.nextInt();
    
//    while(n1 <= n2){
//     if(n1%100 == 0){
//       if(n1%400 == 0 && n1%4 == 0){
//         System.out.println(n1 + "is leap year");
//       }
//       }else{
//         if(n1%4 == 0){
//           System.out.println(n1 + "is a leap year");
//         }
        
//       }
//       n1++;
//    } 
//   }
// }


//digit sum 
import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter number : ");
     int n = sc.nextInt();
     int sum = 0;
     while(n > 0){
      int digit = n%10;
      sum = sum + digit;
      n = n/10;
     }
     System.out.println("Total digit sum : "+ sum);
  }
}  