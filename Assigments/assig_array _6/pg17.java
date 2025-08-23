// //check string is palindrom or not

// class Test{
//   public static boolean isPalindrome(String s1){
//     int end = s1.length()-1;
//     int start = 0;
//     while(start <= end){
//          if(s1.charAt(start) == s1.charAt(end)){
//             start++;
//             end--;
//          }else{
//             return false;
//          }
//     }
//     return true;
//   }

//   public static void main(String[] args){
//     // String s1 = "abcdcba";
//     String s1 = "Alfaiz";
//     boolean result = isPalindrome(s1);
//     if(result){
//       System.out.print("It is palindrom ");
//     }else{
//       System.out.print("It is not palindrom ");
      
//     }
//   }
// }

// class subarray{
//    public String subarray(int arr[]){
//       for(int i=0; i<arr.length; i++){
//         for(int j=i+1; j<arr.length; j++){
//           if(arr[i] + arr[j] == 0){
//             return yes;
//           }
//         }
//       }
//    }
// }
class TestMain{
  public static void  main(String[] args){
     int arr[] = {4,2,-3,1,6};
     String result = "";
       for(int i=0; i<arr.length; i++){
        int sum = 0;
        for(int j=0; j<i+1; j++){
             sum += arr[j];
          }
           if(sum + arr[i] == 0){
            result = "yes";
           } 
        }
      System.out.print(result);
   
  }
}


