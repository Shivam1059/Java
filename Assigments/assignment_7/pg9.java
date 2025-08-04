import java.util.Scanner;

class Circle{
  private int radious;

  //setter
  public void setR(int radious){
    this.radious = radious;
  }

  public void getArea(){
    float r = (float)(radious);
    float area = 3.14f*r*r;   //pir^2
    System.out.println("Cirlce area is : "+area);
  }
  public void getCircumF(){
    float r = (float)(radious);
    float cf = (float)(2)*3.14f*r;
    System.out.println("Circumference 0f circle  : "+cf);
  }
}

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radious value of circle : ");
    int r = sc.nextInt();

    Circle obj = new Circle();
    obj.setR(r);
    obj.getArea();
    obj.getCircumF();
  }
}