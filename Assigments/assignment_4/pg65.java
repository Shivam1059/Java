import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter start  num : ");
    int start = sc.nextInt();
    System.out.println("Enter end  num : ");
    int end = sc.nextInt();

    while(start < end){
      if(start%2 != 0){
        System.out.println("Odd number : "+start);
      }
      start++;
    }
  }
}