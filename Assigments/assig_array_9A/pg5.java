//5. Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions
import java.util.Scanner;

class compareLexi{
  private String  str1;
  private String  str2;
  
  public compareLexi(){};
  public compareLexi(String str1, String str2){
    this.str1 = str1;
    this.str2 = str2;
  }

  public boolean compare(){
    if(str1.equals(str2)){
      return true;
    }else{
      return false;
    }
  }
}

class TestMain{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the str1 :   ");
    String str1 = sc.nextLine();
    System.out.println("Enter the str2 :   ");
    String str2 = sc.nextLine();

    compareLexi cl = new compareLexi(str1, str2);
    System.out.print( cl.compare());
  }
}