//Problem 1: Payment Gateway System 💳
interface refundable{
    void processRefund();
}

abstract class PaymentGetway{
     private  int amount_field;

     public PaymentGetway(int amount_field ){
        this.amount_field = amount_field;
     }

    abstract  public void  payDetails();
    abstract public void  pay();
};

class CriditCardPayment extends  PaymentGetway implements refundable{
   private int amount_field;
     public CriditCardPayment(int amount_field ){
        super(amount_field);
        System.out.print(amount_field);
     }

    public void pay(){
      System.out.println("Payment of  "+ amount_field+" succesfully ");
    }
    public void payDetails() {
    System.out.println("Payment through Credit Card.");
   }
    public void processRefund(){
       System.out.print("Refound of   "+ amount_field);
    }
}
class DebitCardPayment extends PaymentGetway{
    
     private int amount_field;
     public DebitCardPayment(int amount_field ){
        super(amount_field);
        System.out.print(amount_field);
     }

     public void  pay(){
         System.out.println("Payment is "+amount_field+" succesfully ");
     }
     public void payDetails() {
       System.out.println("Payment through Debit Card.");
     }
}
class UPIPayment extends  PaymentGetway implements refundable{
     private int amount_field;
     public UPIPayment(int amount_field ){
        super(amount_field);
        System.out.print(amount_field);
     }

      public void pay(){
          System.out.println("Payment is " +amount_field+" succesfully ");
      }
      public void payDetails() {
         System.out.println("Payment through UPI .");
      }
      public void processRefund(){
        System.out.println("Refound of  "+amount_field);
      }
}

class TestMain{
    public static void main(String[] args){
        CriditCardPayment obj = new CriditCardPayment(2000);
        obj.pay();
        obj.payDetails();
        obj.processRefund();
       
      
        DebitCardPayment obj1 = new DebitCardPayment(2000);
        obj1.pay();
        obj1.payDetails();
       
        UPIPayment obj2 = new UPIPayment(2000);
        obj2.pay();
        obj2.payDetails();
        obj2.processRefund();
       
     
    }
}