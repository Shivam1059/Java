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

  abstract public void  processOder();
  abstract public void  calcelOder();
  public void productSummary(){
   processOder();
  }
}

class onlineOrder extends order{
   public onlineOrder(int orderId, double amount){
    super(orderId, amount);
   }

   public void processOder(String s){
      System.out.println("Your  order "+s+"  is book ");
   }
   public void calcelOder(String  s ){
        System.out.println("you want to cancel your order"+s);
   }
}
class StorePickupOrder extends order  implements DiscountApplicable{
    public StorePickupOrder(int orderId, double amount){
    super(orderId, amount);
   }

   public void processOder(String s){
      System.out.println("Your  order "+s+"  is book ");
   }
   public void calcelOder(boolean s ){
        boolean flag = true;
        if(flag == s){
          System.out.println("you want to cancel your order"+s);
        }else{
          System.out.println("you want to cancel your order"+s);
        }
   }
   public void DiscountApplicable(){
    System.out.println("If you order 500 rs more that you get Disscont");
   }


}

class TestMain{
  public static void main(String[] args){
     order op = new onlineOrder(10123,500);
    op.processOder("Smartwatch");
    op.calcelOder("y");
   
    StorePickupOrder sp  = new StorePickupOrder(3456787,900);
    sp.processOder("Smart watch , airphone");
    sp.calcelOder("y");
    sp.DiscountApplicable();

  }
}