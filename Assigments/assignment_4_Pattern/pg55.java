import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<n-i; j++){
        int a = 65+j;
        char ch = (char)a;
        if(j==0||j==n-i-1||i==0){
          System.out.print(ch);
        }else{
          System.out.print("_");
        }
      }
      System.out.println();
    }
  }
}