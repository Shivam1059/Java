import java.util.Scanner;

class Product{
  private  int  productId;
  private  String  productName;
  private  int quantity;
  private  float price;

  //setter method
  public  void setId(int productId){
    this.productId = productId;
  }
  public void setNa(String productName){
    this.productName = productName;
  }
  public void setQ(int quantity){
    this.quantity = quantity;
  }
  public void setP(float price){
    this.price = price;
  }

 
   public void getTotal(){
    float total_value = quantity*price;
    System.out.println("Total value : "+total_value);
  }
}


class Tast{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the productId : ");
    int id = sc.nextInt();

    System.out.print("Enter the name : ");
    String name  = sc.next();

    System.out.print("Enter the quantity : ");
    int quantity = sc.nextInt();

    System.out.print("Enter the price  : ");
    float price  = sc.nextInt();

   Product obj = new Product();
   obj.setId(id);
   obj.setNa(name);
   obj.setQ(quantity);
   obj.setP(price);


   obj.getTotal();

  }
}
  //getter method
 