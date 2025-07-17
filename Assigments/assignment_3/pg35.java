//21
import java.util.Scanner;

class triangle{
   public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the triangle side1 :");
    int side1 = sc.nextInt();
    System.out.println("Enter the triangle side2 :");
    int side2 = sc.nextInt();
    System.out.println("Enter the triangle side3 :");
    int side3 = sc.nextInt();

    int angle = 180;
    int sum = side1+side2+side3;

    if(sum == angle){
      System.out.println(" It is Triangle ");
    }else{
       System.out.println(" It is  not Triangle ");
    }
   }
}