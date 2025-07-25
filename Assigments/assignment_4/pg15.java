//factorial
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    while(n > 0){
      int digit = n%10;
      System.out.println("Foctorial of digit : "+digit);
       int f = 1;
      while(digit > 0){
        f = f*digit;
        digit--;
      }
        System.out.println(f);
        n = n/10;
    }
  }
}

// import java.util.Scanner;
// class Test{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number : ");
//     int n = sc.nextInt();
//     int i = 1;
//     int fac = 1;
//     while(i <= n){
//       fac = fac*i;
//       System.out.println(fac);
//       i++;
//     }
//   }
// }