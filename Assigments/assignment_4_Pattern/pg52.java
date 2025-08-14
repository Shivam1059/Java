import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for(int i=n; i>0; i--){
      for(int j=1;j<n;j++)
      {
        if(j>=n-i)
        {
          System.out.print(i);
        }
        else
        System.out.print(" ");
      }
      System.out.println();
     
    }
  }
}

import java.util.Scanner;
class Test{
  public static void main(String args[]){
    Scanner sc  = new Scanner(System.in);

    System.out.print("Enter the num : ");
    int n = sc.nextInt();

    for(int i=n; i>0; i--){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int j=0; j<i; j++){
        System.out.print(i);
      }
      System.out.println();
    }

  }
}