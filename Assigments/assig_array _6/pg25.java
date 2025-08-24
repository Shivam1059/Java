//25. Write a Java program to reverse the element of an integer 1-D array. 
import java.util.Scanner;


class TestMain{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the size of array : ");
  int size = sc.nextInt();

  int arr[] = new int[size];

  for(int i=0; i<size; i++){
     arr[i] = sc.nextInt();
  } 
   
  System.out.println(" Array ");
  for(int i=0; i<size; i++){
     System.out.print(arr[i]+" ");
  }   
  System.out.println();


    int start = 0;
    int end = arr.length-1;
       while(start < end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;

            start++;
            end--;
        }  


     System.out.println("After reverse  Array ");
     for(int i=0; i<size; i++){
       System.out.print(arr[i]+" ");
     }   

  }
}