import java.util.Scanner;

class dmart{
    public static void main(String args[]){
      Scanner sc  = new Scanner(System.in);
     

      //customer basic information
      System.out.println("Enter your name : ");
      String name = sc.next();
     
    //gender 
      System.out.println("Enter your gender  (m/f): ");
      char g = sc.next().charAt(0);
      String  Geft;
     if(g == 'f'){
       Geft  = "Cadeberry";
     }else{
      Geft = "Ladger_Wallet";
     }

   //carry-bag
     System.out.println("you taken a  Carrybag (y/n): ");
     char bag = sc.next().charAt(0);
     String  CarryBag ;
     int preice = 0;

     if(bag == 'y'){
       CarryBag  = "Yes";
       preice = 10;
     }else{
      CarryBag = "No";
     }
     


    //Enter item name and quantity
    //item 1
      System.out.println("Enter the item-1 name : ");
      String itemName1  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity1 = sc.nextInt();
     
    //item 2
      System.out.println("Enter the item-2 name : ");
      String itemName2  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity2 = sc.nextInt();
    
    //item 3
      System.out.println("Enter the item-3 name : ");
      String itemName3  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity3 = sc.nextInt();
    
    //item 4
      System.out.println("Enter the item-4 name : ");
      String itemName4  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity4 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
     
    //item 5
      System.out.println("Enter the item-5 name : ");
      String itemName5  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity5 = sc.nextInt();
     
    //item 6
      System.out.println("Enter the item-6 name : ");
      String itemName6  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity6 = sc.nextInt();
    
    //item 7
      System.out.println("Enter the item-7 name : ");
      String itemName7  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity7 = sc.nextInt();
     
    //item 8
      System.out.println("Enter the item-8 name : ");
      String itemName8  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity8 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
     
    //item 9
      System.out.println("Enter the item-9 name : ");
      String itemName9  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity9 = sc.nextInt();
      System.out.println("Enter the price  of  item : ");
     
    //item 10
      System.out.println("Enter the item-10  name : ");
      String itemName10  = sc.next();
      System.out.println("Enter the quantity of  item : ");
      int quantity10 = sc.nextInt();
      
 //price 
     int item_p1 = 10;
     int total1 = item_p1 * quantity1;
     int item_p2 = 20;
     int total2 = item_p2 * quantity2;
     int item_p3 = 30;
     int total3 = item_p3 * quantity3; 
     int item_p4 = 40;
     int total4 = item_p4 * quantity4;
     int item_p5 = 50;
     int total5 = item_p5 * quantity5;
     int item_p6 = 60;
     int total6 = item_p6 * quantity6;
     int item_p7 = 70;
     int total7 = item_p7 * quantity7;
     int item_p8 = 80;
     int total8 = item_p8 * quantity8;
     int item_p9 = 90;
     int total9 = item_p9 * quantity9;
     int item_p10 = 100;
     int total10 = item_p10 * quantity10;

//total amount 
float total_amount = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;


//offer 
//1 th
float dis1  = 0f;
if(quantity1 > 4){
   dis1 =  (5/(float)100)*total1;
}
float act_total1 = total1 - dis1 ;

//5 th 
float dis5  = 0f;
   dis5 =  (10/(float)100)*total5;
float act_total5 = total5 - dis5 ;

//10 th 
float dis10  = 0f;
   dis10 =  (15/(float)100)*total10;
float act_total10 = total10 - dis10 ;

//offer
float dis_total_amount = total_amount - (act_total1+act_total5+act_total10);

//discount-totalbill
float dic = 1.0f;
if(dis_total_amount > 10000){
   dic = (15/(float)100)*dis_total_amount;
}else{
   if(dis_total_amount > 5000 || dis_total_amount < 8000){
    dic = (10/(float)100)*dis_total_amount;
   }else{
    dic = dis_total_amount;
   }
}
//total GST
double gst  = 0.10*total_amount;
double total_after_gst = total_amount + gst;
double dic_after_gst = total_amount + gst + preice ;


    // //output
    System.out.println("  \t  \t   \t  D-Mart");
    System.out.println("Name : "+ name + " \t " + "\t"  +   " \t   \t  \t  Date :  12/9/2022");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(  "Item Name \t" + "Quantity \t " + "Price  \t " + "Total \t " + " \t After-Discount ");
    System.out.println(itemName1 + "\t  \t " +quantity1   +"\t  \t " +item_p1+ "\t \t" +total1+" Rs"+ "\t  \t" + act_total1 +" Rs");
    System.out.println(itemName2 + "\t  \t " +quantity2   +"\t  \t " +item_p2+ "\t \t" +total2+ " Rs"+"\t  \t" +  total2 +" Rs");
    System.out.println(itemName3 + "\t  \t " +quantity3   +"\t  \t " +item_p3+ "\t \t" +total3+ " Rs"+"\t  \t" +  total3 +" Rs");
    System.out.println(itemName4 + "\t  \t " +quantity4   +"\t  \t " +item_p4+ "\t \t" +total4+ " Rs"+"\t  \t" +  total4 +" Rs");
    System.out.println(itemName5 + "\t  \t " +quantity5   +"\t  \t " +item_p5+ "\t \t" +total5+ " Rs"+"\t  \t" +  act_total5 +" Rs");
    System.out.println(itemName6 + "\t  \t " +quantity6   +"\t  \t " +item_p6+ "\t \t" +total6+ " Rs"+"\t  \t" +  total6 +" Rs");
    System.out.println(itemName7 + "\t  \t " +quantity7   +"\t  \t " +item_p7+ "\t \t" +total7+ " Rs"+"\t  \t" +  total7 +" Rs");
    System.out.println(itemName8 + "\t  \t " +quantity8   +"\t  \t " +item_p8+ "\t \t" +total8+ " Rs"+"\t  \t" +  total8 +" Rs");
    System.out.println(itemName9 + "\t  \t " +quantity9   +"\t  \t " +item_p9+ "\t \t" +total9+ " Rs"+"\t  \t" +  total9 +" Rs");
    System.out.println(itemName10 + "\t  \t " +quantity10  +"\t  \t "+item_p10+ "\t \t"+total10+ " Rs"+"\t  \t" + act_total10 +" Rs");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" \t  \t   \t  \t A.P " + "\t \t D.P");
    System.out.println(" \t  \t   \t   \t "+total_amount + "\t  "+dis_total_amount);
    System.out.println( "geft "+Geft + "  \t  \t  0.00 " + "\t \t 0.00");
    System.out.println(" Carry Bag "+CarryBag+ " \t \t \t " +preice + " \t \t  "+ preice);
    System.out.println(" GST (10%)  \t  \t  \t  "+gst + "\t  \t  "+gst);
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println(" \t  \t   \t  " + total_after_gst + "\t  \t"+ dic_after_gst +" Rs");
    System.out.println(" \t  \t  Thank you ");
    System.out.println(" \t  \t    To Visit us  ");
    System.out.println(" \t  \t     D-Mart ");
    System.out.println("----------------------------------------------------------------------------------");

    }
}