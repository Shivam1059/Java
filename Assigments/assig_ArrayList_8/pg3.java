class Rectangle{
  private int width;
  private int height;
  private float area;
  private float perimeter;

//constructor
  public   Rectangle(int width, int height){
      this.width = width;
      this.height = height;
  }

  public void setW(int width){
     this.width = width;
  }
  public void setH(int height){
     this.height = height;
  }

  public void Display(){
    area = width * height;
    perimeter = (2*(width + height));
    System.out.println("Reactangle area : " +area);
    System.out.println("Parameter of Reactangle : "+ perimeter);
  }
}


class Test{
  public static void main(String args[]){
    Rectangle obj = new Rectangle(10, 20);
    obj.setW(5);
    obj.setH(4);
    obj.Display();
  }
}