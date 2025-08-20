//check string is palindrom or not

class Test{
  public static boolean isPalindrome(String s1){
    int end = s1.length()-1;
    int start = 0;
    while(start <= end){
         if(s1.charAt(start) == s1.charAt(end)){
            start++;
            end--;
         }else{
            return false;
         }
    }
    return true;
  }

  public static void main(String[] args){
    String s1 = "abcdcba";
    boolean result = isPalindrome(s1);
    System.out.println(result);
  }
}