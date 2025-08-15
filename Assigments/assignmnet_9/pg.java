class convert{
   private string s1;

   public convert(string s1){
       this.s1 = s1;
   }
 
  public String changeUpper(String st){
  String newStr ;
   for(int i=0; i<st.lenght(); i++){
      char ch = st.charAt(i);
      ch = ch-32;
      newStr  = ch;
   }
   return newStr;
  }

}

class Testmain{
  public static void main(String args[]){
     convert obj = new convert("infobeans");
     obj.changeUpper(obj);
      System.out.print(change);
  }
}