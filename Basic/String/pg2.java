//convert  LowerCase  to UpperCase

import java.util.Scanner;

class Test{
   private String data ;

   public Test(String data){
      this.data = data;
   }

     public  String gettoUpperCase(){
      String result = "";
      char arr[] =  data.toCharArray();
         for(char element : arr){
          if(element  >= 'a' && element <='z'){
              element  = (char)(element - 32);
           result += element;
          }else{
            result += element;
          }
       }
         return result;
     }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the any word : ");
     String str = sc.nextLine();
    Test obj =   new Test(str);
    String ans  = obj.gettoUpperCase();
    System.out.print(ans);
    
  }
}