import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num  st : ");
    int st = sc.nextInt();
    System.out.println("Enter num  end : ");
    int  end = sc.nextInt();

    while(st <= end ){
       int i = st*st;
      System.out.println("Square : "+i);
      int j = st*st*st;
      System.out.println("Quab : "+j);

      st++;
    }
  }
}