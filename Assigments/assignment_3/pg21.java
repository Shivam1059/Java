import java.util.Scanner;

class grater{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the toe digit any random number : ");
      int towdigit = sc.nextInt();

      if(towdigit == 99){
        System.out.println(towdigit + " Number is greatest  number in twodigit");
      }else{
        if(towdigit >= 10 && towdigit <= 98){
          System.out.println("It is not a gratest");
        }else{
          System.out.println("It not towdigit number ");
        }
      }
    }
}