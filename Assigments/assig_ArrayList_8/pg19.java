
 class Travaltrip{
       ArrayList<flights> f_list = new ArrayList<>();
       ArrayList<hotels> h_list = new ArrayList<>();

       public void bookflight(flights f){
         f_list.add(f);
       }
       public void bookhotels(hotels h){
         f_list.add(h);
       }
       public void cancleflight(flight f){
        
       }
 }
class flights{
    private String flight;

    public flights(String flight){
       this.flights = flights;
    }
    public void display(){
      System.out.print(flight);
    }
}
class hotels{
    private String hotel;

    public hotels(String hotel){
       this.flights = hotel;
    }
    public void display(){
      System.out.print(hotel);
    }
}