class Test{
   public static  boolean  isPalindrom(int[] str){
        int start = 0;
        int end = arr.length;
        while(start <= end){
           if(str[start] == str[end]){
               start++;
               end--;
           }else{
            return false;
           }
        }
        return true;
    }

  public static void main(String args[]){

    String str = "aaabbbacccababacccaabb";
    char[] arr = str.toCharArray();
    boolean result = isPalindrom(arr);
    System.out.print("result : "+result);
    }
}