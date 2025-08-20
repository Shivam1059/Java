import java.util.Scanner;
import java.util.ArrayList;

class Library{
     ArrayList<String> book_list = new ArrayList<String>();

     public void  addBook(Book bk){
        book_list.add(bk);
     }
     
     public void  removeBook(Book bk){
      book_list.remove(bk);
     }

     public String  Display(){
        for(Book ele : book_list){
         System.out.println( ele.display());
        }
     }
}

class Book{
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author){
       this.id = id;
       this.title = title;
       this.author = author;
    }

    public String  display(){
      return "Book id : "+id+ " Title : "+title+" Authore : "+author;
    }
}

class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Library lb = new Library();

      Book obj = new Book(1234, "Indian_China Trade ", "Ajay");
      Book obj1 = new Book(1345, " Trade-war ", "Rohan");
      Book obj2 = new Book(1456, " New Indian ", "Devaj");

      lb.addBook(obj);
      lb.addBook(obj1);
      lb.addBook(obj2);
       
      lb.Display();
  }
}