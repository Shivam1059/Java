import java.util.Scanner;

class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int ans = 1;
    int k = 1;
    for(int i=1; i<n; i++){
 
      for(int j=1; j<=ans; j++){
        System.out.print("* ");
      }
       System.out.println();
       ans += k++;
    }
  }
}