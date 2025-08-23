import java.util.Scanner;
import java.util.ArrayList;


class School{
      ArrayList<Study> st_list = new ArrayList<>();
      
      public void addStudent(Study st){
         st_list.add(st);
      }
      public void addTeacher(Study st){
         st_list.add(st);
      }

     public Study findStudent(int id){
       for(Student ele : st_list){
          if(ele == id){
            return ele;
          }
       }
       return null;
     }
     public Study findTeacher(int id){
       for(Teacher ele : st_list){
          if(ele == id){
            return ele;
          }
       }
       return null;
     }

      public void removeStudent(Study st){
         st_list.remove(st);
      }
      public void removeTeacher(Study st){
         st_list.remove(st);
      }
    public void Display(){
      for(Study ele : st_list){
          ele.display();
          ele.displayT();
      }
    }

}

class Student{
   private String name;
   private int id;
   private int studyclass;

   public Student(String name, int id, int studyclass){
       this.name = name;
       this.id = id; 
       this.studyclass = studyclass;
   }

  public int getStudentid(){
   return id;
  }
 public void display(){
    System.out.println("Student Name : "+name);
    System.out.println("Student id  : "+id);
    System.out.println("Student class  : "+studyclass);
 }
}
class Teacher{
   private String name;
   private int id;
   private double salary;

   public Teacher(String name, int id, double salary){
       this.name = name;
       this.id = id; 
       this.salary = salary;
   }

  public int getTeacherid(){
   return id;
  }
 public void displayT(){
    System.out.println("Teacher  Name : "+name);
    System.out.println("Teacher id  : "+id);
    System.out.println("Teacher Salary  : "+salary);
 }
}

class TestMain{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Student  of number that to add in list : ");
      int n = sc.nextInt();
      System.out.print("Enter the Teacher of number that to add in  list : ");
      int te = sc.nextInt();
      int m = n + te;
      School sl = new School();
      int arr[] = new int[m];
      
      for(int i=0; i<n; i++ ){
         System.out.print(i+" Enter the student name : ");
         String name = sc.nextLine();
         System.out.print(i+" Enter the student id : ");
         int id  = sc.nextInt();
         System.out.print(i+" Enter the student studyClass  : ");
         int  studyclsaa = sc.next();
        arr[i] =   new Student(name,id,studyclass);
      }
      for(int i=0; i<te; i++ ){
         System.out.print(i+" Enter the teacher  name : ");
         String name = sc.nextLine();
         System.out.print(i+" Enter the  id : ");
         int id  = sc.nextInt();
         System.out.print(i+" Enter the Teacher salary  : ");
         int  salary = sc.next();
        arr[i] =   new Student(name,id,salary);
      }

      sl.addStudent(arr);
      sl.Display();
   }
}