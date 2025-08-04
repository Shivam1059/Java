import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int num = sc.nextInt();
    
    int reverse = 0;
    while( num>0){
     int  digit  = num%10;
      if(digit == 0 && reverse == 0){
      System.out.print("0");
      }
      reverse = reverse *10 + digit;
      num = num/10;
    }
      System.out.print(reverse);
  }
}