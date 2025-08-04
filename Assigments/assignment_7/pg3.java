import java.util.Scanner;

class bank{
  private long accountNumber;
  private String HolderName;
  private float balance;

  //setter
  public void setAc(long accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setHn(String HolderName){
    this.HolderName = HolderName;
  }
  public void setB(float balance){
    this.balance = balance;
  }

  //getter
  public void display(){
    System.out.println("Ac Balance : "+balance);
  }
}

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you Ac number : ");
    long ac = sc.nextLong();
    System.out.println("Enter you Ac Holder Name : ");
    String name = sc.next();
    System.out.println("Enter you Ac Balance : ");
    float balance  = sc.nextFloat();


    bank obj = new bank();
    obj.setAc(ac);
    obj.setHn(name);
    obj.setB(balance);

   obj.display();
  }
}