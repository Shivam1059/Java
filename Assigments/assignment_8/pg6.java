import java.util.Scanner;
import java.util.ArrayList;

class empFile{
  ArrayList<employee> Emplist = new ArrayList<employee>();

  public void addemp(employee emp){
    Emplist.add(emp);
  }
  public void removeemp(employee emp){
    Emplist.remove(emp);
  }

  public void Display(){
     for(employee element : Emplist){
          System.out.print(element.Display());
     }
     System.out.println(" Total number of emplayee : "+Emplist.size());
  }
}



class employee{
  private String name;
  private String job;
  private int salary;

  public employee(String name, String job, int salary){
      this.name = name;
      this.job = job;
      this.salary = salary;
  }

  public employee(){};

  public void setN(String name){
    this.name = name;
  }
  public void setj(String job){
    this.job = job;
  }
  public void setS(int salary){
    this.salary = salary;
  }


  public String  Display(){
    return "  Employee Name : "+ name +"  Job title :  " + job + ",  Salary : " +salary;

   }

}

class  TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employee : ");
    int n = sc.nextInt();
      employee obj[] = new employee[n];
      empFile lib = new empFile();
    
    for(int i=0; i<n; i++){
       System.out.println("Enter the employee name : ");
       String name = sc.nextLine();
       sc.nextLine(); 
       System.out.println("Enter the employee job title   : ");
       String job = sc.nextLine();
       System.out.println("Enter the employee salary : ");
       int  salary = sc.nextInt();
       
       obj[i] = new employee(name, job,  salary);
         lib.addemp(obj[i]);
      
    }


    lib.Display();
  }
}