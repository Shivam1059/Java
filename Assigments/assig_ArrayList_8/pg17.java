import java.util.ArrayList;
import java.util.Scanner;

class file{
    ArrayList<movie> moive_list = new ArrayList<>();

    public void addMovie(movie m){
        moive_list.add(m);
    }
    public void removeMovie(movie m){
        moive_list.remove(m);
    }

   public movie findMovie(String r){
       for(movie m : moive_list){
          if(m.getMoiveT().equals(r) )
          return m;
       }
       return null;
   }
    public void Display(){
      for(movie ele : moive_list){
          ele.display();
          System.out.println();
      }
    }
}
class movie{
    private String title;
    private String director;
    private String actors;
    private String reviews;

    public movie(String title, String director, String actors, String reviews){
      this.title = title;
      this.director = director;
      this.actors = actors;
      this.reviews = reviews;
    }
  
   public void setReview(String reviews){
       this.reviews = reviews;
   }
   public String  getMoiveT(){
      return title;
   }

    public void display(){
      System.out.print("Moive title : "+title);   
      System.out.print(", Moive director : "+director);   
      System.out.print(", Moive actors : "+actors);   
      System.out.print(", Moive reviews : "+reviews);   
    }
}

class TestMain{
    public static void main(String[] args){   
      Scanner sc = new Scanner(System.in);
      file ml = new file();
      movie m1 = new movie("3Ideat", "khushi", "Amir khan", "Good ");
      movie m2 = new movie("10th pash", "khushi", "Abhisec Bacchan", "Very nice ");
      movie m3 = new movie("3Ideat", "khushi", "Salman  khan", "comedy movie");
      movie m4 = new movie("Keshari", "Vijay dev ", "Akashy ", "Very nice movies");
      ml.addMovie(m1);
      ml.addMovie(m2);
      ml.addMovie(m3);
      ml.addMovie(m4);
      
      ml.Display();
      
      System.out.print("Enter the moive name : ");
      String mv = sc.nextLine();
      movie m  = ml.findMovie(mv);

       if(m != null){
        System.out.println("Enter your reviews : ");
        String s = sc.nextLine();
         m.setReview(s);
       }else{
          System.out.print("Enter the right name of movie : ");
       }
      
      System.out.println(" After updating review of movielist ");
      ml.Display();

    }
}