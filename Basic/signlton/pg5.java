import java.util.ArrayList;

abstract class Library{
  private int id;
  private String title;

  public   Library(int id , String title){
    this.id = id;
    this.title = title;
  }
  
   public int getId(){
    return id;
   }
   public String  getTitle(){
    return title;
   }

  public abstract int   calculateLaatefee(int day);

}

class book  extends Library{

   public book(int id, String title){
    super(id, title);
   }

   public int   calculateLaatefee(int day){
      int latefee = day*2;
      return latefee;
   }
}
class Dvd  extends Library{


   public Dvd(int id, String title){
    super(id, title);
   }
   

   public int  calculateLaatefee(int day){
      int latefee = day*5;
      return latefee;
   }
}

class Test{
  public static void main(String args[]){
    ArrayList<Library> items = new ArrayList<>();
    
    items.add(new book(101, "India"));
    items.add(new book(102, "India"));
    items.add(new book(103, "India"));
    items.add(new Dvd(104, "Atomic habit"));
   for(Library  item : items){
      int  fee = item. calculateLaatefee(5);
         System.out.println("Item: " + item.getTitle() + " (ID: " + item.getId() + ")");
          System.out.println("Late Fee: Rs " + fee + "\n");
   }
  }
}