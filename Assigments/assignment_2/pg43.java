import java.util.Scanner;
class Test{
  public static void main(String args[]){
    System.out.println("Enter the height : ");
    float height = new Scanner(System.in).nextInt();
    System.out.println("Enter the len : ");
    float len = new Scanner(System.in).nextInt();

    System.out.println("Enter the rate : ");
    int rate = new Scanner(System.in).nextInt();
  
   double  x  =  len*len+height*height;
   double r = Math.sqrt(x);
   double area = (3.14f)*r*r;
   System.out.println("Area : "+area);

  }
}
