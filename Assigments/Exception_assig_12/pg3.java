import java.util.Arrays;
import java.util.Scanner;

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the size of array : ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    for(int i=0; i<size; i++){
      System.out.print("Enter the array values : ");
        arr[i] =  sc.nextInt();
    }

    for(int i: arr){
      System.out.print(i+" ");
    }
   System.out.println();
   
    try{
      System.out.println("Enter the index to access value of array : ");
      int indx = sc.nextInt();
      System.out.println("Array element : " +arr[indx]);
    }catch(ArrayIndexOutOfBoundsException e){
               e.printStackTrace();
    }
  }
}