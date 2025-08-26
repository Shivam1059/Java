public class pg1{
  public static void main(String arrgs[]){
    // int a[] = {1,2,4,4,6,3,3,5};
    int a[] = {0,0,0,0,0,0,0,1};
    int n = a.length;
    for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        int k = 1;

    for(int i = 1; i < a.length; i++){
      if(a[i-1] != a[i]){
        a[k] = a[i];
        k++;
      }
    }

    for(int i = 0; i < k; i++){
      System.out.print(" " + a[i]);
    }

    System.out.println();

    int b = 3;
    int largest = a[k-b];
    int smallest = a[b-1];
    System.out.println(largest);
    System.out.println(smallest);
  }
}