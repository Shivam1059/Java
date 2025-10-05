import java.util.Scanner;
import java.util.ArrayList;



abstract class libraryitem{
    private int id;
    private String titel;

    public libraryitem(int id, String titel){
       this.id = id;
       this.title = title;
    }

   abstract calculateLateFee(int daysLate){};
}

class Book  extends libraryitem{
   private int id;
   private String titel;

    public Book(int id , String titel){
       super(id, titel);
       this.id = id;
       this.titel = titel;
    }
   
  public  calculateLateFee(){
    System.out.println("Enter the day : ");
    int day = sc.nextInt();
    int latefee = day*2;
    System.out.println("Late fee : "+latefee);
  }

}

class Dvd extends libraryitem{
   private int id;
   private String titel;

   public Dvd(int id, String titel){
      super(id, titel);
      this.id= id;
      this.titel = titel;
   }

   public calculateLateFee(){
      System.out.println("Ente the late day : ");
      int day = sc.nextInt();
      int latefee = day*5;
      System.out.println("Late day : "+latefee);
   }
}


class list{
      ArrayList<book> = ArrayList<>();
      ArrayList<dvd> = ArrayList<>();

     public void  addbook(){
        book.add();
     }

     public void addDvd(){
      dvd.add();
     }

}

class TestMain{
  public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size : ");
      int size = sc.nextInt();

      int  arr[] = new int[size];
   

     
      
  }
}