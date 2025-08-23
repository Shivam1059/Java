import java.util.Scanner;
// import java.util.Array;

class Test{
    public static int  secondLarget(int arr[]){

      for(int i=0; i<arr.length; i++ ){
        for(int j=i+1; j<arr.length; j++){
          if(arr[i] >  arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
   
      int secondLarget = 0;
      int start = 0;
      int end = arr.length-1;
      while(start <= end){
          if(arr[end] != arr[end -1]){
             secondLarget = arr[end-1];
             break;
          }else if(start==end){
            secondLarget = 0;
          }
         end--;
      }
      return secondLarget;
    }
}

class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the size of array : ");
      int n = sc.nextInt();

      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        System.out.print("Enter the element "+i+ " of array ");
         arr[i] = sc.nextInt();
      }

       int secondLarget =   Test.secondLarget(arr);

         for(int ele : arr){
          System.out.print(ele+" ");
       }

       System.out.println();
     System.out.print("Larget element : "+secondLarget);

   }
}