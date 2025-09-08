//Write a Java program to test if a given string contains the specified sequence of char values
import java.util.Scanner;
class check{
  private String str1;
  private String str2;

  public check(String str1, String str2){
    this.str1 = str1;
    this.str2 = str2;
  }
  public boolean  getSame(){
    boolean  flag = true;
      for(int i=0; i<str1.length(); i++){
        for(int j=0; j<str2.length(); j++){
             if(str1.charAt(i) != str2.charAt(j)){
                 flag = false;
             }
        }
      }
     return flag;
  }
}


class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the str1 : ");
    String str1 = sc.nextLine();
    System.out.println("Enter the str2 : ");
    String str2 = sc.nextLine();
   
   check c = new check(str1, str2);
      boolean flag = c.getSame();

      if(flag){
        System.out.println("same string both");
      }else{
        System.out.println("same string not same");
      }

  }
}