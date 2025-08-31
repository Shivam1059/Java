//Problem 4: Banking System 
interface LoanEligible{
   void checkLoanEligibility();
}

abstract class BankAccount{
   private int accountNumber ;
   protected double balance_fields ;
  
  public BankAccount(int accountNumber, double balance_fields){
   this.accountNumber = accountNumber;
   this.balance_fields = balance_fields;
  }

  public int  getAc(){
    return accountNumber;
  }
  // public double  getBf(){
  //   return balance_fields;
  // }
  public void showBalance(){
       System.out.println("--------------Account Details-------");
       System.out.println(" Account Number : "+accountNumber);
       System.out.println(" Balace : "+balance_fields);
  }
  abstract  public void deposit(double money);
  abstract  public void withdrow(double money);
  
}

class SavingAccount extends BankAccount   implements LoanEligible{

    public SavingAccount(int accountNumber, double balance_fields){
      super(accountNumber,balance_fields);
    }
    public void deposit(double money){
      balance_fields =  balance_fields + money;
       System.out.println("Your deposit Rs. "+money+" Successfully");
        showBalance();
    }
    public void withdrow(double money){
       if(balance_fields - money  < 1000){
         System.out.println("Withdrawal denied! Minimum balance of ₹1000 must be maintained");
       }else{
        balance_fields = balance_fields - money;
         System.out.println("withdrew $ "+money+ "form saving Account ");
         showBalance();
       }
    }
    public void checkLoanEligibility(){
      System.out.println("Your are eligible for Loan");
    }

}
class CurrentAccount extends BankAccount{
  

    public CurrentAccount(int accountNumber, double balance_fields){
      super(accountNumber,balance_fields);
    }
     public void deposit(double money){
       balance_fields = balance_fields  + money;
       System.out.println("Your deposit Rs. "+balance_fields+" Successfully");
    }
      public void withdrow(double money){
        balance_fields = balance_fields - money;
         System.out.println(" Balance after deposit : "+balance_fields);
    }
}


class TestMain{
  public static void main(String[] args){
    SavingAccount  bc  = new SavingAccount(12324324, 50000);
    bc.deposit(2000);
    bc.withdrow(100);
    bc.checkLoanEligibility();
       System.out.println("-----------------------");
    BankAccount bc1 = new CurrentAccount(635665456, 75000);
    bc1.deposit(5000);
    bc1.withdrow(5000);
  }
}