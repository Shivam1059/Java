
class PG11 {

     public int  m1(int[] arr){
      int n = arr.length -1;
        int max = 0;
        int min = 0;
        for(int i = 0 ; i <n ; i++){
           if(arr[i] > max){
             max = arr[i];
           }
           else if(arr[i]<min){
              min = arr[i];
           }
           else{
              return -1;
           }
           
        }
        System.out.println(max);
        System.out.println(min);
        return max;
     }

     public static void main(String args[]){
         int[] arr = {1,44,2,1,5};
         PG11 b1 = new PG11();
         b1.m1(arr);
     }
     
}