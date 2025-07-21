import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the any number 1 to 26 : ");
    int n = sc.nextInt();
    int count = 0;
    int i = 65;
    while(count <= n){
          char ch = (char)i;
          System.out.println(ch);
          count++;
          i++;
    }
  }
}