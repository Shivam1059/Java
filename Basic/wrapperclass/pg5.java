//WAP to eenter mobile of user and check wheter it is valid or invalid (length must be 10 , all letter must be digit)
import java.util.Scanner;

class TestMain{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    long  mobileNumber ;
    System.out.println("Enter the mobile number : ");
    mobileNumber = sc.nextLong();

    System.out.println(mobileNumber);
    
    
  }
}