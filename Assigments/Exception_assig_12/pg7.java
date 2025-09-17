import java.util.Scanner;

class Invalidage extends Exception{
      Invalidage(String s){
        super(s);
      }
 }

class TestMain{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the age : ");
     int age = sc.nextInt();

     try{
        if(age < 18){
          throw new Invalidage("Invalid age ");
        }else{
          System.out.print("Valid age ");
        }
     }catch(Invalidage s){
        s.printStackTrace();
     }
  

  }
}