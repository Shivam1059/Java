class Test{
  public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    int x = n-1;
    
    for(int i=n; i>0; i--){
        arr[x] = arr[i-1];  
    }
       arr[0]  = x; 

    for(int ele : arr){
      System.out.print(ele+" ");
    }
  }
}