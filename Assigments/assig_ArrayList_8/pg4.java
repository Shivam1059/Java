class Circle{
  private int radious;
  private double area;
  private double circumferece;

  public Circle(int radious){
    this.radious = radious;
  }

  public void setR(int radious){
    this.radious = radious;
  }

  public void Display(){
      area = Math.PI*radious*radious;
      circumferece = 2*Math.PI*radious;
      System.out.println("Area of circle : "+area);
      System.out.println("Circumferenc  of circle : "+circumferece);
  }

}

class Test{
  public static void main(String args[]){
    Circle obj  = new Circle(9);
    obj.setR(4);
    obj.Display();
  }
}