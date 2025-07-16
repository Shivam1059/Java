import java.util.Scanner;

class tax{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the cost of bike : ");
     int cost = sc.nextInt();

     if(cost > 100000){
       System.out.println(" 15% ");
     }
     if(cost > 100000){
       System.out.println(" 15% ");
     }
    else  if(cost > 500000 && cost <= 100000){
       System.out.println(" 10% ");
     }
     else{
        System.out.println(" 5% ");
     }
   }
}