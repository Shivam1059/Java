import java.util.Scanner;
import java.util.ArrayList;


 class Bank{
     ArrayList<Account> AccountList = new ArrayList<Account>();

     public void addAcount(Account An){
        AccountList.add(An);
     } 
     public void removeAccount(Account An){
        AccountList.remove( An);
     }

    public void   DisplayCollection(){
        for(Account acc : AccountList){
           acc.Display();
        }
    }
      public Account findAccount(int accNo) {
        for (Account acc : AccountList) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
      }

      public  void  depositMoney(Scanner sc){
        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);

        if(acc != null){
              System.out.print("Enter amount to deposit: ");
              double money = sc.nextDouble();
            acc.deposit(money);
        }else{
            System.out.print("Account not found!");
        }
      }

      public  void  withdrawMoney(Scanner sc){
        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);

        if(acc != null){
              System.out.print("Enter amount to withdraw : ");
            double money = sc.nextDouble();
            acc.withdraw(money);
        }else{
            System.out.print("Account not found!");
        }
      }

 } 


class Account{
    private  int  accountNumber;
    private String accountHolder;
    private double balance;


    public Account(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public Account(){};
   
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public int  getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double money ){
       if(money > 0){
         balance += money;
         System.out.println(" Deposit of $ "+money+ " succesful currrent Balance $ "+ balance);
       }else{
          System.out.println(" Invalid deposit amount!");
       }
    }

    public void withdraw(double money){
        if(money > 0 && money <= balance ){
         balance -= money;
          System.out.println("Withdrow  $ "+money+" Successfully current Balance $ "+balance) ; 
        }else{
            System.out.println("Invalid withdraw amount! ");
        }
    }
    public void   Display(){
        System.out.println("---------------Account Detail---------------------");
        System.out.println("Account Holder : "+accountHolder);
        System.out.println("Account Number  : "+accountNumber);
        System.out.println("Account Balance : "+balance);
    }
}

class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of account that you want to add in you bank : ");
        int n = sc.nextInt();
        Account obj[] = new Account[n];
        Bank alb = new Bank();
        for(int i=0; i<n; i++){
            System.out.println("Enter the A/c : ");
            int ac = sc.nextInt();
            sc.nextLine(); // this lime => consume newline
            System.out.println("Enter the accountHolder name  : ");
            String name  = sc.nextLine();
            System.out.println("Enter the balance : ");
            float balancy = sc.nextFloat();
           obj[i] = new Account(ac, name, balancy);
           alb.addAcount(obj[i]);
        }
        alb.DisplayCollection();

        Account ac = new Account();
        int choice ;
        do{
            System.out.println("1. show  all Account  ");
            System.out.println("2. Deposit Money   ");
            System.out.println("3. Withdrow Money  ");
            int ch = sc.nextInt();
            choice = ch;
           switch(choice){
               case 1 :
                 alb.DisplayCollection();
                break;
               case 2:
                alb.depositMoney(sc);
               break;
               case 3:
               alb.withdrawMoney(sc); 
                break; 
                 default:
                System.out.println(" Invalid choice! Try again.");
            }   
        }
             while(choice > 0 && choice < 4);
              sc.close();
    }
}

