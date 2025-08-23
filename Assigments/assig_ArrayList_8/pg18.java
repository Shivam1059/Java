import java.util.ArrayList;


class Restaurant{
    ArrayList<menu> menu_list = new ArrayList<>();
  //   ArrayList<Rating> rating_list = new ArrayList<>();
  //  public void addRating(Rating r){
  //     rating_list.add(r);
  //  }

    public void additem(menu t){
       menu_list.add(t);
    }
    public void removeitem(menu t){
       menu_list.remove(t);
    }

    public void Display(){
      for(menu m : menu_list){
          m.display();
      }
    }
}
class menu{
   private String item;
   private int prices;
   private int ratings;
   
   public menu(String item, int prices, int ratings){
     this.item = item;
     this.prices = prices;
     this.ratings = ratings;
   }
  
  public void display(){
    System.out.println("Item = "+item);
    System.out.println("Price = "+prices);
    System.out.println("Ratings  = "+ratings);

  }
}

class TestMain{
  public static void main(String[] args){
     Restaurant  ml = new Restaurant();
     menu m1 = new menu("Palak Panir ", 90, 5);
     menu m2 = new menu(" Matar Panir  ", 190, 5);
     menu m3 = new menu("Dal tadka ", 50, 5);
     menu m4 = new menu(" Sev sabji  ", 150, 5);

     ml.additem(m1);
     ml.additem(m2);
     ml.additem(m3);
     ml.additem(m4);
   
    System.out.println("--------------Our Restaurant Menu---------------");
     ml.Display();

     ml.removeitem(m3);
     System.out.println("--------------Our new Restaurant Menu---------------");
     ml.Display();
  }
}