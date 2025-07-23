//LCM
import java.util.Scanner;
class Test{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter a : ");
  int a = sc.nextInt();
  System.out.println("Enter b : ");
  int b = sc.nextInt();

  int la = 0, lb = 0;
  // int i = 1, j = 1;
  // while(i <= a ){
  //   if(a%i == 0){
  //     la = i;
  //   }
  //   i++;
  // }

  // while(j <= b/2){
  //   if(b%j == 0){
  //     lb = j;
  //   }
  //   j++;
  // }

 int g = 0;
  for(int i=1; i<= a; i++){
      if(a%i == 0 && b%i == 0){
        g = i;
      }
  }
   
   int m = a*b/g;
   System.out.println("LCM "+ " : "+ m);
  }
}
