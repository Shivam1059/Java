import java.util.Scanner;

class check{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any number : ");
    int num = sc.nextInt();

    if(num%2 == 0){
      System.out.println(num + " Number is even");
    }else{
      if(num == 0){
        System.out.println(num +" Nither even or nor odd");
      }else{
      System.out.println(num + " Number is odd");
      }
    }
  }
}