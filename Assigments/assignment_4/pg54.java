import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    // int num = n;

   int i = 1;
   int reverse = 0 ;
   int count = 0;
   int digit = 0;
    while(n > 0){
      digit = n%10;
      reverse =  (reverse*10)+digit;
      count++;
      n = n/10;
      
    }
    int first = reverse%10;
    System.out.println(digit);
    System.out.println(count);
    System.out.println(first);
    System.out.println(reverse);
  }
}