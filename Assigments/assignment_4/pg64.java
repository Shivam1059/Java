import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number start : ");
    int start = sc.nextInt();
    System.out.println("Enter number end : ");
    int end = sc.nextInt();

    while(start < end){
       if(start%2 == 0){
        System.out.println("Even "+start);
       }
       start++;
    }
    
  }
}