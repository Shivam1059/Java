//Write a Java program to find the largest and smallest element of an array.

class TestMain{
    public static void main(String[] args){
       int arr[] = {3,4,6,7,8,2,1,5};

       int max = 0;
       int smallest = arr[0];

       for(int i=0; i<arr.length; i++){
         if(arr[i] > max){
            max = arr[i];
         }
        else if(arr[i] < smallest){
          smallest = arr[i];
        }
       }

       System.out.println("Largest element = "+max);
       System.out.println("Smallest  element = "+smallest);
    }
}