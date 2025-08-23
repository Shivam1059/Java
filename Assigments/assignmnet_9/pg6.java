// WAP to count the word whose first letter is  vowel.

class Test{
     private String data;

     public Test(String data){
      this.data =  data;
     }

     public int  getWord(){
          int count = 0;
      for(int i=0; i<data.length(); i++){
          if(data.charAt[i] == 'A' || data.charAt[i] == 'a'||data.charAt[i] == 'E' || data.charAt[i] == 'e' ||data.charAt[i] == 'I' || data.charAt[i] == 'i'||data.charAt[i] == 'O' || data.charAt[i] == 'o'||data.charAt[i] == 'U' || data.charAt[i] == 'u'){
              count++;
          }
      }
      return count;
     }
}

class Main{
     public static void main(String[] args){
      String str = "Alfaiz is going to Dewas";
      Test obj = new Test(str);
      obj.getWord();
     }
}