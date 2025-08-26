import java.util.ArrayList;

class StudentList{
    ArrayList<Student>s_list1 =  new ArrayList<>();
    ArrayList<Student>s_list2 =  new ArrayList<>();
    ArrayList<Student>s_list3 =  new ArrayList<>();
    ArrayList<Student>s_list4 =  new ArrayList<>();
   

    public void addSt1(Student st){
      s_list1.add(st);
    }
    public void addSt2(Student st){
      s_list2.add(st);
    }
    public void addSt3(Student st){
      s_list3.add(st);
    }
    public void addSt4(Student st){
      s_list4.add(st);
    }

    public void Display1(){
         System.out.println();
      System.out.println("Group : [80-100]");
      for(Student ele : s_list1){
         ele.display();
         System.out.println();
      }
    }  
      public void Display2(){
           System.out.println();
         System.out.println("Group : [65-80]");
      for(Student ele : s_list2){
         ele.display();
         System.out.println();
      }
      }  

        public void Display3(){
             System.out.println();
           System.out.println("Group : [50-65]");
      for(Student ele : s_list3){
         ele.display();
         System.out.println();
      }
        }

       public void Display4(){ 
           System.out.println(); 
         System.out.println("Group : [0-50]");  
      for(Student ele : s_list4){
         ele.display();
         System.out.println();
      }
    }
}


class Student{
     private String name ;
     private int  roll_no ;
     private int age;
     private int score;

     public Student(String name , int roll_no, int age, int score){
      this.name = name;
      this.roll_no  = roll_no;
      this.age = age;
      this.score = score;
     }

     public void display(){
      System.out.print("Nmae : "+name+" ");
      System.out.print("Rollno: "+roll_no+" ");
      System.out.print("Age : "+age+" ");
      System.out.print("Score " +score+" ");
     }
}


class TestMain{
  public static void main(String[] args){
    //  Scanner sc = new Scanner(System.in);
     StudentList sl = new StudentList();
    
     Student obj1 = new Student("Abhay", 101, 18, 90);
     Student obj2 = new Student("Arjun", 102, 19, 80);
     Student obj3 = new Student("Abhi", 103, 20, 85);
     Student obj4 = new Student("Shivay", 104, 17, 60);
     Student obj5 = new Student("Ankit", 105, 14, 50);
     Student obj6 = new Student("Sohan", 106, 19, 55);
     Student obj7 = new Student("Rohan", 107, 21, 70);
     Student obj8 = new Student("Manoj", 108, 18, 45);
     Student obj9 = new Student("Mohan", 109, 20, 88);
     Student obj10 = new Student("Ram", 110, 18, 63);

     sl.addSt1(obj1);
     sl.addSt1(obj2);
     sl.addSt1(obj3);
     sl.addSt3(obj4);
     sl.addSt2(obj7);
     sl.addSt1(obj9);
     sl.addSt4(obj5);
     sl.addSt3(obj10);
     sl.addSt3(obj6);
     sl.addSt4(obj8);


     sl.Display1();
     sl.Display2();
     sl.Display3();
     sl.Display4();
 
  }
}