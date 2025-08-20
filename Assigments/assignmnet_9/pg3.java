class Test{
  public static void main(String args[]){
    String str = "aabbccddd";
    char[] arr = str.toCharArray();

    for(int i=0; i<arr.length-2; i++){
      for(int j=i+1; j<arr.length-1; j++){
         if(arr[i] == arr[j]){
           System.out.print(arr[i]);
         }
      }
    }
  }
}