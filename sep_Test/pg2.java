// 2. Exception Handling Problem

// Bank Withdrawal Simulation

// Create a custom exception InsufficientFundsException.

// Create a class BankAccount with fields: accountNumber, balance.

// Add a withdraw(double amount) method that:

// Throws InsufficientFundsException if the amount > balance.

// Deducts the amount otherwise.

// In main, create an account, attempt withdrawals, and handle the exception gracefully.




import java.util.Scanner;

class Insufficient extends Exception{
    public Insufficient(String msg){
      super(msg);
    }
}


class  BankAccount{
    private int accountNumber;
    private int balance;


    public BankAccount(int accountNumber, int balance){
      this.accountNumber =  accountNumber;
      this.balance = balance;
    }

    public void display(){
        System.out.println(" AccoutNumber : "+accountNumber);
        System.out.println(" Balance  : "+balance);
    }
}


 class TestMain{
    static  void withdrow(int balance, double amount)  throws Insufficient{
         if(amount < balance){
           throw new Insufficient("Balance are insufficent ");
         }
         System.out.println("withdrawal successfully");
   }
  public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);
   BankAccount bk = new BankAccount(12345678, 300);
   bk.display();


   System.out.println("Enter the amount : ");
   int amount = sc.nextInt();


    try{
     withdrow(amount, 300);
    }catch(Insufficient e ){
        System.out.println(" Balance  "+e);
    }
    
  }
}