//factorial
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int first = 0, second = 1;
    int i = 1;
    while(i <= n){
      int next = first + second;
      first = second;
      second = next;
      System.out.println(first);
      i++;
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