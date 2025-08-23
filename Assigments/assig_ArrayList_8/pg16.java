abstract  class Shape{
        abstract double  area();
        abstract double  parameter();
    
}
class Circle extends Shape{
     private double radious;

     public Circle(double radious){
        this.radious = radious;
     }

     public double area(){
        double area = (double)(Math.PI)*radious*radious;
        return area;
     }
     public double  parameter(){
      double para = 2*(double)(Math.PI)*radious;
      return para;
     }

}
class Reactangle extends Shape{
    private double len;
    private double bre;

    public Reactangle(double len , double bre){
      this.len = len;
      this.bre = bre;
    }

    public double area(){
      double area = len*bre;
      return area;
    }

    public double parameter(){
      double para = 2*(len+bre);
      return para;
    }

}

class Triangle extends Shape{
   private double height;
   private double base ;
   private double len;

   public Triangle(double height, double base , double len){
      this.height = height;
      this.base = base;
      this.len = len;
   }

   public double  area(){
     double area = 0.5*base*height;
     return area;
   }
   public double  parameter(){
     double para = base+height+len;
     return para;
   }
}


class TestMain{
  public static void  main(String args[]){
     Shape react = new Reactangle(5,7);
     System.out.println(" Reactangle area : "+  react.area());
     System.out.println(" Reactangle para : "+ react.parameter());

     Shape cir = new Circle(5);
     System.out.println(" Circle area : "+ cir.area());
     System.out.println(" Circle para : "+cir.parameter());

     Shape tri  = new Triangle(5,7,5);
     System.out.println(" Triangle  area : "+tri.area());
     System.out.println(" Triangle  para : "+tri.parameter());
  }
}