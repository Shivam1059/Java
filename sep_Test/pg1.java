// 1. Constructor Problem

// Car Inventory System

// Create a class Car with fields: brand, model, price.

// Implement:

// A default constructor (sets "Unknown" values and price = 0).

// A parameterized constructor to initialize all fields.

// A copy constructor to clone another Car.

// Write a test class to create cars using all three constructors and print their details.

import java.util.Scanner;
class car{
    private String brand;
    private String model;
    private int price;

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

    public void display(){
      System.out.println("Car brand : "+brand);
      System.out.println("Car model : "+model);
      System.out.println("Car price  : "+price);
    }
}


class Test{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the car brand : ");
     String brand = sc.nextLine();
     System.out.println("Enter the car model : ");
     String model = sc.nextLine();
     System.out.println("Enter the car price : ");
     int  price  = sc.nextInt();


     car c = new car(brand,model,price);
     System.out.println("-----------------Car Details-------------");
     c.display();
  }
}