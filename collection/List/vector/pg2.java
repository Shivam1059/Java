

import java.util.*;
 class Test{
  public static void main(String args[]){
    
    // use granle nature is custom
     Vector<Integer> list = new Vector<>(5, 3);
     System.out.println(list.capacity());
     System.out.println(list.size());

     list.add(10); 
     list.add(20); 
     list.add(30); 
     list.add(40); 
     list.add(50); 
     list.add(60); 
     list.add(70); 
     list.add(80); 
     list.add(90); 

   System.out.println(list);
   System.out.println(list.capacity());
   System.out.println(list.size());

   System.out.println(list.get(4));
   System.out.println(list.remove(6));
   System.out.println(list.set(5, 119));
   System.out.println(list);

  }
 }