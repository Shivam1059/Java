class Test{
  public static void main(String[] args){
    
    // int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
    int arr[] = {-5, 7, -3, -4, 9, 10, -1, 11};

   for(int i=0; i<arr.length-1; i++){
     for(int j=i+1; j<arr.length-1; j++){
         if(arr[j] > 0){
           int  temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          } 
      }
   }  
     for(int i=0; i<arr.length-1; i++){
      System.out.print(arr[i]+" ");
     }
  }
}