//Comparable Interface



import java.util.*;

class Student implements Comparable<Student>{
   private String name;
   private int roll;

   public Student(String name, int roll){
    this.name  = name;
    this.roll = roll;
   }

   public String getName(){
    return name;
   }
   public int getRoll(){
    return roll;
   }
   
  //compareTo() method use below concept ot compare the values 
  // 0 both value is equal
  // + postive  o1 is grater o2 is small -> o2 first and o1 leter
  // - negative  o2 is grater o1 is small -> o1 first and o2 leter

   public int compareTo(Student other){
    return this.roll - other.roll;
   }
   public String toString(){
    return "Student { Name :  "+name +", roll "+ roll+" } ";
   }
}

 class Test{
    public static void main(String args[]){

      ArrayList<Student> sl = new ArrayList<>();

      Student s1 = new Student("Moahn", 101);
      Student s2 = new Student("Moahn", 105);
      Student s3 = new Student("Moahn", 102);
      Student s4 = new Student("Moahn", 107);
      Student s5 = new Student("Moahn", 103);

      sl.add(s1);
      sl.add(s2);
      sl.add(s3);
      sl.add(s4);
      sl.add(s5);

      for(Student s : sl){
        System.out.println(s);
      }
     
     System.out.println("After compare ");
     Collections.sort(sl);
      for(Student s : sl){
        System.out.println(s);
      }

    }
 }