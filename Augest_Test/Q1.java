class Check{
    public static boolean  isPrime(int num){
      for(int i=2; i<29; i++){
          if(num%i==0){
            return  false; 
          }
      }
      return true;
    }
}

class TestMain{
   public static void main(String[] args){
     int number = 29;
     boolean result =  Check.isPrime(number);
     if(result == true){
       System.out.print(number + " is a  prime number ");
     }else{
       System.out.print(number + " is a not a  prime number ");
     }
   }
}