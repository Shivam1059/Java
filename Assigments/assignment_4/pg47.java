import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter nam : ");
    int num = sc.nextInt();
    int reverse = 0;
     while( num != 0){
     int  digit  = num%10;
      reverse = reverse *10 + digit;
      num = num/10;
    }

    if(reverse == num){
        System.out.println("it is palindrom ");
    }else{
         System.out.println("it is not  palindrom ");
    }

  }
}