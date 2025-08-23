
import java.util.Scanner;
class TrafficLight{
     private String color;
     private int duration;

     public TrafficLight(String color, int duration){
        this.color = color.toLowerCase();
        this.duration = duration;
     }

     public TrafficLight(){};

     public void setSignal(String color){
      this.color = color.toLowerCase();
     }

     public void setDuration(int duration){
      this.duration = duration;
     }

     
     public void TrafficSignal(){
       switch(color){
         case "red": 
           System.out.println("Signal is "+color+" , Stop "+duration);
           break;
         case "yellow": 
           System.out.println("Signal is "+color+", Ready "+duration);
           break;
         case "Green": 
            System.out.println("Signal is "+color+", go "+duration);
            break;
         default :
            System.out.println(" Enter correct color name : ");
       }
     }
}


class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      TrafficLight obj = new TrafficLight("green", 30);
     obj.TrafficSignal();
     obj.setSignal("yellow");
     obj.TrafficSignal();
     sc.close();
    }
}