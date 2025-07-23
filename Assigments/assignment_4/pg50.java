import java.util.Scanner;

class Test{
  public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int num = sc.nextInt();

    int even_Count = 0;
    int odd_Count = 0;

    int i = 1;
    while(i <= num){
      if(i%2 != 0){
        System.out.println("odd no : "+ i);
        even_Count++;
      }else{
        if( i%2 >= 0)
         System.out.println("Even no : "+ i);
        odd_Count++;
      }
      i++;
    }

    System.out.println("Total odd number : "+ even_Count);
    System.out.println("Total odd number : "+ odd_Count);
  }
}