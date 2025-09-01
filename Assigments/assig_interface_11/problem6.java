//Problem 5: Smart Home System 🏠
interface SmartDevice{
   void connectWifi();
}

abstract class  Appliance{
   private String name;
   private String power;
  
   public Appliance(String name, String power){
    this.name = name;
    this.power = power;
   }

   public String getName(){
    return name;
   }
   public String getPower(){
    return power;
   }
  public void  showStatus(){
     System.out.println("Current you "+getName()+ "Stauts  is  On ");
  }
  abstract public void  turnOn(String lightOn);
  abstract public void  turnOff(String lightOff);
}

class Fan extends Appliance{
     public Fan(String name, String power){
      super(name,power);
     }

     public void  turnOn(String  fanOn){
          System.out.println(getName()+ " is " +  fanOn);
     }
     public void  turnOff(String  fanOff){
       System.out.println(getName() +" is "+fanOff);
     }

}
class Light extends Appliance implements SmartDevice{
     public Light(String name, String power){
      super(name,power);
     }
     public void  turnOn(String lightOn){
          System.out.println( getName()+ " is : "+lightOn);
     }
     public void  turnOff(String lightOff){
       System.out.println(getName()+" is : "+lightOff);
     }

     public void connectWifi(){
      System.out.println("You are Light is concceted to Wifi");
     }
}

class WashingMachine extends Appliance implements SmartDevice{
     public WashingMachine(String name, String power){
      super(name,power);
     }
    public void  turnOn(String wmOn){

      System.out.println(getName() +" is "+wmOn);
    }
    public void  turnOff(String wmOff){
      System.out.println(getName()+" is " +wmOff);
    }
    public void connectWifi(){
      System.out.println("You are WashingMachine is concceted to Wifi");
     }
}


class TestMain{
  public static void main(String[] args){
    
    Appliance ap = new Fan("Fan",  "Power");
    ap.showStatus();
    ap.turnOn("On");
    ap.turnOff("Off");

    System.out.println();
    Light  lg = new Light("Light", "Power" );
    lg.turnOn("On");
    lg.turnOff("Off");
    lg.connectWifi();
       System.out.println();
    WashingMachine  w = new WashingMachine("WashingMachine", "Power");
    w.turnOn("On");
    w.turnOff("OFF");
    w.connectWifi();
  }
}