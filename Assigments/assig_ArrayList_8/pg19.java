import java.util.ArrayList;


 class TravalBookingSystem{
       ArrayList<flights> f_list = new ArrayList<>();
       ArrayList<hotels> h_list = new ArrayList<>();

      //flights
       public void bookflight(flights f){
         f_list.add(f);
       }
       public void cancleflight(flights f){
        f_list.remove(f);
       }
       public flights findflight(String s){
          for(flights ele : f_list){
             if( ele.getflight(fight).equals(s)){
                   return ele;
             }
          }
          return null;
       }

     //hotels
       public void bookhotels(hotels h){
         h_list.add(h);
       }
       public void canclehotes(hotels h){
        h_list.remove(h);
       }
       public void  findflight(String s){
          for(hotels ele : h_list){
             if( ele.gethotel(hotel).equals(s)){
                  return ele;
             }
          }
          return null;
       }


      public void Display(){
        for(flights f : f_list){
          f.display();
        }
      }
      public void Display(){
        for(hotels h : h_list){
          h.display();
        }
      }
 }
class flights{
    private String flights;

    public flights(String flights){
       this.flights = flights;
    }
    public void getflight(){
      return flights;
    }
    public void display(){
      System.out.print(flights);
    }
}
class hotels{
    private String hotel;

    public hotels(String hotel){
       this.flights = hotel;
    }

    public void gethotel(){
      return hotel;;
    }
    public void display(){
      System.out.print(hotel);
    }
}

class TestMain{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     TravalBookingSystem tp = new TravalBookingSystem();

     flights ft = new fight("Aro india");
     flights ft1 = new fight("Vestara");
     flights ft2 = new fight("Indigo");
     tp.bookflight(ft);
     tp.bookflight(ft1);
     tp.bookflight(ft2);

     hotels ht = new hotels("Taj Hotel");
     hotels ht1 = new hotels("Taj Hotel");
     hotels ht2 = new hotels("Taj Hotel");
     tp.bookhotels(ht);
     tp.bookhotels(ht1);
     tp.bookhotels(ht2);

     tp.Display();

  }
}