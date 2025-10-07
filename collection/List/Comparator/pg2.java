//Comparator interface
import java.util.*;

class Student{
   private String name ;
   private double cgpa;

   public Student(String name , double cgpa){
    this.name = name;
    this.cgpa = cgpa;
   }

   public String getName(){
    return name;
   }

   public double getCgpa(){
    return cgpa;
   }
    public String toString(){
      return "Student { name : "+name+" cgpa : "+cgpa +"} ";
    }
}


class TestMain{
  public static void main(String args[]){
     List<Student> students = new ArrayList<>();

      Student obj = new Student("Rohan", 3.5);
      Student obj3= new Student("Rohan", 5.5);
      Student obj1 = new Student("Rohan", 4.5);
      Student obj2 = new Student("Rohan", 9.5);
      Student obj4= new Student("Charli", 5.5);

      
       students.add(obj);
       students.add(obj1);
       students.add(obj2);
       students.add(obj3);
       students.add(obj4);

    for(Student s : students){
      System.out.println(s);
    }
    students.sort((s1,s2)->{
        if(s2.getCgpa() - s1.getCgpa() > 0){
          return 1;
        }else if(s2.getCgpa() - s1.getCgpa() < 0){
          return -1;
        }else{
          return 0;
        }
    });
    System.out.println(" After cgpa based sortin----");
    for(Student s : students){
      System.out.println(s);
    }
  }
}