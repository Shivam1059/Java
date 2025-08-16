class Test{
  public static void main(String args[]){
    int subarray = 12;
    int arr[] = {1,2,3,7,5};

    for(int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length-1; j++){
          if(arr[i]+arr[j] == subarray){
            System.out.print(arr[i]);
            System.out.print(arr[j]);
          }
      }
    }
  }
}


