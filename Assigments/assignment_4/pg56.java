//find the first and last digit of sum  of give by user
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int first = 0;
    int sum = 0;
    int rev = 0;
    int last = 0;
    while(n > 0){
       first = n%10;
      rev = rev*10+ first;
      n = n/10;
    }
    while(rev > 0){
       last = rev%10;
      rev = rev/10;
    }
   sum = first + last ;
    System.out.println(" num : "+first+ ", "+ last +" \n"+"Sum  of fist and last digit : "+ sum);
  }
}