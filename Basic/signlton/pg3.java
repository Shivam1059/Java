
// Car Inventory System

// Create a class Car with fields: brand, model, price.

// Implement:

// A default constructor (sets "Unknown" values and price = 0).

// A parameterized constructor to initialize all fields.

// A copy constructor to clone another Car.

// Write a test class to create cars using all three constructors and print their details.



class car{
   private String brand;
   private String model;
   private int  price;



   public car(){
     this.brand = brand;
     this.model = model;
     this.price = price;
   }

   public car(String brand, String model, int price){
    this.brand = brand;
    this.model = model;
    this.price = price;
   }

   public car(car obj){
      this.brand = obj.brand;
      this.model = obj.model;
      this.price  = obj.price;
   }

   public void display(){
    System.out.println("----Car details-----");
    System.out.println("Brand : "+brand);
    System.out.println("Model : "+model);
    System.out.println("Price: "+price);
   }
}

class Test{
  public static void main(String args[]){
    car c = new car("Mahindra", "Scorpio-1",  5800000);
    car c1 = new car("Mahindra", "Scorpio-2",  5800000);
    car c2 = new car("Mahindra", "Scorpio-3",  5800000);

    c.display();
  }
}