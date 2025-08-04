//strong number
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = n;
    int sum = 0 ;
    while( n > 0){
      int digit = n%10;
       int a = 1;
      while(digit > 0){
        a  = a*digit;
        digit--;
      }
       sum += a; 
       n =  n/10;
    }
    System.out.println(sum);
    if(sum == m){
      System.out.println("It is strong number");
    }else{
       System.out.println("It is  not strong number");
    }

  }
}