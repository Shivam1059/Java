class Test{
    private String  sentence;

    public Test(String sentence){
        this.sentence = sentence;
    }

    public void  reverse(){
        String word = "";
        char arr[] = sentence.toCharArray();
        for(int i=0; i<arr.length; i++){
          if(arr[i] == 32){
            for(int j= arr.length; j>=0; j++){
              System.out.print(arr[j]);
            }
          }
        }
    }
}

class Main{
  public static void main(String args[]){
    String str = "Java is very simple";
    Test obj = new Test(str);
    String name =  obj.reverse();
    System.out.print(name);

  }
}