import java.util.Scanner;

class student{
  public static void main(String args[]){
    Scanner std = new Scanner(System.in);

    System.out.println("Enter Physics marks : ");
    int Physics = std.nextInt();
    System.out.println("Enter chemistry marks : ");
    int chemistry = std.nextInt();
    System.out.println("Enter Biology  marks : ");
    int Biology = std.nextInt();
    System.out.println("Enter Mathemtics  marks : ");
    int Mathemtics = std.nextInt();
    System.out.println("Enter Computer  marks : ");
    int Computer = std.nextInt();

    int total_marks = Physics+chemistry+Biology+Mathemtics+Computer;
    System.out.println(" Your total marks "+total_marks+" out of 500" );
    float persent = (total_marks/500.0f)*100.0f;

    if(persent >= 90){
      System.out.println("Grade A");
    }
   else if(persent >= 80 && persent < 90 ){
      System.out.println("Grade B ");
    }
   else if(persent >= 70 && persent < 80){
      System.out.println("Grade C");
    }
    else if(persent >= 60 && persent < 70){
      System.out.println("Grade D ");
    }
   else  if(persent >= 40 && persent < 60){
      System.out.println("Grade E");
    }
    else{
      System.out.println("Grade F");
    }

  }
}