import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter name : ");
    String name  = sc.next();
    int n  = name.length();
   int start = 0;
   int end = n-1;

   while(start == end){
       System.out.println(" Total count ");
       start ++;
       end --;
   }

  }
}