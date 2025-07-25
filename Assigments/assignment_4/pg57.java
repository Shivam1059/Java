//print table between any two number
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter start number : ");
    int start = sc.nextInt();
    System.out.println("Enter start end : ");
    int end  = sc.nextInt();

    while(start <= end){
       int i = 1;
       System.out.println("table of "+ start);
       while(i <= 10){
          int m = start*i;
          System.out.println(m);
           i++;
       }
       start++;
    }
  }
}