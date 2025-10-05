//type of declareation of arryList


import java.util.*;

class TestMain{
  public static void main(String[] args){
      
      //tyep1
      List<Integer> al = new ArrayList<>();  //it’s parent reference → child class of object 
      al.add(20);
      al.add(40);
      al.add(50);

      System.out.println(al);

      //type2
      ArrayList<Integer> al1 = new ArrayList<>(); //type safe and use generic class
      al1.add(10) ;
      al1.add(30) ;
      al1.add(70) ;

      System.out.println(al1);

      //Type3
      ArrayList list  = new ArrayList(); //not type safe ,  it is row type
      list.add(100);
      list.add(200);
      list.add(300);

      System.out.println(list);
    
      //Type 4
     //morden java 9 use to decalre a list ,  it is fixed size , only repacle method is work
      List<String> list1 =  Arrays.asList("Mongeo", "Banana", "Orange", "Grapes", "date");  
      //list1.add("Papaya");  // get exception :  UnsupportedOperationException
      list1.set(2,"Papaya");
      System.out.println(list1);
     

     //Type 5
     //moder java 9 use declare the list , it is fixed size not any method is work on this list
     List<Integer> ls = List.of(2,3,4,5,6,7,8,9);
     //ls.add(90); // give UnsupportedOperationException
     //ls.set(2,90); // give UnsupportedOperationException
     System.out.println(ls);


  }
}