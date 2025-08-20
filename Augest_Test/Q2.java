class Test{
   public static void secondLarget(int arr[]){
    int max = arr[0];
    // int secondLarget = 0;

     for(int i=1; i<arr.length; i++){
        if(max < arr[i]){
          max = arr[i];
        }
     }
     System.out.print(max);
    //  System.out.print(secondLarget);
   }
}

class Main{
  public static void main(String args[]){
     int arr[] = {10,5,20,8,25,3};
     Test.secondLarget(arr);
  }
}