import java.util.Scanner;
 

 class AccountLockedException extends Exception{
     public AccountLockedException(String msg){
        super(msg);
     }
 }
 
 class Atm{
     public void checkpin( int pin) throws AccountLockedException{
      Scanner sc = new Scanner(System.in);
       
       int count = 0;
      boolean valid = true;
      while(valid){
      System.out.println("Enter your pin : ");
      int p = sc.nextInt();
        if(pin==p){
           System.out.println(" it is you pin : "+pin);
           valid = false;
        }
        count++;
        if(count == 3) break;
      }
      
       if(count == 3){
          throw new AccountLockedException("You are enter a wrong pin ");
      }
    }
 }


class Test{
  public static void main(String args[]){
      int  pin = 957585;
 
    try{
          Atm at = new Atm();
         at.checkpin(pin);
    }catch(AccountLockedException  a){
        System.out.println(" thank you "+a);
    }
     
  
  }
}  
