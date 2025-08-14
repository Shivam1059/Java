
class Airplane{

    private int flightNumber;
    private String destination;
    private float departureTime;


    public Airplane(int flightNumber, String destination, float departureTime){
      this.flightNumber = flightNumber;
      this.destination = destination;
      this.departureTime = departureTime;
    }

    // public void  Display(){
    //   System.out.print(flightNumber);
    //   System.out.print(destination);
    //   System.out.print(destination);
    // }

}

class TestMain{
  public static void main(String args[]){
    Airplane al = new Airplane(2345, "Indore", 8);
    float dpartTime = 6.0;
    if(dpartTime == departureTime){
      System.out.print("Status : on Runaway "+ "Not a delay");
    }else{
       System.out.print("Status : not  Runaway "+ "delay");
    }

  }
}