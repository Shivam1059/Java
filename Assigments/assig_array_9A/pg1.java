//1.. Write a Java program to concatenate Two strings
import java.util.Scanner;

class addString{
   private String str1;
   private String str2;
 

   public addString(String str1, String str2){
    this.str1 = str1;
    this.str2 = str2;
   }

   public addString(){};

   public void addTwoStr(){
     String newStr = str1 + str2;
     System.out.print(newStr);
   }
}

class TestMain{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string 1 : ");
     String str1 = sc.nextLine();
    System.out.print("Enter the string  2 : ");
     String str2 = sc.nextLine();
    
   addString ct = new addString(str1, str2);
   ct.addTwoStr();
    
  }
}