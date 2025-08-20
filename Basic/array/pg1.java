
import java.util.ArrayList;

class Librarey{
     ArrayList<Book> bookList = new ArrayList<Book>();

    public void addBook(Book bk){
      bookList.add(bk);
    }
    public void removeBook(Book bk){
      bookList.remove(bk);
    }
    public void Display(){
      for(Book bk : bookList){
        System.out.print(bk.display());
      }
    }
}

class Book{
   private  int  bookId;
   private String title;
   private String author;

   public Book(int bookId, String title, String author){
      this.bookId = bookId;
      this.title = title;
      this.author = author;
   }

   public Book(){};

   public String display(){
      return "Book Id : "+bookId+ " Title : "+title+" authore "+author;
   }
}

class Main{
  public static void main(String[] args){

    Librarey lb  = new Librarey();

    Book obj = new Book(1234, "Indian-trade", "Mohan");
    Book obj1 = new Book(1345, "Indian-trade", "Rohan");
    Book obj2 = new Book(1897, "Indian-trade", "Shyam");


    lb.addBook(obj);
    lb.addBook(obj1);
    lb.addBook(obj2);

    lb.Display();
  }
}
