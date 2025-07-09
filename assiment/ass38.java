//ass38
class Test{
  public static void main(String args[]){
    int volume = 1287;
    int ridius = 10;
    float  hight = volume/(2*(3.14f)*(float)ridius);

    float surface_area = 2*(3.14f)*ridius*hight;
    System.out.println(surface_area);

  }
}