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
    System.out.println();
    System.out.println("Enter the element: ");
    int element  = sc.nextInt();
    System.out.println("Enter the position you want to insert : ");
    int index  = sc.nextInt();

   
    System.out.println("after add  element arr ");
    for(int i=0; i<size; i++){
         arr[index] = element;
       System.out.print(arr[i]+" ");
    }

  }
}