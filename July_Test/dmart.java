import java.util.Scanner;

class dmart{
    public static void main(String args[]){
      Scanner sc  = new Scanner(System.in);
     

      //customer basic information
      System.out.println("Enter your name : ");
      String name = sc.next();
     
      System.out.println("Enter your gender : ");
      String gender = sc.next();

    // //Enter item name and quantity
    // //item 1
      System.out.println("Enter the item-1 name : ");
      String itemName1  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity1 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
      int price1 = sc.nextInt();
      int a = quantity1*price1;
      float total1 = (float)a;

       //discount
      float dis = 1f;
       if(quantity1 > 4){
         dis = (5/(float)100)*total1;
       }
       float after_dis = total1 - dis;

    // //item 2
      System.out.println("Enter the item  name : ");
      String itemName2  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity2 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
      int price2 = sc.nextInt();
          int b = quantity2*price2;
      float total2 = (float)b;
       //discount
      float dis2  = 0;
       if(quantity2 > 5){
         dis2 = (10/(float)100)*total2;
       }
       float after_dis2 = total2 - dis2;

     
    // // //item 10
      System.out.println("Enter the item  name : ");
      String itemName10  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity10 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
      int price10 = sc.nextInt();
       int c  = quantity10*price10;
      float total10 = (float)c;
       //discount
     
      float   d  = (15/(float)100)*total10;
      float  dis10 = d*2;
       float after_dis10 = total10 - dis10;
  

   //


    // //output
    System.out.println("  \t  \t   \t  D-Mart");
    System.out.println("Name : "+ name + " \t " + "\t"  +   " \t   \t  \t  Date :  12/9/2022");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(  "Item Name \t" + "Quantity \t " + "Price  \t " + "Total \t " + " \t After-Discount ");
    System.out.println(itemName1 + "\t  \t " +quantity1   +"\t  \t " +price1+ "\t \t" +total1+" Rs"+ "\t  \t" + after_dis +" Rs");
    System.out.println(itemName2 + "\t  \t " +quantity2   +"\t  \t " +price2+ "\t \t" +total2+ " Rs"+"\t  \t" +  after_dis2 +" Rs");
    System.out.println(itemName10 + "\t  \t " +quantity10  +"\t  \t " +price10+ "\t \t" +total10+ " Rs"+"\t " + dis10 +" Rs");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" \t  \t   \t A.P " + "\t D.P");
    System.out.println(" \t  \t   \t 45000 " + "\t 43500");
    System.out.println(" \t  \t   \t 0.00 " + "\t 0.00");
      System.out.println("----------------------------------------------------------------------------------");

    }
}