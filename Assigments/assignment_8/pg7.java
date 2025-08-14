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

    public void DisplayCollection(){
        for(Account acc : AccountList){
           System.out.println(acc.Display());
        }
    }

 }


class Account{
    private  int accountNumber;
    private String accountHolder;
    private float balancy;


    public Account(int accountNumber, String accountHolder, float balancy){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balancy = balancy;
    }
    public Account(){};

    public String Display(){
      return accountNumber+" , "+accountHolder+", "+balancy;
    }

}

class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of account : ");
        int n = sc.nextInt();
        Account obj[] = new Account[n];
        Bank alb = new Bank();
        for(int i=0; i<n; i++){
            System.out.println("Enter the A/c : ");
            int ac = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.println("Enter the accountHolder name  : ");
            String name  = sc.nextLine();
            System.out.println("Enter the balancy : ");
            float balancy = sc.nextFloat();
           obj[i] = new Account(ac, name, balancy);
           alb.addAcount(obj[i]);
        }

        alb.DisplayCollection();

    }
}

