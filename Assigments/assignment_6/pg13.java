class Test{
  public static void main(String[] args){

    int arr[] = {2,3,4,5,2,6,3,7,8};

    for(int i=0; i<arr.length; i++){
       for(int j=i+1; j<arr.length; j++){
          if(arr[i] == arr[j]){
            System.out.println("repeating element :"+arr[j]+" ");
            break;
          }
               
       }

    }

  }
}
