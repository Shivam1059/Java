//ass 15
class Test{
   public static void main(String args[]){
    //rectangle garden
     int Shelly_garden_len  = 22;
     int Shelly_garden_bre  = 15;
     int Shelly_garden_area = Shelly_garden_len*Shelly_garden_bre;

     //square garden
     int Rachel_garden_side  = 21;
     int Rachel_garden_area = Rachel_garden_side*Rachel_garden_side;
     int garden_bigger = Rachel_garden_area-Shelly_garden_area;

    System.out.println("Garden bigger : "+garden_bigger);
    
   }
}
