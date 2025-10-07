import java.util.*;

class Test{
  public static void main(String args[]){
     
     ArrayList<Integer> al = new ArrayList<>();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);
    
    System.out.println(al);
    
    //clone the collection 
     Vector<Integer> vl = new Vector<>(al);
     System.out.println(vl);
     vl.add(50);
     vl.add(600);
     System.out.println(vl);
  }
}