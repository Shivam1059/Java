import java.util.Scanner;

class sign{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value : ");
    int num = sc.nextInt();

    if(num >= 0){
      System.out.println(" +ve ");
    }else{
      System.out.println( " -ve ");
    }
  }
}