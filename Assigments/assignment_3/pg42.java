
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your total elctricity unit : ");
    float unit = sc.nextInt();
    float   total_electricity_bill = 0;


    if(unit <=  50){
       float newunit = unit*0.50f;
       float surcharge = (20/100.0f)*unit;
       total_electricity_bill = newunit+surcharge;
    }
    else if(unit <=  100 && unit > 50){
       unit = unit*0.75f;
        float surcharge = (20/100.0f)*unit;
       total_electricity_bill = unit+surcharge;
    }
   else if(unit <=  250  && unit > 100){
       unit = unit*1.20f;
        float surcharge = (20/100.0f)*unit;
       total_electricity_bill = unit+surcharge;
    }
    else{
       unit = unit*1.50f;
         float surcharge = (20/100.0f)*unit;
       total_electricity_bill = unit+surcharge;
    }

    System.out.println("Total electricity bill  = "+total_electricity_bill);
  }
}