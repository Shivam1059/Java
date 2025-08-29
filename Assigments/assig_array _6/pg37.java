//write a insertion sort method
class Insertion{

  public static void  insertionSort(int arr[]){
   // Start from second element
   // int arr[] = {8,7,1,3,19};
    for(int i=1; i<arr.length; i++){
      int key = arr[i];
      int j = i-1;
   // Start from second element
      while(j >= 0 && arr[j] > key){
         arr[j+1] = arr[j];
         j--;
      }
   // Start from second element
      arr[j+1] = key;
    }
  }

   public static void main(String[] args){
   int arr[] = {8,7,1,3,19};
   System.out.println("after the selection sort ");
    for(int i : arr){
      System.out.print(i+" ");
    }
     insertionSort(arr);

    System.out.println("before the selection sort ");
    for(int i : arr){
      System.out.print(i+" ");
    }
  }
}

