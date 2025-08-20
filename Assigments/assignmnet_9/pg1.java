
class Test{
  public static void main(String[]  args){
     String str = "Java Is Plateform tendnpedent";
    //  String str = "Java is very Simple";
     char[] arr  = str.toCharArray();

      int num = 0, relen = 0;
      for(int i = 0; i<arr.length; i++){
           num = (int)(arr[i]);
           relen++;
           if(num == 32){
              for(int j = relen-1; j>=0; j--){
                 System.out.print(arr[j]);
              }
              //  relen = 0;
           }

      }

  } 
}