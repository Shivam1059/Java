import java.util.Scanner;

class Student{
  private String name;
  private int mathMarks;
  private int scienceMarks;

  //sett
  public void setN(String name){
    this.name = name;
  }
  public void setM(int mathMarks){
    this.mathMarks = mathMarks;
  }
  public void setS(int scienceMarks){
    this.scienceMarks = scienceMarks;
  }

  //getter
  public void  getAverage(){
     int total_marks = mathMarks + scienceMarks;
     int avg_marks = total_marks/2;
     System.out.print("Average marks : "+avg_marks);
  }

}

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name : ");
    String name = sc.next();
    
    System.out.print("Enter your mathmarks  : ");
    int  m_no = sc.nextInt();

    System.out.print("Enter your sciencemarks : ");
    int  s_no = sc.nextInt();

    Student obj = new Student();
    obj.setN(name);
    obj.setM(m_no);
    obj.setS(s_no);

    obj.getAverage();

  }
}