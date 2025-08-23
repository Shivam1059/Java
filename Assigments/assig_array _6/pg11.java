class Test{
  public static void main(String args[]){

    // int k  = 6;
    int x = 2;
    int count = 0;
    // int arr[] = {1,5,7,1};
    int arr[] = {1, 1, 1, 1};

    for(int i=0; i<arr.length-1; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i]+arr[j] ==  x){
          count++;
        }
      }
    }

    System.out.print("Count : "+count);
  }
}