import java.util.Scanner;

class TestMain{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
   try{
     String str = null;
     System.out.println(str);
     System.out.println("String length : "+str.length());
   }catch(NullPointerException e){
       e.printStackTrace();
   }

  }
}