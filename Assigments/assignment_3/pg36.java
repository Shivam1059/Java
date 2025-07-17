import java.util.Scanner;

class check{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number : ");
     int num  = sc.nextInt();
      num = num%10; 

     if(num == 0 || num == 5 ){
      System.out.println("It is divisible by 5");
     }else{
      System.out.println("It is not divisible by 5");
     }
    
  }
}