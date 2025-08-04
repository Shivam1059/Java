import java.util.Scanner;
class employee{
  //data
  private  int id;
  private  String name;
  private  float salary;

  //setter method 
  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setSalary(float salary){
    this.salary = salary;
  }

  //getter method 
  public void display(){
      System.out.println(" id :  "+id);
      System.out.println("Name : "+name);
      System.out.println("Salary : "+salary);
  }
}


class Test{
  public static void main(String args[]){
   employee obj = new employee();
   System.out.println("Employee Details ");
   obj.setId(101);
   obj.setName("Shiavay");
   obj.setSalary(50000);
   obj.display();
  }
}