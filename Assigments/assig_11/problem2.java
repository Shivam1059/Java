//Problem 1: Payment Gateway System 💳
Interface refundable{
    void processRefund();
}

abstract class PaymentGetway{
     private  int amount_field;
     public PaymentGetway(int amount_field ){
        this.amount_field = amount_field;
     }
    abstract  public void  payDetails();
    abstract public void  pay();
}

class CriditCardPayment extends implements PaymentGetway{
    private int amount_field;
     public PaymentGetway(int amount_field ){
        super(amount_field);
        this.amount_field = amount_field;
     }
    public String pay(){
      System.out.print("payment is succesfully ");
    }
    public void processRefund(){
       System.out.print("payment is refundable ");
    }
}
class DebitCardPayment{
        private int amount_field;
     public PaymentGetway(int amount_field ){
        super(amount_field);
        this.amount_field = amount_field;
     }
     public String pay(){
         System.out.print("payment is succesfully ");
     }
}
class UPIPayment extends implements PaymentGetway{
        private int amount_field;
     public PaymentGetway(int amount_field ){
        super(amount_field);
        this.amount_field = amount_field;
     }
      public String pay(){
          System.out.print("payment is succesfully ");
      }
      public void processRefund(){
        System.out.print("payment is refundable ");
      }
}

class TestMain{
    public static void main(String[] args){
        PaymentGetway pg = new PaymentGetway(2000);
        pg.CriditCardPayment();
        pg.DebitCardPayment();
        pg.UPIPayment();
    }
}