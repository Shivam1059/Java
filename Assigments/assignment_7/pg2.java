import java.util.Scanner;

class book{
    public String title;
    public String author;
    public float price;

    //setter method
    public void setT(String title){
      this.title = title;
    }
    public void setA(String author){
      this.author = author;
    }
    public void setP(float price){
      this.price = price;
    }

    //getter method
    public void display(){
      System.out.println("Book Title : "+title);
      System.out.println("Book author : "+author);
      System.out.println("Book price : "+price);
    }
}

class Test{
  public static void main(String args[]){
    book obj = new book();
    System.out.println("Book Details");
    obj.setT("Discovery of India");
    obj.setA("Mr.Javaharlal Neharu");
    obj.setP(299);

    obj.display();
  }
}