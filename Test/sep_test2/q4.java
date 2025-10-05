// . Method Overloading Problem
// 📌 Problem: Area Calculator

// Create a class AreaCalculator with overloaded methods:

// calculateArea(int side) → returns the area of a square.

// calculateArea(int length, int breadth) → returns the area of a rectangle.

// calculateArea(double radius) → returns the area of a circle.
// In main(), demonstrate all three methods.


class  AreaCalculator{
 
   public void calculateArea( int a){
     int area = 4*a;
     System.out.println(" Area of square "+ area);
   }
   public void calculateArea( int a, int b){
     int area = 2*(a+b);
     System.out.println(" Area of rectangle  "+ area);
   }
   public void calculateArea( double radius){
     double area = 2*(3.14F)*radius*radius;
     System.out.println(" Area of circle  "+ area);
   }
}

class main{
  public static void main(String args[]){
    
    AreaCalculator ac1 = new AreaCalculator();
    AreaCalculator ac2 = new AreaCalculator();
    AreaCalculator ac3 = new AreaCalculator();

   ac1.calculateArea(10);
   ac1.calculateArea(10,20);
   ac1.calculateArea(2.00);
  }
}