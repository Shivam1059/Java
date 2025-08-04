import java.util.Scanner;

class Phone{
  private  String  brand;
  private String model;
  private int price; 

  //set
  public void setB(String brand){
    this.brand = brand;
  }
  public void setM(String model){
    this.model = model;
  }
  public void setP(int price){
    this.price = price;
  }

  //getter
  public void getPhone(){
    if(price < 20000){
      System.out.print("Phone is affordable");
    }else{
      System.out.print("Phone is expensive");
    }
  }
}

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the phone brand : ");
    String b = sc.next();
    System.out.print("Enter the phone model : ");
    String m = sc.next();
    System.out.print("Enter the phone price : ");
    int  p = sc.nextInt();


    Phone obj = new Phone();
    obj.setB(b);
    obj.setM(m);
    obj.setP(p);
    // int phone = getPhone();
    obj.getPhone();
  }
}