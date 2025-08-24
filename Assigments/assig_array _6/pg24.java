//24. Write a Java program to swap first and last element of an integer 1-d array.

class TestMain{
     public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7,8};
        int n = arr.length;

        System.out.println( "Before of swaping  Array ");
         for(int i=0; i<n; i++){
          System.out.print(arr[i]+" ");
        }
       System.out.println();
        for(int i=0; i<n; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
        }


      System.out.println( "After  swaping  Array ");
        for(int i=0; i<n; i++){
          System.out.print(arr[i]+" ");
        }
     }
}