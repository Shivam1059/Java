

import java.util.Scanner;
import java.util.ArrayList;

class Library{
    ArrayList<Book> bookList = new ArrayList<Book>();

     public void addBook(Book bk){
        bookList.add(bk);
     }

     public void removeBook(Book bk){
      bookList.remove(bk);
     }

     public void Display(){
     for(Book bk : bookList){
         bk.Display();
         System.out.println();
     }
     }
}
 class Book{
    private String bookName;

    public Book(String bookName){
      this.bookName = bookName;
    }

    public void Display(){
       System.out.println(" Book Name : "+bookName);
    }
 }


 class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of book");
       int n = sc.nextInt();
       sc.nextLine();

       Book [] book = new Book[n];
    
       Library lb = new Library();

      for(int i=0; i<n; i++){
          System.out.print((i+1)+ " Enter the book name : ");
          String bookn = sc.nextLine();
  
          book[i] = new Book(bookn);
          lb.addBook(book[i]);
      }
      lb.Display();

      System.out.print("Enter the index if you want to remove this book");
      int index = sc.nextInt();

      for(int i=0; i<n; i++){
         if((i+1) == index) lb.removeBook(book[i]);
      }
      
      lb.Display();

    }
 }