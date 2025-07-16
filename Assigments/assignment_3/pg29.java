import java.util.Scanner;

class grater{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the three digit any random number : ");
      int fourdigit = sc.nextInt();

      if(fourdigit == 9999){
        System.out.println(fourdigit + " Number is greatest  number in threedigit");
      }else{
        if(fourdigit >= 1000 && fourdigit  <= 9999){
          System.out.println("It is not a gratest");
        }else{
          System.out.println("It not threedigit number ");
        }
      }
    }
}