import java.util.Scanner;
class Test{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println(" Enter the length : ");
   int length = sc.nextInt();
   System.out.println("Enter the breadth : ");
   int breadth = sc.nextInt();

   int room_area = length*breadth;
   int rate_of_tilling = room_area*5;
   System.out.println("total rate : "+rate_of_tilling );

 }

}