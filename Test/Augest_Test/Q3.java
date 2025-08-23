class Student{
    private String name;
    private int marks;

    public  Student(String name, int marks){
      this.name= name;
      this.marks = marks;
    }
     public Student(){};


    public static void  getGrade(String name int marks){
        if(marks >= 80){
          System.out.print("Grade : A");
        }
        else if(marks >= 60 && marks < 80){
            System.out.print("Grade : B");
        }
        else if(marks >= 40 && marks <  60){
            System.out.print("Grade : C");
        }else{
            System.out.print("Grade : F");
        } 
    }

    public void display(){
      System.out.println(name);
      System.out.println(marks);
    }

}
class Main{
    public static void main(String[] args){

     Student obj1 =  new Student("Shivam", 85);
     Student obj2 = new Student("Rohan", 85);
     Student obj3 = new Student("Ram", 30);

     obj1.display();
     obj2.display();

     obj1.getGrade();
    }
}
