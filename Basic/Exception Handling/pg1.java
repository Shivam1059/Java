class Main{
  
  public static int  divide(int a , int b){
      // return a/b ;  //exception

      try{
        return a/b;
      }catch (ArithmeticException e ){
        System.out.println(e);
         return -1;
      }catch (Exception e){
        System.out.println(e);
        return -1;
      }
  }

  public static void main(String args[]){
    int [] numreators = {10, 20, 30, 40};
    int [] denominators = {2, 4, 0, 10};

    for(int i=0; i<numreators.length; i++){
      System.out.println(divide(numreators[i], denominators[i]));
    }
    System.out.println("Good job : ");
  }
}