import java.util.Scanner;

class Parent{
  private int len;
  private int bre;

  public void setData(int len, int bre){
    this.len = len;
    this.bre = bre;
  }

  public int area(){
    int area = len*bre;
    return area;
  }
}
class Child extends Parent{
  private int height ;

  public void setData(int len, int bre, int height){
    setData(len, bre);
    this.height = height;
  }

  public int  volum(){
   int volum = area()*height;
    return volum; 
  }
}

class TestMian{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Child v  = new Child();
    v.setData(10,20,30);
    System.out.println("Area  :"+v.area());
    System.out.println("Volume :"+v.volum());
     
  }
}