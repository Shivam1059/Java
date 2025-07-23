import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter binary number : ");
    int n = sc.nextInt();
    int m = n;
    int j = 0;
    int sum = 0;
    int  i = 1;

    //count
 
   int reverse = 0 ;
   int count = 0;
    while(m > 0){
    int  digit = m%10;
      count++;
      m = m/10;
    }

    //binary to decimal
    while(i <= count){
      int digit = n%10;
      int num = digit*(int)(Math.pow(2,j));
      System.out.println(num);
      n = n/10;
      sum = sum + num;
      j++;
      i++;
    }

    System.out.println("Binary number =>  "+ sum + " Decimal number ,total count : " + count);

  }


}