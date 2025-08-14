import java.util.ArrayList;
import java.util.Scanner;

 
class Library{
   ArrayList<Book> bookList  = new ArrayList<Book>(); 
   
   public void addBook(Book bk){
     bookList.add(bk);
   }
   public void removeBook(Book bk){
     bookList.remove(bk);
   }

    public void Display(){
     for(Book book : bookList){
        System.out.print(book.DisplayBook());
     }
  }

}


class Book{
  private String title;
  private String author;
  private int isbn;

  public Book(String title, String author, int isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }
  //default constructor
  public Book(){};

  public void setT(String title){
    this.title = title;
  }
  public void setA(String author){
    this.author = author;
  }
  public void setI(int isbn){
    this.isbn = isbn;
  }

  public String DisplayBook(){
    return title+": "+author+" : "+isbn;
  }


}

class TestMain{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of book : ");
      int n = sc.nextInt();
      Book bk1[] = new Book[n];
      Library lib = new Library();
   
   for(int i=0; i<n; i++){

      System.out.println("Enter the book title : ");
      String title = sc.nextLine();
      System.out.println("Enter the book author : ");
      String author = sc.nextLine();
      System.out.println("Enter the book ISBA : ");
      int isba = sc.nextInt();
      sc.nextLine();
     
      bk1[i] = new Book(title, author, isba);
      lib.addBook(bk1[i]);

   }



      
      lib.Display();
      
   }
}