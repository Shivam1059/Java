import java.util.Scanner;
class reverse{
   private String data;
   
   public reverse(String data){
      this.data = data;
   }

  public static String reverseword(Stirng s, int start, int end){
   String reverse = "";
   for(int i = s.length(); i>=0; i-- ){
       reverse += s.charAt(i);
   }
   int st = start;
   int en = end;
   while(st < e){
      reverse += s.charAt(st);
   }
   return reverse;
  }

  public void getReverse(){
    int start = 0;
    String reversedSentence = " ";
       for (int i = 0; i <= data.length(); i++) {
         if (i == data.length() || data.charAt(i) == ' ') {
             reversedSentence += reverseWord(data, start, i - 1);
             if (i != data.length()) {
                 reversedSentence += " "; 
             }
             start = i + 1;
          }
      }
   }
}

class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Sentacnce : ");
      String str = sc.nextLine();

      reverse obj = new reverse(str);
      obj.getReverse();
   }
}