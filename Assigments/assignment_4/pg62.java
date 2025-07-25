//Amstrong number
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int m = n;
    int num = m;
    int count = 0;
    double sum = 0;

    while(n > 0){
      int digit = n%10;
      count++;
      n = n/10;
    }
    // System.out.println(count);
    while(m > 0){
      int digit = m%10;
      double  number = Math.pow(digit,count);
      //  System.out.println(number);
      sum = sum + number;
      m = m/10;
    }
    //  System.out.println(" after : "+sum);
    if(sum == num){
      System.out.println("It is amstrong number ");
    }else{
      System.out.println("It is not amstrong number");
    }
  }
}