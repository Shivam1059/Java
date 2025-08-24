import  java.util.Arrays;
class Test{
  public static void main(String args[]){
    int arr[] = {8,3,1,2};
    // public void swap(int arr[], int i, int j){
    //    int temp = arr[i];
    //    arr[i] = arr[j];
    //    arr[j] = temp;
    // }
     
    // for(int i=0; i<arr.length; i++){
    //     // for(int j=i; j<arr.length; j++){
    //        swap(arr, i, i+1);
    //     // }
    // }

    // for(int i : arr){
    //   System.out.print(arr[i]);
    // }

    int maxSum = 0;
    for(int i=0; i<arr.length; i++){
    int currSum = 0;
       for(int j=i; j<arr.length-1; j++){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
       }
       for(int k=0; k<arr.length; k++){
          currSum += arr[k]*k;
       }
       if(currSum > maxSum ){
         maxSum = currSum;
       }
    }
    System.out.print("MaxSum : "+maxSum);
  }
}