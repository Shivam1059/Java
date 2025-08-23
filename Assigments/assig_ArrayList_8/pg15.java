import java.util.Scanner;
import java.util.ArrayList;

class MusicLibrary{
   ArrayList<Song> songList = new ArrayList<>();

   public void addSong(Song s){
     songList.add(s);
   }
   public void removeSong(Song s){
     songList.remove(s);
   }

   public Song findSong(String s){
      for(Song ele : songList){
       if(ele.getSong().equals(s)){
        return ele;
       }
      }
      return null;
   }
   public void playRandom(){
      for(Song ele : songList){
        ele.display();
      }
   }
   
}
class Song{
    private String songname;

    public Song(String songname){
        this.songname = songname;
    }

    public String getSong(){
      return songname;
    }

    public void display(){
      System.out.print("Song name : "+songname);
    }
}

class TestMain{
   public static void main(String[] main){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter number that You want to add in playlist :");
       int n = sc.nextInt();

       Song music[] =  new Song [n];
       MusicLibrary ml = new MusicLibrary();

       for(int i=0; i<n; i++){
          System.out.println(i+" Enter the song name : ");
          String songN = sc.nextLine();
          sc.nextLine();

          music[i] = new Song(songN);
          ml.addSong(music[i]);
       }

       ml.playRandom();

       System.out.println("Enter the song name that you want to remove from your playlist : ");
       String yourSong = sc.nextLine();
       Song  ysong = ml.findSong(yourSong);
       if(ysong != null){
          ml.removeSong(ysong);
       }else{
          System.out.println("Enter the right name of song : ");
       }

       System.out.println("After the remove song from your playList new updated list here ");
       ml.playRandom();
       
   }
}