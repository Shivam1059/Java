// 3. Exception Handling Problem #2
// 📌 Problem: Age Validator

// Ask the user for their age.

// If the age is less than 18 or greater than 100, throw a custom exception InvalidAgeException.

// Catch the exception and display "Invalid age entered".

// If valid, print "Age accepted: <age>".\



import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
      super(s);
    }
}
class TestMain{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);


     try{
       System.out.println("Enter your age : ");
       int a = sc.nextInt();
        age(a);
     }catch(InvalidAgeException  e){
          System.out.println(" Get exception : "+e.getMessage());
     }
     void  age(int a) throws InvalidAgeException{
         if(a < 18 && a > 100){
           throw new InvalidAgeException("Invalid age entered ");
        }else{
          System.out.println("Age is accepted");
          System.out.println("Your age is : "+a);
        }
     }
  }
}