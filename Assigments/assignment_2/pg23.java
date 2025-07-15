import java.util.Scanner;
class Test{
  public static void main(String args[]){
    //cube 
    Scanner cube  = new Scanner(System.in);
    System.out.println(" Enter cube side : ");
    int num = cube.nextInt();
    int cube_volum = num*num*num;
    
    //carton
    Scanner carton =  new Scanner(System.in);
    System.out.println(" Enter carton len : ");
    int length = carton.nextInt();
    System.out.println(" Enter carton len : ");
    int breadth = carton.nextInt();
    System.out.println(" Enter carton len : ");
    int height = carton.nextInt();
    int carton_volum = length*breadth*height;
   //total_cube
    int total_cube = carton_volum/cube_volum;
    System.out.println("Total number of volum : "+total_cube);

  }
}