
import java.util.Scanner;
import java.util.ArrayList;

class Inventory{
   ArrayList<Product> p_list = new  ArrayList<Product>();

   public void addP(Product p){
     p_list.add(p);
   }

   public void removeP(Product p){
     p_list.remove(p);
   }
   public void Display(){
      for(Product p : p_list){
          p.display();
          System.out.println();
      }
   }
   
}

class Product{
   private String product_name;
   private String quality;
   private int quantity;

   public Product(String product_name, String quality, int quntity){
      this.product_name = product_name;
      this.quality = quality;
      this.quantity = quantity;
   }

   public void  display(){
      System.out.print(product_name + " ");
      System.out.print(quality+" ");
      System.out.print(quantity+" ");
   }
}

class TestMain{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of Product ");
     int n = sc.nextInt();
     sc.nextLine();
     Product arr[] = new Product[n];
     Inventory p_list = new Inventory();

     for(int i=0; i<n; i++){
          System.out.println("Enter the product name : ");
          String p = sc.nextLine();
          sc.nextLine();
          System.out.println("Enter the product quality : ");
          String qual = sc.nextLine();
          System.out.println("Enter the product quantity: ");
          int q  = sc.nextInt();
          sc.nextLine();

          arr[i] = new Product(p,qual,q);
          p_list.addP(arr[i]);
     }
        p_list.Display();

        System.out.println("Enter the product index that want to remove : ");
        int index  = sc.nextInt();

        System.out.print("After remove one product update list od Product ");
         for(Product p : p_list){
            if(p == index)  p_list.removeP(p);
         //  p.display();
          System.out.println();
      }
       
   }
}