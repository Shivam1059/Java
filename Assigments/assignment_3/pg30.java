import  java.util.Scanner;
class year{
  public  static void main(String args[]){
     Scanner leapY = new Scanner(System.in);
     System.out.println("Enter the year : ");
     int y = leapY.nextInt();

     int leap = y%7;
     if(leap == 2){
      System.out.println("it is leap Year : "+y);
     }else{
      System.out.println("Not a  leap Year : "+y);
     }
  }
}