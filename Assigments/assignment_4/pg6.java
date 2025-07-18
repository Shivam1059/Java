import java.util.Scanner;

class check{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number : ");
      int n = sc.nextInt();

      int sum = 0;
      int i = 1;
      while(i<=n){
         if(i%2 == 0){
            sum = sum + i;
            System.out.println(i);
         }
         i++;
      }

      System.out.println("Total sum of even number : "+sum);
    }
}