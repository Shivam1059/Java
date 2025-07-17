import java.util.Scanner;

class cal{
   public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter perches prices  product  : ");
      System.out.println("Enter selling  prices  product  : ");

      int parches = sc.nextInt();
      int sell = sc.nextInt();

      int  p = parches - sell;

      if( p > parches){
         System.out.println(" You have  gain  Prifit  "+p);
      }else{
           System.out.println("you have  loss of "+p);
      }
   }
}