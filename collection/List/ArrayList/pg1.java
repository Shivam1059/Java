import java.util.ArrayList;

class TestMain{
  public static void main(String args[]){

    ArrayList<String> al = new  ArrayList<>();
    al.add("Shivam");
    al.add("Rohan");
    al.add("Mohan");
    al.add("Shyam");

    // System.out.println(al);
    // System.out.println(al.get(0));
    // System.out.println(al.set(1,"Karan"));
    // System.out.println(al);
    // System.out.println(al.remove(2));
    // System.out.println(al);

    for(String name : al){
      System.out.println("Name : "+name);
    }
  }
}