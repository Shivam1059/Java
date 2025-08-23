


class Test{
  public static void main(String[] args){
      // int arr[] = {6, -3, -10, 0, 2};
      int arr[] = {2, 3, 4, 5, -1, 0};
      for(int i=0; i<arr.length; i++){
        int product = 1;
        for(int j=0; j<i+1; j++){
            product *= arr[j]; 
        }
           if( product == 120){
            System.out.println("Yes");
           }
      }
  }
}