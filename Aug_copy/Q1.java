import java.util.Scanner;

class Test{
  public static boolean isPrime(int num){

    if(num <= 1) return false;
    if(num == 2) return true;
    if(num %2 == 0) return false;

     for(int i= 3; i<num/2; i++){
         if(num%i==0){
          return false;
         }
     }
         return true;

  }
}


class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 

    System.out.print("Enter the number : ");
    int num = sc.nextInt();


    boolean result =  Test.isPrime(num);
    if(result){
      System.out.print(num + " is a Prime number ");
    }else{
      System.out.print(num + " is not a Prime number ");
    }

  }
}