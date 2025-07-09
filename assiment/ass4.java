//ass 4
class Test{
  public static void main(String args[]){
    int cost_of_Tiling = 6;
    int plot_len = 300;
    int plot_wide = 150;
    int plot_area = plot_len*plot_wide;
    int total_cost = (plot_area/cost_of_Tiling);

    System.out.println("Total cost of tiling of rectangular area : "+ total_cost);
  }
}