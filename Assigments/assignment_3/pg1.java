import java.util.Scanner;
class Test{
    public static void main(String args[]){
      //input 
      System.out.println("Enter the length : ");
      int length = new Scanner(System.in).nextInt();
      System.out.println("Enter the breadth : ");
      int breadth = new Scanner(System.in).nextInt();

      int square_area = length*breadth;
      //check square or not
      if(length == breadth){
        System.out.println("Square ");
      }else{
             System.out.println("not a square ");
      }
    }
}