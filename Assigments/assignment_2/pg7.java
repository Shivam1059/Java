import java.util.Scanner;

class Test{
  public static void main(String args[]){
    System.out.println("Triangle base : ");
    int base = new Scanner(System.in).nextInt();

    System.out.println("Triangle area : ");
    int area = new Scanner(System.in).nextInt();

    int height = (area*2)/base;
    System.out.println("Area of height : "+height);

  }
}