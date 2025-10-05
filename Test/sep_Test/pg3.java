// 3. String Problem #1

// Find First Non-Repeating Character

// Write a program that takes a string input and returns the first character that does not repeat.

// If all characters repeat, return "None".

// Example:

// Input: "swiss" → Output: "w"

// Input: "aabbcc" → Output: "None"



import java.util.Scanner;

  class test{
    public void check(String str){
      boolean flag = true;
      for(int i=0; i<str.length()-1; i++){
        for(int j=i+1; j<str.length(); j++){
          if(str.charAt(i) == str.charAt(j)){
            flag = false;;
               break;
           }
        }
      } 
      System.out.println(flag);
    }
  }

class TestMain{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);


   String str = "swiss";
   test t = new test();
   t.check(str);


  }
}




