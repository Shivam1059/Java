//

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.printf("Enter size of arr : ");
    int size = sc.nextInt();

    int arr[] = new int[size];
    
    for(int i=0; i<size; i++){
      System.out.println("Enter the "+ i + " element  ");
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<size; i++){
      System.out.print(" "+arr[i]);
    }

    System.out.println("Enter the index : ");
    System.out.println("Enter the element  : ");

  }
}