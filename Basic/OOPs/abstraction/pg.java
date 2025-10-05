import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        if(salary > 0){
          this.salary = salary;
        }else{
            System.out.println("Invalid salary");
            this.salary = 0;
        }
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return  salary;
    }
    
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }else{
            System.out.println("you are enter invalid salary");
        }
    }
    
    public void displayDetails(){
        System.out.println("----Employee Details----");
        System.out.println("Employee Name : "+getName());
        System.out.println("Employee Salary : "+getSalary());
    }
}

class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        Employee obj = new Employee("Rohan", 50000);
        //using before update  method
          obj.displayDetails();
        
        
        //update Salary
        System.out.println("Set salary : ");
        double set = sc.nextInt();
        obj.setSalary(set);
        
        //using display method
         obj.displayDetails();
        
        
    }
}