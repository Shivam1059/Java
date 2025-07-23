//prime
import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int n = sc.nextInt();
  
    boolean  status = true;
    int i = 2;
    while( i <= n/2){
      if(n%i == 0){
        status false;
        break;
      }
      i++;
    }

    if(status && n > 1){
      System.out.println("Prime");
    }else{
        System.out.println(" not a Prime");
    }


   

  }
}