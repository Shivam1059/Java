// "Hello 1 world 2 welCome 3"

class TestMain{
  public static void main(String args[]){
    String st = "Hello 1 World 2  wellCome 3" ;
    String [] str = st.split(" ");
    int sum = 0;
    for(int i=0; i<str.length; i++){
      try{
         sum += Integer.parseInt(str[i]);
      }catch(NumberFormatException e){
        //  e.printStacktrace();
      }
       System.out.println(str[i]);
    }


    System.out.println("Sum  "+sum);
  }
}