//28. P is one-dimensional array of integers. Write a Java program search for a data VAL from P. If VAL is present in the array then “element found ” otherwise “element not found” should be displayed. 
import java.util.Scanner;


class Search{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

   int arr[] = new int [size];
    for(int i=0; i<size; i++){
        System.out.println(i+" Enter element : ");
        arr[i] = sc.nextInt();
    }
   
    
    for(int i=0; i<size; i++){
       System.out.print(arr[i]+" ");
    }
    System.out.println();

    System.out.print("Enter the element for serach in  arr : ");
    int element = sc.nextInt();

    boolean status = false;
    for(int i=0; i<size; i++){
      if(arr[i] == element){
       status =  true;
      }
    }
    
    if(status){
      System.out.println("Element is found ");
    }else{
        System.out.println("Element is not found ");
    }

    }
}