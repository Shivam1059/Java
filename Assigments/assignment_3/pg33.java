import java.util.Scanner;

class check{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();

    switch(n%2){
      case 0: System.out.println(" Even "); break;
      default: System.out.println("Odd ") ;
    }
  }
}