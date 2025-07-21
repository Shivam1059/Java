// char
import java.util.Scanner;

class friut{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter friut name : ");
     String friutName = sc.next();

    //  switch(friutName){
    //    case "Mango":
    //     System.out.println("Mango is king of friuts");
    //     break;
    //    case "Banana":
    //     System.out.println("Banana  is yellow  color of friut");
    //      break;
    //    case "Apple":
    //     System.out.println("Apple is red clor  of friut");
    //      break;
    //    case "Grapes":
    //     System.out.println("Grapes is small size of friut");
    //      break;
    //    case "Orange":
    //     System.out.println("Orainge is sweetest of friuts");
    //      break;
    //    default :
    //     System.out.println("Enter the right friuts name : ");
    //  }

    switch(friutName){
       case "Mango" -> System.out.println("Mango is king of friuts");
       case "Banana"-> System.out.println("Banana  is yellow  color of friut");
       case "Apple"->  System.out.println("Apple is red clor  of friut");
       case "Grapes"-> System.out.println("Grapes is small size of friut");
       case "Orange"-> System.out.println("Orainge is sweetest of friuts");
       default -> System.out.println("Enter the right friuts name : ");
     }
     
   }
}