// Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear in ascending order while the numbers in array B appear in descending order. Write a java progtam to produce third array C by merging arrays A and B in ascending order.
import java.util.Scanner;
import java.util.Arrays;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int a[] = {3,4,6,7,9,3,4,6};
      int b[] = {5,6,8,9,3,4,7,2};
      int t = a.length+b.length;
      int c[] = new int[t];

     //swap aseciding order
      for(int i=0; i<a.length; i++){
         for(int j=i+1; j<a.length; j++){
            if(a[i] > a[j]){
              int temp = a[i];
              a[i] = a[j];
              a[j] = temp;
            }
         }
      }
      System.out.print("Array1 :  ");
      for(int i=0; i<a.length; i++){
             System.out.print(a[i]+" ");
             c[i] = a[i];
      }
      System.out.println();
     
     //swap desending order
      for(int i=0; i<b.length; i++){
        for(int j=i+1; j<b.length; j++){
           if(b[i] < b[j]){
            int temp = b[i];
            b[i]=  b[j];
            b[j]= temp;
           }
        }
      }
   System.out.print("Array2  : ");
     for(int i=0; i<b.length; i++){
      System.out.print(b[i]+" ");
      c[i+a.length] = b[i];
      
     }
      System.out.println();
  for(int i=0; i<c.length; i++){
    for(int j=0; j<c.length; j++){
        if(c[i] > c[j]){
            int temp = c[i];
            c[i]=  c[j];
            c[j]= temp;
        }   
    }
  }  
    System.out.print(Arrays.toString(c));
    

  
    }
}