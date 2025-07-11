//ass 34
class Trapezoid{
  public static void main(String args[]){
    int a = 128, b = 92, h = 40, wide = 4, widearea;
    float woodearea = 1/2f*( a + b)*h;
    widearea = wide*h;
    int total_area =(int) woodearea + widearea;
    System.out.println("Wooden area : "+woodearea+"wokeway area : "+ widearea+"after adding both area : "+total_area);

  }
}