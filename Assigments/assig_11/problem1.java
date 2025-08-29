//You are building a transportation system for a logistics company.
interface chargeble{
   void chargebleBettry();
}


abstract class vehicle{
    private  String  registration_number;

    public vehicle(String registration_number){
      this.registration_number = registration_number;
    }

   abstract public void start();
   abstract public void stop();
}
class car extends vehicle{
      private  String  registration_number;
      public car(String registration_number){
        super(registration_number);
        this.registration_number = registration_number;
      }

     public void start(){
       System.out.println("Car "+ registration_number+" starting with petrol  engine... ");
     }
     public void stop(){
       System.out.println("Car "+registration_number+  " stopped");
     }
}

class truck extends vehicle{
    private  String  registration_number;
   
    public truck(String registration_number){
      super(registration_number);
      this.registration_number= registration_number;
    }
     public void start(){
       System.out.println("Truck "+registration_number+"  starting with diesel engin... ");
     }
     public void stop(){
       System.out.println("Truck "+registration_number+" stopped");
     }
}
class bike  extends vehicle implements chargeble{
     private  String  registration_number;

     public bike(String registration_number){
      super(registration_number);
      this.registration_number = registration_number;
    }
     public void start(){
       System.out.println("Electric Bike  "+ registration_number+" starting silently..... ");
     }
     public void chargebleBettry(){
       System.out.println("Electric Bike "+registration_number+" battery charging... ");
     }
     public void stop(){
       System.out.println("Electric Bike  "+ registration_number+  " stopped");
     }
}
class eleCar  extends vehicle implements chargeble{
     private  String  registration_number;
     public eleCar(String registration_number){
      super(registration_number);
      this.registration_number = registration_number;
    }
     public void start(){
       System.out.println("Electric car  "+ registration_number+" starting silently..... ");
     }
     public void chargebleBettry(){
       System.out.println("Electric Car "+registration_number+" battery charging... ");
     }
     public void stop(){
       System.out.println("Electric Car "+registration_number+  " stopped.");
     }
}


class TestMain{
  public static void main(String[] args){
      vehicle obj1 = new car("KA01AB1234");
     
      obj1.start();
      obj1.stop();
      vehicle obj2  = new truck("KA02XY9876");
      obj2.start();
      obj2.stop();
      bike obj3 = new bike("KA03EL5678");
      obj3.start();
      obj3.chargebleBettry();
      obj3.stop();
      eleCar obj4 = new eleCar("KA04EV4321");
      obj4.start();
       obj4.chargebleBettry();
      obj4.stop();
  }
}
