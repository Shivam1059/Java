import java.util.Scanner;
class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int a[] = {3,4,6,7,9,3,4,6};
      int b[] = {5,6,8,9,3,4,7,2};
      int t = a.length+b.length;
      int c[] = new int[t];

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
      }
      System.out.println();

      for(int i=0; i<b.length; i++){
        for(int j=i+1; j<b.length; j++){
           if(b[i] < b[j]){
            int temp = b[i];
            b[i]=  b[j];
            b[j]= temp;
           }
        }
      }
   system.out.print("Array2  : ");
     for(int i=0; i<b.length; i++){
      System.out.print(b[i]+" ");
     }
      System.out.println();

  
    }
}