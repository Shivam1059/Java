import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

class Main{
  public static void main(String args[]){
      try(FileReader fr = new  FileReader("file handling\note.txt")){
        int letters = fr.read();
        while(fr.ready()){
          System.out.println((char) letters);
          letters = fr.read();
        }

        System.out.println();
      }catch (IOException e){
        System.out.println(e.getMessage());
      }
  }
}