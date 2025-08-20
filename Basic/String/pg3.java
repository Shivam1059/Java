import java.util.Scanner;
class Test{
    private String data ;

   public Test(String data){
      this.data = data;
   }

    public int  getLength(){
    int count = 0;
    char arr[] = data.toCharArray();
       for(char element : arr){
               count++;
      }
      return count;
    }

}

class Main{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

      System.out.print("Enter the number : ");
      String str = sc.nextLine();

      Test obj = new Test(str);
      int result =  obj.getLength();
      System.out.print("Length of String : "+result);
     
  }
}