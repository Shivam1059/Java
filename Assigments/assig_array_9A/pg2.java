//2. Write a Java program to get the character at the given index within the String
import java.util.Scanner;
import java.util.Arrays;

class getStrChar{
  private String str ;
  private int index;

  public  getStrChar(String str,int  index){
    this.str = str;
    this.index = index;
  }
  
  public getStrChar(){};

  public void   getChar(){
    char arr[] = str.toCharArray();

     for(int i=0; i<arr.length; i++){
       if(i == index){
        System.out.print("Index of char : "+arr[i]);
        break;
       }
     }
  }
}

class TestMain{
  public static void main(String[]  args ){
    Scanner sc = new Scanner(System.in);
    
    String str = "AnkitRajput";
     int idx = -1;
     
    boolean flag = true;
    while(flag){ 
     System.out.print("Enter the index : ");
     int index = sc.nextInt();
     if(index >= 0 && index <= str.length()-1){
        idx = index;
        flag = false;
      }else{
       System.out.print("Enter valid index");
      }
    } 
      getStrChar s = new getStrChar(str, idx);
    
    s.getChar();
  }
}