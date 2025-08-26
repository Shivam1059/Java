import java.util.Scanner;

    //square title for 
class Tile{
    private int edge_l;

  public Tile(int edge_l){
    this.edge_l = edge_l;
  }

  public int  getAreaOneTiles(){
    int area = edge_l*edge_l;
    return area;
  }

}
//for rectangel floor
class Floor{
    private int length;
    private int width;

    public Floor(int length, int width){
       this.length = length;
       this.width = width;
    }

    public int  getAreafloor(){
      int floorArea = (length * width);
     return floorArea;
    }
}

class TestMain{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the edge for square : ");
     int edge = sc.nextInt();
     Tile tl = new Tile(edge);
    //  Tile tl = new Tile(20);

     System.out.println("Enter the floor length : ");
     int length  = sc.nextInt();
     System.out.println("Enter the floor width : ");
     int width  = sc.nextInt();

     Floor fl = new Floor(length, width);
    //  Floor fl = new Floor(20,40);
     

    int Tile_Area = tl.getAreaOneTiles();
    int floor_Area = fl.getAreafloor();
    int total_Titles = floor_Area/Tile_Area;
    System.out.print("Total number of Tiles : "+total_Titles);

  }
}

