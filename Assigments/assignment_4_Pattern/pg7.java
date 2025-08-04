import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num : ");
    int num = sc.nextInt();

    for(int i=1; i<=num; i++){
      for(int j=1; j<=i; j++){
       if(i%2 != 0){
         System.out.print(1); 
       }else{
         System.out.print(0);
       }
      }
      System.out.println("");
    }

  }
}