//error
import java.util.Scanner;
class check{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println("  Enter the character : ");

     char ch = sc.next().charAt(0);
     char letter = sc.next().char();
     switch(ch){
       case 1:
        System.out.println("a");
       case 2:
        System.out.println("e");
       case 3:
        System.out.println("i");
       case 4:
        System.out.println("o");
       case 5:
        System.out.println("e");
        default:
          System.out.print("Not a character ");
     }
  }
}