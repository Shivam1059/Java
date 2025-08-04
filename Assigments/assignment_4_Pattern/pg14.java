import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Entert the size : ");
    int size = sc.nextInt();

    int arr[] = new int[size];
    int count = 1;
    for(int i=1; i<=size; i++){
      for(int j=1; j<=i; j++){
           System.out.print(count+ " ");
           count++;
      }
        System.out.println();
    }

  }
}