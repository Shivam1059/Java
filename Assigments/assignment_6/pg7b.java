class Test{
  public static void main(String args[]){

    int subarray = 15;
    int arr[] = {1,2,3,4,5,6,7,8,9,10};

    int sum = 0;
    for(int i=0; i<arr.length-1; i++){
         sum += arr[i];
        
         if(sum == subarray){
          System.out.print(arr[i]+" ");
          System.out.print(temp+" ");
         }
      }
      System.out.println();
    
  }
}