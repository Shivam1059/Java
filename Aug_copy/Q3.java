import java.util.Scanner;

class Student{
     private String name;
     private int marks;

    public Student(String name, int marks){
      this.name = name;
      this.marks = marks;
    } 
   
   public Student(){};

    // public void setSt(String name, int marks){
    //   this.name = name;
    //   this.marks = marks;
    // }
    public  String  getGrade(){
       if(marks >= 80){
         return " A ";
       }else if(marks >= 60 && marks < 80){
         return " B ";
       }else if(marks >= 40 && marks < 60 ){
         return " C ";
       }else{
         return " F ";
       }
    }

    public void gitDisplay(){
      System.out.println("Name : "+name+  ",  Marks : "+marks+ ",  Grade : "+getGrade());
    }
  

}

class Main{
  public static void  main(String[] args){
  Scanner sc = new Scanner(System.in);
    
   System.out.print("Enter the number of student that you want to print : ") ;
   int n = sc.nextInt();

  //  String  name ;
  //  int marks;
  //  for(int i=0; i<n-1; i++){
  //   System.out.print("Enter the Student Name : ");
  //   String name = sc.nextLine();
  //   System.out.print("Enter the Student marks : ");
  //   int marks  = sc.nextInt();
  //  }

  //  Student obj = new Student(name, marks);
     Student obj  = new Student("Shivam", 45);
     Student obj1  = new Student("Hemant", 95);
     Student obj2  = new Student("Ram", 35);
    //  obj.gitDisplay();
     obj1.gitDisplay();
     obj2.gitDisplay();
     obj1.gitDisplay();

    //  String  grade = Student.getGrade(marks);
    //  System.out.print("Nmae : "+name+" Marks : "+marks+" Grade : "+grade);
  }
}