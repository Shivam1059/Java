import java.util.Scanner;
import java.util.Arrays;

class Test{
  public static void main(String [] args){
    int a[] = {3,2,1,7,6,3};
    int b[] = {9,3,5,6,2,8,10};
    int n = a.length+b.length;
    int c[] = new  int [n];
    int k = 0;
    // even numbers of A from left to right are copied into C from left to right. 
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" ");
      if(a[i]%2 == 0){
        c[k++] = a[i];
      }
    }
    System.out.println();
  //All odd numbers of A from left to right are copied into C from right to left.   
    for(int i=0; i<b.length; i++){
      System.out.print(b[i]+" ");
      if(b[i]%2 == 0){
        c[k++] = b[i];
      }
    }
    //All even numbers of B from left to right are copied into C from left to right.
    for(int i=b.length-1; i>=0; i--){
       if(b[i]%2 != 0){
        c[k++] = b[i];
      }
    }
    //All old numbers of B from left to right are copied into C from right to left.
     for(int i=a.length-1; i>=0; i--){
      System.out.print(a[i]+" ");
      if(a[i]%2 != 0){
        c[k++] = a[i];
      }
    }
      System.out.println();

    System.out.print(Arrays.toString(c));

     
  }
}