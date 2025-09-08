
// 8) WAP to find out total occurrence of each letter in string.
// 	 Sample Input: “aabbccddd”
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times
class Test{
  public static void main(String args[]){
      String str = "aabbccddd";
      char[] arr = str.toCharArray();

      int a_count = 1;
      int b_count = 1;
      int c_count = 1;
      int d_count = 0;

      for(int i=0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
          if(arr[j] == 'a'){
            if(arr[i] == arr[j]){
               a_count++;
            }
          }else if(arr[j] == 'b'){
              if(arr[i] == arr[j]){
               b_count++;
            }
          }else if(arr[j] == 'c'){
              if(arr[i] == arr[j]){
               c_count++;
              }
            }else{
               if(arr[i] == arr[j]){
                d_count++;
               }
          }
        }
      }
      System.out.println("a - "+a_count+" times");
      System.out.println("b - "+b_count+" times");
      System.out.println("c - "+c_count+" times");
      System.out.println("d - "+d_count+" times");
  }
}