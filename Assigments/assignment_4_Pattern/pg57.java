import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();

    for(int i=1; i<n; i++){
      for(int j=0; j<n-i; j++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
        System.out.print(i);
      }
      System.out.println();
    }
  }
}