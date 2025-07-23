//HCF
import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num a : ");
    int a = sc.nextInt();
    System.out.println("Enter num b : ");
    int b = sc.nextInt();

   int g = 0;
    for(int i=1; i<a; i++){
      if(a%i == 0 && b%i == 0){
         g = i;
      }
    }
    System.out.println(" HCF : "+ g);
  }
}