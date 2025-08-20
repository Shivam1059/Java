
import java.util.Scanner;

class Test{
  public static void main(String args[]){
      // int a[] = {5,3};
      // int b[] = {1,2,3,4,5};

      int a[] = {6,2};
      int b[] = {85,25,1,32,54,6};
      int count = 0;
     for(int i=0; i<a.length-1; i++){
      for(int j=0; j<b.length-1; j++){
        if(a[i] != b[j]){
          count++;
        }
      }
     }
     System.out.print("Union : "+count);
  }
}