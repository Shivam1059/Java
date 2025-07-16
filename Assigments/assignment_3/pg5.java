import java.util.Scanner;
class persion{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the person_1 age : ");
      int person_1 = scan.nextInt();
      System.out.println("Enter the person_2 age : ");
       int person_2 = scan.nextInt();
      System.out.println("Enter the person_3 age : ");
      int person_3 = scan.nextInt();

      //check which person youngest
      if(person_1 < person_2 && person_1 < person_3){
        System.out.println("Persion_1 is youngest ");
      }
      else if(person_2 < person_1 && person_1 < person_3){
        System.out.println("Persion_2 is youngest ");
      }else{
        System.out.println("Persion 3 is youngest");
      }
   }
}