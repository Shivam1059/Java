//Problem 2: Employee Management System 
interface BonusEligible{
    void giveBonus(double bonus);
}

abstract class Employee{
    private int id;
    private String name;
    private double salary_fields;

    public Employee(int id , String name, double salary_fields){
      this.id = id;
      this.name = name;
      this.salary_fields = salary_fields;
    }
    abstract public void calculateSalary();
    abstract public void showDetails();
}

class FullTimeEmployee extends Employee implements BonusEligible{
   private int id ;
   private String name;
   private double salary_fields; 


   public FullTimeEmployee(int id , String name, double salary_fields){
      super(id,name,salary_fields);
      this.id = id;
      this.name = name;
      this.salary_fields = salary_fields;
   }
   public void giveBonus(double bonus){
       salary_fields = salary_fields+bonus;
   }
   public void calculateSalary(){
      System.out.println("Salary : "+salary_fields);
   }
   public void showDetails(){
       System.out.println("Employee id : "+id);
       System.out.println("Employee name : "+name);
       System.out.println("Employee Total Salary  : "+salary_fields);
       System.out.println();
   }
}

class PartTimeEmployee extends Employee {
   private int id ;
   private String name;
   private double salary_fields; 

   public PartTimeEmployee(int id , String name, double salary_fields){
       super(id,name,salary_fields);
      this.id = id;
      this.name = name;
      this.salary_fields = salary_fields;
   }
     public void giveBonus(double bonus){
      salary_fields = salary_fields+bonus;
   }
    public void calculateSalary(){
          System.out.println("Salary : "+salary_fields);
   }
   public void showDetails(){
    System.out.println("Employee id : "+id);
    System.out.println("Employee name : "+name);
    System.out.println("Employee Total Salary : "+salary_fields);
    System.out.println();
   }
}

class Intern extends Employee{
  private int id ;
   private String name;
   private double salary_fields; 

   public Intern(int id , String name, double salary_fields){
      super(id,name,salary_fields);
      this.id = id;
      this.name = name;
      this.salary_fields = salary_fields;
   }
   public void calculateSalary(){    
         System.out.println("Salary : "+salary_fields);        
   }
   public void showDetails(){
    System.out.println("Intern id : "+id);
    System.out.println("Intern name : "+name);
    System.out.println("Intern Salary  : "+salary_fields);
       System.out.println();
   }
}

class TestMain{
  public static void main(String args[]){
       FullTimeEmployee obj = new FullTimeEmployee(101,"Arjun",25000);
       obj.calculateSalary();
       obj.giveBonus(1200);
       obj.showDetails();
       PartTimeEmployee obj1 = new PartTimeEmployee(102,"Karan",50000);
       obj1.calculateSalary();
       obj1.giveBonus(1500);
       obj1.showDetails();
       Employee obj2 = new Intern(103, "Ram",75000);
       obj2.calculateSalary();
       obj2.showDetails();
  }
}