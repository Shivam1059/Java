//37. Write a java progrtam to implement select  sort algorithm 


// class InsertionSort{
//   public void sortArray(int arr[]){
//     for(int i=1; i<arr.length; i++){
//          int key = arr[i];
//          int j = i-1;
//       while(j >= 0 && arr[j] > key){
//         arr[j+1] = arr[j];
//         j = j-1;
//       }
//         arr[j+1] = key; 
//     }

//   }
// }


class InsertionSort{
  public void sortArray(int arr[]){
    for(int i=0; i<arr.length; i++){
         int minIndex = i;
         for(int j = i+1; j<arr.length; j++){
            if(arr[j] < arr[minIndex])
              minIndex = j;
         }
         int temp = arr[minIndex];
         arr[minIndex] = arr[i];
         arr[i] = temp;
    }
  }
}

class Main{
  public static void main(String[] args){
     int arr[] = { 64,25,12,22,11};
     InsertionSort sort = new InsertionSort();
     sort.sortArray(arr);
    for(int i : arr){
      System.out.print(i+" ");
    }


  }
}