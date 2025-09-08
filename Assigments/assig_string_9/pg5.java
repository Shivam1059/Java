class Test{
    private  String data ;

    public  Test(String data){
        this.data = data;
    }
   
   public void getSubString(){
      int count = 0;
      for(int i=0; i<data.length(); i++){
         count++;
         if(data.charAt(i) == ' '){
            count = 0;
         }
      }
   }

}


class Main{
   public static void main(String args[]){
      String str = "Dear Student , you have need to work hard";
     
   }
}