import java.util.Scanner;
class Test{
  public static void main(String args[]){

     System.out.println("Enter Tiles length : ");
     int length = new Scanner(System.in).nextInt();
     System.out.println("Enter Tiles breadth : ");
     int breadth = new Scanner(System.in).nextInt();

     int tiles_area = length*breadth;

     System.out.println("Enter rectanguler region  len : ");
     int len = new Scanner(System.in).nextInt();
     System.out.println("Enter rectanguler region  bre : ");
     int bre  = new Scanner(System.in).nextInt();

     int rectanguler_region = len*bre;

     //total tiles 
     int Total_Tiles = rectanguler_region/tiles_area;
     
     System.out.println("Total tiles : "+ Total_Tiles);
  }
}