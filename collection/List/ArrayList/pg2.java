// import java.util.ArrayList;
// class TestMain{
//     public static void main(String args[]){
//        ArrayList<Integer> al = new ArrayList<Integer>(3); // 10
//        al.add(10);
//        al.add(50);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        System.out.println(al);
//        System.out.println("Total Element : "+al.size());
//        System.out.println(al.contains(50));
//        System.out.println(al.get(4));
       
       
//     }
// }


import java.util.*;

class TestMain{
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>();

        al.add(20);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        // System.out.println(al.get(0));
        // System.out.println(al.remove(1));
        // System.out.println(al.get(2));
        // System.out.println(al);
        System.out.println(al.size());


        
        List<Integer> al1 = new ArrayList<>(al);
        System.out.println(al1);
    
        
    }
}