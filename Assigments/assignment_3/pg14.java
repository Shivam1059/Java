import java.util.Scanner;

class student{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your marks : ");
     int marks = sc.nextInt();

     if(marks > 90){
       System.out.println(" Grade : A");
     }
     else if(marks > 80 && marks <= 90){
       System.out.println(" Grade : B");
     }
    else if(marks > 60 && marks <= 80){
       System.out.println(" Grade : C");
     }
     else{
       System.out.println(" Grade : D");
     }
   }
}