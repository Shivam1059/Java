import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter nuber : ");
    int n = sc.nextInt();
    int m = n;
   
   int i = 0, sum = 0;
    while(n > 0){
    int   f = 1;
    int digit = n%10;
    while(digit > 0){
      f = f*digit;
      digit--;
    }
    sum += f;
    n = n/10;
    }
  if(sum == m){
    System.out.println("It is strong number ");
  }else{

    System.out.println("It is not strong number ");
  }
   
  }
}