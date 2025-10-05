 //classcastexception

// import java.util.ArrayList;

// class TestMain{
//   public static void main(String[] args){
//     ArrayList  list = new ArrayList();
//      list.add("Hello");
//     list.add(20);
//     list.add(40);
//     list.add(3.56);

//       System.out.println(list);
//       System.out.println(list.get(0));
//   }
// }




// import java.util.ArrayList;
// class ClassCastExample {
//     public static void main(String[] args) {
//         // Raw ArrayList (no generics)
//         ArrayList list = new ArrayList();

//         // Adding different types of objects
//         list.add("Hello");   // String
//         list.add(100);       // Integer
//         list.add(20.5);      // Double

//         System.out.println("List: " + list);

//         // Now try to retrieve a String but cast wrongly to Integer
//         try {
//             Integer num = (Integer) list.get(0); // ERROR at runtime
//             System.out.println("Number: " + num);
//         } catch (ClassCastException e) {
//             System.out.println("⚠️ ClassCastException caught: " + e);
//         }
//     }
// }


//indexoutofbound exception
import java.util.*;
class Demo{
    public static void main(String args[]){
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);

      System.out.println(list);

      //update
      list.add(2,70); //right shift
        System.out.println(list);

      //replace 
      list.set(3,90);
      System.out.println(list);  

      //remove
      list.remove(3);
      System.out.println(list);

      //indexoutofbound Exception
      list.remove(6);
      System.out.println(list);

    }
}