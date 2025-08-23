import java.util.Scanner;
import java.util.ArrayList;

class StudentList{
   ArrayList<Student> studentList = new ArrayList<Student>();

   public void addStudent(Student st){
      studentList.add(st);
   }
   public void removeStudent(Student st){
      studentList.remove(st);
   }
   public void DisplayDettail(){
      for(Student st : studentList){
        st.Display();
        System.out.println();
      }
   }
}

class Student{
   private String name ;
   private String gender;
   private String course;


   public Student(String name, String gender, String course){
      this.name = name;
      this.gender = gender;
      this.course = course;
   }

   public void  Display(){
      System.out.print("Name : "+name );
      System.out.print("  Gender : "+gender);
      System.out.print("  course : "+course);
    
   }
}

class TestMain{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

     System.out.print("Enter the number that you make list of student ");
     int n  = sc.nextInt();
     sc.nextLine();

     StudentList sl = new StudentList();

     Student[] stud = new Student[n];


      for(int i=0; i<n; i++){
      System.out.println("Enter the name : ");
      String name = sc.nextLine();
      // sc.nextLine();

      System.out.println("Enter the gender : ");
      String gender = sc.nextLine();

      System.out.println("Enter the course : ");
      String course = sc.nextLine();

       stud[i] = new Student(name, gender, course);
       sl.addStudent(stud[i]);
      }
     sl.DisplayDettail();


    System.out.println("Enter the student to remove :");
    int index = sc.nextInt();
     for(int i=0; i<n; i++){
        if((i+1) == index)  sl.removeStudent(stud[i]);
     }

     System.out.println("After removing Student update list ");
     sl.DisplayDettail();
   }
}