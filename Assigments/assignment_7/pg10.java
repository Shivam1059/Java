import java.util.Scanner;

class Rectangle{
  private int length;
  private int width;

  public void setLe(int length){
    this.length = length;
  }
  public void setW(int width){
    this.width = width;
  }

  public void area(){
    int ans = length*width;
    System.out.println("Rectangle Area : "+ans);
  }
}

class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.print("Enter the length : ");
    int len = sc.nextInt();

    System.out.print("Enter the width: ");
    int width = sc.nextInt();

    Rectangle obj = new Rectangle();
    obj.setLe(len);
    obj.setW(width);

    obj.area();
  }
}