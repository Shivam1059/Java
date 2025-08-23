import  java.util.Arrays;
class Test{
  public static void main(String args[]){
    int arr[] = {8,3,1,2};
    int maxSum = 0;

    public void swap(int arr[], int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
     
    for(int i=0; i<arr.length; i++){
        // for(int j=i; j<arr.length; j++){
           swap(arr, i, i+1);
        // }
    }

    for(int i : arr){
      System.out.print(arr[i]);
    }
  }
}