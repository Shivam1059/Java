

class Insufficient extends Exception{
    public Insufficient(String msg){
      super(msg);
    }
}

 class TestMain{

    static  void withdrow(int balance, int amount)  throws Insufficient{
         if(amount > balance){
           throw new Insufficient("Balance are insufficent ");
         }
         System.out.println("withdrawal successfully");
   }

  public static void main(String args[]){  
    try{
      withdrow(600, 300);
    }catch(Insufficient e ){
        System.out.println(" Balance  "+e);
    }

  }


}
