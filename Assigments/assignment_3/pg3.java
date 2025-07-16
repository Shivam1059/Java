import java.util.Scanner;
class employee{
    public static void main(String args[]){
      Scanner emp = new Scanner(System.in);

      System.out.println("Enter service year : ");
      int service_y = emp.nextInt();
      
      System.out.println("Enter your  salary : ");
      int salary = emp.nextInt();

      if(service_y >= 5){
        int bonus = (salary*5)/100;
        int salary_b = salary + bonus;
        System.out.println("Employee selary including bonus : "+salary_b);
      }else{
        System.out.println("Employee salary without bonus : "+salary);
      }

    }
}