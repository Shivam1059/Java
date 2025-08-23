
// import java.util.Arrays;
class Test{
  public static void main(String args[]){


  int arr[] = {2,3,1,2,3,4,5,4};

    for(int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length-1; j++){
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for(int i=0; i<arr.length-1; i++){
      System.out.print(arr[i]+" ");
    }
    // for(int element : arr){
    //   System.out.print(arr[element]+" ");
    // }
    // System.out.println(Arrays.toString(arr));
  }
}