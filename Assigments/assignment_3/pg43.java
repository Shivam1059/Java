
import java.util.Scanner;

class user{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the value a : ");
     int a = sc.nextInt();

     System.out.println("Enter the value b : ");
     int b = sc.nextInt();

     System.out.println("choice  any one addtion for '+' , find gretest for '>' , comparesion for '==' ");
     char ch = sc.next().charAt(0);

     if(ch == '+'){
       int ans = a + b;
       System.out.println("final value is "+ans);
     }
    else if(ch == '>'){
      if(a > b){
       System.out.println("final value is "+a);
      }else{
         System.out.println("Graterst value is "+b);
      }
     }
     else if(ch == '='){
        if(a == b){
          System.out.println("Nuber is equal");
        }else{
           System.out.println("Nuber is not equal");
        }
     }
  }
}