import java.util.Scanner;

class print{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println(" Enter the nuber : ");
      int num = sc.nextInt();

      if(num > 0){
        System.out.println(num +" Postive number ");
      }else{
        if(num == 0){
          System.out.println(num +" Nither postive and nor negative ");
        }else{
          System.out.println(num +" Negative  number ");
        }
      }
   }
}