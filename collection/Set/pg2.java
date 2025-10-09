import java.util.*;


class Student{
   String name;
   int id;

   public Student(String name, int id){
    this.name = name;
    this.id = id;
   }

  public String toString(){
    return "Student name : "+name+" id "+id;
  }

}
class TestMain{
  public static void main(String args[]){

     ArrayList<Student> list = new ArrayList<>();
     list.add(new Student("Shivam", 101));
     list.add(new Student("Mohan", 102));
     list.add(new Student("Shyam", 103));
  
     Collections.sort(list, new Comparator<Student>(){
       public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
       }
     });
    
    System.out.println("Sorted by name:");
        for(Student s : list){
            System.out.println(s);
        }

  }
}