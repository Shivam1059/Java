// WAP to count the word whose first letter is  vowel.

class Test{
     private String data;

     public Test(String data){
      this.data =  data;
     }
     
     public void  getWord(){
        char arr[] = data.toCharArray();
          int count = 0;
          int size = 0;
        for(int j=0 ; j<arr.length; j++){
            size++;
            if(arr[j] == ' '){
                size = 0;
            }
            for(int i=j; i<size; i++){
                 if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='U'||arr[i]=='u'){
                    count++;
               }
            }
        }
      System.out.print(count);
     }
}

class Main{
     public static void main(String[] args){
      String str = "India is our Country";
      Test obj = new Test(str);
      obj.getWord();
    
     }
}