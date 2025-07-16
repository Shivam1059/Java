import java.util.Scanner;

class day{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println(" Enter the any random digit between 1 to 7");
     int digit = sc.nextInt();

     if(digit == 1 ){
       System.out.println("Monday");
     }
    else if(digit == 2 ){
       System.out.println("Tuesday");
     }
    else if(digit == 3 ){
       System.out.println("Wednesday");
     }
    else if(digit == 4 ){
       System.out.println("Thursday");
     }
    else if(digit == 5 ){
       System.out.println("Friday");
     }
    else if(digit == 6 ){
       System.out.println("Saturday");
     }
     else{
       System.out.println("Sunday");
     }
   }
}