import java.util.Scanner;
class Test{
  public static void main(String args[]){

    //input
    System.out.println("Enter the quantity : ");
    int quantity = new Scanner(System.in).nextInt();

    if(quantity >= 1000){
      int offer  = (quantity*10)/100;
      int cost = offer*100;
      System.out.println("Total cast after offer : "+cost);
       
    }else{
      int cost = quantity*100;
      System.out.println("Total cost : "+cost);
    }
  }
}