  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.IOException;

  
class Test{
  public static void main(String[]  args){
     BufferedReader reader = null;
     try {
        reader = new BufferedReader(new FileReader(fileName: "example.txt"));
        String line;
        while((line = reaer.readLine()) != null){
          System.out/println(line);
        }
     } catch (IOException e){
      System.out.println("IOException caught : "+e.getMessage());
     } finally{
        try{
          if (reader != null){
            reader.close();
          }
          catch(IOException e){
            System.out.println("Error closing reader : "+e.getMessage());
          }
        }
     }
  
  }
}