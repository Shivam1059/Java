import java.util.Scanner;
import java.util.ArrayList;
class ProductL{
    ArrayList<Product> p_list = new  ArrayList<>();

    public void addProduct(Product p){
          p_list.add(p);
    }
    public int   getTotalAmount(){
      int Total_Amount = 0;
       for(Product p : p_list){
           Total_Amount +=  p.getAmount();
      }
     return Total_Amount;
    }
    public void  Display(){
      for(Product p : p_list){
          p.display();
          System.out.println();
      }
    }
}

class Product{
    private int pid;
    private int price;
    private int quantity;

    public  Product(int  pid, int price, int quantity){
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
   }
   public int  getAmount(){
     int amount =  price*quantity;
      return amount;
   }
  public void display(){
    System.out.print(" Pid : "+pid);
    System.out.print(", Price  $ : "+price);
    System.out.print(",  Quantity : "+quantity);
  }

}

class Main{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Product number : ");
     int n = sc.nextInt();

     Product arr[] = new Product[n];
     ProductL pl = new ProductL();

     for(int i=0; i<n; i++ ){
      System.out.println("Enter the Product id : ");
        int  pid = sc.nextInt();
      System.out.println("Enter the Product price : ");
        int  p = sc.nextInt();
      System.out.println("Enter the Product quantity : ");
        int  q = sc.nextInt();

        arr[i] = new Product(pid, p, q);
        pl.addProduct(arr[i]);
     }

     pl.Display();
    int totalA = pl.getTotalAmount();
     System.out.print("Total spent amount : "+totalA);
  }
}