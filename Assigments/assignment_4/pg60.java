import java.util.Scanner;

class Test{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter start num : ");
  int start = sc.nextInt();

  System.out.println("Enter number end : ");
  int end = sc.nextInt();

  while(start < end){
  int n = start;
    int reverse = 0;
    while(n > 0){
      int digit = n%10;
      if(digit == 0  && reverse == 0){
        System.out.print("0");
      }
      reverse = reverse*10 + digit;
      n = n/10;
    }
    System.out.println(reverse);
    start++;
  }

  }
}