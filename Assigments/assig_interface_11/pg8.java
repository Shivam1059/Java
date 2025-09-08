//Problem 7: E-commerce Order System 🛒
interface DiscountApplicable{
  void applyDiscount();
}
abstract class order{
  private int orderId;
  private double amount;

  public order(int orderId , double amount){
   this.orderId = orderId;
   this.amount = amount;
  }

  public double  getAmount(){
    return amount;
  }
  public void   setAmount(double amount){
    this.amount = amount;
  }
  abstract public void  processOder(String s);
  abstract public void  calcelOder(String s);
  public void productSummary(){
  //  processOder();
  }
}
class onlineOrder extends order implements  DiscountApplicable{
  // private int amount;
   public onlineOrder(int orderId, double amount){
    super(orderId, amount);
   }

   public void processOder(String s){
      System.out.println("Your  order "+s+"  is booked ");
   }
   public void calcelOder(String  s ){
       System.out.println("you want to cancel your order "+s);
   }
  public void applyDiscount(){
    if(getAmount() > 100){
       setAmount((getAmount()-(getAmount()*(10/100))));
    System.out.println("you are order more 100 rs so");
    System.out.println(" you get a discount  on product Rs."+getAmount());
    }else{
      System.out.println("You are not eleigble for discount");
    }
   }
}
class StorePickupOrder extends order{
    public StorePickupOrder(int orderId, double amount){
    super(orderId, amount);
   }

   public void processOder(String s){
      System.out.println("Your  order "+s+"  is book ");
   }
   public void calcelOder(String s ){
        System.out.println("you want to cancel your order"+s);
   }
}

class TestMain{
  public static void main(String[] args){
    onlineOrder op = new onlineOrder(10123,500);
    op.processOder("Smartwatch");
    op.calcelOder("No");
    op.applyDiscount();
   
    StorePickupOrder sp  = new StorePickupOrder(3456787,900);
    sp.processOder("Smart watch , airphone");
    sp.calcelOder("y");

  }
}