import java.util.Scanner;

class grater{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the three digit any random number : ");
      int threedigit = sc.nextInt();

      if(threedigit == 999){
        System.out.println(threedigit + " Number is greatest  number in threedigit");
      }else{
        if(threedigit >= 100 && threedigit  <= 998){
          System.out.println("It is not a gratest");
        }else{
          System.out.println("It not threedigit number ");
        }
      }
    }
}