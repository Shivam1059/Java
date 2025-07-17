import java.util.Scanner;

class employee{
  public static void main(String args[]){
    Scanner emp = new Scanner(System.in);

    System.out.println("Enter your salary : ");
    int salary = emp.nextInt();
   
   if(salary <= 10000){
      float hra = salary * 0.2f;
      float da = salary * 0.8f;
       float final_salary = salary+hra+da;
      System.out.println("final salary is : "+final_salary);
   }
   else if(salary <= 20000 &&  salary > 10000){
         float hra = salary * 0.02f;
      float da = salary * 0.9f;
       float final_salary = salary+hra+da;
      System.out.println("final salary is : "+final_salary);
   }
  else if(salary > 20000 ){
       float hra = salary * 0.3f;
       float da = salary * 0.09f;
       float final_salary = salary+hra+da;
      System.out.println("final salary is : "+final_salary);
   }
  }
}