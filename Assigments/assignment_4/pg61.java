//reverse between tow number
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the start  number : ");
    int start  = sc.nextInt();
    System.out.println("Enter the  end number : ");
    int end = sc.nextInt();
  

    while(start <=  end){
      int reverse = 0;
      int m = start;
      while(m > 0){
        int digit = m%10;
        reverse = reverse*10 + digit;
         m  = m/10;
      }
      System.out.println(" reverse number : "+reverse);
      start++;
    }
  }
}