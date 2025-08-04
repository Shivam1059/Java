import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the start  number : ");
    int start = sc.nextInt();
    System.out.println("Enter the end  number : ");
    int end = sc.nextInt();

    while(start < end){
      if(start%4 == 0){
        System.out.println("Leap year : "+start);
      }
      start++;
    }
  }
}