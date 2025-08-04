import java.util.Scanner;


class Movie{
  private String name;
  private String genre;
  private int rating;

//setter method
  public void setN(String name){
    this.name = name;
  }
  public void setG(String genre){
    this.genre = genre;
  }
  public void setR(int rating){
    this.rating = rating;
  }

//getter method
public boolean isHit(){
    if(rating >= 8.0){
      return true;
    }else{
      return false;
    }
}
}


class Test{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter movie name : ");
      String name = sc.next();
      System.out.println("Enter movie genre : ");
      String genre = sc.next();
      System.out.println("Enter movie rating : ");
      int rating  = sc.nextInt();

      Movie obj = new Movie();
      obj.setN(name);
      obj.setG(genre);
      obj.setR(rating);
      boolean result = obj.isHit();
      System.out.print(result);
      
    }
}
