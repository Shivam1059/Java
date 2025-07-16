import java.util.Scanner;

class employee{
  public static void main(String args[]){
   Scanner emp = new Scanner(System.in);

   System.out.println("Enter your age : ");
   int age = emp.nextInt();

   System.out.println("Select  your gender (M & F): ");
  //  char gender  = emp.nextchar();
   char gender = emp.next().charAt(0);

   System.out.println("Select  your martial status : ");
  //  char martial_status  = emp.next().char();
   char  martial_status = emp.next().charAt(0);

   if(gender ==  'F'){
     System.out.println("She will work only in urben areas");
   }
   else if(age >= 20 && age <= 40 && gender == 'M'){
     System.out.println("He  will work only in antwhere");
   }else if(age >= 40 && age <= 60){
      System.out.println("He  will work only in urben areas");
   }else{
    System.out.println(" ERROR ");
   }



  }
}