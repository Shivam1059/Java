//14) WAP check if a String contains only digits?



class Test{
  public void main(String args[]){
     String str = "123456";
     boolean flag = true; 
     for(int i=0; i<str.length(); i++){
      if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'){
         
      }else{
        flag = false;
      }
     }

     if(true){
      System.out.println("Yes contain only digits");
     }else{
      System.out.println("No it's not cantain digit");
     }

  }
}