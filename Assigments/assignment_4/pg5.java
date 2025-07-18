import java.util.Scanner;

class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println(" Enter number : ");
     int n = sc.nextInt();
 
     int sum = 0;
     int i=1;
     while(i<=n){
        if(i%2 != 0){
          sum = sum + i;
          System.out.println(i);
          
        }
         i++;
     }
     System.out.println("Total odd sum = "+sum);
  }
}