import java.util.Scanner;



class Employee{
   private String name;
   private float salary;
   private int hireyear;


   public Employee(String name, float salary , int hireyear){
       this.name = name;
       this.salary = salary;
       this.hireyear = hireyear;
  
   }

  public String Display(){
    int currentYear = 2025;
    int service = currentYear - hireyear;
    return "Year of service is : "+service;
  }
}

class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter employee name : ");
    String name = sc.nextLine();
    System.out.print("Enter employee salary : ");
    float salary = sc.nextFloat();
    System.out.print("Enter employee hireyear : ");
    int year  = sc.nextInt();
    Employee emp = new Employee(name, salary, year);
    String emplayee = emp.Display();
    System.out.print(emplayee);
    
  }
}