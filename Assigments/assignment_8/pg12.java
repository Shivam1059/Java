import java.util.Scanner;

class Airplane{

    private int flightNumber;
    private String destination;
    private int departureTime;
    private char status;
    


    public Airplane(int flightNumber, String destination, int departureTime, char  status){
      this.flightNumber = flightNumber;
      this.destination = destination;
      this.departureTime = departureTime;
      this.status = status;

    }

    public  String isDelay(){
           if(status =='y'){
              return "delay ";
           }else{
            return " not delay";
           }
    }

    public void getDisplay(){
       System.out.println(" ------Flight Details---------- ");
          System.out.println("Flight number : "+flightNumber);
          System.out.println("Flight Destination : "+destination);
          System.out.println("Flight time  : "+departureTime);
          System.out.println("Flight Status : "+isDelay());
       
    }
}

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the flightNumber : ");
    int flightNumber = sc.nextInt();
    System.out.println("Enter the destionation: ");
    String des = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter the departureTiem : ");
    int time = sc.nextInt();
    System.out.println("Enter the flight delay 'y/n: ");
    char ch = sc.next().charAt(0);

    Airplane al = new Airplane(flightNumber, des, time, ch);

   al.getDisplay();

  }
}