import java.util.Scanner;

class student{
  public static void main(String args[]){
     Scanner std = new Scanner(System.in);
    
    System.out.println("Enter the total student : ");
     float total_s =  std.nextInt();
    System.out.println("Enter the total present  student : ");
     float present_s =  std.nextInt();

     float present = (present_s/total_s)*100f;
     System.out.println("Total present student : "+present);
  }
}