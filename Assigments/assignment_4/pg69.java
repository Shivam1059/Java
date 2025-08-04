import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int st = 100;
    int end = 200;
    int sum = 0;
    while(st <= end){
      if(st%9 == 0){
        System.out.println(st);
        sum += st;
      }
      st++;
    }
    System.out.println("Total sum : "+sum);
  }
}