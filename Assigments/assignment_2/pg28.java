import java.util.Scanner;
class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("carpet leng : ");
     int length = sc.nextInt();
     System.out.println("carpet wide : ");
     int wide = sc.nextInt();

     int area = length*wide;
     int rate = area*205;

     System.out.println("Enter rate : "+rate);
  }
}