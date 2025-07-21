import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int n = sc.nextInt();
    int count = 0;
    int i = 1;
    while(i<=n){
    if( n < 0){
      n = n/10;
      count++;
    }
    i++;
    }
    System.out.println(count);
    
  }
}