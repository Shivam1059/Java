import java.util.ArrayList;
import java.util.Scanner;

 
class Library{
   ArrayList<Book> bookList  = new ArrayList<Book>(); 
   
   public void addBook(Book bk){
     bookList.add(bk);
   }
    public void Display(){
     for(Book book : bookList){
        System.out.print(book.displayInfo());
        System.out.println();
     }
  }

}
class Book{
  private String title;
  private String author;
  private int price;

  public Book(String title, String author, int price){
    this.title = title;
    this.author = author;
    this.price = price;
  }
 
  public String displayInfo(){
    return title+": "+author+" : "+price;
  }
}
class ebook extends Book{
   private String title;
   private String author;
   private int price;

  public ebook(String title, String author, int price){
    super(title,author,price);
    this.title = title;
    this.author = author;
    this.price = price;
  }
    public String displayInfo(){
    return title+": "+author+" : "+price;
  }
}

class TestMain{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number of book : ");
      int n = sc.nextInt();
      sc.nextLine();
      Book bk1[] = new Book[n];
      Library lib = new Library();
   
   for(int i=0; i<n; i++){
      System.out.println("Enter the book title : ");
      String title = sc.nextLine();
      System.out.println("Enter the book author : ");
      String author = sc.nextLine();
      System.out.println("Enter the book price : ");
      int price = sc.nextInt();
      sc.nextLine();
     
      bk1[i] = new ebook(title, author, price);
      lib.addBook(bk1[i]);

   }
      lib.Display();

   }
}