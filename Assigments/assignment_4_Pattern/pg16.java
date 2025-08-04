import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size : ");
    int size = sc.nextInt();

    char ch = 'a';
    for(int i=0; i<=size;i++){
      for(int j=0; j<i; j++){
        System.out.print(" "+ch);
        ch++;
      }
             System.out.println();
    }
  }
}