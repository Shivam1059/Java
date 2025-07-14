import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the perimeter of a rectangle : ");
    int para = new Scanner(System.in).nextInt();
   
    System.out.println("Enter the length of a rectangle : ");
    int length = new Scanner(System.in).nextInt();
    
    // perimeter of rectange : 2*(l + b);
    int breadth =  para/2 - length;
    int area = length*breadth;

    System.out.println( " breadth : "+  breadth);
    System.out.println( "  Area : "+  area);
  }
}
