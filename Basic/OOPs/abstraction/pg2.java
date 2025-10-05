abstract class Employee{
  private String name;
  private double salary;

  public Employee(String name, double salary){
    this.name = name;
    this.salary = salary;
  }
 
 public String getName(){
  return name;
 }
 public double getSalary(){
  return salary;
 }

  abstract public void calculateBonus();

  public void displayDetails(){
     System.out.println("-----Employee Details------");
     System.out.println("Employee Name : "+getName());
     System.out.println("Employee salary : "+getSalary());
  }

}

class Manager extends Employee{
    public Manager(String name, double salary){
      super(name,salary);
    }
   
   public void calculateBonus(){
    double  bonus = 20*getSalary()/100;
       bonus += getSalary();
     System.out.println("after bonus new salary : "+bonus);
   }
}

class Developer extends Employee{
   public Developer(String name, double salary){
      super(name,salary);
    }

    public void calculateBonus(){
    double bonus = 10*getSalary()/100;
    bonus += getSalary();
      System.out.println("after bonus new salary : "+bonus);
   }
  
}

class TestMain{
   public static void main(String args[]){

  Employee emp1 = new Manager("Ankit", 90000);
  Employee emp2 = new Developer("Pavan", 70000);

  Employee[] employees = {emp1, emp2};

  for(Employee e : employees) {
    e.displayDetails();
    e.calculateBonus();
    System.out.println("-------------------------");
  }

    
   }
}