//23. Write a Java program to find the sum and average of one dimensional integer array. 
class Test{
  public static void main(String[] args){
     int[] arr = {1,2,4,5,6,8,9};
                   
    int sum = 0;
    for(int i=0; i<arr.length; i++){
       sum += arr[i];
    }     
    int average = sum/arr.length;
    System.out.println("Sum : "+sum);        
    System.out.println("Average : "+average);        
  }
}