import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter start num : ");
    int start   = sc.nextInt();
    System.out.println("Enter end num : ");
    int end   = sc.nextInt();
   
    while(start <= end){
      int i = 1, fac = 1 ;
      System.out.println(" Factor of number : "+ start);
      while( i <= start/2){
         if(start%i == 0){
          System.out.print( i + " , ");
     
         }
         i++;
      }
      System.out.println(start);
      start++;
    }
  }
}