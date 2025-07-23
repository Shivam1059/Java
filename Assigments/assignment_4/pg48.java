import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    int temp = num;

    int digit = 0;
    int sum = 0;
    // int reverse = 0;
    while(num != 0){
      digit = num%10;
      sum  = sum + (digit*digit*digit);
      num = num/10;
     
    }

    if(sum == temp){
      System.out.println("It is Amstrong numbet ");
    }else{
       System.out.println("It is not  Amstrong numbet ");
    }

  }
}