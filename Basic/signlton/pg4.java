class InsufficientFundsException extends Exception{
  public InsufficientFundsException(String s){
    super(s);
  }
}

class BankAccount{
    private int accNo;
    private double   balance;

    public BankAccount(int accNo, double balance){
      this.accNo = accNo;
      this.balance = balance;
    }

    public void withdrow(double amount) throws InsufficientFundsException{
        if(amount > balance){
          throw new InsufficientFundsException("Withdrowal failed , insufficient found "+balance);
         
        }else{
          balance  -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        }
    }

    public double getbalance(){
      return balance;
    }
}

class Test{
  public static void main(String args[]){
    BankAccount account = new BankAccount(12345678, 900);
    try{
      account.withdrow(100);
    }catch(InsufficientFundsException e){
       System.out.println(" Exception caught : "+e.getMessage());
    }
  }
}