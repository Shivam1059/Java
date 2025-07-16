import java.util.Scanner;

class check{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the nuber : ");
    int num = sc.nextInt();

    if(num%5 == 0 || num%11 == 0){
      System.out.println("It is divisible : "+num);
    }else{
       System.out.println("It is not divisible "+num);
    }
  }
}