//Comparator interface 


import java.util.*;

 //compare method use below concept ot compare the values 
  // 0 both value is equal
  // + postive  o1 is grater o2 is small -> o2 first and o1 leter
  // - negative  o2 is grater o1 is small -> o1 first and o2 leter

class StringlengthComparator implements Comparator<String>{
   public int compare(String s1, String s2){
     return s1.length() - s2.length();
   }
}

class MyComparator implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
      // return o1 - o2;
      return o2- o1;    
    }
}

class TestMain{
  public static void main(String args[]){

    System.out.println("--Natural sorting order -----");
     ArrayList<Integer> al = new ArrayList<>();
     al.add(50);
     al.add(10);
     al.add(100);
     al.add(70);
     System.out.println(al);
     al.sort(null); //sort using utility class  , natural sorting 
     al.sort(new MyComparator());
     System.out.println(al);


    System.out.println("--Custom sorting order -----");

     List<String> frouts = Arrays.asList("banana", "apple", "date","Mango");  
     System.out.println(frouts);
     frouts.sort(new StringlengthComparator()); // used to add custom sorting order
     System.out.println("without => "+frouts);
    //lamda exprestion
     frouts.sort((a,b)->a.length() - b.length()); 
     System.out.println("Lamda exprestion => "+frouts);
     

    List<Integer> al1 = new ArrayList<>();
    al1.add(10);
    al1.add(20);
    al1.add(30);
    System.out.println(al1);
    //sort using lamda exprestion
    al1.sort((a, b)-> b - a);
    System.out.println(al1);

  }
}